<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet" href="css/deptsearch.css">
</head>
<body>
</head>
<body>

	<div id="myOverlay" class="overlay">
		<span class="closebtn" onclick="closeSearch()" title="Close Overlay">×</span>
		<div class="overlay-content">

			<form action="com">
				<input type="hidden" name="command" value="deptone">
				<input type="text" placeholder="부서 번호를 입력해주세요" name="search">
				<button type="submit">
					<i class="fa fa-search"></i>
				</button>
			</form>
		</div>
	</div>

	<h2>하나의 부서 번호 검색 요청</h2>
	<p>input dept id </p>
	<button class="openBtn" onclick="openSearch()">검색하기</button>

	<script>
		function openSearch() {
			document.getElementById("myOverlay").style.display = "block";
		}

		// x 버튼 클릭 시 팝업창(모달) 종료하게 하는 javascript 코드
		function closeSearch() {
			document.getElementById("myOverlay").style.display = "none";
		}
	</script>

</body>
</html>


