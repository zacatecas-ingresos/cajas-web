<%-- 
    Document   : estado
    Created on : Apr 20, 2017, 11:34:54 AM
    Author     : Freddy Barrera (freddy.barrera@gmail.com)
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
        <title>Estados</title>

        <!-- Bootstrap -->
        <link href="${pageContext.request.contextPath}/resources/bootstrap/css/bootstrap.min.css"
              rel="stylesheet" type="text/css" />
    
        <!-- Font Awesome -->
        <link href="${pageContext.request.contextPath}/resources/font-awesome/css/font-awesome.min.css"
              rel="stylesheet" type="text/css" />
    
        <!-- AdminLTE -->
        <link href="${pageContext.request.contextPath}/resources/admin-lte/css/Fonts.css"
              rel="stylesheet" type="text/css" />
        <link href="${pageContext.request.contextPath}/resources/admin-lte/css/AdminLTE.css"
              rel="stylesheet" type="text/css" />
        <link href="${pageContext.request.contextPath}/resources/admin-lte/css/skins/_all-skins.min.css"
              rel="stylesheet" type="text/css" />
    
        <!-- Sweetalert -->
        <link href="${pageContext.request.contextPath}/resources/sweetalert/sweetalert.css"
              rel="stylesheet" type="text/css">
    
        <!-- FormValidation -->
        <link href="${pageContext.request.contextPath}/resources/formvalidation/css/formValidation.min.css"
              rel="stylesheet" type="text/css">

        <!-- SIT -->
        <link href="${pageContext.request.contextPath}/resources/sit/css/sit.css"
              rel="stylesheet" type="text/css">
    </head>
    <body class="hold-transition skin-blue sidebar-mini">
        <div class="wrapper">
            <header class="main-header">
                <!-- Logo -->
                <a href="index2.html" class="logo"> <!-- mini logo for sidebar mini 50x50 pixels -->
                    <span class="logo-mini"><b>A</b>LT</span> <!-- logo for regular state and mobile devices -->
                    <span class="logo-lg"><b>Cajas</b></span>
                </a>
                <!-- Header Navbar: style can be found in header.less -->
                <nav class="navbar navbar-static-top" role="navigation">
                    <!-- Sidebar toggle button-->
                    <a href="#" class="sidebar-toggle" data-toggle="offcanvas"
                        role="button"> <span class="sr-only">Toggle navigation</span>
                    </a>
                    <div class="navbar-custom-menu">
                        <ul class="nav navbar-nav">
                            <jsp:include page="/views/menu/logout.jsp"></jsp:include>
                        </ul>
                    </div>
                </nav>
            </header>

            <!-- Left side column. contains the logo and sidebar -->
            <aside class="main-sidebar">
                <!-- sidebar: style can be found in sidebar.less -->
                <section class="sidebar">
                    <%@ include file="/views/menu/menu.jspf" %>
                </section>
                <!-- /.sidebar -->
            </aside>

            <!-- Content Wrapper. Contains page content -->
            <div class="content-wrapper">
                <!-- Content Header (Page header) -->
                <section class="content-header">
                    <h1>Estados</h1>
                </section>

                <!-- Main content Estados -->
                <section class="content">
                    <div class="row">
                        <div class="col-md-4 col-md-offset-4">
                            <div class="has-feedback">
                                <input id="search" name="search" type="text"
                                       class="form-control input-sm" 
                                       placeholder="Buscar..." data-toggle="tooltip" 
                                       data-placement="top" title="Buscar por nombre del estado">
                                <span class="glyphicon glyphicon-search form-control-feedback"></span>
                            </div>
                        </div>
                    </div>
                    <div class="box voffset3">
                        <div class="box-header with-border">
                            <h3 class="box-title">Lista de estados</h3>
                            <div class="box-tools pull-right">
                                <div class="dropdown">
                                    <button class="btn btn-primary dropdown-toggle" type="button"
                                            data-toggle="dropdown">
                                        Opciones <span class="caret"></span>
                                    </button>
                                    <ul class="dropdown-menu">
                                        <li><a class="button" id="crear">Nuevo</a></li>
                                        <li><a class="button" id="editar" >Modificar</a></li>
                                        <li><a class="button" id="eliminar">Eliminar</a></li>
                                    </ul>
                                </div>
                            </div>
                        </div><!-- /.box-header -->
                        <div class="box-body">
                            <table id="tblEstado" class="table table-hover">
                                <thead>
                                    <tr>
                                        <th></th>
                                        <th>Abrevación</th>
                                        <th>Nombre</th>
                                    </tr>
                                </thead>
                                <tbody>
                                </tbody>
                            </table>
                        </div><!-- /.box-body -->
                    </div><!-- /.box -->
                </section>
                <!-- Fin contenido Estados -->
            </div>

            <footer class="main-footer">
                <div class="pull-right hidden-xs">
                    <b>Version</b> 2.3.0
                </div>
                <strong>Derechos de autor &copy; 2016 <a href="http://www.finanzas.gob.mx">Secretaría de finanzas de Zacatecas</a>.</strong> Todos los derechos reservados.
            </footer>
        </div>
    <!-- ./wrapper -->


        <!-- Scripts -->
    <!-- jQuery -->
    <script
        src="${pageContext.request.contextPath}/resources/jquery/jquery.min.js"></script>
    
    <!-- jQuery UI -->
    <script
        src="${pageContext.request.contextPath}/resources/jquery-ui/jquery-ui.min.js"></script>
    
    <!-- jQuery Form -->
    <script
        src="${pageContext.request.contextPath}/resources/jquery-form/jquery.form.min.js" /></script>
    
    <script
        src="${pageContext.request.contextPath}/resources/bootstrap/js/bootstrap.min.js"></script>
    
    <!-- Bootstrap WYSIHTML5 -->
    <script
        src="${pageContext.request.contextPath}/resources/bootstrap-wysihtml5/bootstrap3-wysihtml5.all.min.js"></script>
        
    <script
        src="${pageContext.request.contextPath}/resources/admin-lte/js/app.min.js"></script>
        
    <script
        src="${pageContext.request.contextPath}/resources/admin-lte/js/demo.js"></script>
        
    <script
        src="${pageContext.request.contextPath}/resources/sweetalert/sweetalert.min.js"></script>
        
    <script
        src="${pageContext.request.contextPath}/resources/formvalidation/js/formValidation.min.js"></script>
    <script
        src="${pageContext.request.contextPath}/resources/formvalidation/js/framework/bootstrap.min.js"></script>
    <script
        src="${pageContext.request.contextPath}/resources/formvalidation/js/language/es_ES.min.js"></script>
    
    <!-- Fin scripts -->
    <script>
$(document).ready(function() {
    
    $.ajax({
        type : "GET",
        url : "${pageContext.request.contextPath}/cajas/estados",
        dataType : 'json',
        success : function(data) {
            llenarTablaEstados(data);
        },
        error : function(jqXHR,textStatus,errorThrown) {
            console.log(textStatus+ " "+ errorThrown);
        }
    });
    
    //Filtro de búsqueda
    $('#search').keyup(function() {
        var input= $('#search').val();
        var urlGet = '${pageContext.request.contextPath}/cajas/estados/consulta?porNombreEstado=' + input;

        $.ajax({
            type: "GET",
            dataType : 'json',
            url: urlGet,
            success: function(data) {
                llenarTablaEstados(data);
            },
            error : function(jqXHR, textStatus, errorThrown) {
                console.log(textStatus + " " + errorThrown);
            }
        });
    });
    
});

function llenarTablaEstados(data) {
    $('#tblEstado > tbody').find('tr').remove();
    var tableBody = $('#tblEstado > tbody');
    for (var i = 0; i < data.length; i++) {
        var row = 
                '<tr>'
                + '<td>' + (i + 1) + '</td>'
                + '<td>' + data[i].abreviacionEstado + '</td>'
                + '<td>' + data[i].estado + '</td>'
                + '</tr>';
        $(tableBody).append(row);
    }
};
        </script>
    </body>
</html>
