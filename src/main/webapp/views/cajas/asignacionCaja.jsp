<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta
	content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no"
	name="viewport">
<title>Asignacion Caja</title>
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


<style type="text/css">
#formCalculos .selectContainer .form-control-feedback {
	/* Adjust feedback icon position */
	right: -25px;
}
</style>

<body class="hold-transition skin-blue sidebar-mini">
	<div class="wrapper">

		<header class="main-header">
			<!-- Logo -->
			<a href="index.html" class="logo"> <!-- mini logo for sidebar mini 50x50 pixels -->
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
					<span style="color: #798c9c"> </span>Asignación de Caja
				</h1>
			</section>

			<!-- Main content Asignacion Caja-->
			<section class="content">
				<div class="row">
					<!-- Main row -->
					<div class="col-md-12" id="div2">
						<div class="box box-primary" id="asignacionCaja">
							<div class="box-header">
								<h3 class="box-title">Cajas sin asignar</h3>
							</div>
							<div class="box-footer">
								<div class="col-md-4">
									<button type="button" class="btn btn-sm btn-success"
										id="btnAsignarCajero">
										<i class="fa fa-plus"></i> Asignar Cajero
									</button>
								</div>
								<br /> <br />
								<div class="col-md-12" id="div2">
									<table id="tablaCajasLibres"
										class="tablaUsuarios table table-bordered table-hover">
										<thead>
											<tr class="bg-primary">
												<th>Número de Caja</th>
												<th>NOMBRE</th>
												<th>TIPO</th>
												<th>DELEGACION</th>

											</tr>
										</thead>
										<tbody>
										</tbody>
									</table>
								</div>
							</div>
						</div>
					</div>
				</div>
				
				<div class="row">
					<!-- Main row -->
					<div class="col-md-12" id="div2">
						<div class="box box-primary" id="liberarCaja">
							<div class="box-header">
								<h3 class="box-title">Cajas asignadas</h3>
							</div>
							<div class="box-footer">
								<div class="col-md-4">
									<button type="button" class="btn btn-sm btn-success"
										id="btnLiberarcaja">
										<i class="fa fa-plus"></i> Liberar Caja
									</button>
								</div>
								<br /> <br />
								<div class="col-md-12" id="div2">
									<table id="tablaCajasAsignadas"
										class="tablaUsuarios table table-bordered table-hover">
										<thead>
											<tr class="bg-primary">
												<th>Número de Caja</th>
												<th>NOMBRE</th>
												<th>TIPO</th>
												<th>DELEGACION</th>

											</tr>
										</thead>
										<tbody>
										</tbody>
									</table>
								</div>
							</div>
						</div>
					</div>
				</div>
				
				<div class="row">
				
				    <div class="col-md-12">
							<div class="box box-primary" id="elegirCajero">
					     		<div class="box-header">
						     		<h3 class="box-title">Asignar Cajero</h3>
								</div>
								<form id="form-asignar-Caja">
								 <div class="box-footer">
									   <div class="col-xs-1"></div> 			
						           				<div class="col-xs-3">
						           					
						           				</div>
											<div class="col-xs-5">
												<div class="form-group">
														<label>Número Caja</label>
														<input id="numero-alta" name="product-name" class="form-control" value="01" disabled="true"/>
													</div>
													<div class="form-group">
														<label>Nombre</label>
														<input id="nombre-alta" name="product-name" class="form-control" value="Caja 01" disabled="true"/>
													</div>
													<div class="form-group">
														<label>Tipo</label>
														<input id="tipo-alta" name="product-name" class="form-control" value="Cajas centrales" disabled="true"/>
													</div>
													<div class="form-group">
														<label>Delegacion</label>
														<input id="delegacion-alta" name="product-name" class="form-control" value="Zacatecas" disabled="true"/>
													</div>
													<div class="form-group">
														<label>Cajeros disponibles</label>
														<select id="cajero-alta" class="form-control" required name="cajero-alta">
														<option value="" selected>Seleccione un empleado..</option>
															<option value="2">Luis Sanchez</option>
															<option value="3">Maria Lopez</option>
															<option value="4">Antonio Garcia</option>														
														</select>
													</div>
											</div>
									</div>
									</form>
									<div class="box-footer clearfix">
										<button id="cancelCajero-btn" type="button" class="btn btn-default btn-lg pull-left">
	            							<i class="fa fa-remove"></i> Cancelar
	            						</button>
										<button type="button" id="saveCajero-btn" class="btn btn-success btn-lg pull-right">
	           	    						<i class="fa fa-credit-card"></i> Guardar
	           	    					</button>
									</div>
									
								
							</div>
					</div>
				</div>
			</section>



		</div>

		<footer class="main-footer">
			<div class="pull-right hidden-xs">
				<b>Version</b> 2.3.0
			</div>
			<strong>Derechos de autor &copy; 2016 <a href="------">--------------</a>.
			</strong> Todos los derechos reservados.
		</footer>
	</div>
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

<script type="text/javascript">
	$(document)
			.ready(
					function() {
						$('#elegirCajero').hide();
						
						$('#btnAsignarCajero').prop('disabled',true);
						$('#btnLiberarcaja').prop('disabled',true);

						var numCaja=0;
						var numLCaja=0;
						var data = [ {NumeroCaja : '01',nombre : 'Caja 01',tipo : 'Cajas centrales',delegacion : 'Zacatecas'},
									 {NumeroCaja : '02',nombre : 'Caja 02',tipo : 'Cajas centrales',delegacion : 'Zacatecas'},
									 {NumeroCaja : '03',nombre : 'Caja 03',tipo : 'Cajas centrales',delegacion : 'Zacatecas'},
									 {NumeroCaja : '04',nombre : 'Caja 04',tipo : 'Kioskos',delegacion : 'Zacatecas'},
									 {NumeroCaja : '05',nombre : 'Caja 05',tipo : 'Internet',delegacion : 'Zacatecas'}, ];

						var data2 = [ {NumCaja : '06',nombre : 'Caja 06',tipo : 'Cajas centrales',delegacion : 'Zacatecas'},
									 {NumCaja : '07',nombre : 'Caja 07',tipo : 'Cajas centrales',delegacion : 'Zacatecas'},
									 {NumCaja : '08',nombre : 'Kiosko centro',tipo : 'Cajas centrales',delegacion : 'Zacatecas'},
									 {NumCaja : '09',nombre : 'Caja 09',tipo : 'Kioskos',delegacion : 'Zacatecas'},
									 {NumCaja : '010',nombre : 'Internet Zacatecas',tipo : 'Internet',delegacion : 'Zacatecas'}, ];
						
						 
						//llena la tabla de cajas sin asignar
						$('tbody').find('td').remove();
						for (var i = 0; i < data.length; i++) {
							tr = $('<tr/>');
							$(tr).append("<td class="+"numeroCaja" +" >"+ data[i].NumeroCaja + "</td>");
							$(tr).append("<td class="+"nombre" +" >"+ data[i].nombre + "</td>");
							$(tr).append("<td class="+"tipo" +" >" + data[i].tipo+ "</td>");
							$(tr).append("<td class="+"delegacion" +" >"+ data[i].delegacion + "</td>");
							$('#tablaCajasLibres > tbody').append(tr);
						}


						//Llena la tabla de cajas asignadas
						//$('tbody').find('td').remove();
						for (var i = 0; i < data2.length; i++) {
							tr = $('<tr/>');
							$(tr).append("<td class="+"numCaja" +" >"+ data2[i].NumCaja + "</td>");
							$(tr).append("<td class="+"nombre" +" >"+ data2[i].nombre + "</td>");
							$(tr).append("<td class="+"tipo" +" >" + data2[i].tipo+ "</td>");
							$(tr).append("<td class="+"delegacion" +" >"+ data2[i].delegacion + "</td>");
							$('#tablaCajasAsignadas > tbody').append(tr);
						}
						

						// accion del boton para asignar cajeros
							
												$('#btnLiberarcaja')
														.click(
																function() {
																	swal({
																		  title: "Liberar Caja",
																		  text: "Esta seguro de continuar con la liberación de la caja?",
																		  type: "warning",
																		  showCancelButton: true,
																		  closeOnConfirm: false,
																		  showLoaderOnConfirm: true,
																		  confirmButtonColor: "#DD6B55",
																		  confirmButtonText: "Si , continuar!",
																		  cancelButtonText: "No, cancelar",
																		},
																		function(){
																		  setTimeout(function(){
																		    swal("Caja Liberada","La caja fue liberada correctamente!","success");
																		  }, 2000);
																		});
																});

												$('#cancelCajero-btn')
												.click(
														function() {
															$('#elegirCajero').hide();
															$('#asignacionCaja').show();
															$('#liberarCaja').show();
														});


												$('#saveCajero-btn')
												.click(
														function() {
												//Validaciones
												var formValidation = $(
														'#form-asignar-Caja').data(
														'formValidation');

												formValidation.validate();

												console.log(formValidation
														.isValid());
														});
												

												//Validaciones
												$('#form-asignar-Caja')
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
																		'cajero-alta' : { //validación del campo
																			trigger : 'blur', //Se especifica cuando se acciona la validación del campo
																			validators : { //validaciones

																				notEmpty : {
																					message : 'El empleado es requerido.'
																				},
																			}
																		},
																	}
																});



												//Liberar Cajas
												
												$('#btnAsignarCajero')
														.click(
																function() {
																	$('#elegirCajero').show();
																	$('#asignacionCaja').hide();
																	$('#liberarCaja').hide();
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

	//Mantiene seleccionada una fila cambiando de color	
	$('tbody').on("click", "tr", function(event) {
	   	$(this).addClass('bg-info').siblings().removeClass('bg-info');
	});
		
	//cambiar puntero
	$('tbody').hover(function() {
		 $(this).css('cursor','pointer');
	});

	$('tbody').on("click", "td", function() {
		numCaja= $(this).closest('tr').find('.numeroCaja').text();
		numLCaja= $(this).closest('tr').find('.numCaja').text();
		if(numCaja>0){
			$('#btnLiberarcaja').prop('disabled',true);
			$('#btnAsignarCajero').prop('disabled',false);
		
		}
		if(numLCaja>0){
			$('#btnAsignarCajero').prop('disabled',true);
			$('#btnLiberarcaja').prop('disabled',false);
			
			}
		
	});



</script>


</html>
