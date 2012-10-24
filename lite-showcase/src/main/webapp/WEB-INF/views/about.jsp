<%@ page session="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
	<head>
		<title>Spring Mobile | Lite Showcase</title>
	</head>
	<body>
		<header>
			<h1>About (Normal Site)</h1>
		</header>
		<content>
			<p>Return to the <a href="<c:url value="/" />">Home</a> page.</p>
		</content>
		<footer>
			An Apache-licensed technology showcase by SpringSource.
		</footer>
		<aside id="site-preference">
			<p>Site: 
			<c:if test="${currentSitePreference.mobile}"><a href="?site_preference=normal">Normal</a> | Mobile | <a href="?site_preference=tablet">Tablet</a></c:if>
			<c:if test="${currentSitePreference.tablet}"><a href="?site_preference=normal">Normal</a> | <a href="?site_preference=mobile">Mobile</a> | Tablet</c:if>
			<c:if test="${currentSitePreference.normal}">Normal | <a href="?site_preference=mobile">Mobile</a> | <a href="?site_preference=tablet">Tablet</a></c:if>
		</aside>
	</body>
</html>