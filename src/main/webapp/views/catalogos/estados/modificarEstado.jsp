<%-- 
    Document   : modificarEstado
    Created on : Apr 21, 2017, 9:04:00 PM
    Author     : Freddy Barrera (freddy.barrera.moo@gmail.com)
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
        <title>Modificar estado</title>

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
                    <h1>Estados</h1>
                </section>

                <!-- Main content Estados -->
                <section class="content">
                    <div class="box box-primary">
                        <div class="box-header with-border">
                            <h1>Modificar estado</h1>
                        </div>
                        <div class="box-body">
                            <form id="frm-estado">
                                <div class="form-group">
                                    <label for="inputabrev" class="control-label">Abreviación del estado</label>
                                    <input id="inputabrev" name="inputabrev"
                                           type="text" class="form-control" maxlength="10"
                                           placeholder="Abreviación" required>
                                </div>
                                <div class="form-group">
                                    <label for="inputnom" class="control-label">Nombre del estado</label>
                                    <input id="inputnom" name="inputnom"
                                           type="text" class="form-control"
                                           maxlength="30" placeholder="Nombre"
                                           required>
                                </div>
                            </form>
                        </div>
                        <div class="box-footer clearfix">
                            <button id="btn-cancel" type="button"
                                    class="btn btn-default btn-lg pull-left">
                                <i class="fa fa-arrow-circle-left" aria-hidden="true"></i>
                                Cancelar
                            </button>
                            <button type="button" id="btn-save"
                                    class="btn btn-success btn-lg pull-right">
                                <i class="fa fa-credit-card"></i> Guardar
                            </button>
                        </div>
                    </div>
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

        <!-- Bibliotecas JavaScript -->
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

        <script>
$(document).ready(
        function() {

            // Cancelar y dirige a la vista principal de las marcas registradas
            $('#cancel-btn').click(
                function() {
                    window.location = '${pageContext.request.contextPath}/views/catalogos/estados/estado.jsp';
                }
            );

	//Registra una marca
	$('#save-btn').click(function() {

		//Validaciones
		var formValidation = $('#form-marcas').data('formValidation');
		
			formValidation.validate();

			console.log(formValidation.isValid());
			
			if (formValidation.isValid()) {

				var datos = {};
				var Abreviatura = $('#inputAbreviatura');
				var Nombre = $('#inputNombre');
				
				datos.Abreviatura = Abreviatura.val();
				datos.Nombre = Nombre.val();
				datos.activo = 1;

				var formData = JSON.stringify(datos);
			
				console.log(formData);
			
				var urlPost = "${pageContext.request.contextPath}/cajas/catalogos/marcavehiculo";
				var urlMarcas = "${pageContext.request.contextPath}/views/catalogos/marca/modificarMarca.jsp";
				                                  

				$.ajax({
					type : 'POST',
					url : urlPost,
					data : formData,
					dataType : "json",
					contentType : 'application/json',
					success : function(data,textStatus,jQxhr) {
					swal(
						{
							title : "Estado modificado correctamente.",
							type : "success",
							closeOnCancel : false
						},
							function() {
							window.location = urlMarcas;
							});
				},
					error : function(jqXHR,textStatus,errorThrown) {
						console.log(textStatus+ " "+ errorThrown);
						}
					});
			}

	});

	//Dirige a la sección para registrar un usuario
	$('#crear').click(function() {
		var urlCrearMarca = "${pageContext.request.contextPath}/views/catalogos/marca/crearMarca.jsp";
		window.location = urlCrearMarca;
	});
	//Editar Marca
	$('#home').click(function(){
			var urlEditarMarca = "${pageContext.request.contextPath}/views/catalogos/marca/marca.jsp";
			window.location=urlEditarMarca;
		
	});
	

	//Errores
	$.ajaxSetup({
			error : function(x, status, error) {
				if (x.status == 400) {
					var result = x.responseJSON;
						swal({
							title : "Error " + result.code,
							text : result.message,
							type : "error",
							closeOnCancel : false
						});
				} else if (x.status == 500) {
						swal({
						title : "Error 500",
						text : "Disculpe las molestias no podemos procesar su solicitud.",
						type : "error",
						closeOnCancel : false
					});
				}
		}
	});

	});
        </script>
    </body>
</html>
