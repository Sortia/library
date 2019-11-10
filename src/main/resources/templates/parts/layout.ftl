<#macro page>
    <!doctype html>
    <html lang="en">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <link rel="stylesheet" href="/static/css/sb-admin-2.css">
        <meta name="_csrf" content="${_csrf.token}"/>
        <link href="/static/css/all.css" rel="stylesheet" type="text/css">

        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
                integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
                crossorigin="anonymous"></script>
        <!-- Latest compiled and minified CSS -->
        <link rel="stylesheet" href="https://unpkg.com/bootstrap-table@1.13.5/dist/bootstrap-table.min.css">
        <link rel="stylesheet" href="https://unpkg.com/bootstrap-table@1.15.5/dist/bootstrap-table.min.css">

        <!-- Latest compiled and minified JavaScript -->
        <script src="https://unpkg.com/bootstrap-table@1.13.5/dist/bootstrap-table.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
                integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
                crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
                integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
                crossorigin="anonymous"></script>

        <script src="/static/js/jquery.js"></script>
        <script src="/static/js/sb-admin-2.js"></script>
        <script src="/static/js/jquery_easing.js"></script>

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

    </body>
    </html>
</#macro>