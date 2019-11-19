<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>
<head>
<base href="<%=basePath%>">
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery-3.4.1.min.js"></script>
</head>
<body>
	<form id="form" >
			<label id="tip">${msg }</label><br/>
			用户名:<input type="text" name="user_name"><br>
			密码:<input type="password" name="password"><br>
			邮箱:<input type="text" name="email"><br>
			<input id="btn" type="button" value="添加">
	</form>
	
	<script type="text/javascript">
		$("#btn").on("click",function(){
			$.ajax({
				url:"user/addUser",
				data:$("#form").serialize(), // 序列化表单的值
				
				success: function(data){					
					alert(data[0].user_name);
					alert(data[1].message);
					alert(data[2]);
				}
			});
		})
	</script>
</body>
</html>