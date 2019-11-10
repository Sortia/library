<#macro page>
    <!doctype html>
    <html lang="en">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="_csrf" content="${_csrf.token}"/>
        <link rel="stylesheet" href="/static/css/sb-admin-2.css">
        <link rel="stylesheet" href="/static/css/bootstrap-table.css">
        <link href="/static/css/all.css" rel="stylesheet" type="text/css">

        <title>Library</title>

    </head>
    <body id="page-top">
    <div id="wrapper">

        <#include "sidebar.ftl">
        <div id="content-wrapper" class="d-flex flex-column">
            <div id="content">
                <#include "navbar.ftl">
                <div class="container-fluid">
                    <#nested>
                </div>
            </div>
        </div>

    </div>

    <script src="/static/js/jquery.js"></script>
    <script src="/static/js/bootstrap-table.js"></script>
    <script src="/static/js/bootstrap.js"></script>
    <script src="/static/js/sb-admin-2.js"></script>

    </body>
    </html>
</#macro>