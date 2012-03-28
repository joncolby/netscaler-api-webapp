

<%@ page import="de.mobile.siteops.NetscalerService" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
        <meta name="layout" content="main" />
        <g:set var="entityName" value="${message(code: 'netscalerService.label', default: 'NetscalerService')}" />
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
            <g:hasErrors bean="${netscalerServiceInstance}">
            <div class="errors">
                <g:renderErrors bean="${netscalerServiceInstance}" as="list" />
            </div>
            </g:hasErrors>
            <g:form method="post" >
                <g:hiddenField name="id" value="${netscalerServiceInstance?.id}" />
                <g:hiddenField name="version" value="${netscalerServiceInstance?.version}" />
                <div class="dialog">
                    <table>
                        <tbody>
                        
                            <tr class="prop">
                                <td valign="top" class="name">
                                  <label for="dataCenter"><g:message code="netscalerService.dataCenter.label" default="Data Center" /></label>
                                </td>
                                <td valign="top" class="value ${hasErrors(bean: netscalerServiceInstance, field: 'dataCenter', 'errors')}">
                                    <g:textField name="dataCenter" value="${fieldValue(bean: netscalerServiceInstance, field: 'dataCenter')}" />
                                </td>
                            </tr>
                        
                            <tr class="prop">
                                <td valign="top" class="name">
                                  <label for="ipAddress"><g:message code="netscalerService.ipAddress.label" default="Ip Address" /></label>
                                </td>
                                <td valign="top" class="value ${hasErrors(bean: netscalerServiceInstance, field: 'ipAddress', 'errors')}">
                                    <g:textField name="ipAddress" value="${netscalerServiceInstance?.ipAddress}" />
                                </td>
                            </tr>
                        
                            <tr class="prop">
                                <td valign="top" class="name">
                                  <label for="lbvserver"><g:message code="netscalerService.lbvserver.label" default="Lbvserver" /></label>
                                </td>
                                <td valign="top" class="value ${hasErrors(bean: netscalerServiceInstance, field: 'lbvserver', 'errors')}">
                                    <g:select name="lbvserver.id" from="${de.mobile.siteops.NetscalerLbvserver.list()}" optionKey="id" value="${netscalerServiceInstance?.lbvserver?.id}"  />
                                </td>
                            </tr>
                        
                            <tr class="prop">
                                <td valign="top" class="name">
                                  <label for="name"><g:message code="netscalerService.name.label" default="Name" /></label>
                                </td>
                                <td valign="top" class="value ${hasErrors(bean: netscalerServiceInstance, field: 'name', 'errors')}">
                                    <g:textField name="name" value="${netscalerServiceInstance?.name}" />
                                </td>
                            </tr>
                        
                            <tr class="prop">
                                <td valign="top" class="name">
                                  <label for="port"><g:message code="netscalerService.port.label" default="Port" /></label>
                                </td>
                                <td valign="top" class="value ${hasErrors(bean: netscalerServiceInstance, field: 'port', 'errors')}">
                                    <g:textField name="port" value="${fieldValue(bean: netscalerServiceInstance, field: 'port')}" />
                                </td>
                            </tr>
                        
                            <tr class="prop">
                                <td valign="top" class="name">
                                  <label for="serviceType"><g:message code="netscalerService.serviceType.label" default="Service Type" /></label>
                                </td>
                                <td valign="top" class="value ${hasErrors(bean: netscalerServiceInstance, field: 'serviceType', 'errors')}">
                                    <g:textField name="serviceType" value="${netscalerServiceInstance?.serviceType}" />
                                </td>
                            </tr>
                        
                            <tr class="prop">
                                <td valign="top" class="name">
                                  <label for="state"><g:message code="netscalerService.state.label" default="State" /></label>
                                </td>
                                <td valign="top" class="value ${hasErrors(bean: netscalerServiceInstance, field: 'state', 'errors')}">
                                    <g:textField name="state" value="${netscalerServiceInstance?.state}" />
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
