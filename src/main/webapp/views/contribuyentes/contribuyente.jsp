<%-- 
    Document   : contribuyente
    Created on : Apr 25, 2017, 6:58:49 AM
    Author     : Freddy Barrera (freddy.barrera.moo@gmail.com)
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="es">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" />
        <title>Contribuyentes</title>
        
        <!-- Bootstrap -->
        <link href="${pageContext.request.contextPath}/resources/bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css" />
        
        <!-- Font Awesome -->
        <link href="${pageContext.request.contextPath}/resources/font-awesome/css/font-awesome.min.css" rel="stylesheet" />
        
        <!-- AdminLTE -->
        <link href="${pageContext.request.contextPath}/resources/admin-lte/css/Fonts.css" rel="stylesheet" />
        <link href="${pageContext.request.contextPath}/resources/admin-lte/css/AdminLTE.css" rel="stylesheet" />
        <link href="${pageContext.request.contextPath}/resources/admin-lte/css/skins/_all-skins.min.css" rel="stylesheet" />
        
        <!-- jsTree -->
        <link href="${pageContext.request.contextPath}/resources/jstree/themes/default/style.css" rel="stylesheet" />
        
        <!-- Sweetalert -->
        <link href="${pageContext.request.contextPath}/resources/sweetalert/sweetalert.css" rel="stylesheet" type="text/css" >
        
        <!-- FormValidation -->
        <link href="${pageContext.request.contextPath}/resources/formvalidation/css/formValidation.min.css" rel="stylesheet" type="text/css">
    </head>
    <body class="hold-transition skin-blue sidebar-mini">
        <div class="wrapper">
            <header class="main-header">
                <!-- Logo -->
                <a href="${pageContext.request.contextPath}" class="logo"> <!-- mini logo for sidebar mini 50x50 pixels -->
                    <span class="logo-mini"><b>S</b>it</span> <!-- logo for regular state and mobile devices -->
                    <span class="logo-lg"><b>Sistema Integral Tributario</b></span>
                </a>
                <!-- Header Navbar: style can be found in header.less -->
                <nav class="navbar navbar-static-top" role="navigation">
                    <!-- Sidebar toggle button-->
                    <a href="#" class="sidebar-toggle" data-toggle="offcanvas"
                       role="button"> <span class="sr-only">Botón de navegación</span>
                    </a>
                    <div class="navbar-custom-menu">
                        <ul class="nav navbar-nav">
                            <%@ include file="/WEB-INF/jspf/logout.jspf" %>
                        </ul>
                    </div>
                </nav>
            </header>
                        
            <!-- Left side column. contains the logo and sidebar -->
            <aside class="main-sidebar">
                <!-- sidebar: style can be found in sidebar.less -->
                <section class="sidebar">
                    <%@ include file="/WEB-INF/jspf/menu.jspf" %>
                </section>
                <!-- /.sidebar -->
            </aside>
                
            <!-- Content Wrapper. Contains page content -->
            <div class="content-wrapper">
                <!-- Content Header (Page header) -->
                <section class="content-header">
                    <h1>Contribuyentes <small>Administración</small></h1>
                    <ol class="breadcrumb">
                        <li><a href="${pageContext.request.contextPath}"><i class="fa fa-home"></i> Inicio</a></li>
                        <li class="active">Contribuyentes</li>
                    </ol>
                </section>
                
                <!-- Main content -->
                <section class="content">
                    <div class="row">
                        <div class="col-lg-3 col-xs-6">
                            <!-- small box -->
                            <div class="small-box bg-yellow">
                                <div class="inner">
                                    <h3>Registrar</h3>
                                    <p>Dar de alta un nuevo contribuyente</p>
                                </div>
                                <div class="icon">
                                    <i class="fa fa-user-plus"></i>
                                </div>
                                <a href="${pageContext.request.contextPath}/views/contribuyentes/crearContribuyente.jsp" class="small-box-footer">Ir al alta <i class="fa fa-arrow-circle-right"></i>
                                </a>
                            </div>
                        </div>
                    </div>
                </section>
            </div>
            
            <footer class="main-footer">
                <div class="pull-right hidden-xs">
                    <b>Version</b> 2.3.0
                </div>
                <strong>Derechos de autor &copy; 2016 <a href="http://finanzas.gob.mx">Secretaría de finanzas de Zacatecas</a>.
                </strong>Todos los derechos reservados.
            </footer>
        </div>
        <!-- ./wrapper -->

        <!-- REQUIRED JS SCRIPTS -->
        <!-- jQuery -->
        <script src="${pageContext.request.contextPath}/resources/jquery/jquery.min.js"></script>

        <!-- jQuery UI -->
        <script src="${pageContext.request.contextPath}/resources/jquery-ui/jquery-ui.min.js"></script>

        <!-- jQuery Form -->
        <script src="${pageContext.request.contextPath}/resources/jquery-form/jquery.form.min.js"/></script>

        <!-- Bootstrap -->
        <script src="${pageContext.request.contextPath}/resources/bootstrap/js/bootstrap.min.js"></script>

        <!-- Bootstrap WYSIHTML5 -->
        <script src="${pageContext.request.contextPath}/resources/bootstrap-wysihtml5/bootstrap3-wysihtml5.all.min.js"></script>

        <!-- AdminLTE -->
        <script src="${pageContext.request.contextPath}/resources/admin-lte/js/app.min.js"></script>
        <script src="${pageContext.request.contextPath}/resources/admin-lte/js/demo.js"></script>

        <!-- jsTree -->
        <script src="${pageContext.request.contextPath}/resources/jstree/jstree.min.js" type="text/javascript"></script>	

        <!-- Sweetalert -->
        <script src="${pageContext.request.contextPath}/resources/sweetalert/sweetalert.min.js"></script> 

        <!-- FormValidation -->
        <script src="${pageContext.request.contextPath}/resources/formvalidation/js/formValidation.min.js"></script>
        <script src="${pageContext.request.contextPath}/resources/formvalidation/js/framework/bootstrap.min.js"></script>
        <script src="${pageContext.request.contextPath}/resources/formvalidation/js/language/es_ES.min.js"></script>
    </body>
</html>
