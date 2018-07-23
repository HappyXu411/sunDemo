<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>搜索结果</title>
<%
	pageContext.setAttribute("APP_PATH", request.getContextPath());
%>
<script type="text/javascript" src="${APP_PATH }/static/js/jquery-1.12.4.min.js"></script>
<link href="${APP_PATH }/static/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
<script src="${APP_PATH }/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container">
		<!-- 标题 -->
		<div class="row"></div>
			<div class="col-md-12">
				<h1>查询结果</h1>
			</div>
		<!-- 显示表格数据 -->
		<div class="row">
			<div class="col-md-12">
				<table class="table table-hover" id="docs_table">
					<thead>
						<tr>
							<th>docTitle</th>
						</tr>
					</thead>
					<tbody>
							
					</tbody>
				</table>
				
			</div>
		</div>
		<!-- 显示分页信息 -->
		<div class="row">
			<!-- 分页文字信息 -->
			<div class="col-md-6" id="page_info_area">
				
			</div>
			<!-- 分页条信息 -->
			<div class="col-md-6" id="page_nav_area">
				
			</div>
		</div>
	</div>
	<script type="text/javascript">
		function getQueryString(title) {
			var reg = new RegExp("(^|&)" + title + "=([^&]*)(&|$)"); // 匹配目标参数
			var result = window.location.search.substr(1).match(reg); // 对querystring匹配目标参数
			if (result != null) {
				return decodeURIComponent(result[2]);
			} else {
				return null;
			}
		}
		
		var title = getQueryString("title");
		
		$(function(){
			toPage(title,1);
		});
		
		//显示页面
		function toPage(str,pn){
			$.ajax({
				url:"/sunDemo/findByTitle" ,
				data:"title="+title+"&pn="+pn,
				type:"get",
				success:function(result){
					//console.log(result);
					//1.解析并显示文章数据
					build_docs_table(result);
					//2.解析并显示分页信息
					build_page_info(result);
					//3.解析并显示分页条
					build_page_nav(result,title);
				},
				error:function(){
					alert("你输入的标题不存在");
				}
			});
		}
		
		//解析并显示文章数据
		function build_docs_table(result){
			$("#docs_table tbody").empty();
			var docs = result.extend.pageInfo.list;
			$.each(docs,function(index,item){
				var docTitleTd = $("<td></td>").append(item.doctitle)
				$("<tr></tr>").append(docTitleTd)
					.appendTo("#docs_table tbody");
					
			});
		}
		//解析显示分页信息
		function build_page_info(result){
			$("#page_info_area").empty();
			$("#page_info_area").append(
					"当前" + result.extend.pageInfo.pageNum + "页,总" + 
					result.extend.pageInfo.pages + "页,总" + 
					result.extend.pageInfo.total + "条记录"); 
			totalRecord = result.extend.pageInfo.total;
		}
		
		//解析显示分页条,点击后去往下一页
		function build_page_nav(result,title){
			$("#page_nav_area").empty();
			//page_nav_area
			var ul = $("<ul></ul>").addClass("pagination")
			var firstPageLi = $("<li></li>").append($("<a></a>").append("首页").attr("href","#"));
			var prePageLi = $("<li></li>").append($("<a></a>").append("&laquo;"));
			
			if (result.extend.pageInfo.hasPreviousPage == false) {
				firstPageLi.addClass("disabled");
				prePageLi.addClass("disabled");
			} else {
				//构建点击事件
				firstPageLi.click(function(){
					toPage(title,1);
				});
				prePageLi.click(function(){
					toPage(result.extend.pageInfo.pageNum - 1);
				});
			}
			var nextPageLi = $("<li></li>").append($("<a></a>").append("&raquo;"));
			var lastPageLi = $("<li></li>").append($("<a></a>").append("末页").attr("href","#"));
			
			if (result.extend.pageInfo.hasNextPage == false) {
				nextPageLi.addClass("disabled");
				lastPageLi.addClass("disabled");
			} else {
				//构建点击事件
				nextPageLi.click(function(){
					toPage(title,result.extend.pageInfo.pageNum + 1);
				});
				lastPageLi.click(function(){
					toPage(title,result.extend.pageInfo.pages);
				});
			}
			//添加首页和前一页的按钮
			ul.append(firstPageLi).append(prePageLi);
			//1,2,3遍历提供提示
			$.each(result.extend.pageInfo.navigatepageNums, function(index,item){
				var numLi = $("<li></li>").append($("<a></a>").append(item));
				if (result.extend.pageInfo.pageNum == item) {
					numLi.addClass("active");
				}
				numLi.click(function(){
					toPage(title,item);
				});
				ul.append(numLi);
			});
			//添加末页和后一页的按钮
			ul.append(nextPageLi).append(lastPageLi);
			
			var navEle = $("<nav></nav>").append(ul);
			navEle.appendTo("#page_nav_area");
		}
	</script>
</body>
</html>