<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>"/practice02/req2 POST 요청</h1>

	<div>
		<form action= "/request03/param2" method = "post">
			<input type = "text" name = "name"> <br>
			<input type = "text" name = "count"> <br>
			<button  type = "submit">전송</button>
		</form>
	</div>
</body>
</html>