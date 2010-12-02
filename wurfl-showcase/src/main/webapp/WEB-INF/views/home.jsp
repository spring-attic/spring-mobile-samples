<%@ page session="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s" %>
<!DOCTYPE html>
<html>
	<head>
		<title>Spring Mobile | Wurfl Showcase | Desktop Home</title>
	</head>
	<body>
		<h2>Hello desktop user!</h2>
		<p>
			Try switching your User-Agent to a mobile device and refreshing this page.
			This is easy to do with the Firefox User Agent Switcher add-on or Safari Develop menu.
			Alternatively, just indicate a <a href="${pageContext.request.contextPath}?site_preference=mobile">mobile site preference</a>.
		</p>
		<p>Your browser:</p>
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
