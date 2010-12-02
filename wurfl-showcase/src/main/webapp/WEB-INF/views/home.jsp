<%@ page session="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s" %>
<!DOCTYPE html>
<html>
	<head>
		<title>Spring Mobile | Wurfl Showcase | Normal Site Home</title>
	</head>
	<body>
		<h2>Hello normal user!</h2>
		<p>
			Prefer the <a href="${pageContext.request.contextPath}?site_preference=mobile">mobile site</a>?
		</p>
		<p>
			If you have not indicated a site preference, try switching your User-Agent to a mobile device and refreshing this page.
			This is easy to do with the Firefox User Agent Switcher add-on or Safari Develop menu.
			Upon refresh, you should see the mobile version of this page.
		</p>
		<p>
			View your cookies to see if a site preference has been saved and delete the cookie to reset it.
		</p>
		<h3>Device Information</h3>
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
