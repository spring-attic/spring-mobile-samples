<%@ page session="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s" %>
<!DOCTYPE html>
<html>
	<head>
		<title>Spring Mobile | Wurfl Showcase | Mobile Home</title>
	</head>
	<body>
		<h2>Hello mobile user!</h2>
		<p><a href="${pageContext.request.contextPath}/wng">View a mobile page</a> rendered by the WURFL "Wall NG" library</p>
		<p>Prefer the <a href="${pageContext.request.contextPath}?site_preference=normal">normal site</a> instead?
		<p>Your mobile device:</p>
		<ul>
			<li>${currentDevice.userAgent}</li>
		</ul>
		<p>is capable of:</p>		
		<ul>
			<s:eval expression="new java.util.TreeMap(currentDevice.capabilities)" var="sortedCapabilities" />
			<c:forEach var="capability" items="${sortedCapabilities}">
				<li>${capability}</li>
			</c:forEach>
		</ul>	
		<p>and has a preferred markup grade of:</p>
		<ul>
			<li>${currentDevice.markUp}</li>
		</ul>
	</body>
</html>
