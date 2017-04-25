<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
<title>Marcas de Vehiculos</title>

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
				<%@ include file="/WEB-INF/jspf/menu.jspf" %><!-- Se llama al al archivo donde se encuentra el menú -->
			</section>
		</aside>
		<!-- Fin menú lateral izquierdo -->

		<!-- Contenido de la página -->
		<div class="content-wrapper">
		
			<!-- Encabezado del contenido de la página -->
			<section class="content-header">
				<h1>
					<span style="color: #798c9c"> </span>Administrar Marcas de Vehiculos
				</h1>
			</section>
			<!-- Fin del encabezado del contenido de la página -->
			
			

			<!-- Usuarios Registrados -->
			<section class="content">
                            <div class="box box-primary">
                                                <div class="box-header">
                                                    <div class="box-tools pull-right">
                                                        <!-- Botón nuevo marcas -->
                                                        <div class="dropdown">
                                                            <button class="btn btn-primary dropdown-toggle" type="button"
                                                                    data-toggle="dropdown">
                                                                Opciones <span class="caret"></span>
                                                            </button>
                                                            <ul class="dropdown-menu">
                                                                <li><a class="button" id="crear">Crear Marca</a></li>
                                                                <li><a class="button" id="editar" >Modificar Marca</a></li>
                                                                <li><a class="button" id="eliminar">Eliminar Marca</a></li>
                                                            </ul>
                                                        </div>
                                                        <!--Fin botón nuevo marcas -->
                                                    </div>
                                                </div>	
					
						<div class="box-body">
						
							<div class="col-md-12">
								
								<!-- Contenido -->
									<div class="row">
									<div class="col-xs-3" style=" text-align: center;"></div>
									<div class="col-xs-6 well" style=" text-align: center ;">
										<label for="search" class="control-label"><span class="glyphicon glyphicon-search" aria-hidden="true"></span> Busqueda:</label>
										<input type="text" class="form-control" data-toggle="tooltip" data-placement="top" title="Ingrese Criterio de busqueda" id="search"
														name="search" placeholder="Marca... Abreviatura...">
									</div>
									<div class="col-xs-3" style=" text-align: center;"></div>
									</div>					
									<br/><br/>
						
									<!-- Tabla Marcas -->
									<div class="col-md-12">
										<table id="tablaMarcas" class="tablaMarcas table table-bordered table-hover"   >
											<thead>
												<tr class="bg-primary" >
													<th style="display:none;">ID</th>
													<th>ABREVIATURA</th>
													<th>NOMBRE</th>
													<th>ESTATUS</th>
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
					</div>
			</section>
			<!-- Fin contenido Registrar marca -->
		</div>

                <footer class="main-footer">
                    <div class="pull-right hidden-xs">
                        <b>Version</b> 2.3.0
                    </div>
                    <strong>Derechos de autor &copy; 2016 <a
                            href="------">--------------</a>.
                    </strong> Todos los derechos reservados.
                </footer>
                <!-- Fin del contenido de la página -->
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



<script>

$(document).ready(function(){

	//id usuario
	var idMarca;

	function tabla(data){
		$('tbody').find('td').remove();
		for (var i = 0; i < data.length; i++) {
			tr = $('<tr/>');
			$(tr).append("<td style=\"display:none;\" class="+"id"+" >" + data[i].idMarcaVehiculo + "</td>");
			$(tr).append("<td class="+"abreviatura" +" >" + data[i].abreviatura + "</td>");
			$(tr).append("<td class="+"nombre" +" >" + data[i].nombre + "</td>");
			$(tr).append("<td class="+"estatus" +" >" + "<img src="+estatusMarca(data[i].estatus)+" style="+"width:30px; height:auto;" + "></img></td>");
			$('#tablaMarcas > tbody').append(tr);
		}
	};
		
	
		$.ajax({
			type : "GET",
			url : "${pageContext.request.contextPath}/cajas/catalogos/marcavehiculo/obtenerListaCompleta",
			dataType : 'json',
			success : function(data) {
				tabla(data);
			},
			error : function(jqXHR,textStatus,errorThrown) {
				console.log(textStatus+ " "+ errorThrown);
			}
		});


	//estatus de los usuarios
	function estatusMarca(estatus) {
            console.log(estatus);
		var urlEstatus;
		if(estatus === true) {
                    urlEstatus = "${pageContext.request.contextPath}/resources/admin-lte/img/active.png";
		} else if(estatus === false) {
                    urlEstatus = "${pageContext.request.contextPath}/resources/admin-lte/img/inactive.png";
		}
		return urlEstatus;
	}	
	

	//Filtro de búsqueda
	$('#search').keyup(function(){
		
		var input= $('#search').val();

		var table = $('#tablaMarcas').find('tbody').find('tr');

		var urlGet;
		var urlMarca = "${pageContext.request.contextPath}/cajas/catalogos/marcavehiculo/buscarPorCriterio/";
		var urlMarca = "${pageContext.request.contextPath}/cajas/catalogos/marcavehiculo/buscarPorCriterio/"+"?parametro="+input;

		if(input === null){
			urlGet = urlMarca;
		} else {
			urlGet = urlMarca;
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
			
	});
	
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
		idMarca = $(this).closest('tr').find('.id').text();
		console.log(idMarca);
	});

	
	//Editar Marca
	$('#editar').click(function(){
		if(idMarca === null){
			swal(
				{
					title : "No ha seleccionado ninguna Marca.",
					type : "error",
					closeOnCancel : false
				}
			);
		}else{
			//Dirige a la sección para edita la marca selecionada
			var urlEditarMarca = "${pageContext.request.contextPath}/views/catalogos/marcavehiculo/modificarMarca.jsp"+"?id="+idMarca;
			window.location=urlEditarMarca;					
		}	
	});

	
	//Elimina Marca
	$('#eliminar').click(function(){
		if(idMarca === null){
			swal(
					{
				  	title : "No ha seleccionado ninguna Marca.",
				 	 type : "error",
			 	  	closeOnCancel : false
					}
				);
		}else{
			swal({
				  title: "Esta seguro de Eliminar la Marca seleccionada",
				  text: "Una vez eliminada la Marca perdera toda la informacion correspondiente de ella",
				  type: "warning",
				  showCancelButton: true,
				  confirmButtonColor: "#DD6B55",
				  confirmButtonText: "Aceptar",
				  closeOnConfirm: false
				},
				function(isConfirm){

				if(isConfirm){
					var urlDelete = "${pageContext.request.contextPath}/cajas/catalogos/marcavehiculo/eliminarMarcaVehiculos?idMarcaVehiculo="+idMarca;
					var urlMarca = "${pageContext.request.contextPath}/views/catalogos/marca/marca.jsp";
					
					
					$.ajax({
							type: "DELETE",
							url : urlDelete,
							success: function(){
								swal(
									{
									  title : "Marca eliminada correctamente.",
									  type : "success",
									  closeOnCancel : false
									},
									function() {
										window.location = urlMarca;
								});
							},
							error : function(jqXHR,textStatus,errorThrown) {
								console.log(textStatus+ " "+ errorThrown);
								}
						});			
					}
				});
		}
	});

	/*
	//Desactiva a un usuario
	$('#desactivar').click(function(){
		if(idUsuario == null){
			swal(
					{
				  	title : "No ha seleccionado a un usuario.",
				 	 type : "error",
			 	  	closeOnCancel : false
					}
				);
		}else{
			swal({
				  title: "Esta seguro de inhabilitar al usuario seleccionado",
				  text: "",
				  type: "warning",
				  showCancelButton: true,
				  confirmButtonColor: "#DD6B55",
				  confirmButtonText: "Aceptar",
				  closeOnConfirm: false
				},
				function(isConfirm){

				if(isConfirm){
					var urlPut = "${pageContext.request.contextPath}/cajas/usuario/desactivarUsuario?idUsuario="+idUsuario;
					var urlUsuario = "${pageContext.request.contextPath}/views/usuario/usuario.jsp";
					$.ajax({
							type: "PUT",
							url : urlPut,
							success: function(){
								swal(
									{
									  title : "Usuario inhabilitado correctamente.",
									  type : "success",
									  closeOnCancel : false
									},
									function() {
										window.location = urlUsuario;
								});
							},
							error : function(jqXHR,textStatus,errorThrown) {
								console.log(textStatus+ " "+ errorThrown);
								}
						});			
					}
				});
		}
	});


	//Activa a un usuario
	$('#activar').click(function(){
		if(idUsuario == null){
			swal(
					{
				  	title : "No ha seleccionado a un usuario.",
				 	 type : "error",
			 	  	closeOnCancel : false
					}
				);
		}else{
			swal({
				  title: "Esta seguro de habilitar al usuario seleccionado",
				  text: "",
				  type: "warning",
				  showCancelButton: true,
				  confirmButtonColor: "#DD6B55",
				  confirmButtonText: "Aceptar",
				  closeOnConfirm: false
				},
				function(isConfirm){

				if(isConfirm){
					var urlPut = "${pageContext.request.contextPath}/cajas/usuario/activarUsuario?idUsuario="+idUsuario;
					var urlUsuario = "${pageContext.request.contextPath}/views/usuario/usuario.jsp";
					$.ajax({
							type: "PUT",
							url : urlPut,
							success: function(){
								swal(
									{
									  title : "Usuario habilitado correctamente.",
									  type : "success",
									  closeOnCancel : false
									},
									function() {
										window.location = urlUsuario;
								});
							},
							error : function(jqXHR,textStatus,errorThrown) {
								console.log(textStatus+ " "+ errorThrown);
								}
						});			
					}
				});
		}
	});
	
	*/
	//Dirige a la sección para registrar un usuario
	$('#crear').click(function() {
		var urlCrearMarca = "${pageContext.request.contextPath}/views/catalogos/marca/crearMarca.jsp";
		window.location = urlCrearMarca;
	});
	
	
	
	//Errores
    $.ajaxSetup({
        error: function (x, status, error) {	        	
            if (x.status === 400) {
            	var result = x.responseJSON;
            	swal({
					title:"Error " + result.code, 
					text:result.message, 
					type:"error",
					closeOnCancel: false
				});	            		               
            } else if(x.status === 500) {
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