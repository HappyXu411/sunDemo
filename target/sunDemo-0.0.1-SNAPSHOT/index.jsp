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
<script type="text/javascript" src="${APP_PATH }/static/js/jquery-1.12.4.min.js"></script>
<link href="${APP_PATH }/static/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
<script src="${APP_PATH }/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container">
		<div style="float:right;">
			<input class="form-control" style="display:inline-block;width:200px;" id="doc_find_input" placeholder="输入你想要查询的文章标题"/><button type="submit" style="display:inline-block;" class="btn btn-default" id="doc_find_modal_btn">查询</button>
		</div>
	</div>
	<iframe id="iframepage" name="iframepage"  frameBorder=0 scrolling=no width=100% src="views/default_1.html" onLoad="iFrameHeight()"></iframe> 
	<script>
		function iFrameHeight() {
			var iframeid= document.getElementById("iframepage");
			if (document.getElementById){
				if (iframeid && !window.opera){
				    if (iframeid.contentDocument && iframeid.contentDocument.body.offsetHeight){
				    	iframeid.height = iframeid.contentDocument.body.offsetHeight;
				    }else if(iframeid.Document && iframeid.Document.body.scrollHeight){
				    	iframeid.height = iframeid.Document.body.scrollHeight;
				    }
				}
			}
		}
			
		function validate_find_form(query){
			var str = query;
			var regex = /^[\u2E80-\u9FFF]+$/;
			if (!regex.test(str)){
				alert("必须是输入中文的标题");
				return false;
			} else {
				return true;
			}
		}
		
		
		$("#doc_find_modal_btn").click(function(){
			//1.将填写好的表单内容提交给服务器进行保存
			//提交之前先对数据进行合法性检验

			var title = $("#doc_find_input").val();
			if (!(validate_find_form(title))){
				return false;
			}
			//2.开始进行查询
			$.ajax({
				url: "/sunDemo/findByTitle",
				data: "title=" + encodeURI(title),
				type:"get",
				success:function(result){
					var href = "resultList.jsp?title=" + encodeURI(title);
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