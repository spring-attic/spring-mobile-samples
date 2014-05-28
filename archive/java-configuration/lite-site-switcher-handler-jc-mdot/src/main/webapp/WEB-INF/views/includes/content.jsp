<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<p>
<c:choose>
	<c:when test="${currentDevice.normal}">
	You are currently viewing this page from a <strong>normal</strong> device. The site switcher has returned
	the normal site.
	</c:when>
	<c:when test="${currentDevice.mobile}">
	You are currently viewing this page from a <strong>mobile</strong> device. Note the URL begins with "m.".
	This means the site switcher has redirected you to the mobile version of the site.
	</c:when>
	<c:when test="${currentDevice.tablet}">
	You are currently viewing this page from a <strong>tablet</strong> device. Depending on how you have the 
	site switcher configured tablets are either presented with the normal site, or the mobile site.
	</c:when>
	<c:otherwise>
	No device was detected. This usually means that the device resolver is not configured properly.
	In this case, the site switcher will return the normal site.
	</c:otherwise>
</c:choose>
</p>
