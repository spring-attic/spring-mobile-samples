<%@ page session="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
	<head>
		<title>Spring Mobile | Lite Device Resolver XML</title>
	</head>
	<body>
		<header>
			<h1>Device Resolver Example</h1>
		</header>
		<p>Device: 
			<c:choose>
				<c:when test="${currentDevice.normal}">Normal</c:when>
				<c:when test="${currentDevice.mobile}">Mobile</c:when>
				<c:when test="${currentDevice.tablet}">Tablet</c:when>
				<c:otherwise>Default</c:otherwise>
			</c:choose>
		</p>
	</body>
</html>
