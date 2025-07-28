<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>새로운 도서 정보 추가 페이지</h1>

	<form action="/book/bookAdd" method="post">
		<input type="text" name="id" placeholder="ID">
		<input type="text" name="title" placeholder="제목">
		<input type="text" name="author" placeholder="저자">
		<input type="text" name="price" placeholder="가격">
		<button type="submit">등록</button>
	</form>
</body>
</html>