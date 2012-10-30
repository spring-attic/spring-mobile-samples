<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<style>
table{
 	margin:30px;   
}

table{
    border-collapse: seperate;
    border-spacing: 0px;
    border: 1px solid gray;
}

td{
    border: 1px solid gray;
    padding: 6px;
}

thead{
	font-weight: bold;
}

tbody{
	text-align: center;
}
</style>
<table>
	<thead>
		<tr><td>Current Site Preference</td><td>Current Device</td></tr>
	</thead>
	<tbody>
		<tr>
			<td>
			<c:choose>
				<c:when test="${currentSitePreference.normal}">
						Normal
				</c:when>
				<c:when test="${currentSitePreference.mobile}">
						Mobile
				</c:when>
				<c:when test="${currentSitePreference.tablet}">
						Tablet
				</c:when>
				<c:otherwise>
						None
				</c:otherwise>
			</c:choose>
			</td>
			<td>
			<c:choose>
				<c:when test="${currentDevice.normal}">
						Normal
				</c:when>
				<c:when test="${currentDevice.mobile}">
						Mobile
				</c:when>
				<c:when test="${currentDevice.tablet}">
						Tablet
				</c:when>
				<c:otherwise>
						None
				</c:otherwise>
			</c:choose>
			</td>
		</tr>
	</tbody>
</table>