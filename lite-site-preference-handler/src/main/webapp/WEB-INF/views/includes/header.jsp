<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<header>
	<h1>
		<c:choose>
			<c:when test="${currentSitePreference.normal}">
				Normal Site
			</c:when>
			<c:when test="${currentSitePreference.mobile}">
				Mobile Site
			</c:when>
			<c:when test="${currentSitePreference.tablet}">
				Tablet Site
			</c:when>
			<c:otherwise>
				Default Site (no site preference)
			</c:otherwise>
		</c:choose>
	</h1>
</header>