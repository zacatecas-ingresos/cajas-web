<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
	<title>Verificaciones Vehiculares</title>

	<!-- Bootstrap -->
	<link href="${pageContext.request.contextPath}/resources/bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css" />

	<!-- Font Awesome -->
	<link href="${pageContext.request.contextPath}/resources/font-awesome/css/font-awesome.min.css" rel="stylesheet" />

	<!-- AdminLTE -->
	<link href="${pageContext.request.contextPath}/resources/admin-lte/css/Fonts.css" rel="stylesheet" />
	<link href="${pageContext.request.contextPath}/resources/admin-lte/css/AdminLTE.css" rel="stylesheet" />
	<link href="${pageContext.request.contextPath}/resources/admin-lte/css/skins/_all-skins.min.css" rel="stylesheet" />

	<!-- Sweetalert -->
	<link href="${pageContext.request.contextPath}/resources/sweetalert/sweetalert.css" rel="stylesheet" type="text/css">

	<!-- FormValidation -->
	<link href="${pageContext.request.contextPath}/resources/formvalidation/css/formValidation.min.css" rel="stylesheet" type="text/css">
</head>
<body class="hold-transition skin-blue sidebar-mini">
	<div class="wrapper">
		<!-- Encabezado -->
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
		<!-- Fin del encabezado -->

		<!-- Menú lateral izquierdo -->
		<aside class="main-sidebar">
			<section class="sidebar">
				<%@ include file="/WEB-INF/jspf/menu.jspf" %>
			</section>
		</aside>
		<!-- Fin menú lateral izquierdo -->

		<!-- Contenido de la página -->
		<div class="content-wrapper">
			<!-- Encabezado del contenido de la página -->
			<section class="content-header">
				<h1>
					<span style="color: #798c9c">Verificaciones</span>
				</h1>
			</section>
			<!-- Fin del encabezado del contenido de la página -->


			<!-- Usuarios Registrados -->
			<section class="content">

				<div class="box box-primary">

					<div class="box-body">

						<div class="row">
							<div class="col-md-12">
								<!-- Contenido -->

								<div class="row">
									<div class="col-xs-1" style="text-align: center;"></div>
									<div class="col-xs-3 " style="text-align: center;">
										<label for="search" class="control-label"> VIN:</label> <input
											type="text" class="form-control" data-toggle="tooltip"
											data-placement="top" title="Ingrese VIN" id="search"
											name="search" placeholder="VIN...">
									</div>
									<div class="col-xs-4">
										<div class="form-group">
											<label for="selectEstatusVerificacion" class="control-label">Estatus
												Verificacion:</label> <select class="form-control"
												id="selectEstatusVerificacion"
												name="selectEstatusVerificacion">
												<option value="0" selected>TODOS</option>
												<option value="1">CAPTURADA</option>
												<option value="2">AUTORIZADA</option>
												<option value="3">TERMINADA</option>
												<option value="4">RECHAZADA MINISTERIO</option>
												<option value="5">RECHAZADA VERIFICACIO</option>
												<option value="6">PAGADO</option>
												<option value="7">PAGA DESPUES</option>
												<option value="8">CONDONADO</option>
												<option value="9">CANCELADO</option>
											</select>
										</div>
									</div>
									<div class="col-xs-1" style="text-align: center;"></div>
								</div>
								<br /> <br />

								<!-- Tabla Marcas -->
								<div class="col-md-12">
									<table id="tablaVerificacion"
										class="tablaVerificacion table table-bordered table-hover">
										<thead>
											<tr class="bg-primary">
												<th style="display: none;">ID</th>
												<th>No. Seguimiento</th>
												<th>VIN</th>
												<th>Estatus</th>
											</tr>
										</thead>
										<tbody>
										</tbody>
									</table>
								</div>
								<!-- Fin tabla marcas -->

								<!-- Fin contenido -->
							</div>
						</div>

						<!-- DIV INFORMACION DE LA VERIFICACION SELECIONADA -->
						<div id="divInfo" style="display: none" class="well">
							<button id="botonGastos" type="button"
								class="btn btn-warning btn-md">
								<i class="fa fa-money" aria-hidden="true"></i> VALIDAR GASTOS
							</button>
							&nbsp;&nbsp;
							<button id="botonOcultar" type="button"
								class="btn btn-info btn-md pull-right">
								<i class="fa fa-eye-slash" aria-hidden="true"></i> OCULTAR
							</button>
							<br>
							<br>							
							<fieldset>
							<legend>Mas Informacion:</legend>
							<div class="row" id="contenido"></div>
							</fieldset>
						</div>
			</section>
			<!-- Fin contenido Registrar marca -->

		</div>
		<!-- Fin del contenido de la página -->

		<!-- Footer -->
		<div class="wrapper">
			<footer class="main-footer">
				<div class="pull-right hidden-xs">
					<b>Version</b> 2.3.0
				</div>
				<strong>Derechos de autor &copy; 2016 <a href="------">--------------</a>.
				</strong> Todos los derechos reservados.
			</footer>
		</div>
		<!-- Fin del footer -->

		<!-- Add the sidebar's background. This div must be placed
	           immediately after the control sidebar -->
		<div class="control-sidebar-bg"></div>
	</div>
</body>

<!-- Scripts -->
<!-- jQuery -->
<script src="${pageContext.request.contextPath}/resources/jquery/jquery.min.js"></script>
<!-- jQuery UI -->
<script src="${pageContext.request.contextPath}/resources/jquery-ui/jquery-ui.min.js"></script>
<!-- jQuery Form -->
<script src="${pageContext.request.contextPath}/resources/jquery-form/jquery.form.min.js" /></script>
<script src="${pageContext.request.contextPath}/resources/bootstrap/js/bootstrap.min.js"></script>
<!-- Bootstrap WYSIHTML5 -->
<script src="${pageContext.request.contextPath}/resources/bootstrap-wysihtml5/bootstrap3-wysihtml5.all.min.js"></script>
<script src="${pageContext.request.contextPath}/resources/admin-lte/js/app.min.js"></script>
<script src="${pageContext.request.contextPath}/resources/admin-lte/js/demo.js"></script>
<script src="${pageContext.request.contextPath}/resources/sweetalert/sweetalert.min.js"></script>
<script src="${pageContext.request.contextPath}/resources/formvalidation/js/formValidation.min.js"></script>
<script src="${pageContext.request.contextPath}/resources/formvalidation/js/framework/bootstrap.min.js"></script>
<script src="${pageContext.request.contextPath}/resources/formvalidation/js/language/es_ES.min.js"></script>
<!-- Fin scripts -->

<script>
$(document).ready(function(){
	
	 
	$( "#botonOcultar" ).click(function() {
	  $( "#divInfo" ).hide( "slow" );
	});

	var idVerificacion;

	function tabla(data){
		$('tbody').find('td').remove();
		for (var i = 0; i < data.length; i++) {
			tr = $('<tr/>');
			$(tr).append("<td style=\"display:none;\" class="+"id"+" >" + data[i].idVerificacionVehiculo + "</td>");
			$(tr).append("<td class="+"noSeguimiento" +" >" + data[i].noSeguimientoVerificion + "</td>");
			$(tr).append("<td class="+"vin" +" >" + data[i].vinVehiculo + "</td>");
			$(tr).append("<td class="+"estatus" +" >" + estatusVerificaciones(data[i].estatusVerificacion) + "</td>");
			$('#tablaVerificacion > tbody').append(tr);
		}
	};		
	
		$.ajax({
			type : "GET",
			url : "${pageContext.request.contextPath}/cajas/vehicular/verificacion/obtenerVerificaciones",
			dataType : 'json',
			success : function(data) {
				tabla(data);
			},
			error : function(jqXHR,textStatus,errorThrown) {
				console.log(textStatus+ " "+ errorThrown);
			}
		});
		
		function estatusVerificaciones(estatus){
			var urlEstatus;
			if(estatus == 1){
				urlEstatus = "CAPTURADA";
			}else if(estatus == 2){
				urlEstatus = "AUTORIZADA";
			}else if(estatus == 3){
				urlEstatus = "TERMINADA";
			}else if(estatus == 4){
				urlEstatus = "RECHAZADA MINISTERIO";
			}else if(estatus == 5){
				urlEstatus = "RECHAZADA VERIFICACIÓN";
			}else if(estatus == 6){
				urlEstatus = "PAGADO";
			}else if(estatus == 7){
				urlEstatus = "PAGADO DESPUES";
			}else if(estatus == 8){
				urlEstatus = "CONDONADO";
			}else if(estatus == 9){
				urlEstatus = "CANCELADO";
			}
			return urlEstatus;
		}	
		


	//Filtro de búsqueda
		
		$( "#selectEstatusVerificacion" ).change(function() {
			var estatusVerificacion = $('#selectEstatusVerificacion').val();
			var search= $('#search').val();
			busca(search,estatusVerificacion);
		});
		
		$('#search').on('keyup',function(){		
			var estatusVerificacion = $('#selectEstatusVerificacion').val();
			var search= $('#search').val();		
			busca(search,estatusVerificacion);		
		});
	
	function busca(search,estatusVerificacion){
		var table = $('#tablaVerificacion').find('tbody').find('tr');

		var urlGet;
		var urlBusqueda = "${pageContext.request.contextPath}/cajas/vehicular/verificacion/buscarPorCriterio/";
		var urlBusqueda = "${pageContext.request.contextPath}/cajas/vehicular/verificacion/buscarPorCriterio/"+"?vin="+search+"&estatusVerificacion="+estatusVerificacion;
				
		if(search === null){
			var urlGet = urlBusqueda
		}else{
			var urlGet = urlBusqueda
		}
		
		$.ajax({
				type: "GET",
				dataType : 'json',
				url: urlGet,
				success: function(data){
					tabla(data);
				},
				error : function(jqXHR,textStatus,errorThrown) {
					console.log(textStatus+ " "+ errorThrown);
				}
		});
	}
	
	//Mantiene seleccionada una fila cambiando de color	
	$('tbody').on("click", "tr", function(event) {
    	$(this).addClass('bg-info').siblings().removeClass('bg-info');
	});

	//cambiar puntero
	$('tbody').hover(function() {
		 $(this).css('cursor','pointer');
	});

	//Obtiene un valor del id de la fila seleccionada
	$('tbody').on("click", "td", function() {
		idVerificacion = $(this).closest('tr').find('.id').text();
		$( "#divInfo" ).hide( "slow" );
		$( "#divInfo" ).show( "slow" );
		
		var urlBusqueda = "${pageContext.request.contextPath}/cajas/vehicular/verificacion/obtenerVerificacioPorID/"+"?id="+idVerificacion;
		
		$.ajax({
				type: "GET",
				dataType : 'json',
				url: urlBusqueda,
				success: function(data){
					$('#contenido').html(""); 
					$.each( data, function( key, val ) {
						var ejercicio = $('<div class="col-xs-2"><label><strong>EJERCICIO: </strong>'+ val.ejercicio + '</label></div>');
						ejercicio.appendTo('#contenido');
						var fecha = $('<div class="col-xs-3"><label><strong>FECHA CAPTURA: </strong>'+val.fechaVerificacion+'</label></div>');
						fecha.appendTo('#contenido');
			  		});
				},
				error : function(jqXHR,textStatus,errorThrown) {
					console.log(textStatus+ " "+ errorThrown);
				}
		});				
	});

	
	//Dirige a la sección para registrar un usuario
	$('#crear').click(function() {
		var urlCrearVerificacion = "${pageContext.request.contextPath}/views/verificacion/altaVerificacion.jsp";
		window.location = urlCrearVerificacion;
	});
	
	
	
	//Errores
    $.ajaxSetup({
        error: function (x, status, error) {	        	
            if (x.status == 400) {
            	var result = x.responseJSON;
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
	
  //Editar Usuario
	$('#botonGastos').click(function(){
		if(idVerificacion == null){
			swal(
				{
					title : "No ha seleccionado Ninguna Verificación.",
					type : "error",
					closeOnCancel : false
				}
			);
		}else{
			//Dirige a la sección para edita un usuario
			var urlAdeudo = "${pageContext.request.contextPath}/views/verificacion/adeudoVerificacion.jsp"+"?id="+idVerificacion;
			window.location=urlAdeudo;					
		}	
	});

	
});
	
</script>
</html>