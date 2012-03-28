
<%@ page import="de.mobile.siteops.NetscalerAppliance" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
        <meta name="layout" content="main" />
        <g:set var="entityName" value="${message(code: 'netscalerAppliance.label', default: 'NetscalerAppliance')}" />
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
                            <td valign="top" class="name"><g:message code="netscalerAppliance.id.label" default="Id" /></td>
                            
                            <td valign="top" class="value">${fieldValue(bean: netscalerApplianceInstance, field: "id")}</td>
                            
                        </tr>
                    
                        <tr class="prop">
                            <td valign="top" class="name"><g:message code="netscalerAppliance.role.label" default="Role" /></td>
                            
                            <td valign="top" class="value">${fieldValue(bean: netscalerApplianceInstance, field: "role")}</td>
                            
                        </tr>
                    
                        <tr class="prop">
                            <td valign="top" class="name"><g:message code="netscalerAppliance.dataCenter.label" default="Data Center" /></td>
                            
                            <td valign="top" class="value">${fieldValue(bean: netscalerApplianceInstance, field: "dataCenter")}</td>
                            
                        </tr>
                    
                        <tr class="prop">
                            <td valign="top" class="name"><g:message code="netscalerAppliance.dateCreated.label" default="Date Created" /></td>
                            
                            <td valign="top" class="value"><g:formatDate date="${netscalerApplianceInstance?.dateCreated}" /></td>
                            
                        </tr>
                    
                        <tr class="prop">
                            <td valign="top" class="name"><g:message code="netscalerAppliance.ipAddress.label" default="Ip Address" /></td>
                            
                            <td valign="top" class="value">${fieldValue(bean: netscalerApplianceInstance, field: "ipAddress")}</td>
                            
                        </tr>
                    
                        <tr class="prop">
                            <td valign="top" class="name"><g:message code="netscalerAppliance.lastUpdated.label" default="Last Updated" /></td>
                            
                            <td valign="top" class="value"><g:formatDate date="${netscalerApplianceInstance?.lastUpdated}" /></td>
                            
                        </tr>
                    
                        <tr class="prop">
                            <td valign="top" class="name"><g:message code="netscalerAppliance.lbvservers.label" default="Lbvservers" /></td>
                            
                            <td valign="top" style="text-align: left;" class="value">
                                <ul>
                                <g:each in="${netscalerApplianceInstance.lbvservers}" var="l">
                                    <li><g:link controller="netscalerLbvserver" action="show" id="${l.id}">${l?.encodeAsHTML()}</g:link></li>
                                </g:each>
                                </ul>
                            </td>
                            
                        </tr>
                    
                        <tr class="prop">
                            <td valign="top" class="name"><g:message code="netscalerAppliance.managed.label" default="Managed" /></td>
                            
                            <td valign="top" class="value"><g:formatBoolean boolean="${netscalerApplianceInstance?.managed}" /></td>
                            
                        </tr>
                    
                        <tr class="prop">
                            <td valign="top" class="name"><g:message code="netscalerAppliance.password.label" default="Password" /></td>
                            
                            <td valign="top" class="value">${fieldValue(bean: netscalerApplianceInstance, field: "password")}</td>
                            
                        </tr>
                    
                        <tr class="prop">
                            <td valign="top" class="name"><g:message code="netscalerAppliance.protocol.label" default="Protocol" /></td>
                            
                            <td valign="top" class="value">${fieldValue(bean: netscalerApplianceInstance, field: "protocol")}</td>
                            
                        </tr>
                    
                        <tr class="prop">
                            <td valign="top" class="name"><g:message code="netscalerAppliance.username.label" default="Username" /></td>
                            
                            <td valign="top" class="value">${fieldValue(bean: netscalerApplianceInstance, field: "username")}</td>
                            
                        </tr>
                    
                    </tbody>
                </table>
            </div>
            <div class="buttons">
                <g:form>
                    <g:hiddenField name="id" value="${netscalerApplianceInstance?.id}" />
                    <span class="button"><g:actionSubmit class="edit" action="edit" value="${message(code: 'default.button.edit.label', default: 'Edit')}" /></span>
                    <span class="button"><g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" /></span>
                </g:form>
            </div>
        </div>
    </body>
</html>
