
<%@ page import="de.mobile.siteops.NetscalerService" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
        <meta name="layout" content="main" />
        <g:set var="entityName" value="${message(code: 'netscalerService.label', default: 'NetscalerService')}" />
        <title><g:message code="default.show.label" args="[entityName]" /></title>
    </head>
    <body>
        <div class="nav">
            <span class="menuButton"><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></span>
            <span class="menuButton"><g:link class="list" action="list"><g:message code="default.list.label" args="[entityName]" /></g:link></span>
            <span class="menuButton"><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></span>
        </div>
        <div class="body">
            <h1><g:message code="default.show.label" args="[entityName]" /></h1>
            <g:if test="${flash.message}">
            <div class="message">${flash.message}</div>
            </g:if>
            <div class="dialog">
                <table>
                    <tbody>
                    
                        <tr class="prop">
                            <td valign="top" class="name"><g:message code="netscalerService.id.label" default="Id" /></td>
                            
                            <td valign="top" class="value">${fieldValue(bean: netscalerServiceInstance, field: "id")}</td>
                            
                        </tr>
                    
                        <tr class="prop">
                            <td valign="top" class="name"><g:message code="netscalerService.dataCenter.label" default="Data Center" /></td>
                            
                            <td valign="top" class="value">${fieldValue(bean: netscalerServiceInstance, field: "dataCenter")}</td>
                            
                        </tr>
                    
                        <tr class="prop">
                            <td valign="top" class="name"><g:message code="netscalerService.dateCreated.label" default="Date Created" /></td>
                            
                            <td valign="top" class="value"><g:formatDate date="${netscalerServiceInstance?.dateCreated}" /></td>
                            
                        </tr>
                    
                        <tr class="prop">
                            <td valign="top" class="name"><g:message code="netscalerService.ipAddress.label" default="Ip Address" /></td>
                            
                            <td valign="top" class="value">${fieldValue(bean: netscalerServiceInstance, field: "ipAddress")}</td>
                            
                        </tr>
                    
                        <tr class="prop">
                            <td valign="top" class="name"><g:message code="netscalerService.lastUpdated.label" default="Last Updated" /></td>
                            
                            <td valign="top" class="value"><g:formatDate date="${netscalerServiceInstance?.lastUpdated}" /></td>
                            
                        </tr>
                    
                        <tr class="prop">
                            <td valign="top" class="name"><g:message code="netscalerService.lbvserver.label" default="Lbvserver" /></td>
                            
                            <td valign="top" class="value"><g:link controller="netscalerLbvserver" action="show" id="${netscalerServiceInstance?.lbvserver?.id}">${netscalerServiceInstance?.lbvserver?.encodeAsHTML()}</g:link></td>
                            
                        </tr>
                    
                        <tr class="prop">
                            <td valign="top" class="name"><g:message code="netscalerService.name.label" default="Name" /></td>
                            
                            <td valign="top" class="value">${fieldValue(bean: netscalerServiceInstance, field: "name")}</td>
                            
                        </tr>
                    
                        <tr class="prop">
                            <td valign="top" class="name"><g:message code="netscalerService.port.label" default="Port" /></td>
                            
                            <td valign="top" class="value">${fieldValue(bean: netscalerServiceInstance, field: "port")}</td>
                            
                        </tr>
                    
                        <tr class="prop">
                            <td valign="top" class="name"><g:message code="netscalerService.serviceType.label" default="Service Type" /></td>
                            
                            <td valign="top" class="value">${fieldValue(bean: netscalerServiceInstance, field: "serviceType")}</td>
                            
                        </tr>
                    
                        <tr class="prop">
                            <td valign="top" class="name"><g:message code="netscalerService.state.label" default="State" /></td>
                            
                            <td valign="top" class="value">${fieldValue(bean: netscalerServiceInstance, field: "state")}</td>
                            
                        </tr>
                    
                    </tbody>
                </table>
            </div>
            <div class="buttons">
                <g:form>
                    <g:hiddenField name="id" value="${netscalerServiceInstance?.id}" />
                    <span class="button"><g:actionSubmit class="edit" action="edit" value="${message(code: 'default.button.edit.label', default: 'Edit')}" /></span>
                    <span class="button"><g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" /></span>
                </g:form>
            </div>
        </div>
    </body>
</html>
