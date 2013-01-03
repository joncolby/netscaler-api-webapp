<g:set var="a" value="${statsArray[0]}" />
<g:each in="${a}" var="header">${header.key.toString().substring(header.key.toString().indexOf('.')+1,header.key.toString().length())} </g:each>
<g:each in="${statsArray}"><g:each in="${it}" var="map"><g:if test="${map.value != ''}">${map.value}</g:if><g:else>NULL</g:else> </g:each>
</g:each>