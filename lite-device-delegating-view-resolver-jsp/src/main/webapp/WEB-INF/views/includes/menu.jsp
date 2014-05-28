<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<p> Select site preference: 
	<c:choose>
		<c:when test="${currentSitePreference.normal}"> 
			Normal | 
			<a href="?site_preference=mobile">Mobile</a> | 
			<a href="?site_preference=tablet">Tablet</a>
		</c:when>
		<c:when test="${currentSitePreference.mobile}"> 
			<a href="?site_preference=normal">Normal</a> | 
			Mobile | 
			<a href="?site_preference=tablet">Tablet</a>
		</c:when>
		<c:when test="${currentSitePreference.tablet}"> 
			<a href="?site_preference=normal">Normal</a> | 
			<a href="?site_preference=mobile">Mobile</a> | 
			Tablet
		</c:when>
		<c:otherwise>
			<a href="?site_preference=normal">Normal</a> | 
			<a href="?site_preference=mobile">Mobile</a> | 
			<a href="?site_preference=tablet">Tablet</a>
		</c:otherwise>
	</c:choose>
</p>
