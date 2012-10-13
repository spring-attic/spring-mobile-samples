<%@ page session="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
	<head>
		<title>Spring Mobile | Lite Showcase</title>
	</head>
	<body>
		<header>
			<h1>Device Resolver Example</h1>
		</header>
		<p>
			<c:if test="${currentDevice.mobile}">Hello mobile user!</c:if>
			<c:if test="${currentDevice.tablet}">Hello tablet user!</c:if>
			<c:if test="${currentDevice.normal}">Hello desktop user!</c:if>
		</p>
		<footer>
			An Apache-licensed technology showcase by SpringSource.
		</footer>
	</body>
</html>