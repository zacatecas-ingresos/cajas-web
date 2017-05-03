<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<head>
<meta
	content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no"
	name="viewport">
<title>Cajas</title>

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
					<span style="color: #798c9c"> </span>Presupuesto Estatal
				</h1>
			</section>

			<!-- Main content Usuarios Registrados -->
			<section class="content">

				<div class="row"> 
					
					<div class="col-md-12">
						<div class="box box-primary" id="busqueda">
							
							<div class="box-header">
								<h3 class="box-title">Datos Generales</h3>
							</div>
							<div class="box-body">
									<div class="row">
										<div class="col-md-3">
											<div class="form-group">
												<label>Ingrese un Criterio Búsqueda:</label> 
											</div>
										</div>
										<div class="col-md-6">
											<div class="form-group">
												<input type="text" class="form-control" id="inputCriterio"
												placeholder="Ingrese criterio busqueda">
											</div>
										</div>
										<div class="col-md-3">
											<button type="button"
											class="btn btn-sm btn-success glyphicon glyphicon-search"
											id="btnBuscar">
											</button>
										</div>
									</div>
								<br /> <br />
							</div>
						</div>
					</div>
				</div>	
				
				<div class="row">
					<div class="col-md-12">
						<div class="box box-success" id="panelContribuyente" >
						
							<div class="box-header">
								<h3 class="box-title">Contribuyentes</h3>
							</div>

							<div class="box-body">

								<div class="col-md-12">
									
									<form class="form-horizontal" id="formContribuyente" >

										<div class="form-group">
											<label for="inputNombre" class="col-sm-2 control-label">Nombre:</label> 
											 <div class="col-sm-10">
												<input type="text"
												class="form-control" id="inputNombre"
												placeholder="Nombre contribuyente" >
											 </div>
										</div>
										<div class="form-group">
											<label for="inputRfc" class="col-sm-2 control-label">&nbsp;&nbsp;&nbsp;RFC:</label> 
											<div class="col-sm-10">
												<input
												type="email" class="form-control" id="inputRfc"
												placeholder="Ingrese criterio busqueda" >
											</div>
										</div>
										<div class="form-group">
											<label for="inputDomicilio" class="col-sm-2 control-label" >Docimilio:</label> 
											<div class="col-sm-10">
												<input
												type="text" class="form-control" id="inputDomicilio"
												placeholder="Nombre contribuyente" >
											</div>
										</div>
										<div class="form-group">
											<label for="selectObligacion" class="col-sm-2 control-label" >Obligación:</label> 
											 <div class="col-sm-4">
												<select
													class="form-control " id="selectObligacion" name= "selectObligacion">
													<option value="">Seleccione	una obligación</option>
												</select>
											 </div>
										</div>
										<div class="form-group">
											 <div class="col-sm-4">
												<button type="button" id="cancelar-btn-contribuyente"
													class="btn btn-danger btn-md pull-left">
													<i class="fa fa-close"></i> Cancelar
												</button>
											 </div>
										</div>
									</form>
								</div>

							<div class="col-md-12" id="panelSucursales">
								<table id="tablaSucursales"
									class="tablaUsuarios table table-bordered table-hover">
									<thead>
										<tr class="bg-primary">
											<th>NO.</th>
											<th>CALLE</th>
											<th>NO. EXT</th>
											<th>NO. INT</th>
											<th>COLONIA</th>
											<th>MUNICIPIO</th>
											<th>NO. EMPLEADO</th>
											<th>DECLARA</th>
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
						<div class="box box-info" id="panelCalculos" >
							<div class="box-header">
								<h3 class="box-title">Calculos</h3>
							</div>
						<div class="box-body">
							<form id="formCalculos">
								<div class="col-md-4">
									<div class="form-group">
										<label>Declaración</label>
									</div>
									<div class="form-group">
										<label for="selectDeclaracion">Tipo Declaración:</label> 
								        <div class="selectContainer">
											<select
											class="form-control " id="selectDeclaracion" name= "selectDeclaracion">
											<option value="">Seleccione
												una opción</option>
											</select>
										</div>
									</div>
									<div id="panelComplementaria">
										<div class="form-group">
											<label for="inputRecibo">No. Recibo anterior:</label> <input
												class="form-control" id="inputRecibo"
												placeholder="Numero recibo anterior" type="text">
										</div>
										<div class="form-group">
											<label for="inputComplementaria">No. Complementaria:</label> <input
												class="form-control" id="inputComplementaria"
												placeholder="Numero complementaria" type="text">
										</div>
										<div class="form-group">
											<label for="inputComplementaria">Importe Anterior:</label> <input
												class="form-control" id="inputComplementaria"
												placeholder="Importe anterior" type="text">
										</div>
									</div>
								</div>
								<div class="col-md-4">
									<div class="form-group">
										<label for="inputComplementaria">Detalle de Pago</label>
									</div>
									<div class="form-group">
										<label for="selectAnyoFiscal">Año Fiscal:</label>
										 <div class="selectContainer">
											<select
											class="form-control " id="selectAnyoFiscal" name= "selectAnyoFiscal">
											<option value="">Seleccione
												una opción</option>
											</select>
										</div>
									</div>
									<div class="form-group">
										<label for="selectPeriodo">Periodo:</label> 
										<div class="selectContainer">
											<select
											class="form-control " id="selectPeriodo" name= "selectPeriodo">
											<option value="">Seleccione
												una opción</option>
											</select>
										</div>
									</div>
									
									<div class="form-group">
										<label for="inputEmpleados">No. de Empleados:</label>
										<input
											class="form-control" id="inputEmpleados" name="inputEmpleados"
											placeholder="Numero empleados" type="text">
									</div>
									<div class="form-group" id="importeNomina" >
										<label for="inputImporteNomina">Importe de Nómina:</label> <input
											class="form-control" id="inputImporteNomina"
											name="inputImporteNomina"
											placeholder="Importe nómina" type="text">
									</div>
									<div class="form-group" id="importeHospedaje">
										<label for="inputImporteHospedaje">Importe de Hospedaje:</label> <input
											class="form-control" id="inputImporteHospedaje"
											name="inputImporteHospedaje"
											placeholder="Importe nómina" type="text">
									</div>
									<div class="form-group">
										<button type="button" id="calcular-btn"
											class="btn btn-success btn-lg pull-left">
											<i class="fa fa-calculator"></i> Calcular
										</button>
									</div>

								</div>
								<div class="col-md-4">
									<div class="form-group">
										<label for="inputComplementaria">Importe a Pagar</label>
									</div>
									<div class="form-group" id="resultadoNomina" >
										<label for="inputNomina">Nómina:</label> <input 
											class="form-control" id="inputNomina" placeholder="Nómina"
											type="text">
									</div>
									<div class="form-group" id="resultadoHospedaje" >
										<label for="inputHospedaje">Hospedaje:</label> <input 
											class="form-control" id="inputHospedaje" placeholder="Hospedaje"
											type="text">
									</div>
									<div class="form-group">
										<label for="inputUaz">UAZ:</label> <input class="form-control"
											id="inputUaz" placeholder="UAZ" type="text">
									</div>
									<div class="form-group">
										<label for="inputActualizacion">Actualización:</label> <input
											class="form-control" id="inputActualizacion"
											placeholder="Actualizacion" type="text">
									</div>

									<div class="form-group">
										<label for="inputRecargo">Recargos:</label> <input
											class="form-control" id="inputRecargo" placeholder="Recargos"
											type="text">
									</div>
									<div class="form-group">
										<label for="inputMulta">Multa:</label> <input
											class="form-control" id="inputMulta" placeholder="Multa"
											type="text">
									</div>
									<br />
									<div class="form-group">
											<label for="inputGasto">Gastos de Ejecución:</label> <input
												class="form-control" id="inputGasto" placeholder="Recargos"
												type="text">
									</div>
									<div class="form-group">
											<label for="inputEstimulo">Estimulo:</label> <input
												class="form-control" id="inputEstimulo" placeholder="Estimulo"
												type="text">
									</div>
									<div class="form-group">
											<label for="inputTotal">Total:</label> <input
												class="form-control" id="inputTotal" placeholder="Total"
												type="text">
									</div>
								</div>
							  </form>
							</div>
							<!-- /.box-body -->
							<div class="box-footer">
								<div class="row" >
									<div class="col-md-6">
										<button type="button" id="cancelar-btn"
											class="btn btn-danger btn-lg pull-right">
											<i class="fa fa-close"></i> Cancelar
										</button>
									</div>
									<div class="col-md-6">
										<button type="button" id="agregar-btn"
											class="btn btn-primary btn-lg pull-left">
											<i class="fa fa-plus"></i> Agregar
										</button>										
									</div>									
								</div>								
							</div>
						</div>						
					</div>
				</div>

				<div class="row">
					<div class="col-md-12">
						<div class="box box-info" id="panelResultados" >
							<div class="box-header">
								<h3 class="box-title">Resultados</h3>
							</div>
							<div class="box-body">
								<table id="tablaResultados" class="tablaResultados table table-bordered table-hover">
									<thead>
										<tr class="bg-primary">
											<th>NOMINA</th>
											<th>UAZ</th>
											<th>ACTUALIZACIONES</th>
											<th>RECARGOS</th>
											<th>TOTAL</th>
											<th></th>
										</tr>
									</thead>
									<tbody>
									</tbody>
								</table>
								<div class="box-footer">
									<button type="button" id="clear-btn"
											class="btn btn-danger btn-md pull-left">
											<i class="fa fa-trash"></i> Quitar Resultados
									</button>	
									<button type="button" id="save-btn"
											class="btn btn-success btn-md pull-right">
											<i class="fa fa-trash"></i> Generar Presupuesto
									</button>								
								</div>
							</div>
						</div>
					</div>
				</div>

			</section>
			<!-- Fin contenido Registrar Usuario -->
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

<!-- Include Bootstrap-select CSS, JS -->
<script src="${pageContext.request.contextPath}/resources/bootstrap-select/js/bootstrap-select.min.js"></script>

<!-- Fin scripts -->


<script>
$(document).ready(function() {
		
	var resultados = [];
	var rfcContribuyente;
	var datosCalculo;
	var contribuyente;

	$('#panelContribuyente').hide();
	$('#panelCalculos').hide();
	$('#panelComplementaria').hide();
	$('#panelResultados').hide();
	$('#agregar-btn').hide();
	$('#save-btn').hide();
	$('#resultadoHospedaje').hide();
	$('#importeHospedaje').hide();
	$('#panelSucursales').hide();
						
	obtenerDeclaracion();
	obtenerObligacion();
	obtenerAnyo();
		
		
	//Busca un contribuyente
	$('#btnBuscar').click(function() {
							
		if($('#inputCriterio').val().length < 1){
				swal(
						{
						  	title : "Debe Ingresar criterio de busqueda.",
						 	type : "error",
							closeOnCancel : false
						}
					);
				$('#inputCriterio').css("border-color", "#ff0000");
				return;		
			}else{
				
				$('#inputCriterio').css("border-color", "#d2d6de");
				var urlContribuyente = "${pageContext.request.contextPath}/cajas/validarContribuyente/contribuyente?rfc="
				+$('#inputCriterio').val();
				$.ajax({
					type : 'GET',
					dataType : 'json',
					url : urlContribuyente,
					contentType : 'application/json',
					success : function(data,textStatus,jQxhr) {
							contribuyente = data;
							$('#inputNombre').val(data.contribuyente);
							$('#inputRfc').val(data.rfc);
							$('#panelContribuyente').show();
							$('#busqueda').hide();
						}
					});
				}

				$('#panelCalculos').hide();						
		});


		$('#selectObligacion').on("change", function() {

			var urlContribuyente = "${pageContext.request.contextPath}/cajas/validarContribuyente/sucursales?idContribuyente="
			+ contribuyente.idContribuyente +"&idObligacion="+parseInt($('#selectObligacion').val());
				$.ajax({
					type : 'GET',
					dataType : 'json',
					url : urlContribuyente,
					contentType : 'application/json',
					success : function(data,textStatus,jQxhr) {
							
							tablaContribuyenteSucursales(data);

							$('#panelSucursales').show();
							$('#panelCalculos').show();
							$('#cancelar-btn-contribuyente').hide();

							if($('#selectObligacion').val()==3){

								$('#importeNomina').show();
								$('#resultadoNomina').show();
								$('#importeHospedaje').hide();
								$('#resultadoHospedaje').hide();

							}else if($('#selectObligacion').val()==4){

								$('#importeNomina').hide();
								$('#resultadoNomina').hide();
								$('#importeHospedaje').show();
								$('#resultadoHospedaje').show();
						}
					},
					error : function(jqXHR,textStatus,errorThrown) {
						if (jqXHR.status == 400) {
			            	var result = jqXHR.responseJSON;
			            	console.log(result.code);
			            	console.log(result.message);
			            	swal({
								title:"Error " + result.code, 
								text:result.message, 
								type:"error",
								closeOnCancel: false
							});	

							$("#tablaResultados tr").remove();            		               
							$('#panelSucursales').hide();
							$('#panelCalculos').hide();

			            } 	
					}
				});
		});

	function tablaContribuyenteSucursales(data){
		$('tbody').find('td').remove();
		for (var i = 0; i < data.length; i++) {
			tr = $('<tr/>');
			$(tr).append("<td class="+"calle" +" >" + data[i].calle + "</td>");
			$(tr).append("<td class="+"noExterior" +" >" + data[i].numeroExterior + "</td>");
			$(tr).append("<td class="+"noInterior" +" >" + data[i].numeroInterior + "</td>");
			$('#tablaSucursales > tbody').append(tr);
		}
	};
	


	//Validaciones
	$('#formCalculos').formValidation(
			{
				framework : 'bootstrap', //Indicamos el framework para validar, Bootstrap, Pure,Semantic,etc
				excluded: ':disabled',
				icon : {//Feedback Icons
				valid : 'glyphicon glyphicon-ok',
				invalid : 'glyphicon glyphicon-remove',
				validating : 'glyphicon glyphicon-refresh'
			},
			//Lista de campos a validar y las reglas que aplican para cada uno de ellos
			fields : {
				'inputEmpleados' : { //validación del campo
							validators : { //validaciones
								notEmpty : {
											message : 'Ingrese el número de empleados.'
										},
										numeric: {
				                            message: 'El valor no es un número.'
				                        }
							}	
					}
               }
	});

		
	function parseDate(jsonDate) {
		var dateObject = new Date(jsonDate);
		var day = dateObject.getDate();
		var month = dateObject.getMonth() + 1;
		var year = dateObject.getFullYear();
		day = day < 10 ? "0" + day : day;
		month = month < 10 ? "0" + month : month;
		var date = day + "/" + month + "/" + year;
		return date;
	}
		

	function estatusUsuario(estatus){
		var urlEstatus;
		if(estatus == 1){
			urlEstatus = "${pageContext.request.contextPath}/resources/admin-lte/img/active.png";
		}else if(estatus == 0){
			urlEstatus = "${pageContext.request.contextPath}/resources/admin-lte/img/inactive.png";
		}
		return urlEstatus;
	}	


	//Mantiene seleccionada una fila cambiando de color	
	$('tbody').on("click", "tr", function(event) {
	   	$(this).addClass('bg-info').siblings().removeClass('bg-info');
	});
		
	//cambiar puntero
	$('tbody').hover(function() {
		 $(this).css('cursor','pointer');
	});
		
	$('tbody').on("click", "td", function() {
		rfcContribuyente = $(this).closest('tr').find('.rfc').text();
	});
												
	
	function obtenerDeclaracion() {
		var declaraciones = [{id:1, declaracion:'Normal'}, {id:2, declaracion:'Complementaria'}];
		$.grep(declaraciones, function(value, index) {
			$('#selectDeclaracion').append(
					'<option value="'+value.id+'">' + value.declaracion
							+ '</option>');
		});
	}

	function obtenerObligacion() {
		console.log("Obtener Obligación...");
		var obligaciones = [{id:3, obligacion:'Nomina'}, {id:4, obligacion:'Hospedaje'}];
		$.grep(obligaciones, function(value, index) {
			$('#selectObligacion').append('<option value="'+value.id+'">' + value.obligacion
			+ '</option>');
		});
	}	

	function obtenerAnyo(){
		var urlEjerciciosFiscales = "${pageContext.request.contextPath}/cajas/ejerciciosFiscales";
		$.ajax({
				type: "GET",
				dataType : 'json',
				url: urlEjerciciosFiscales,
				success: function(data){
					selectEjercicioFiscales(data);
				}
		});
	}

	//colocar valores select box
	function selectEjercicioFiscales(data){
		$.each( data, function( key, val ) {
			$('#selectAnyoFiscal').append('<option value=' + val.ejercicioFiscal  + '>' + val.ejercicioFiscal + '</option>');
  		});
	}


	$('#selectAnyoFiscal').on('change', function() {
		$('#selectPeriodo').empty();
  		obtenerPeriodo();
	});


	function obtenerPeriodo(){
		var ejercicioFiscal = $('#selectAnyoFiscal');
		var aFiscal = parseInt(ejercicioFiscal.val());
		var urlPeriodos = "${pageContext.request.contextPath}/cajas/periodos"+"?aFiscal="+aFiscal;
		$.ajax({
				type: "GET",
				dataType : 'json',
				url: urlPeriodos,
				success: function(data){
					selectPeriodos(data);
				}
		});
	};
	
		//colocar valores select box
	function selectPeriodos(data){
		$.each( data, function( key, val ) {
			$('#selectPeriodo').append('<option value=' + val.idPeriodo  + '>' + val.mes + '</option>');
  		});
	}						



	$('#selectDeclaracion').on("click", function() {
			if($('#selectDeclaracion').val()==2){
				$('#panelComplementaria').show();	
			}else if($('#selectDeclaracion').val()==1){
				$('#panelComplementaria').hide();
			}else{
				$('#panelComplementaria').hide();
			}
	});

	//calculos
	$('#calcular-btn').click(function() {

		//Validaciones
		var formValidation = $('#formCalculos').data('formValidation');
		formValidation.validate();

		console.log(formValidation.isValid());

		if (formValidation.isValid()) {
			
			var datos = {};
			var mes = $('#selectPeriodo');
			var ejercicioFiscal = $('#selectAnyoFiscal');
			var totalErogaciones;

			if($('#selectObligacion').val()==3){
				totalErogaciones = $('#inputImporteNomina');
			}else if($('#selectObligacion').val()==4){
				totalErogaciones = $('#inputImporteHospedaje');
			}

			var idObligacion = $('#selectObligacion');
			var tipoDeclaracion= $('#selectDeclaracion');
			var numeroEmpleados = $('#inputEmpleados');

			datos.periodo = mes.val();
			datos.ejercicioFiscal = parseInt(ejercicioFiscal.val());
			datos.totalErogaciones = totalErogaciones.val();
			datos.numeroEmpleados= numeroEmpleados.val();
			datos.idContribuyente= 1;
			datos.idObligacion= idObligacion.val();
			datos.idSucursal= 1;
			datos.idTipoDeclaracion = tipoDeclaracion.val();
			var formData = JSON.stringify(datos);
			
			
			console.log(formData);
			var urlPut = "${pageContext.request.contextPath}/cajas/calculoEstatal";
			var presupuestoEstatal = "${pageContext.request.contextPath}/views/cajas/presupuestoEstatal.jsp";
		$.ajax({
				type : 'PUT',
				url : urlPut,
				data : formData,
				dataType : "json",
				contentType : 'application/json',
				success : function(data,textStatus,jQxhr) {
					datosCalculo = data;
				swal(
						{
							title : "Calculo realizado correctamente.",
							type : "success",
						}
						);
						colocarValores(data);
						$('#agregar-btn').show();
						$('#save-btn').show();
					}
				});
		}
	});

	$('#agregar-btn').click(function() {
		var existe = false;
		$('#panelResultados').show();
		console.log(JSON.stringify(datosCalculo));

		if(resultados.length == 0){
			resultados.push(datosCalculo);
		}else{
			for (var i = 0; i < resultados.length; i++) {

				if(resultados[i].periodo==datosCalculo.periodo && resultados[i].aFiscal==datosCalculo.aFiscal 
					&& resultados[i].obligacion == datosCalculo.obligacion && resultados[i].declaracion== datosCalculo.declaracion){
					existe = true;
				}
			}
			if(!existe){
				resultados.push(datosCalculo);
			}else{
				swal(
						{
							title : "Seleccione un presupuesto con un periodo, año u obligación distinto.",
							type : "error",
							closeOnCancel : false
						}
					);
			}
		}
		tablaResultados(resultados);
	});

	$('#save-btn').click(function() {
		
		var urlPost = "${pageContext.request.contextPath}/cajas/presupuestos";
		var presupuestoEstatal = "${pageContext.request.contextPath}/views/cajas/presupuestoEstatal.jsp";
		var formData = JSON.stringify(resultados);	
		console.log(formData);
		$.ajax({
				type : 'POST',
				url : urlPost,
				data : formData,
				dataType : "json",
				contentType : 'application/json',
				success : function(data,textStatus,jQxhr) {
				swal(
						{
							title : "Calculo realizado correctamente.",
							type : "success",
						},
							function() {
							window.location = presupuestoEstatal;
				});
			}
		});
	});

	function tablaResultados(data){
		$('tbody').find('td').remove();
		for (var i = 0; i < data.length; i++) {
			tr = $('<tr/>');
			$(tr).append("<td class="+"nomina" +" >" + data[i].impuesto + "</td>");
			$(tr).append("<td class="+"uaz" +" >" + data[i].uaz + "</td>");
			$(tr).append("<td class="+"actualizaciones" +" >" + data[i].actualizaciones + "</td>");
			$(tr).append("<td class="+"recargos" +" >" + data[i].recargos + "</td>");
			$(tr).append("<td class="+"total" +" >" + data[i].total + "</td>");
			$(tr).append("<td align="+ "center" + ">" + '<input type="button" class="eliminar-btn btn btn-sm btn-primary "  value="Quitar">'  + "</td>");
			$('#tablaResultados > tbody').append(tr);
		}
	};


	$("table.tablaResultados").on("click", ".eliminar-btn", function (event) {
		$(this).closest("tr").remove(); 
		var row = $(this).index()+1;
		resultados.splice(0, row);
		$(this).closest("tr").remove();  
        if (resultados.length == 0) {
    		resultados= [];
    		$('#panelResultados').hide();
		}
    });

	$('#clear-btn').click(function() {
		$('tbody').find('td').remove();
		resultados= [];
        $('#panelResultados').hide();
	});

	$('#cancelar-btn').click(function() {
		
		$('#panelContribuyente').hide();
		$('#panelCalculos').hide();
		$('#panelComplementaria').hide();
		$('#busqueda').show();
		$('#panelResultados').hide();
		$('#selectPeriodo').empty();
		$('#agregar-btn').hide();
		$('#save-btn').hide();
		$('#panelSucursales').hide();
		$('#cancelar-btn-contribuyente').show();

		rfcContribuyente = null
		resultados= [];
		$("#tablaResultados tr").remove();
		document.getElementById("formCalculos").reset();

		fv = $('#formCalculos').data('formValidation');
		// Reset form
        fv.resetForm(true);
	});

	$('#cancelar-btn-contribuyente').click(function() {
		$('#busqueda').show();
		$('#panelContribuyente').hide();
		$('#cancelar-btn-contribuyente').show();
		rfcContribuyente = null
	});


	//colocar valores despues de realizar el calculo
	function colocarValores(data){	
		$.each( data, function( key, val ) {
			if(key=="uaz"){
				$('#inputUaz').val(val);
			}
			if(key == "actualizaciones"){
				$('#inputActualizacion').val(val);
			}
			if(key == "recargos"){
				$('#inputRecargo').val(val);
			}
			if(key=="impuesto"){
				if($('#selectObligacion').val()==3){
					$('#inputNomina').val(val);
				}else if($('#selectObligacion').val()==4){
					$('#inputHospedaje').val(val);
				}
			}
			if(key=="total"){
				$('#inputTotal').val(val);
			}
  		});
	}	



	//Errores
    $.ajaxSetup({
        error: function (x, status, error) {
            if (x.status == 400) {
            	var result = x.responseJSON;
            	console.log(result.code);
            	console.log(result.message);
            	swal({
					title:"Error " + result.code, 
					text:result.message, 
					type:"error",
					closeOnCancel: false
				});	            		               
            } else if(x.status == 500) {
            	swal({
					title:"Error 500", 
					text:"Disculpe las molestias no podemos procesar su solicitud.", 
					type:"error",
					closeOnCancel: false
				});
            }
        }
    });

});
</script>

</html>