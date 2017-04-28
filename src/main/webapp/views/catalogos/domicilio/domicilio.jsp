<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta
	content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no"
	name="viewport">
<title>Domicilio</title>
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
	href="${pageContext.request.contextPath}/resources/formvalidation/css/formValidation.min.css"
	rel="stylesheet" type="text/css">

<!-- jquery-ui.css -->
<link
	href="${pageContext.request.contextPath}/resources/jquery-ui/jquery-ui.css"
	rel="stylesheet" type="text/css" />
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
				<h1>
					<span style="color: #798c9c"> </span>Domicilio del Contribuyente
				</h1>
			</section>

			<!-- Main content Alta Vehiculo -->
			<section class="content">
				<div class="row">
					<!-- Main row -->
					<div class="col-md-12" id="div2">

						<div class="box box-primary">

							<div class="box-body">

								<form id="form-domicilio">

									<div class="col-md-12">

										<div class="row">
											<div class="col-md-4">
												<div class="form-group">
													<label for="selectOficina" class="control-label">Oficina
														</label> <select class="form-control"
														id="selectOficina" name="selectOficina" disabled required>
														<option value="1" selected>ZACATECAS</option>
													</select>
												</div>
											</div>
										</div>
										<fieldset>
											<legend>Direccion</legend>
											<div class="row">
												<div class="col-md-4">
													<div class="form-group">
														<label for="inputCalle" class="control-label">Calle
															</label> <input id="inputCalle" name="inputCalle" type="text"
															class="form-control" maxlength="25"
															placeholder="Calle" required>
													</div>
												</div>
												<div class="col-md-2">
													<div class="form-group">
														<label for="inputNum" class="control-label">Numero Ext.
															</label> <input id="inputNum"
															name="inputNum" type="text" class="form-control"
															maxlength="8" placeholder="Num " required>
													</div>
												</div>
													<div class="col-md-2">
													<div class="form-group">
														<label for="inputNumInt" class="control-label">Numero Int.
															</label> <input id="inputNumInt"
															name="inputNumInt" type="text" class="form-control"
															maxlength="8" placeholder="Num " >
													</div>
												</div>
												<div class="col-md-4">
													<div class="form-group">
														<label for="inputColonia" class="control-label">Colonia</label>
														<input id="inputColonia" class="form-control"  placeholder="Colonia" required> 
														
													</div>
												</div>
											</div>
											<div class="row">
												<div class="col-md-4">
													<div class="form-group">
														<label for="inputEntreCalle1" class="control-label">Entre Calles</label>
														<input id="inputEntreCalle1" name="inputEntreCalle1" type="text"
															class="form-control" maxlength="25" placeholder="Calle"
															name="inputEntreCalles1" >
													</div>
												</div>
													
													<div class="col-md-4">
													<div class="form-group">
														<label for="inputEntreCalle2" class="control-label">        </label>
														<input id="inputEntreCalle2" name="inputEntreCalle2" type="text"
															class="form-control" maxlength="25" placeholder="Calle"
															name="inputEntreCalles2" >
													</div>
												</div>
												<div class="col-md-2">
													<div class="form-group">
														<label for="inputCP" class="control-label">Codigo Postal</label>
														<input id="inputCP" name="inputCP" type="text"
															class="form-control" maxlength="5" placeholder="Codigo Postal"
															name="inputCP" required>
													</div>
												</div>
												</div> 
											
											<div class="row">
												<div class="col-md-3">
													<div class="form-group">
														<label for="selectEdo" class="control-label">Estado</label>
														<select class="form-control" id="selectEdo"
															name="selectEdo" required>
															<option value="1">ZACATECAS</option>
															
														</select>
													</div>
												</div>
												<div class="col-md-3">
													<div class="form-group">
														<label for="selectMunicipio" class="control-label">Municipio</label>
														<select class="form-control" id="selectMunicipio"
															name="selectMunicipio" required>
															<option value="1">ZACATECAS</option>
														</select>
													</div>
												</div>
												 <div class="col-md-4">
													<div class="form-group">
														<label for="selectLocalidad" class="control-label">Localidad</label>
														<select class="form-control" id="selectLocalidad"
															name="selectLocalidad"  required>
															<option value="1">BUENAVISTA</option>
														</select>
													</div>
												</div> 
											</div>
										
											</div>

									</div>

								</form>

							</div>
							<div class="box-footer">
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
				</div>
			</section>
			<!-- Fin contenido Alta Vehiculo -->
		</div>

                <footer class="main-footer">
                        <div class="pull-right hidden-xs">
                                <b>Version</b> 2.3.0
                        </div>
                        <strong>Derechos de autor &copy; 2016 <a href="------">--------------</a>.
                        </strong> Todos los derechos reservados.
                </footer>
	
	<!-- ./wrapper -->
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

						

						//Cancelar y dirige a la vista principal
						$('#cancel-btn')
								.click(
										function() {
											var urlBack = "${pageContext.request.contextPath}/views/index.jsp";
											window.location = urlBack;
										});

						//Registra 
						$('#save-btn').click(function() {
							
											var anio = new Date().toISOString()
													.slice(0, 4);

											//Validaciones
											var formValidation = $(
													'#form-domicilio').data(
													'formValidation');

											formValidation.validate();

											console.log(formValidation
													.isValid());

											if (formValidation.isValid()) {

												var datos = {};
												var idOficina = $('#selectOficina');
												var calle = $('#inputCalle');
												var numExt = $('#inputNum');
												var numInt = $('#inputNumInt');
												var colonia = $('#inputColonia');
												var entreCalle1 = $('#inputEntreCalle1');
												var entreCalle2 = $('#inputEntreCalle2');
												var cp = $('#inputCP');
												var idEstado = $('#selectEdo');
												var idMunicipio = $('#selectMunicipio');
												var idLocalidad = $('#selectLocalidad');
												

												

												datos.idOficina = idOficina
														.val();
												datos.calle = calle
														.val();
												datos.numExt = numExt
														.val();
												datos.numInt = numInt
														.val();
												datos.colonia = colonia
														.val();
												datos.entreCalle1 = entreCalle1
														.val();
												datos.entreCalle2 = entreCalle2
														.val();
												datos.cp = cp
														.val();
												datos.idEstado = idEstado
														.val();
												datos.idMunicipio = idMunicipio
														.val();
												datos.idLocalidad = idLocalidad
														.val();
												
												var formData = JSON
														.stringify(datos);

												console.log(formData);

												var urlPost = "${pageContext.request.contextPath}/cajas/vehicular/verificacion";
												var admin = "${pageContext.request.contextPath}/views/verificacion/verificaciones.jsp";

												$
														.ajax({
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
																			text : "Direccion registrada correctamente",
																			title : "No Seguimiento: "
																					+ data.valor,
																			type : "success",
																			closeOnCancel : false
																		},
																		function() {
																			window.location = admin;
																		});
															}
														});
											}

										});

						//Validaciones
						$('#form-domicilio')
								.formValidation(
										{
											framework : 'bootstrap', //Indicamos el framework para validar, Bootstrap, Pure,Semantic,etc
											icon : {//Feedback Icons
												valid : 'glyphicon glyphicon-ok',
												invalid : 'glyphicon glyphicon-remove',
												validating : 'glyphicon glyphicon-refresh'
											},
											//live: 'enabled',
											//Lista de campos a validar y las reglas que aplican para cada uno de ellos
											fields : {
												'inputCalle' : { //validación del campo
													trigger : 'blur', //Se especifica cuando se acciona la validación del campo
													validators : { //validaciones

														notEmpty : {
															message : 'Ingrese la calle'
														},			
													},
												},
												'inputNum' : { //validación del campo
													trigger : 'blur', //Se especifica cuando se acciona la validación del campo
													validators : { //validaciones

														notEmpty : {
															message : 'El Numero es requerido.'
														},
														
													}
												},
												'inputColonia' : { //validación del campo
													trigger : 'blur', //Se especifica cuando se acciona la validación del campo
													validators : { //validaciones

														notEmpty : {
															message : 'Ingrese una Colonia.'
														},
													}
												},
												'inputCP' : { //validación del campo
													trigger : 'blur', //Se especifica cuando se acciona la validación del campo
													validators : { //validaciones

														notEmpty : {
															message : 'Ingrese Codigo Postal.'
														},
														numeric : {
															message : 'El Codigo Postal debe ser numerico',
														}
													}
												},
												'selectEdo' : { //validación del campo
													trigger : 'blur', //Se especifica cuando se acciona la validación del campo
													validators : { //validaciones

														notEmpty : {
															message : 'Seleccione un estado.'
														},
													}
												},
												'selectMunicipio' : { //validación del campo
													trigger : 'blur', //Se especifica cuando se acciona la validación del campo
													validators : { //validaciones

														notEmpty : {
															message : 'Seleccione un municipio.'
														},
													}
												},
												'selectMunicipio' : { //validación del campo
													trigger : 'blur', //Se especifica cuando se acciona la validación del campo
													validators : { //validaciones

														notEmpty : {
															message : 'Seleccione un municipio.'
														},
													}
												},
												'selectLocalidad' : { //validación del campo
													trigger : 'blur', //Se especifica cuando se acciona la validación del campo
													validators : { //validaciones

														notEmpty : {
															message : 'Seleccione una localidad.'
														},
													}
												},
												
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

					

	

	
</script>
</html>