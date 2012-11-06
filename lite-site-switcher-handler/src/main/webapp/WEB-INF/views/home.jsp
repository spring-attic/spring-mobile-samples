<%@ page session="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
	<head>
		<title>Spring Mobile | Lite Site Switcher Handler</title>
	</head>
	<body>
		<header>
			<h1>Home</h1>
		</header>
		<%@include file="includes/content.jsp" %>
		<footer>
			An Apache-licensed technology showcase by SpringSource.
		</footer>
		<aside>
			<p>Home | <a href="<c:url value="/about" />">About</a></p>
		</aside>
	</body>
</html>