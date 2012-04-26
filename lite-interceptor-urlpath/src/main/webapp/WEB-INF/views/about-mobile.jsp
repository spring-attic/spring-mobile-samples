<%@ page session="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
	<head>
		<title>Spring Mobile | Lite Showcase</title>
		<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
	</head>
	<body>
		<header>
			<h1>About (Mobile Site)</h1>
		</header>
		<content>
			<p>Return to the <a href="<c:url value="/" />">Home</a> page.</p>
		</content>
		<footer>
			An Apache-licensed technology showcase by SpringSource.
		</footer>
		<aside id="site-switcher">
			<p>Site: <c:if test="${currentSitePreference.mobile}"><a href="?site_preference=normal">Normal</a> | Mobile</c:if><c:if test="${!currentSitePreference.mobile}">Normal | <a href="?site_preference=mobile">Mobile</a></c:if></p>
		</aside>
	</body>
</html>
