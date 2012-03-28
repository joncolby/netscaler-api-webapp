
<%@ page import="de.mobile.siteops.NetscalerAppliance" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
        <meta name="layout" content="main" />
        <g:set var="entityName" value="${message(code: 'netscalerAppliance.label', default: 'NetscalerAppliance')}" />
        <title><g:message code="default.list.label" args="[entityName]" /></title>
    </head>
    <body>
        <div class="nav">
            <span class="menuButton"><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></span>
            <span class="menuButton"><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></span>
        </div>
        <div class="body">
            <h1><g:message code="default.list.label" args="[entityName]" /></h1>
            <g:if test="${flash.message}">
            <div class="message">${flash.message}</div>
            </g:if>
            <div class="list">
                <table>
                    <thead>
                        <tr>
                        
                            <g:sortableColumn property="id" title="${message(code: 'netscalerAppliance.id.label', default: 'Id')}" />
                        
                            <g:sortableColumn property="role" title="${message(code: 'netscalerAppliance.role.label', default: 'Role')}" />
                        
                            <g:sortableColumn property="dataCenter" title="${message(code: 'netscalerAppliance.dataCenter.label', default: 'Data Center')}" />
                        
                            <g:sortableColumn property="dateCreated" title="${message(code: 'netscalerAppliance.dateCreated.label', default: 'Date Created')}" />
                        
                            <g:sortableColumn property="ipAddress" title="${message(code: 'netscalerAppliance.ipAddress.label', default: 'Ip Address')}" />
                        
                            <g:sortableColumn property="lastUpdated" title="${message(code: 'netscalerAppliance.lastUpdated.label', default: 'Last Updated')}" />
                        
                        </tr>
                    </thead>
                    <tbody>
                    <g:each in="${netscalerApplianceInstanceList}" status="i" var="netscalerApplianceInstance">
                        <tr class="${(i % 2) == 0 ? 'odd' : 'even'}">
                        
                            <td><g:link action="show" id="${netscalerApplianceInstance.id}">${fieldValue(bean: netscalerApplianceInstance, field: "id")}</g:link></td>
                        
                            <td>${fieldValue(bean: netscalerApplianceInstance, field: "role")}</td>
                        
                            <td>${fieldValue(bean: netscalerApplianceInstance, field: "dataCenter")}</td>
                        
                            <td><g:formatDate date="${netscalerApplianceInstance.dateCreated}" /></td>
                        
                            <td>${fieldValue(bean: netscalerApplianceInstance, field: "ipAddress")}</td>
                        
                            <td><g:formatDate date="${netscalerApplianceInstance.lastUpdated}" /></td>
                        
                        </tr>
                    </g:each>
                    </tbody>
                </table>
            </div>
            <div class="paginateButtons">
                <g:paginate total="${netscalerApplianceInstanceTotal}" />
            </div>
        </div>
    </body>
</html>
