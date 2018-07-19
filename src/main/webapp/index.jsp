<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<title>东莞新闻</title>
<%
	pageContext.setAttribute("APP_PATH", request.getContextPath());
%>
<!-- 
	不以/开始的相对路径找资源，以当前资源的路径为基准，经常容易出问题
	以/开始的相对路径找资源，以当前资源的路径为基准，以服务器的路径为标准（http://localhost:3306),需要加上项目名
	http://localhost:3306/crud
 -->
<script type="text/javascript" src="${APP_PATH }/static/js/jquery-1.12.4.min.js"></script>
<link href="${APP_PATH }/static/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
<script src="${APP_PATH }/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
</head>
<body>
	<!-- 搭建显示页面 -->
	<div class="container">
		<!-- 标题 -->
		<div class="row"></div>
			<div class="col-md-12">
				<h1>文章列表</h1>
			</div>
        <!-- 查询框 -->
		<form class="form-inline" style="float: right;">
			<div class="form-group">
			<input type="text" name="title" class="form-control" id="doc_find_input" placeholder="输入你想要查询的文章ID">
			</div>
			<button type="submit" class="btn btn-default" id="doc_find_modal_btn">查询</button>
		</form>
		<!-- 显示表格数据 -->
		<div class="row">
			<div class="col-md-12">
				<table class="table table-hover" id="docs_table">
					<thead>
						<tr>
							<th>docTitle</th>
							<th>docAuthor</th>
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
		var totalRecord;
		//1.页面加载完成以后，直接去发送一个ajax请求
		$(function(){
			//toPage(1);
		});
		
		//初始化生成页面
		function toPage(pn){
			$.ajax({
				url:"${APP_PATH}/docs",
				//data:"index=" + 0,
				type:"get",
				success:function(result){
					console.log(result);
					//1.解析并显示员工数据
					/*build_docs_table(result);
					//2.解析并显示分页信息
					build_page_info(result);
					//3.解析并显示分页条
					build_page_nav(result);*/
				}
			});
		}
		
		//解析并显示员工数据
		function build_docs_table(result){
			$("#docs_table tbody").empty();
			var docs = result.extend.pageInfo.list;
			$.each(docs,function(index,item){
				var docTitleTd = $("<td></td>").append(item.doctitle)
				var docEditorTd = $("<td></td>").append(item.doceditor);
				$("<tr></tr>").append(docTitleTd)
					.append(docEditorTd)
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
		function build_page_nav(result){
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
					toPage(1);
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
					toPage(result.extend.pageInfo.pageNum + 1);
				});
				lastPageLi.click(function(){
					toPage(result.extend.pageInfo.pages);
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
					toPage(item);
				});
				ul.append(numLi);
			});
			//添加末页和后一页的按钮
			ul.append(nextPageLi).append(lastPageLi);
			
			var navEle = $("<nav></nav>").append(ul);
			navEle.appendTo("#page_nav_area");
		}
		
		function validate_find_form(query){
			var str = query;
			var regex = /^[\u2E80-\u9FFF]+$/;
			if (!regex.test(str)){
				alert("必须是输入中文的标题");
				return false;
			}
		}
		
		
		$("#doc_find_modal_btn").click(function(){
			//1.将填写好的表单内容提交给服务器进行保存
			//提交之前先对数据进行合法性检验
			var title = $("#doc_find_input").val();
			if (validate_find_form(title)){
				return false;
			}
			//2.开始进行查询
			$.ajax({
				url:"${APP_PATH }/findByTitle/" + title.toString(),
				type:"get",
				success:function(result){
					alert(result);
					var href = "resultList.jsp?title=" + title;
					window.location.href = href;
				},
				error:function(){
					alert("该标题不存在");
				}
			});
		});
	</script>
</body>
</html>