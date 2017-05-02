<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
<title>Usuarios</title>

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
					<span style="color: #798c9c"> </span>Administrar Usuarios
				</h1>
			</section>
			<!-- Fin del encabezado del contenido de la página -->
			
			

			<!-- Usuarios Registrados -->
			<section class="content">
				
				<div class="col-md-12" id="div2">
					
					<div class="box box-primary">
					
						<div class="box-body">
						
							<div class="col-md-12">
								
								<!-- Contenido -->
									
									<!-- Botón nuevo usuario -->
									<div class="col-xs-1 col-md-5"></div>
									<div class="col-xs-1 col-md-5"></div>
									<div class="col-xs-10 col-md-2">
											<div class="dropdown">
											<button class="btn btn-primary dropdown-toggle" type="button"
												data-toggle="dropdown">
												Opciones <span class="caret"></span>
											</button>
											<ul class="dropdown-menu">
												<li><a class="button" id="registro">Registrar Usuario</a></li>
												<li><a class="button" id="editar" >Editar Usuario</a></li>
												<li><a class="button" id="desactivar">Desactivar Usuario</a></li>
												<li><a class="button" id="activar">Activar Usuario</a></li>
												<li><a class="button" id="eliminar">Eliminar Usuario</a></li>
											</ul>
										</div>
									</div>
									<!--Fin botón nuevo usuario -->
									
									<br /><br /><br />
									
									<div class="col-xs-7 col-md-5">
										<input type="text" class="form-control"
													data-toggle="tooltip" data-placement="top"
													title="Ingrese el nombre de usuario o email." id="search"
														name="search" placeholder="Usuario...">
									</div>
									
									
									<br /><br /><br />
						
									<!-- Tabla usuarios -->
									<div class="col-md-12">
										<table id="tablaUsuarios" class="tablaUsuarios table table-bordered table-hover"   >
											<thead>
												<tr class="bg-primary" >
													<th>ID</th>
													<th>USUARIO</th>
													<th>EMAIL</th>
													<th>FECHA DE ALTA</th>
													<th>ESTATUS</th>
												</tr>
											</thead>
											<tbody>
											</tbody>
										</table>
									</div>
									<!-- Fin tabla usuario -->

									<!-- Fin contenido -->
							</div>
						</div>
					</div>
				</div>
			</section>
			<!-- Fin contenido Registrar Usuario -->

		</div>
		<!-- Fin del contenido de la página -->

		<!-- Footer -->
		<div class="wrapper">
			<footer class="main-footer">
			<div class="pull-right hidden-xs">
				<b>Version</b> 2.3.0
			</div>
			<strong>Derechos de autor &copy; 2016 <a
				href="------">--------------</a>.
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
	var idUsuario;

	function tabla(data){
		$('tbody').find('td').remove();
		for (var i = 0; i < data.length; i++) {
			tr = $('<tr/>');
			$(tr).append("<td class="+"id" +" >" + data[i].id + "</td>");
			$(tr).append("<td class="+"nombre" +" >" + data[i].nombre + "</td>");
			$(tr).append("<td class="+"email" +" >" + data[i].email + "</td>");
			$(tr).append("<td class="+"fechaAlta" +" >" + parseDate(data[i].fechaAlta) + "</td>");
			$(tr).append("<td class="+"activo" +" >" + "<img src="+estatusUsuario(data[i].activo)+" style="+"width:30px; height:auto;" + "></img></td>");
			$('#tablaUsuarios > tbody').append(tr);
		}
	};
		
	//Obtiene todos los usuarios registrados
		$.ajax({
			type : "GET",
			url : "${pageContext.request.contextPath}/cajas/usuario",
			dataType : 'json',
			success : function(data) {
				tabla(data);
			}
		});


	//estatus de los usuarios
	function estatusUsuario(estatus){
		var urlEstatus;
		if(estatus == 1){
			urlEstatus = "${pageContext.request.contextPath}/resources/admin-lte/img/active.png";
		}else if(estatus == 0){
			urlEstatus = "${pageContext.request.contextPath}/resources/admin-lte/img/inactive.png";
		}
		return urlEstatus;
	}	
	
	//Formato para las fechas
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


	//Filtro de búsqueda
	$('#search').keyup(function(){
		
		var input= $('#search').val();
		console.log(input);

		var table = $('#tablaUsuarios').find('tbody').find('tr');

		var urlGet;
		var urlUsuario = "${pageContext.request.contextPath}/cajas/usuario";
		var urlUsuario = "${pageContext.request.contextPath}/cajas/usuario/buscarUsuarios"+"?parametro="+input;

		if(input === null){
			urlGet = urlUsuarios;
		}else{
			urlGet = urlUsuario;
		}	
		
		$.ajax({
				type: "GET",
				dataType : 'json',
				url: urlGet,
				success: function(data){
					tabla(data);
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
		idUsuario = $(this).closest('tr').find('.id').text();
		console.log(idUsuario);	
	});

	//Editar Usuario
	$('#editar').click(function(){
		if(idUsuario == null){
			swal(
				{
					title : "No ha seleccionado a un usuario.",
					type : "error",
					closeOnCancel : false
				}
			);
		}else{
			//Dirige a la sección para edita un usuario
			var urlEditarUsuario = "${pageContext.request.contextPath}/views/usuario/editarUsuario.jsp"+"?id="+idUsuario;
			window.location=urlEditarUsuario;					
		}	
	});

	
	//Elimina un usuario
	$('#eliminar').click(function(){
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
				  title: "Esta seguro de eliminar al usuario seleccionado",
				  text: "Una vez eliminado el usuario se perdera toda la informacion correspondiente a el",
				  type: "warning",
				  showCancelButton: true,
				  confirmButtonColor: "#DD6B55",
				  confirmButtonText: "Aceptar",
				  closeOnConfirm: false
				},
				function(isConfirm){

				if(isConfirm){
					var urlDelete = "${pageContext.request.contextPath}/cajas/usuario?idUsuario="+idUsuario;
					var urlUsuario = "${pageContext.request.contextPath}/views/usuario/usuario.jsp";
					$.ajax({
							type: "DELETE",
							url : urlDelete,
							success: function(){
								swal(
									{
									  title : "Usuario eliminado correctamente.",
									  type : "success",
									  closeOnCancel : false
									},
									function() {
										window.location = urlUsuario;
								});
							}
						});			
					}
				});
		}
	});

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
							}
						});			
					}
				});
		}
	});
	

	//Dirige a la sección para registrar un usuario
	$('#registro').click(function() {
		var urlAltaUsuario = "${pageContext.request.contextPath}/views/usuario/altaUsuario.jsp";
		window.location = urlAltaUsuario;
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

	
});
	
</script>
</html>