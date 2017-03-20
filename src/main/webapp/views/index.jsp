<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Mi titulo</title>
		
		<!-- jQuery -->
		<script src="${pageContext.request.contextPath}/resources/jquery/jquery.min.js"></script>
		
		<!-- jQuery UI -->
		<script src="${pageContext.request.contextPath}/resources/jquery-ui/jquery-ui.min.js"></script>
		
		<!-- jQuery Form -->
		<script src="${pageContext.request.contextPath}/resources/jquery-form/jquery.form.min.js"/></script>
		
		<!-- Bootstrap -->
		<link href="${pageContext.request.contextPath}/resources/bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css" />
		<script src="${pageContext.request.contextPath}/resources/bootstrap/js/bootstrap.min.js"></script>
		
		<!-- Bootstrap WYSIHTML5 -->
		<script src="${pageContext.request.contextPath}/resources/bootstrap-wysihtml5/bootstrap3-wysihtml5.all.min.js"></script>
		
		<!-- Font Awesome -->
		<link href="${pageContext.request.contextPath}/resources/font-awesome/css/font-awesome.min.css" rel="stylesheet" />
				
		<!-- AdminLTE -->
		<link href="${pageContext.request.contextPath}/resources/admin-lte/css/Fonts.css" rel="stylesheet" />
		<link href="${pageContext.request.contextPath}/resources/admin-lte/css/AdminLTE.css" rel="stylesheet" />
		<link href="${pageContext.request.contextPath}/resources/admin-lte/css/skins/_all-skins.min.css" rel="stylesheet" />
		<script src="${pageContext.request.contextPath}/resources/admin-lte/js/app.min.js"></script>
		<script src="${pageContext.request.contextPath}/resources/admin-lte/js/demo.js"></script>
		
		<!-- jsTree -->
		<link href="${pageContext.request.contextPath}/resources/jstree/themes/default/style.css" rel="stylesheet" />
		<script src="${pageContext.request.contextPath}/resources/jstree/jstree.min.js" type="text/javascript"></script>	
		
		<!-- Sweetalert -->
		<link href="${pageContext.request.contextPath}/resources/sweetalert/sweetalert.css" rel="stylesheet" type="text/css" >
		<script src="${pageContext.request.contextPath}/resources/sweetalert/sweetalert.min.js"> </script> 
			
		<!-- FormValidation -->
		<link href="${pageContext.request.contextPath}/resources/formvalidation/css/formValidation.min.css" rel="stylesheet" type="text/css">
		<script src="${pageContext.request.contextPath}/resources/formvalidation/js/formValidation.min.js"></script>
		<script src="${pageContext.request.contextPath}/resources/formvalidation/js/framework/bootstrap.min.js"></script>
		<script src="${pageContext.request.contextPath}/resources/formvalidation/js/language/es_ES.min.js"></script>			
	
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
	        			<span style="color: #798c9c">        		
	            			<a href="${pageContext.request.contextPath}/inventory/products/">Productos / </a>       
	        			</span>
	        			Crear nuevo producto
          			</h1>                    
       	 		</section>
	
				<!-- Main content -->
				<section class="content">
					<!-- Main row -->
					<div class="row">
	
						<!-- content column -->
						<div class="col-md-12">
							<div class="box box-primary">
								<form id="product-form">
									<div class="box-body">
										<br/>  
					           			<div class="row">      
											<div class="col-xs-1"></div> 			
					           				<div class="col-xs-3">
					           					<label class="lead">Datos Generales</label>
					           				</div>
											<div class="col-xs-5">							
												<div class="form-group">
													<label>Nombre</label>
													<input id="product-name" name="product-name" class="form-control"/>
												</div>
													
												<div class="form-group">
													<label>Codigo</label>
													<input id="product-code" name="product-code" class="form-control"/>
												</div>
												
												<div class="form-group">
													<label>Categoria</label>
													<div class="input-group">
														<input id="category-id" type="hidden">
										                <input id="category-name" type="text" class="form-control" readonly>
										                    <span class="input-group-btn">
										                      <button id="category-btn" type="button" class="btn btn-primary"  data-toggle="modal" data-target="#category-modal">
										                      	<i class="fa fa-search"></i>
										                      </button>
										                    </span>
										                    
										            </div>													
												</div>																																				
												
											</div>	
											<div class="col-xs-2">
																																																	
											</div>		
										</div>
										<br>								
										<div class="row">      
											<div class="col-xs-1"></div> 			
					           				<div class="col-xs-3">
					           					<label class="lead">Precio</label>
					           				</div>
											<div class="col-xs-5">												
								           	    <div id="price-list" class="form-horizontal"></div>
								           	    								           	    
												<div class="form-group">
													<label>Impuesto</label>
													<select id="tax" class="form-control">														
													</select>
												</div>												
											</div>		
																																						
										</div>
										<br>
										<div class="row">      
											<div class="col-xs-1"></div> 			
					           				<div class="col-xs-3">
					           					<label class="lead">Inventario</label>
					           				</div>
											<div class="col-xs-5">
																																														
												<div id="warehouse-list" class="form-horizontal"></div>	
																							
											</div>																													
										</div>
									</div>
									<div class="box-footer clearfix">
										<button id="cancel-btn" type="button" class="btn btn-default btn-lg pull-left">
	            							<i class="fa fa-remove"></i> Cancelar
	            						</button>
										<button type="button" id="save-btn" class="btn btn-success btn-lg pull-right">
	           	    						<i class="fa fa-credit-card"></i> Guardar
	           	    					</button>
									</div>
								</form>
								
							</div>
						</div>
	
	
					</div>
					<!-- /.row (main row) -->
	
				</section>
				<!-- /.content -->
			</div>
			<!-- /.content-wrapper -->
			<footer class="main-footer">
				<div class="pull-right hidden-xs">
					<b>Version</b> 2.3.0
				</div>
				<strong>Derechos de autor &copy; 2016 <a
					href="http://fiscoflex.mx">FiscoFlex</a>.
				</strong> Todos los derechos reservados.
			</footer>
	
			<!-- Add the sidebar's background. This div must be placed
	           immediately after the control sidebar -->
			<div class="control-sidebar-bg"></div>
		</div>
		<!-- ./wrapper -->
	
		<!-- category-modal -->
		<div id="category-modal" class="modal fade" role="dialog">
			<div class="vertical-alignment-helper">
				<div class="modal-dialog vertical-align-center">
					<div class="modal-content">
						<div class="modal-header">
							<button type="button" class="close" data-dismiss="modal">&times;</button>
		        			<h4 class="modal-title">Categor&iacute;a</h4>        			
						</div>
						<div class="modal-body">
					        <div id="category-tree"  style="overflow: auto; min-height: 150px; max-height: 150px"></div>
					      </div>
						<div class="modal-footer">
			                <button type="button" class="btn btn-default pull-left" data-dismiss="modal">Cancelar</button>
			                <button id="category-ok-btn" type="button" class="btn btn-primary" data-dismiss="modal">Aceptar</button>
			              </div>
					</div>
				</div>
			</div>
		</div>
		<!-- ./category-modal  -->
	</body>
	
</html>