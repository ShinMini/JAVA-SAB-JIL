<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>deptview.jsp</title>
<link rel="stylesheet" href="css/style.css">
</head>
<body>
	<h3 style="margin-bottom: 50px; border-bottom: 1px solid gray;">하나의 probono 정보 보기</h3>

	<table id="customers">
		<tr>
			<!-- table header약자 -->
			<th>probono id</th>
			<th>probono name</th>
			<th>probono purpose</th>
		</tr>
 
		<tr>
			<td>${requestScope.one.probonoId}</td>
			<td>${requestScope.one.ProbonoName}</td>
			<td>${requestScope.one.ProbonoPurpose}</td>
		</tr>

</body>
</html>