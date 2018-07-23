<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>新闻</title>
<script type="text/javascript" src="../static/js/jquery-1.12.4.min.js"></script>
<link href="../static/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
<script src="../static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container">
		<!-- 标题 -->
		<div class="row"></div>
			<div class="col-md-12">
				<h1>文章列表</h1>
			</div>
		<!-- 显示表格数据 -->
		<div class="row">
			<div class="col-md-12">
				<table class="table table-hover" id="docs_table">
					<thead>
						<tr>
							<th>文章标题</th>
						</tr>
					</thead>
					<tbody>
						<#list docLists as docList>
							<tr><td>${docList.title}</td></tr>
						</#list>
					</tbody>
				</table>
			</div>
		</div>
		<!-- 显示分页信息 -->
		<div class="row">
			<!-- 分页条信息 -->
			<div class="col-md-6" id="page_nav_area">
				
			</div>
		</div>
	</div>
	<script type="text/javascript">
		var array = [];
		
		function buildArray(){
			for (var i = ${pageNum};i <= ${pageNum + 4};i++){
				if (i == ${listNum}){
					array.push(${listNum});
					return;
				}
				array.push(i);
			}
		}
		
		$(function(){
			buildArray();
			build_page_nav();
		});
		
		
		//解析显示分页条,点击后去往下一页
		function build_page_nav(){
			$("#page_nav_area").empty();
			//page_nav_area
			var ul = $("<ul></ul>").addClass("pagination")
			var firstPageLi = $("<li></li>").append($("<a></a>").append("首页").attr("href","#"));
			var prePageLi = $("<li></li>").append($("<a></a>").append("&laquo;"));
			
			if (${preNum} == false) {
				firstPageLi.addClass("disabled");
				prePageLi.addClass("disabled");
			} else {
				//构建点击事件
				firstPageLi.children("a").attr("href","default_1.html");
				prePageLi.children("a").attr("href","default_" + ${pageNum - 1} + ".html");
			}
			var nextPageLi = $("<li></li>").append($("<a></a>").append("&raquo;"));
			var lastPageLi = $("<li></li>").append($("<a></a>").append("末页").attr("href","#"));
			
			if (${nextNum} == false) {
				nextPageLi.addClass("disabled");
				lastPageLi.addClass("disabled");
			} else {
				//构建点击事件
				nextPageLi.children("a").attr("href","default_" + ${pageNum + 1} + ".html");
				lastPageLi.children("a").attr("href","default_" + ${listNum} + ".html");
			}
			//添加首页和前一页的按钮
			ul.append(firstPageLi).append(prePageLi);
			//1,2,3遍历提供提示
			$.each(array, function(index,item){
				var numLi = $("<li></li>").append($("<a></a>").attr("href","default_" + item + ".html").append(item));
				if (${pageNum} == item) {
					numLi.addClass("active");
				}
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