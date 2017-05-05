<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<head>
<meta
	content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no"
	name="viewport">
<title>Verificación Adeudos</title>
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
						<%@ include file="/WEB-INF/jspf/logout.jspf"%>
					</ul>
				</div>
			</nav>
		</header>

		<!-- Left side column. contains the logo and sidebar -->
		<aside class="main-sidebar">
			<!-- sidebar: style can be found in sidebar.less -->
			<section class="sidebar">
				<%@ include file="/WEB-INF/jspf/menu.jspf"%>
			</section>
			<!-- /.sidebar -->
		</aside>

		<!-- Content Wrapper. Contains page content -->
		<div class="content-wrapper">
			<!-- Content Header (Page header) -->
			<section class="content-header">
				<h1>
					<span style="color: #798c9c"> </span>Verificación Adeudos
				</h1>
				    <ol class="breadcrumb">
                        <li><a href="${pageContext.request.contextPath}"><i class="fa fa-home"></i> Inicio</a></li>
                        <li><a href="${pageContext.request.contextPath}/views/verificacion/verificaciones.jsp">Verificaciones</a></li>
                        <li class="active">Verificación Adeudos</li>
                    </ol>
			</section>

			<!-- Main content Verificacion adeudo -->
			<section class="content">
				<div class="row">
					<!-- Main row -->
					<div class="col-md-12" id="div2">

						<div class="box box-primary">

							<div class="box-body">

								<form id="form-adeudo">

									<div class="col-md-12 well">

										<fieldset>
											<legend style="text-align: center;">Información
												Verificacion</legend>
											<div id="contenido" class="form-group"></div>
										</fieldset>
										<br>
									</div>

									<div class="col-md-12">
										<br>
										<fieldset>
											<legend>Periodos de Adeudo</legend>
										
												<div class="row">
													<div id="comprobantes" class="form-group"></div>
												</div>
												<br>
												<div class="row">
													<div class="col-md-1 ">
														<label class="checkbox-inline"><input id="baja"
															type="checkbox" value="1">Baja:</label>
													</div>
													<div class="col-md-6">
														<label for="bajaPlaca" class="control-label">Placa:</label>
														<input class=" form-control-inlinel" id="bajaPlaca"
															name="bajaPlaca" placeholder="Placa..." maxlength="10" disabled>
													</div>
												</div>
										
										</fieldset>
										<br>
									</div>
									<div class="col-md-12">														
										<fieldset>
											<legend>Verificacíon de Adeudos</legend>
											<div class="row">
												<div class="col-md-4">
													<label for="folioVerificacionAdeudo" class="control-label">Folio
														Verficación:</label> <input class=" form-control"
														id="folioVerificacionAdeudo"
														name="folioVerificacionAdeudo"
														placeholder="Folio Verificación" maxlength="7">
												</div>
												<div class="col-md-4">
													<div class="form-group">
														<label for="procedencia" class="control-label">Procedencia:</label>
														<select class="form-control" id="procedencia"
															name="procedencia" required>
															<option value="0" selected>NACIONAL</option>
															<option value="1">EXTRANJERA</option>
														</select>
													</div>
												</div>
											</div>
											<div class="row" id="divExtranjero" style="display: none;">
												<div class="col-md-3">
													<div class="form-group">
														<label for="idEstado" class="control-label">Estado:</label>
														<select class="form-control" id="idEstado" name="idEstado"
															required>															
														</select>
													</div>
												</div>
												<div class="col-md-2">
													<label for="folioCalcamonia" class="control-label">Folio
														Calcamonia:</label> <input class=" form-control"
														id="folioCalcamonia" name="folioCalcamonia"
														placeholder="Folio Calcamonia" maxlength="10">
												</div>
												<div class="col-md-2">
													<label for="fechaRegularizacion" class="control-label">Fecha
														Regularizacion: </label> <input class=" form-control"
														id="fechaRegularizacion" name="fechaRegularizacion" placeholder="dd-mm-yyyy">
												</div>											
												
												<div class="col-md-4">
													<div class="form-group">
														<label for="documento" class="control-label">Documento:</label>
														<select class="form-control" id="documento"
															name="documento" required>
														</select>
													</div>
												</div>
											</div>
											<div class="row">
												<div class="col-md-6">
													<label for="observacion">Observaciones:</label>
													<textarea class="form-control" rows="1" id="observacion"></textarea>
												</div>
												<div class="col-md-3">
													<div class="form-group">
														<label for="estatus" class="control-label">Estatus:</label>
														<select class="form-control" id="estatus" name="estatus"
															required>
															<option value="0" selected>Verificado</option>
															<option value="1">error</option>
														</select>
													</div>
												</div>
											</div>
									</div>
									</fieldset>
									<br>
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
		<!-- Fin contenido Verificacion adeudo -->
	</div>

	<footer class="main-footer">
		<div class="pull-right hidden-xs">
			<b>Version</b> 2.3.0
		</div>
		<strong>Derechos de autor &copy; 2016 <a href="------">--------------</a>.
		</strong> Todos los derechos reservados.
	</footer>
	</div>
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
						
						/*
						
						$(function() {
							$.datepicker.regional['es-MX'] = {
								"Name" : "es-MX",
								"closeText" : "Close",
								"prevText" : "Prev",
								"nextText" : "Next",
								"currentText" : "Today",
								"monthNames" : [ "enero", "febrero", "marzo",
										"abril", "mayo", "junio", "julio",
										"agosto", "septiembre", "octubre",
										"noviembre", "diciembre", "" ],
								"monthNamesShort" : [ "ene", "feb", "mar",
										"abr", "may", "jun", "jul", "ago",
										"sep", "oct", "nov", "dic", "" ],
								"dayNames" : [ "domingo", "lunes", "martes",
										"miércoles", "jueves", "viernes",
										"sábado" ],
								"dayNamesShort" : [ "dom", "lun", "mar", "mié",
										"jue", "vie", "sáb" ],
								"dayNamesMin" : [ "do", "lu", "ma", "mi", "ju",
										"vi", "sá" ],
								"dateFormat" : "dd-mm-yy",
								"firstDay" : 0,
								"isRTL" : false
							};
							$.datepicker
									.setDefaults($.datepicker.regional['es-MX']);
							
							//$("#fechaRegularizacion").datepicker();
							
					
						});*/

						var url = window.location.search.substring(1);
						var fragmento = url.split("=");
						var idVerificacion = fragmento[1];

						var urlBusqueda = "${pageContext.request.contextPath}/cajas/vehicular/verificacion/obtenerVerificacioPorID/"
								+ "?id=" + idVerificacion;

						$
								.ajax({
									type : "GET",
									dataType : 'json',
									url : urlBusqueda,
									success : function(data) {
										$('#contenido').html("");
										$
												.each(
														data,
														function(key, val) {
															var ejercicio = $('<div class="col-md-2"><label><strong>EJERCICIO: </strong>'
																	+ val.ejercicio
																	+ '</label></div>');
															ejercicio
																	.appendTo('#contenido');
															var fecha = $('<div class="col-md-4"><label><strong>FECHA CAPTURA: </strong>'
																	+ val.fechaVerificacion
																	+ '</label></div>');
															fecha
																	.appendTo('#contenido');
															var vin = $('<div class="col-md-4"><label><strong>VIN: </strong>'
																	+ val.vinVehiculo
																	+ '</label></div>');
															vin
																	.appendTo('#contenido');
															var noSeguimiento = $('<div class="col-md-2"><label><strong>No Seguimiento: </strong>'
																	+ val.noSeguimientoVerificion
																	+ '</label></div>');
															noSeguimiento
																	.appendTo('#contenido');
														});
									},
									error : function(jqXHR, textStatus,
											errorThrown) {
										console.log(textStatus + " "
												+ errorThrown);
									}
								});

						// MANDA LLAMAR LOS COMBOS QUE SE GENERAN DE MANERA DINAMICA
						combos();

						//Cancelar y dirige a la vista principal de los vehiculos registrados
						$('#cancel-btn')
								.click(
										function() {
											var urlBack = "${pageContext.request.contextPath}/views/verificacion/verificaciones.jsp";
											window.location = urlBack;
										});

						//Registra un vehiculo
						$('#save-btn')
								.click(
										function() {

											//Validaciones
											var formValidation = $(
													'#form-adeudo').data(
													'formValidation');

											formValidation.validate();

											//console.log(formValidation.isValid());
											//alert(formValidation.isValid());
											
											if (formValidation.isValid()) {

												var datos = {};
												var idVerificacionVehiculo = idVerificacion;
												var folioVerificacionAdeudo = $(
														'#folioVerificacionAdeudo')
														.val();
												var procedencia = $(
														'#procedencia').val();
												var idEstado = $('#idEstado')
														.val();
												var folioCalcamonia = $(
														'#folioCalcamonia')
														.val();
												var fechaRegularizacion = $(
														'#fechaRegularizacion')
														.val();
												var documento = $('#documento')
														.val();
												var estatus = $('#estatus')
														.val();
												var observacion = $(
														'#observacion').val();
												var baja = $('#baja').val();
												var bajaPlaca = $('#bajaPlaca')
														.val();

												var anio0VerificacionAdeudo = 0;
												var anio1VerificacionAdeudo = 0;
												var anio2VerificacionAdeudo = 0;
												var anio3VerificacionAdeudo = 0;
												var anio4VerificacionAdeudo = 0;
												var anio5VerificacionAdeudo = 0;
												var baja = 0;

												if ($("#baja").is(':checked'))
												{
													baja = $("#anio0VerificacionAdeudo").val();
												}
												
												if ($("#anio0VerificacionAdeudo").is(':checked'))
													{
														anio0VerificacionAdeudo = $("#anio0VerificacionAdeudo").val();
													}
												if ($(
														"#anio1VerificacionAdeudo")
														.is(':checked')) {
													anio1VerificacionAdeudo = $(
															"#anio1VerificacionAdeudo")
															.val();
												}
												if ($(
														"#anio2VerificacionAdeudo")
														.is(':checked')) {
													anio2VerificacionAdeudo = $(
															"#anio2VerificacionAdeudo")
															.val();
												}
												if ($(
														"#anio3VerificacionAdeudo")
														.is(':checked')) {
													anio3VerificacionAdeudo = $(
															"#anio3VerificacionAdeudo")
															.val();
												}
												if ($(
														"#anio4VerificacionAdeudo")
														.is(':checked')) {
													anio4VerificacionAdeudo = $(
															"#anio4VerificacionAdeudo")
															.val();
												}
												if ($(
														"#anio5VerificacionAdeudo")
														.is(':checked')) {
													anio5VerificacionAdeudo = $(
															"#anio5VerificacionAdeudo")
															.val();
												}

												datos.idVerificacionVehiculo = idVerificacionVehiculo;
												datos.folioVerificacionAdeudo = folioVerificacionAdeudo;
												datos.procedencia = procedencia;
												datos.idEstado = idEstado;
												datos.folioCalcamonia = folioCalcamonia;
												datos.fechaRegularizacion = fechaRegularizacion;
												datos.idDocumento = documento;
												datos.estatus = estatus;
												datos.observaciones = observacion;
												datos.baja = baja;
												datos.bajaPlaca = bajaPlaca;
												datos.anio0VerificacionAdeudo = anio0VerificacionAdeudo;
												datos.anio1VerificacionAdeudo = anio1VerificacionAdeudo;
												datos.anio2VerificacionAdeudo = anio2VerificacionAdeudo;
												datos.anio3VerificacionAdeudo = anio3VerificacionAdeudo;
												datos.anio4VerificacionAdeudo = anio4VerificacionAdeudo;
												datos.anio5VerificacionAdeudo = anio5VerificacionAdeudo;

												var formData = JSON
														.stringify(datos);

												var urlPost = "${pageContext.request.contextPath}/cajas/vehicular/verificacion/adeudo";
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
																			text : "Verificación Adeudo registrada correctamente",
																			title : "Exito",
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
						$('#form-adeudo')
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
											//excluded: ':disabled',
    										//live: 'enabled',
											fields : {
												'folioVerificacionAdeudo' : { //validación del campo
													trigger : 'blur', //Se especifica cuando se acciona la validación del campo
													//enabled: true,
													validators : { //validaciones

														notEmpty : {
															message : 'Folio requerido.'
														},
														numeric : {
															message : 'Folio debe ser numerico',
														},
														stringLength : {															
															max : 7,
															message : 'Excede valor'
														},
														remote : {
															url : '${pageContext.request.contextPath}/cajas/vehicular/verificacion/adeudo/existeFolioVerificacion?'+ $('#folioVerificacionAdeudo').val(),														
															message : "¡El Folio que ingreso ya existe!",
															data : function(
																	validator,
																	$field,
																	value) {
																return {
																	folioVerificacionAdeudo : validator
																			.getFieldElements(
																					'folioVerificacionAdeudo')
																			.val()
																};
															}
														}
													}
												},
												'estatus' : { //validación del campo
													//enabled: true,
													trigger : 'blur', //Se especifica cuando se acciona la validación del campo
													validators : { //validaciones

														notEmpty : {
															message : 'Estatus es requerido.'
														}
													}
												},
												'procedencia' : { //validación del campo
													//enabled: true,
													trigger : 'blur', //Se especifica cuando se acciona la validación del campo
													validators : { //validaciones

														notEmpty : {
															message : 'Procedencia Vehiculo es requerido.'
														},
													}
												},
												'folioCalcamonia' : { //validación del campo													
													enabled: false,
													validators : { //validaciones
														notEmpty : {
															message : 'Folio Calcamonia Requerido',
														},
														stringLength : {															
															max : 7,
															message : 'Excede valor'
														},
													}
												},
												'idEstado' : { //validación del campo													
													enabled: false,
													validators : { //validaciones
														notEmpty : {
															message : 'Estado Requerido',
														},
													}
												},
												'documento' : { //validación del campo													
													enabled: false,
													validators : { //validaciones
														notEmpty : {
															message : 'Documento Requerido',
														},
													}
												},
												'bajaPlaca' : { //validación del campo													
													enabled: false,
													validators : { //validaciones
														notEmpty : {
															message : 'Placa Requerida',
														},
													}
												},
												'fechaRegularizacion': {
													//enabled: false,
													validators: {
								                        notEmpty: {
								                            message: 'La Fecha es Requerida'
								                        },
								                        date: {
								                            format: 'MM-DD-YYYY',
								                            message: 'Formato no valido'
								                        },
								                    }
								                },
											}
										});
						
						$('#procedencia').change(function() {
							if ($(this).val() != 0) {
								mostrar();	
							} else {
								ocultar();
							}
						});
						
						$('#baja').change(function() {
							 if (this.checked) {
							    	$('#bajaPlaca').removeAttr("disabled"); 
							    	$('#form-adeudo')
					                .formValidation('enableFieldValidators', 'bajaPlaca', true)
					                .formValidation('revalidateField', 'bajaPlaca');
							    } else {
							    	 $('#bajaPlaca').attr("disabled", "disabled"); 
							    	 $('#bajaPlaca').val('');
							    	 $('#bajaPlaca').parent().children('i').css('display', 'none');
							    	 $('#bajaPlaca').parent().children('small').css('display', 'none');
							    	 $('#form-adeudo')
					                    .formValidation('enableFieldValidators', 'bajaPlaca', false)
					                    .formValidation('revalidateField', 'bajaPlaca');
							    }
						    });
						
						var urlGetEstados = "${pageContext.request.contextPath}/cajas/estados";
						$.ajax({
							type : "GET",
							dataType : 'json',
							url : urlGetEstados,
							success : function(data) {
						        $.each(data, function(key, item) {
						            $('#idEstado').append($('<option>').text(item.estado).attr('value', item.idEstado));
						        });
							},
							error : function(jqXHR, textStatus, errorThrown) {
								console.log(textStatus + " " + errorThrown);
							}
						});
						
						var urlGetDocumentos = "${pageContext.request.contextPath}/cajas/vehicular/verificacion/documentoPedimento/obtenerDocumentos";
						$.ajax({
							type : "GET",
							dataType : 'json',
							url : urlGetDocumentos,
							success : function(data) {
						        $.each(data, function(key, item) {
						            $('#documento').append($('<option>').text(item.documento).attr('value', item.idDocumentoPedimento));
						        });
							},
							error : function(jqXHR, textStatus, errorThrown) {
								console.log(textStatus + " " + errorThrown);
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

					//documentReady
					});

	function mostrar(){
		$('#divExtranjero').show();
		$('#form-adeudo').formValidation('enableFieldValidators','folioCalcamonia',true).formValidation('revalidateField','folioCalcamonia');
		$('#form-adeudo').formValidation('enableFieldValidators','fechaRegularizacion',true).formValidation('revalidateField','fechaRegularizacion');
		$('#form-adeudo').formValidation('enableFieldValidators','idEstado',true).formValidation('revalidateField','idEstado');
		$('#form-adeudo').formValidation('enableFieldValidators','documento',true).formValidation('revalidateField','documento');
		$('#form-adeudo').formValidation('enableFieldValidators','fechaRegularizacion',true).formValidation('revalidateField','fechaRegularizacion');
	}
	
	function ocultar(){
		$('#divExtranjero').hide();
		$('#form-adeudo').formValidation('enableFieldValidators','folioCalcamonia',false).formValidation('revalidateField','folioCalcamonia');
		$('#form-adeudo').formValidation('enableFieldValidators','fechaRegularizacion',false).formValidation('revalidateField','fechaRegularizacion');
		$('#form-adeudo').formValidation('enableFieldValidators','idEstado',false).formValidation('revalidateField','idEstado');
		$('#form-adeudo').formValidation('enableFieldValidators','documento',false).formValidation('revalidateField','documento');
		}
	
	
	function combos() {
		var d = new Date();
		var year = d.getFullYear();

		var anio0VerificacionAdeudo = $('<div class="col-md-1"><label class="checkbox-inline"><input id="anio0VerificacionAdeudo" type="checkbox" value="'+year+'">'
				+ year + '</label></div>');
		anio0VerificacionAdeudo.appendTo('#comprobantes');
		var anio1VerificacionAdeudo = $('<div class="col-md-1"><label class="checkbox-inline"><input id="anio1VerificacionAdeudo" type="checkbox" value="'
				+ (year - 1) + '">' + (year - 1) + '</label></div>');
		anio1VerificacionAdeudo.appendTo('#comprobantes');
		var anio2VerificacionAdeudo = $('<div class="col-md-1"><label class="checkbox-inline"><input id="anio2VerificacionAdeudo" type="checkbox" value="'
				+ (year - 2) + '">' + (year - 2) + '</label></div>');
		anio2VerificacionAdeudo.appendTo('#comprobantes');
		var anio3VerificacionAdeudo = $('<div class="col-md-1"><label class="checkbox-inline"><input id="anio3VerificacionAdeudo" type="checkbox" value="'
				+ (year - 3) + '">' + (year - 3) + '</label></div>');
		anio3VerificacionAdeudo.appendTo('#comprobantes');
		var anio4VerificacionAdeudo = $('<div class="col-md-1"><label class="checkbox-inline"><input id="anio4VerificacionAdeudo" type="checkbox" value="'
				+ (year - 4) + '">' + (year - 4) + '</label></div>');
		anio4VerificacionAdeudo.appendTo('#comprobantes');
		var anio5VerificacionAdeudo = $('<div class="col-md-1"><label class="checkbox-inline"><input id="anio5VerificacionAdeudo" type="checkbox" value="'
				+ (year - 5) + '">' + (year - 5) + '</label></div>');
		anio5VerificacionAdeudo.appendTo('#comprobantes');
	};
</script>
</html>