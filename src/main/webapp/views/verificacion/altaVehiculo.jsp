<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<head>
<meta
	content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no"
	name="viewport">
<title>Alta Vehiculo</title>


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
				<jsp:include page="/views/menu/menu.jsp"></jsp:include>
			</section>
			<!-- /.sidebar -->
		</aside>

		<!-- Content Wrapper. Contains page content -->
		<div class="content-wrapper">
			<!-- Content Header (Page header) -->
			<section class="content-header">
				<h1>
					<span style="color: #798c9c"> </span>Alta Vehiculo
				</h1>
			</section>

			<!-- Main content Alta Vehiculo -->
			<section class="content">
				<!-- Main row -->
				<div class="col-md-12" id="div2">

					<div class="box box-primary">

						<div class="box-body">

							<form id="form-vehiculos">

								<div class="col-md-12">

									<div class="form-group">
										<label for="fvin" class="control-label">Serie (VIN)</label> <input
											id="fvin" name="fvin" type="text" class="form-control"
											maxlength="17" placeholder="Serie (VIN)" required>
									</div>

									<div class="form-group">
										<label for="fnomotor" class="control-label">Numero Motor</label> <input
											id="fnomotor" name="fvin" type="text" class="form-control"
											maxlength="17" placeholder="Numero Motor" required>
									</div>


									<div class="form-group">
										<label for="fmarca" class="control-label">Marca</label> <select
											class="form-control" id="fmarca" required>
											<option value="Honda">Honda</option>
											<option value="Toyota">Toyota</option>
										</select>
									</div>

									<div class="form-group">
										<label for="fvin" class="control-label">Modelo</label> <input
											id="fmodelo" name="fmodelo" type="text" class="form-control"
											maxlength="4" placeholder="Modelo" required>
									</div>

									<div class="form-group">
										<label for="fclase" class="control-label">Clase</label> <select
											class="form-control" id="fclase" required>
											<option value="1-AUTOMOVIL">1-AUTOMOVIL</option>
										</select>
									</div>

									<div class="form-group">
										<label for="ftipo" class="control-label">Tipo</label> <select
											class="form-control" id="ftipo" required>
											<option value="1-AUTOMOVIL">1-AUTOMOVIL</option>
										</select>
									</div>

									<div class="form-group">
										<label for="flinea" class="control-label">Linea</label> <select
											class="form-control" id="flinea" required>
											<option value="Sienna">Sienna</option>
										</select>
									</div>

								</div>

							</form>

						</div>
						<div class="box-footer clearfix">
							<button id="cancel-btn" type="button"
								class="btn btn-default btn-lg pull-left">
								<i class="fa fa-arrow-circle-left" aria-hidden="true"></i>
								Cancelar
							</button>
							<button type="button" id="save-btn"
								class="btn btn-success btn-lg pull-right">
								<i class="fa fa-credit-card"></i> Guardar
							</button>
						</div>

					</div>

				</div>
			</section>
			<!-- Fin contenido Alta Vehiculo -->
		</div>
	</div>
	<!-- ./wrapper -->


	<footer class="main-footer">
		<div class="pull-right hidden-xs">
			<b>Version</b> 2.3.0
		</div>
		<strong>Derechos de autor &copy; 2016 <a href="------">--------------</a>.
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
	$(document)
			.ready(
					function() {

						//Cancelar y dirige a la vista principal de los vehiculos registrados
						$('#cancel-btn')
								.click(
										function() {
											var urlUsuario = "${pageContext.request.contextPath}/views/usuario/usuario.jsp";
											window.location = urlUsuario;
										});

						//Registra un vehiculo
						$('#save-btn')
								.click(
										function() {

											//Validaciones
											var formValidation = $('#form-vehiculos').data('formValidation');

											formValidation.validate();

											console.log(formValidation.isValid());

											if (formValidation.isValid()) {

												var datos = {};
												var nombre = $('#inputUser');
												var email = $('#inputEmail');
												var password = $('#inputPassword');

												datos.nombre = nombre.val();
												datos.email = email.val();
												datos.password = password.val();
												datos.activo = 1;

												var formData = JSON.stringify(datos);

												console.log(formData);

												var urlPost = "${pageContext.request.contextPath}/cajas/usuario";
												var urlUsuario = "${pageContext.request.contextPath}/views/usuario/usuario.jsp";

												 $.ajax({
															type : 'POST',
															url : urlPost,
															data : formData,
															dataType : "json",
															contentType : 'application/json',
															success : function(
																	data,
																	textStatus,
																	jQxhr) {
																swal(
																		{
																			title : "Usuario registrado correctamente.",
																			type : "success",
																			closeOnCancel : false
																		},
																		function() {
																			window.location = urlUsuario;
																		});
															},
															error : function(
																	jqXHR,
																	textStatus,
																	errorThrown) {
																console
																		.log(textStatus
																				+ " "
																				+ errorThrown);
															}
														});
											}

										});

						//Validaciones
						$('#form-usuarios')
								.formValidation(
										{
											framework : 'bootstrap', //Indicamos el framework para validar, Bootstrap, Pure,Semantic,etc
											icon : {//Feedback Icons
												valid : 'glyphicon glyphicon-ok',
												invalid : 'glyphicon glyphicon-remove',
												validating : 'glyphicon glyphicon-refresh'
											},

											//Lista de campos a validar y las reglas que aplican para cada uno de ellos
											fields : {
												'inputUser' : { //validación del campo
													trigger : 'blur', //Se especifica cuando se acciona la validación del campo
													validators : { //validaciones

														notEmpty : {
															message : 'El nombre de usuario es requerido.'
														},
														stringLength : {
															min : 8,
															max : 100,
															message : 'El nombre de usuario requiere por lo menos ocho caracteres.'
														},
														remote : {
															url : '${pageContext.request.contextPath}/cajas/usuario/existeNombreUsuario?'
																	+ $(
																			'#inputUser')
																			.val(),
															message : "El usuario ya existe",
															data : function(
																	validator,
																	$field,
																	value) {
																return {
																	inputUser : validator
																			.getFieldElements(
																					'inputUser')
																			.val()
																};
															}
														}
													}
												},
												'inputEmail' : {
													trigger : 'blur',
													validators : {
														notEmpty : {
															message : 'El email es requerido.'
														},
														regexp : {
															regexp : /^[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,4}$/,
															message : 'La estructura del email es incorrecta.'
														},
														remote : {
															url : '${pageContext.request.contextPath}/cajas/usuario/existeEmail?'
																	+ $(
																			'#inputEmail')
																			.val(),
															message : "Ya existe un usuario registrado con este email.",
															data : function(
																	validator,
																	$field,
																	value) {
																return {
																	inputEmail : validator
																			.getFieldElements(
																					'inputEmail')
																			.val()
																};
															}
														}

													}
												},
												'inputPassword' : {
													trigger : 'blur',
													validators : {
														notEmpty : {
															message : 'La conraseña es requerida.'
														},
														stringLength : {
															min : 8,
															max : 100,
															message : 'Su contraseña requiere por lo menos ocho caracteres.'
														}

													}
												}
											}
										});

						//Errores
						$
								.ajaxSetup({
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
</html>