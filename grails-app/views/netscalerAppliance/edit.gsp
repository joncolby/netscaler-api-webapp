

<%@ page import="de.mobile.siteops.NetscalerAppliance" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
        <meta name="layout" content="main" />
        <g:set var="entityName" value="${message(code: 'netscalerAppliance.label', default: 'NetscalerAppliance')}" />
        <title><g:message code="default.edit.label" args="[entityName]" /></title>
    </head>
    <body>
        <div class="nav">
            <span class="menuButton"><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></span>
            <span class="menuButton"><g:link class="list" action="list"><g:message code="default.list.label" args="[entityName]" /></g:link></span>
            <span class="menuButton"><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></span>
        </div>
        <div class="body">
            <h1><g:message code="default.edit.label" args="[entityName]" /></h1>
            <g:if test="${flash.message}">
            <div class="message">${flash.message}</div>
            </g:if>
            <g:hasErrors bean="${netscalerApplianceInstance}">
            <div class="errors">
                <g:renderErrors bean="${netscalerApplianceInstance}" as="list" />
            </div>
            </g:hasErrors>
            <g:form method="post" >
                <g:hiddenField name="id" value="${netscalerApplianceInstance?.id}" />
                <g:hiddenField name="version" value="${netscalerApplianceInstance?.version}" />
                <div class="dialog">
                    <table>
                        <tbody>
                        
                            <tr class="prop">
                                <td valign="top" class="name">
                                  <label for="role"><g:message code="netscalerAppliance.role.label" default="Role" /></label>
                                </td>
                                <td valign="top" class="value ${hasErrors(bean: netscalerApplianceInstance, field: 'role', 'errors')}">
                                    <g:select name="role" from="${netscalerApplianceInstance.constraints.role.inList}" value="${netscalerApplianceInstance?.role}" valueMessagePrefix="netscalerAppliance.role"  />
                                </td>
                            </tr>
                        
                            <tr class="prop">
                                <td valign="top" class="name">
                                  <label for="dataCenter"><g:message code="netscalerAppliance.dataCenter.label" default="Data Center" /></label>
                                </td>
                                <td valign="top" class="value ${hasErrors(bean: netscalerApplianceInstance, field: 'dataCenter', 'errors')}">
                                    <g:textField name="dataCenter" value="${fieldValue(bean: netscalerApplianceInstance, field: 'dataCenter')}" />
                                </td>
                            </tr>
                        
                            <tr class="prop">
                                <td valign="top" class="name">
                                  <label for="ipAddress"><g:message code="netscalerAppliance.ipAddress.label" default="Ip Address" /></label>
                                </td>
                                <td valign="top" class="value ${hasErrors(bean: netscalerApplianceInstance, field: 'ipAddress', 'errors')}">
                                    <g:textField name="ipAddress" value="${netscalerApplianceInstance?.ipAddress}" />
                                </td>
                            </tr>
                        
                            <tr class="prop">
                                <td valign="top" class="name">
                                  <label for="lbvservers"><g:message code="netscalerAppliance.lbvservers.label" default="Lbvservers" /></label>
                                </td>
                                <td valign="top" class="value ${hasErrors(bean: netscalerApplianceInstance, field: 'lbvservers', 'errors')}">
                                    
<ul>
<g:each in="${netscalerApplianceInstance?.lbvservers?}" var="l">
    <li><g:link controller="netscalerLbvserver" action="show" id="${l.id}">${l?.encodeAsHTML()}</g:link></li>
</g:each>
</ul>
<g:link controller="netscalerLbvserver" action="create" params="['netscalerAppliance.id': netscalerApplianceInstance?.id]">${message(code: 'default.add.label', args: [message(code: 'netscalerLbvserver.label', default: 'NetscalerLbvserver')])}</g:link>

                                </td>
                            </tr>
                        
                            <tr class="prop">
                                <td valign="top" class="name">
                                  <label for="managed"><g:message code="netscalerAppliance.managed.label" default="Managed" /></label>
                                </td>
                                <td valign="top" class="value ${hasErrors(bean: netscalerApplianceInstance, field: 'managed', 'errors')}">
                                    <g:checkBox name="managed" value="${netscalerApplianceInstance?.managed}" />
                                </td>
                            </tr>
                        
                            <tr class="prop">
                                <td valign="top" class="name">
                                  <label for="password"><g:message code="netscalerAppliance.password.label" default="Password" /></label>
                                </td>
                                <td valign="top" class="value ${hasErrors(bean: netscalerApplianceInstance, field: 'password', 'errors')}">
                                    <g:textField name="password" value="${netscalerApplianceInstance?.password}" />
                                </td>
                            </tr>
                        
                            <tr class="prop">
                                <td valign="top" class="name">
                                  <label for="protocol"><g:message code="netscalerAppliance.protocol.label" default="Protocol" /></label>
                                </td>
                                <td valign="top" class="value ${hasErrors(bean: netscalerApplianceInstance, field: 'protocol', 'errors')}">
                                    <g:textField name="protocol" value="${netscalerApplianceInstance?.protocol}" />
                                </td>
                            </tr>
                        
                            <tr class="prop">
                                <td valign="top" class="name">
                                  <label for="username"><g:message code="netscalerAppliance.username.label" default="Username" /></label>
                                </td>
                                <td valign="top" class="value ${hasErrors(bean: netscalerApplianceInstance, field: 'username', 'errors')}">
                                    <g:textField name="username" value="${netscalerApplianceInstance?.username}" />
                                </td>
                            </tr>
                        
                        </tbody>
                    </table>
                </div>
                <div class="buttons">
                    <span class="button"><g:actionSubmit class="save" action="update" value="${message(code: 'default.button.update.label', default: 'Update')}" /></span>
                    <span class="button"><g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" /></span>
                </div>
            </g:form>
        </div>
    </body>
</html>
