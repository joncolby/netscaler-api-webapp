

<%@ page import="de.mobile.siteops.NetscalerLbvserver" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
        <meta name="layout" content="main" />
        <g:set var="entityName" value="${message(code: 'netscalerLbvserver.label', default: 'NetscalerLbvserver')}" />
        <title><g:message code="default.create.label" args="[entityName]" /></title>
    </head>
    <body>
        <div class="nav">
            <span class="menuButton"><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></span>
            <span class="menuButton"><g:link class="list" action="list"><g:message code="default.list.label" args="[entityName]" /></g:link></span>
        </div>
        <div class="body">
            <h1><g:message code="default.create.label" args="[entityName]" /></h1>
            <g:if test="${flash.message}">
            <div class="message">${flash.message}</div>
            </g:if>
            <g:hasErrors bean="${netscalerLbvserverInstance}">
            <div class="errors">
                <g:renderErrors bean="${netscalerLbvserverInstance}" as="list" />
            </div>
            </g:hasErrors>
            <g:form action="save" >
                <div class="dialog">
                    <table>
                        <tbody>
                        
                            <tr class="prop">
                                <td valign="top" class="name">
                                    <label for="name"><g:message code="netscalerLbvserver.name.label" default="Name" /></label>
                                </td>
                                <td valign="top" class="value ${hasErrors(bean: netscalerLbvserverInstance, field: 'name', 'errors')}">
                                    <g:textField name="name" value="${netscalerLbvserverInstance?.name}" />
                                </td>
                            </tr>
                        
                            <tr class="prop">
                                <td valign="top" class="name">
                                    <label for="dataCenter"><g:message code="netscalerLbvserver.dataCenter.label" default="Data Center" /></label>
                                </td>
                                <td valign="top" class="value ${hasErrors(bean: netscalerLbvserverInstance, field: 'dataCenter', 'errors')}">
                                    <g:textField name="dataCenter" value="${fieldValue(bean: netscalerLbvserverInstance, field: 'dataCenter')}" />
                                </td>
                            </tr>
                        
                            <tr class="prop">
                                <td valign="top" class="name">
                                    <label for="ipAddress"><g:message code="netscalerLbvserver.ipAddress.label" default="Ip Address" /></label>
                                </td>
                                <td valign="top" class="value ${hasErrors(bean: netscalerLbvserverInstance, field: 'ipAddress', 'errors')}">
                                    <g:textField name="ipAddress" value="${netscalerLbvserverInstance?.ipAddress}" />
                                </td>
                            </tr>
                        
                            <tr class="prop">
                                <td valign="top" class="name">
                                    <label for="netscaler"><g:message code="netscalerLbvserver.netscaler.label" default="Netscaler" /></label>
                                </td>
                                <td valign="top" class="value ${hasErrors(bean: netscalerLbvserverInstance, field: 'netscaler', 'errors')}">
                                    <g:select name="netscaler.id" from="${de.mobile.siteops.NetscalerAppliance.list()}" optionKey="id" value="${netscalerLbvserverInstance?.netscaler?.id}"  />
                                </td>
                            </tr>
                        
                            <tr class="prop">
                                <td valign="top" class="name">
                                    <label for="port"><g:message code="netscalerLbvserver.port.label" default="Port" /></label>
                                </td>
                                <td valign="top" class="value ${hasErrors(bean: netscalerLbvserverInstance, field: 'port', 'errors')}">
                                    <g:textField name="port" value="${fieldValue(bean: netscalerLbvserverInstance, field: 'port')}" />
                                </td>
                            </tr>
                        
                            <tr class="prop">
                                <td valign="top" class="name">
                                    <label for="serviceType"><g:message code="netscalerLbvserver.serviceType.label" default="Service Type" /></label>
                                </td>
                                <td valign="top" class="value ${hasErrors(bean: netscalerLbvserverInstance, field: 'serviceType', 'errors')}">
                                    <g:textField name="serviceType" value="${netscalerLbvserverInstance?.serviceType}" />
                                </td>
                            </tr>
                        
                            <tr class="prop">
                                <td valign="top" class="name">
                                    <label for="state"><g:message code="netscalerLbvserver.state.label" default="State" /></label>
                                </td>
                                <td valign="top" class="value ${hasErrors(bean: netscalerLbvserverInstance, field: 'state', 'errors')}">
                                    <g:textField name="state" value="${netscalerLbvserverInstance?.state}" />
                                </td>
                            </tr>
                        
                        </tbody>
                    </table>
                </div>
                <div class="buttons">
                    <span class="button"><g:submitButton name="create" class="save" value="${message(code: 'default.button.create.label', default: 'Create')}" /></span>
                </div>
            </g:form>
        </div>
    </body>
</html>
