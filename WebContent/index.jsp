<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<style>
		table{
	    width: 1282px;
	    height: 739px;
		background-image: url(8.jpg);
		}
	</style>
	<form action="index" method="post">
		<table border="1">
			<tr>
				<td align="center" colspan="7">学员信息</td>
			</tr>
			<tr>
				<td>学员编号</td>
				<td>学员姓名</td>
				<td>学员年龄</td>
				<td></td>
				<td></td>
			</tr>
				<c:forEach items="${lists }" var="li">
					<tr>
						<td>${li.sTuNo }</td>
						<td>${li.sTuName }</td>
						<td>${li.sTuAge }</td>
						<!-- <td><a href="PetServlet?op=findById&pid=${pet.petid }">修改</a><a href="PetServlet?op=delete&pid=${pet.petid }">删除</a></td> -->
					</tr>
			</c:forEach>
		<table>
	</form>
</body>
</html>