<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>${homepageModel.applicationName}</title>
<link rel="stylesheet" href="assets/css/homepage.css" type="text/css"
	media="all">
</head>
<body>
	<div class="header">
		<h1>Welcome in ${homepageModel.applicationName}!</h1>
	</div>
	<div>
		<table class="dataTable">
			<thead>
				<tr>
					<th>First name</th>
					<th>Last name</th>
					<th>Age</th>
					<th>Place of birth</th>
					<th>Profession</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${homepageModel.people}" var="person">
					<tr>
						<td>${person.firstName}</td>
						<td>${person.lastName}</td>
						<td>${person.age}</td>
						<td>${person.placeOfBirth}</td>
						<td>${person.profession}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>
