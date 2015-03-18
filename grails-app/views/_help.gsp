<g:set var="context" value="${createLinkTo(dir: '/')}" />
<html>
    <head>
        <title>Netscaler REST API Help</title>
	<!-- meta name="layout" content="main" / -->
    </head>
    <body>
        <h1 style="margin-left:20px;">Netscaler REST API Help</h1>
        <p style="margin-left:20px;width:80%">Functions are available for an <b>lbvserver</b> and a <b>service</b>.<BR/>
        An <b>lbvserver</b> is the "virtual service" name.<BR/>
        A <b>service</b> is usually a particular host that is bound to the lbvserver. <BR/>
        <b>** Note disabling of services is performed gracefully with a default delay of 1000 seconds **</b>
        </p>
        <div class="dialog" style="margin-left:20px;width:60%;">

        <h2>Lbvserver functions:</h2>

        <table border="1">
        <tr>
        <th>function</th>
        <th>rest syntax</th>
        <th>example</th>
        </tr>

        <tr>
        <td>Show bindings and status of an lbserver</td>
        <td>${context}lbvserver/read/<b>lbvserver</b>[?datacenter=]</td>
        <td>${context}lbvserver/read/<b>replyts-rz</b></td>
        </tr>

        <tr>
        <td>Show bindings and status of ALL lbservers</td>
        <td><a href="<g:createLink controller="lbvserver" action="read" />"><g:createLink action="read" controller="lbvserver" /></a>[?datacenter=]</td>
        <td><a href="<g:createLink controller="lbvserver" action="read" />"><g:createLink action="read" controller="lbvserver" /></a></td>
        </tr>


        <tr>
        <td>Show status of an lbserver</td>
        <td>${context}lbvserver/list/<b>lbvserver</b>[?datacenter=]</td>
        <td>${context}lbvserver/list/<b>replyts-rz</b></td>
        </tr>

        <tr>
        <td>Show status of ALL lbservers</td>
        <td><a href="<g:createLink controller="lbvserver" action="list" />"><g:createLink action="list" controller="lbvserver" /></a>  [?datacenter=]</td>
        <td><a href="<g:createLink controller="lbvserver" action="list" />"><g:createLink action="list" controller="lbvserver" /></a></td>
        </tr>




        </table>


      <h2>Service functions:</h2>

        <table border="1" width="100%">
        <tr>
        <th>function</th>
        <th>rest syntax</th>
        <th>example</th>
        </tr>


       <tr>
       <td>Show service status</td>
       <td>${context}service/read/<b>hostname</b> | <b>servicename</b></td>
       <td>${context}service/read/<b>anyserver99-9</b></td>
       </tr>


        <tr>
        <td>Take service (host) IN SERVICE</td>
        <td>${context}service/in/<b>hostname</b> | <b>servicename</b></td>
        <td>${context}service/in/<b>anyserver99-9</b></td>
        </tr>

        <tr>
        <td>Take service (host) OUT OF SERVICE <b>gracefully<b></b></td>
        <td>${context}service/out/<b>hostname</b> | <b>servicename</b></td>
        <td>${context}service/out/<b>anyserver99-9</b></td>
        </tr>

        <tr>
        <td NOWRAP>Take service (host) OUT OF SERVICE <b>forcefully</b></br>(destroy established connections)</td>
        <td NOWRAP>${context}service/forceout/<b>hostname</b> | <b>servicename</b></td>
        <td NOWRAP>${context}service/forceout/<b>anyserver99-9</b></td>
        </tr>

        <tr>
        <td>List all configured services</td>
        <td><a href="<g:createLink controller="service" action="list" />"><g:createLink action="list" controller="service" /></a> [?datacenter=]</td>
        <td><a href="<g:createLink controller="service" action="list" />"><g:createLink action="list" controller="service" /></a></td>
        </tr>

        </table>


       <h2>Other functions:</h2>

        <table border="1">
        <tr>
        <th>function</th>
        <th>rest syntax</th>
        <th>example</th>
        </tr>

        <tr>
        <td>get port(s) for a host or service name</td>
        <td>${context}service/port/<b>host-name</b>|<b>service name</b></td>
        <td>${context}service/port/<b>replyts46-1</b></td>
        </tr>

        </table>

    </body>
</html>