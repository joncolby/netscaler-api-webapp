
<%@ page import="de.mobile.siteops.NetscalerLbvserver" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
        <meta name="layout" content="main" />
        <g:set var="entityName" value="${message(code: 'netscalerLbvserver.label', default: 'NetscalerLbvserver')}" />
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
                            <td valign="top" class="name"><g:message code="netscalerLbvserver.id.label" default="Id" /></td>
                            
                            <td valign="top" class="value">${fieldValue(bean: netscalerLbvserverInstance, field: "id")}</td>
                            
                        </tr>
                    
                        <tr class="prop">
                            <td valign="top" class="name"><g:message code="netscalerLbvserver.name.label" default="Name" /></td>
                            
                            <td valign="top" class="value">${fieldValue(bean: netscalerLbvserverInstance, field: "name")}</td>
                            
                        </tr>
                    
                        <tr class="prop">
                            <td valign="top" class="name"><g:message code="netscalerLbvserver.dataCenter.label" default="Data Center" /></td>
                            
                            <td valign="top" class="value">${fieldValue(bean: netscalerLbvserverInstance, field: "dataCenter")}</td>
                            
                        </tr>
                    
                        <tr class="prop">
                            <td valign="top" class="name"><g:message code="netscalerLbvserver.dateCreated.label" default="Date Created" /></td>
                            
                            <td valign="top" class="value"><g:formatDate date="${netscalerLbvserverInstance?.dateCreated}" /></td>
                            
                        </tr>
                    
                        <tr class="prop">
                            <td valign="top" class="name"><g:message code="netscalerLbvserver.ipAddress.label" default="Ip Address" /></td>
                            
                            <td valign="top" class="value">${fieldValue(bean: netscalerLbvserverInstance, field: "ipAddress")}</td>
                            
                        </tr>
                    
                        <tr class="prop">
                            <td valign="top" class="name"><g:message code="netscalerLbvserver.lastUpdated.label" default="Last Updated" /></td>
                            
                            <td valign="top" class="value"><g:formatDate date="${netscalerLbvserverInstance?.lastUpdated}" /></td>
                            
                        </tr>
                    
                        <tr class="prop">
                            <td valign="top" class="name"><g:message code="netscalerLbvserver.netscaler.label" default="Netscaler" /></td>
                            
                            <td valign="top" class="value"><g:link controller="netscalerAppliance" action="show" id="${netscalerLbvserverInstance?.netscaler?.id}">${netscalerLbvserverInstance?.netscaler?.encodeAsHTML()}</g:link></td>
                            
                        </tr>
                    
                        <tr class="prop">
                            <td valign="top" class="name"><g:message code="netscalerLbvserver.port.label" default="Port" /></td>
                            
                            <td valign="top" class="value">${fieldValue(bean: netscalerLbvserverInstance, field: "port")}</td>
                            
                        </tr>
                    
                        <tr class="prop">
                            <td valign="top" class="name"><g:message code="netscalerLbvserver.serviceType.label" default="Service Type" /></td>
                            
                            <td valign="top" class="value">${fieldValue(bean: netscalerLbvserverInstance, field: "serviceType")}</td>
                            
                        </tr>
                    
                        <tr class="prop">
                            <td valign="top" class="name"><g:message code="netscalerLbvserver.services.label" default="Services" /></td>
                            
                            <td valign="top" style="text-align: left;" class="value">
                                <ul>
                                <g:each in="${netscalerLbvserverInstance.services}" var="s">
                                    <li><g:link controller="netscalerService" action="show" id="${s.id}">${s?.encodeAsHTML()}</g:link></li>
                                </g:each>
                                </ul>
                            </td>
                            
                        </tr>
                    
                        <tr class="prop">
                            <td valign="top" class="name"><g:message code="netscalerLbvserver.state.label" default="State" /></td>
                            
                            <td valign="top" class="value">${fieldValue(bean: netscalerLbvserverInstance, field: "state")}</td>
                            
                        </tr>
                    
                    </tbody>
                </table>
            </div>
            <div class="buttons">
                <g:form>
                    <g:hiddenField name="id" value="${netscalerLbvserverInstance?.id}" />
                    <span class="button"><g:actionSubmit class="edit" action="edit" value="${message(code: 'default.button.edit.label', default: 'Edit')}" /></span>
                    <span class="button"><g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" /></span>
                </g:form>
            </div>
        </div>
    </body>
</html>
