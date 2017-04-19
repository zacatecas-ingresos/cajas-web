<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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

<style type="text/css">
	#formCalculos .selectContainer .form-control-feedback {
    /* Adjust feedback icon position */
    right: -15px;
}
</style>


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
					<span style="color: #798c9c"> </span>Presupuesto ISN
				</h1>
			</section>

			<!-- Main content Usuarios Registrados -->
			<section class="content">

				<div class="row"> 
					
					<div class="col-md-12">
						<div class="box box-primary">
							
							<div class="box-header">
								<h3 class="box-title">Datos Generales</h3>
							</div>
							
							<div class="box-body">
								<div class="col-md-6">
									<form class="form-inline">
										<div class="form-group">
											<label for="selectCriterio">Criterio Búsqueda:</label> <select
													class="form-control" id="selectCriterio">
												<option value="" selected="selected">Seleccione
													una opción</option>
												</select>
												
										</div>
											
										<div class="form-group">
											<input type="text" class="form-control" id="inputCriterio"
												placeholder="Ingrese criterio busqueda">
										</div>
											
										<button type="button"
											class="btn btn-sm btn-success glyphicon glyphicon-search"
											id="btnBuscar">
										</button>
												
									</form>
								</div>
								<br /> <br />
							</div>

							
							<div class="box-footer">
								<div class="col-md-12">
									<table id="tablaContribuyente"
										class="tablaUsuarios table table-bordered table-hover">
										<thead>
											<tr class="bg-primary">
											<th>RFC</th>
											<th>NOMBRE O RAZON SOCIAL</th>
											<th>DIRECCION FISCAL</th>
											<th>FECHA INICIO</th>
											<th>ESTATUS</th>
											</tr>
										</thead>
										<tbody>
										</tbody>
									</table>
								</div>								
								<br /> <br />
								<button type="button" class="btn btn-primary glyphicon glyphicon-eye-open" id="seleccionarContribuyente">&nbsp;Ver contribuyente</button>
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
									
									<form class="form-horizontal">

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
									</form>
								</div>
							<br /> <br />

							<div class="col-md-12">
								<table id="tablaSucursales"
									class="tablaUsuarios table table-bordered table-hover">
									<thead>
										<tr class="bg-primary">
											<th>N°</th>
											<th>CALLE</th>
											<th>N° EXT</th>
											<th>N° INT</th>
											<th>COLONIA</th>
											<th>MUNICIPIO</th>
											<th>N° EMPLEADO</th>
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
								        <div class=" col-md-12 selectContainer">
											<select
											class="form-control " id="selectDeclaracion" name= "selectDeclaracion">
											<option value="">Seleccione
												una opción</option>
											</select>
										</div>
									</div>
									<div id="panelComplementaria">
										<div class="form-group">
											<label for="inputRecibo">N° Recibo anterior:</label> <input
												class="form-control" id="inputRecibo"
												placeholder="Numero recibo anterior" type="text">
										</div>
										<div class="form-group">
											<label for="inputComplementaria">N° Complementaria:</label> <input
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
										<label for="inputEmpleados">N° de Empleados:</label>
										<input
											class="form-control" id="inputEmpleados" name="inputEmpleados"
											placeholder="Numero empleados" type="text">
									</div>
									<div class="form-group">
										<label for="inputImporteNomina">Importe de Nomina:</label> <input
											class="form-control" id="inputImporteNomina"
											name="inputImporteNomina"
											placeholder="Importe nomina" type="text">
									</div>
								</div>
								<div class="col-md-4">
									<div class="form-group">
										<label for="inputComplementaria">Importe a Pagar</label>
									</div>
									<div class="form-group">
										<label for="inputNomina">Nomina:</label> <input 
											class="form-control" id="inputNomina" placeholder="Nomina"
											type="text">
									</div>
									<div class="form-group">
										<label for="inputUaz">UAZ:</label> <input class="form-control"
											id="inputUaz" placeholder="Uaz" type="text">
									</div>
									<div class="form-group">
										<label for="inputActualizacion">Actualizacion:</label> <input
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
											<label for="inputGasto">Gastos de Ejecucion:</label> <input
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
							<div class="box-footer clearfix">
									<button type="button" id="calcular-btn"
											class="btn btn-success btn-lg pull-right">
										<i class="fa fa-credit-card"></i> Calcular
									</button>
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
<link rel="stylesheet" href="//cdnjs.cloudflare.com/ajax/libs/bootstrap-select/1.6.2/css/bootstrap-select.min.css" />
<script src="//cdnjs.cloudflare.com/ajax/libs/bootstrap-select/1.6.2/js/bootstrap-select.min.js"></script>

<!-- Fin scripts -->


<script>
	$(document).ready(function() {
						
		var rfcContribuyente;
		var data = [{rfc:'ROAA6411012FA', nombre:'ABEL RODRIGUEZ AGUILAR', domicilio:'CARR.A SAN RAMON KM. 0+800', fechaInicio:new Date(), activo:true,
								sucursales:[{numero:1, calle:'CARR.A SAN RAMON', numInt:2, numExt:4, colonia:'SIN DATO', municipio:'ZACATECAS', empleados:2, declara:true},
									{numero:2, calle:'SAN RAMON', numInt:2, numExt:4, colonia:'SIN DATO', municipio:'ZACATECAS', empleados:2, declara:true}]},
							{rfc:'TOSC850108M67', nombre:'CARLOS FRANCISCO TORRES SORIANO', domicilio:'PRIVADA LOS PINOS Nº 204', fechaInicio:new Date(), activo:true,
								sucursales:[{numero:1, calle:'PRIVADA LOS PINOS', numInt:204, numExt:13, colonia:'SIN DATO', municipio:'ZACATECAS', empleados:2, declara:true}]},
							{rfc:'SAAC560304V15', nombre:'CRISTOBAL IVAN SALINAS ARANDA', domicilio:'PRIV. SIERRA HERMOSA Nº 19', fechaInicio:new Date(), activo:true,
								sucursales:[{numero:1, calle:'PRIV. SIERRA HERMOSA', numInt:19, numExt:10, colonia:'SIN DATO', municipio:'ZACATECAS', empleados:1, declara:true}]},
							{rfc:'DRZ9501053P1', nombre:'DISTRIBUIDORA RODRIGUEZ DE ZAC', domicilio:'HIDALGO Nº 5', fechaInicio:new Date(), activo:true,
								sucursales:[{numero:1, calle:'HIDALGO', numInt:5, numExt:1, colonia:'SIN DATO', municipio:'ZACATECAS', empleados:3, declara:true},
									{numero:1, calle:'HIDALGO', numInt:5, numExt:1, colonia:'SIN DATO', municipio:'ZACATECAS', empleados:1, declara:true}]},
							{rfc:'GCC-020227-UW5', nombre:'GRUPO CONSTRUCTOR CARTAGENA', domicilio:'AV. VIÑEDOS RIVER No. 805 AGS.', fechaInicio:new Date(), activo:true,
								sucursales:[{numero:1, calle:'AV. VIÑEDOS RIVER', numInt:805, numExt:8, colonia:'SIN DATO', municipio:'ZACATECAS', empleados:5, declara:true}]}];
				
										
		$('#panelContribuyente').hide();
		$('#panelCalculos').hide();
		$('#panelComplementaria').hide();
						
		obtenerCriterioBusqueda();
		obtenerDeclaracion();
		obtenerAnyo();
		
		
		//Busca un contribuyente
		$('#btnBuscar').click(function() {
							
			//Validaciones
			if($('#selectCriterio').val().length < 1){
				swal(
						{
						  	title : "Debe seleccionar el tipo de busuqeda a realizar.",
						 	type : "error",
							closeOnCancel : false
						}
					);
				
				$('#selectCriterio').css("border-color", "#ff0000");				
				return;		
			}else{
					$('#selectCriterio').css("border-color", "#d2d6de");
				}
				
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
				}

			$('#panelContribuyente').hide();
			$('#panelCalculos').hide();
									
			$('tbody').find('td').remove();
			for (var i = 0; i < data.length; i++) {
				tr = $('<tr/>');
				$(tr).append("<td class="+"rfc" +" >" + data[i].rfc + "</td>");
				$(tr).append("<td class="+"nombre" +" >" + data[i].nombre + "</td>");
				$(tr).append("<td class="+"domicilio" +" >" + data[i].domicilio + "</td>");
				$(tr).append("<td class="+"fechaInicio" +" >" + parseDate(data[i].fechaInicio) + "</td>");
				$(tr).append("<td class="+"activo" +" >" + "<img src="+estatusUsuario(data[i].activo)+" style="+"width:30px; height:auto;" + "></img></td>");
				$('#tablaContribuyente > tbody').append(tr);
			}								
																		
		});
		

		$('#seleccionarContribuyente').click(function(){
			if(rfcContribuyente == null){
				swal(
						{
							title : "No ha seleccionado a un contribuyente.",
							type : "error",
							closeOnCancel : false
						}
					);
			}else{
								
					$.grep(data, function(value, index) {
						if(rfcContribuyente==value.rfc){
							$('#inputNombre').val(value.nombre);
							$('#inputRfc').val(value.rfc);
							$('#inputDomicilio').val(value.domicilio);
										
							//$('tbody').find('td').remove();
							for (var i = 0; i < value.sucursales.length; i++) {
								tr = $('<tr/>');
								$(tr).append("<td class="+"N°" +" >" + value.sucursales[i].numero + "</td>");
								$(tr).append("<td class="+"calle" +" >" + value.sucursales[i].calle + "</td>");
								$(tr).append("<td class="+"numInt" +" >" + value.sucursales[i].numInt + "</td>");
								$(tr).append("<td class="+"numExt" +" >" + value.sucursales[i].numExt + "</td>");
								$(tr).append("<td class="+"colonia" +" >" + value.sucursales[i].colonia + "</td>");
								$(tr).append("<td class="+"municipio" +" >" + value.sucursales[i].municipio + "</td>");
								$(tr).append("<td class="+"empleados" +" >" + value.sucursales[i].empleados + "</td>");
								//$(tr).append("<td class="+"declara" +" >"+"<input type="+"checkbox"+"checked="+sucursales[i].declara+">"+ "</td>");
								$('#tablaSucursales > tbody').append(tr);
							}
										
						}
									
					});
								
								
				$('#panelContribuyente').show();
				$('#panelCalculos').show();				
				}



		//Validaciones
		$('#formCalculos')
			.find('[name="selectDeclaracion"]')
            .selectpicker()
            .change(function(e) {
                $('#formCalculos').formValidation('revalidateField', 'selectDeclaracion');
            })
            .end()
        .formValidation(
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
				'inputImporteNomina' : { //validación del campo
							validators : { //validaciones
								notEmpty : {
											message : 'Ingrese el importe de la nomina.'
										}
							}	
					},
				'inputEmpleados' : { //validación del campo
							validators : { //validaciones
								notEmpty : {
											message : 'Ingrese el número de empleados.'
										}
							}	
					},
				'selectDeclaracion' : { //validación del campo
							validators : { //validaciones
								notEmpty : {
											message : 'Seleccione la declaración.'
										}
							}	
					}
                }
		});



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
						
	});

	
	var obtenerCriterioBusqueda = function() {
		var criterios = [ {id : 1, criterio : 'Nombre'}, {id : 2, criterio : 'Razon Social'}, 
			{id : 3,criterio : 'RFC'}];
		$.grep(criterios, function(value, index) {
			$('#selectCriterio').append(
					'<option value="'+value.id+'">' + value.criterio
							+ '</option>');
		});
	};
	
	var obtenerDeclaracion = function() {
		var declaraciones = [{id:1, declaracion:'Normal'}, {id:2, declaracion:'Complementaria'}];
		$.grep(declaraciones, function(value, index) {
			$('#selectDeclaracion').append(
					'<option value="'+value.id+'">' + value.declaracion
							+ '</option>');
		});
	};

	var obtenerAnyo = function(){
		var urlEjerciciosFiscales = "${pageContext.request.contextPath}/cajas/ejerciciosFiscales";
		$.ajax({
				type: "GET",
				dataType : 'json',
				url: urlEjerciciosFiscales,
				success: function(data){
					selectEjercicioFiscales(data);
				}
		});
	};

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


	var obtenerPeriodo = function(){
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
			console.log("ID PERIODO::::" + val.idMes  +  "MES::::" + val.mes);
			$('#selectPeriodo').append('<option value=' + val.idMes  + '>' + val.mes + '</option>');
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
			var totalErogaciones = $('#inputImporteNomina');
			var idObligacion;
			var tipoDeclaracion= $('#selectDeclaracion');
			var numeroEmpleados = $('#inputEmpleados');

			console.log("MES::::" + mes.val());

			datos.periodo = mes.val();
			datos.ejercicioFiscal = parseInt(ejercicioFiscal.val());
			datos.totalErogaciones = totalErogaciones.val();
			datos.numeroEmpleados= numeroEmpleados.val();
			datos.idContribuyente= 1;
			datos.idObligacion= 1;
			datos.idSucursal= 1;
			datos.idTipoDeclaracion = tipoDeclaracion.val();
			var formData = JSON.stringify(datos);
			
			
			console.log(formData);
			var urlPut = "${pageContext.request.contextPath}/cajas/presupuestoEstatal";
			var presupuestoEstatal = "${pageContext.request.contextPath}/views/cajas/cobroNomina.jsp";
		$.ajax({
				type : 'PUT',
				url : urlPut,
				data : formData,
				dataType : "json",
				contentType : 'application/json',
				success : function(data,textStatus,jQxhr) {
					var datos = data;
				swal(
						{
							title : "Calculo realizado correctamente.",
							type : "success",
						}
						);
						colocarValores(datos);
					}
				});
		}
	});
	

	//colocar valores despues de realizar el calculo
	function colocarValores(data){	
		$.each( data, function( key, val ) {
			if(key=="uaz"){
				$('#inputUaz').val(val);
			}else if(key == "actualizaciones"){
				$('#inputActualizacion').val(val);
			}else if(key == "recargos"){
				$('#inputRecargo').val(val);
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

</script>

</html>