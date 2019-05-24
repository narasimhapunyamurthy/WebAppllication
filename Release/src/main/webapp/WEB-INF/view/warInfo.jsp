<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    <%@taglib prefix="fun" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Hello</h1>
	<table>
 <thead>
  <tr>
   <td>Name</td>
   <td>Phone</td>
  </tr>
 </thead>
 <tbody>
<c:if test="${not empty list}">

		<ul>
			<c:forEach var="listValue" items="${list}">
				<li>${listValue}</li>
			</c:forEach>
		</ul>

	</c:if>
 </tbody>
</table>
</body>
</html>