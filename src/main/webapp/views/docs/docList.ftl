<!DOCTYPE html>
<html lang="zh-cn">
<head>
    <meta charset="utf-8"/>
    <title>书籍首页</title>
    <script type="text/javascript" src="${basePath}/static/js/jquery-1.12.4.min.js"></script>
	<link href="${basePath}/static/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
	<script src="${basePath}/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
</head>
<body id="body">

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
			<!-- 分页文字信息 -->
			<div class="col-md-6" id="page_info_area">
				
			</div>
			<!-- 分页条信息 -->
			<div class="col-md-6" id="page_nav_area">
				
			</div>
		</div>
	</div>
</body>