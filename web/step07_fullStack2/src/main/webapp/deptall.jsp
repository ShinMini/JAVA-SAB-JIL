<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>deptall.jsp</title>
<link rel="stylesheet" href="css/style.css">
</head>

<body>
	<h3 style="margin-bottom: 50px; border-bottom: 1px solid gray;">모든 부서 정보 보기</h3>

	<table id="customers">
		<tr>
			<!-- table header약자 -->
			<th>부서번호</th>
			<th>부서명</th>
			<th>부서위치</th>
		</tr>

	<c:forEach items="${requestScope.allDept}" var="dept">
		<tr>
			<td>${dept.deptno}</td>
			<td>${dept.dname}</td>
			<td>${dept.loc}</td>
		</tr>
	</c:forEach>
	
	</table>

</body>
</html>


