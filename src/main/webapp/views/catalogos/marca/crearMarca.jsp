<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<head>
<meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
<title>Crear Marca</title>

	<!-- Bootstrap -->
	<link
		href="${pageContext.request.contextPath}/resources/bootstrap/css/bootstrap.min.css"
		rel="stylesheet" type="text/css" />
	
	<!-- Font Awesome -->
	<link
		href="${pageContext.request.contextPath}/resources/font-awesome/css/font-awesome.min.css"
		rel="stylesheet" />
	
	<!-- AdminLTE -->
	<link
		href="${pageContext.request.contextPath}/resources/admin-lte/css/Fonts.css"
		rel="stylesheet" />
	<link
		href="${pageContext.request.contextPath}/resources/admin-lte/css/AdminLTE.css"
		rel="stylesheet" />
	<link
		href="${pageContext.request.contextPath}/resources/admin-lte/css/skins/_all-skins.min.css"
		rel="stylesheet" />
	
	<!-- Sweetalert -->
	<link
		href="${pageContext.request.contextPath}/resources/sweetalert/sweetalert.css"
		rel="stylesheet" type="text/css">
	
	<!-- FormValidation -->
	<link
		href="${pageContext.request.contextPath}/resources/formvalidation/css/formValidation.min.css" rel="stylesheet" type="text/css">
	
</head>

<body class="hold-transition skin-blue sidebar-mini">
	<div class="wrapper">

		<header class="main-header">
			<!-- Logo -->
			<a href="index2.html" class="logo"> <!-- mini logo for sidebar mini 50x50 pixels -->
				<span class="logo-mini"><b>A</b>LT</span> <!-- logo for regular state and mobile devices -->
				<span class="logo-lg"><b>Marcas</b></span>
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
				<jsp:include page="/views/menu/menu.jsp"></jsp:include>
			</section>
			<!-- /.sidebar -->
		</aside>

		<!-- Content Wrapper. Contains page content -->
		<div class="content-wrapper">
			<!-- Content Header (Page header) -->
			<section class="content-header">
				<h1>
					<span style="color: #798c9c">Crear Marca</span>
				</h1>
			</section>

			<!-- Main content Usuarios Registrados -->
			<section class="content">
				<div class="col-md-12" id="div2">
					<div class="box box-primary">
						<div class="box-body">
							<div class="col-md-12">
								<!-- Contenido -->
								<!-- Botón nuevo marcas -->
									<div class="col-xs-1 col-md-5"></div>
									<div class="col-xs-1 col-md-5"></div>
									<div class="col-xs-10 col-md-2">
											<div class="dropdown">
											<button class="btn btn-primary dropdown-toggle" type="button"
												data-toggle="dropdown">
												Opciones <span class="caret"></span>
											</button>
											<ul class="dropdown-menu">
												<li><a class="button" id="home">Busqueda por Marca</a></li>
												<li><a class="button" id="editar" >Modificar Marca</a></li>												
											</ul>
										</div>
									</div>
									<!--Fin botón nuevo marcas -->
								<br/><br/><br/><br/>

								<form id="form-marcas">
									<div class="form-group">
										<label for="inputAbreviatura" class="control-label">Abreviatura</label>
										<input type="text" class="form-control" id="inputAbreviatura"
												name="inputAbreviatura" data-toggle="tooltip"
												data-placement="top" title="Ingrese Abreviatura de la marca"
												placeholder="Abreviatura" required="required">
									</div>

									<div class="form-group">
										<label for="inputNombre" class="control-label">Nombre</label>
										<input type="text" 
												class="form-control" 
												id="inputNombre"
												name="inputNombre" 
												data-toggle="tooltip"
												data-placement="top"
												title="Ingrese el nombre de la marca"
												placeholder="Nombre" 
												required="required">
									</div>

									<div class="box-footer clearfix">
									<button id="cancel-btn" 
											type="button"
											class="btn btn-default btn-lg pull-left">
										<i class="fa fa-arrow-circle-left" 
											aria-hidden="true">Cancelar</i>
									</button>
			
									<button type="button" 
											id="save-btn"
											class="btn btn-success btn-lg pull-right">
										<i class="fa fa-credit-card">Guardar</i> 
									</button>
								</div>
								</form>
							</div>
						</div>
					</div>
				</div>
			</section>
		</div>
	</div>
	<!-- ./wrapper -->
	<footer class="main-footer">
		<div class="pull-right hidden-xs">
			<b>Version</b> 2.3.0
		</div>
		<strong>Derechos de autor &copy; 2016 <a
			href="------">--------------</a>.
		</strong> Todos los derechos reservados.
	</footer>
</body>


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


	//Cancelar y dirige a la vista principal de las marcas registradas
	$('#cancel-btn').click(function() {
		var urlMarcas = "${pageContext.request.contextPath}/views/catalogos/marca/marca.jsp";
		window.location = urlMarcas;
	});

	//Registra una marca
	$('#save-btn').click(function() {
		//Validaciones
		var formValidation = $('#form-marcas').data('formValidation');
		console.log(1);
		
			formValidation.validate();
			console.log(2);

			console.log(formValidation.isValid());
			
			if (formValidation.isValid()) {

				var datos = {};
				var abreviatura = $('#inputAbreviatura');
				var nombre = $('#inputNombre');
				
				datos.nombre = nombre.val();
				/*
				datos.abreviatura = abreviatura.val();
				datos.estatus = true;
				*/

				var formData = JSON.stringify(datos);
			
				console.log(formData);
			
				var urlPost = "${pageContext.request.contextPath}/catalogos/marcavehiculo";
				var urlMarcas = "${pageContext.request.contextPath}/views/catalogos/marca/crearMarca.jsp";
				                                  

				$.ajax({
					type : 'POST',
					url : urlPost,
					data : formData,
					dataType : "json",
					contentType : 'application/json',
					success : function(data,textStatus,jQxhr) {
					swal(
						{
							title : "Marca registrada correctamente.",
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
	$('#home').click(function() {
		var urlCrearMarca = "${pageContext.request.contextPath}/views/catalogos/marca/marca.jsp";
		window.location = urlCrearMarca;
	});
	//Editar Marca
	$('#editar').click(function(){
			var urlEditarMarca = "${pageContext.request.contextPath}/views/catalogos/marca/modificarMarca.jsp";
			window.location=urlEditarMarca;
		
	});
	




	//Validaciones
	$('#form-marcas').formValidation(
		{
			framework : 'bootstrap', //Indicamos el framework para validar, Bootstrap, Pure,Semantic,etc
			icon : {//Feedback Icons
			valid : 'glyphicon glyphicon-ok',
			invalid : 'glyphicon glyphicon-remove',
			validating : 'glyphicon glyphicon-refresh'
			},

			//Lista de campos a validar y las reglas que aplican para cada uno de ellos
			fields : {
				'inputAbreviatura' : { //validación del campo
								trigger : 'blur', //Se especifica cuando se acciona la validación del campo
								validators : { //validaciones

							notEmpty : {
									message : 'La Abreviatura es requerida.'
								},
							stringLength : {
									min : 1,
									max: 64,
									message : 'La Abreviatura debe tener una longitud menor a 64 caracteres.'
									}
							}
				}
			}
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

	})
</script>
</html>