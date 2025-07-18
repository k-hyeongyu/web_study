<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	.ad-display-hide{
		display: none;
	}
</style>
</head>
<body>
	<h1>hideAd</h1>

	<!-- HTML주석 -->
	<%-- JSP 서버 주석 --%>
	<c:if test="${hideAd == null}">
		<h2>광고</h2>
		<form action="/practice13/hideAd" method="post" id="adForm">
			<label><input type="checkbox" name="hideAd">24시간 안보기</label>
			<button type="submit">닫기</button>
		</form>
	</c:if>

	<h2>페이지에 표시되는 내용</h2>

	<script>
		
		const adForm = document.getElementById("adForm");
		const chkHide = document.getElementById("chkHide");
		
		adForm.addEventListener("submit", (e)=>{
			e.preventDefault();
			
			//checkbox 체크 O -> form 요청 -> 서버 Post
			//checkbox 체크 X -> 일시적으로 안보이게 -> display:none
			
			if(chkHide.checked == true){
				adForm.submit();
			}else{
				adForm.classList.add('ad-display-hide');'
			}
			
		});
	
	</script>
</body>
</html>