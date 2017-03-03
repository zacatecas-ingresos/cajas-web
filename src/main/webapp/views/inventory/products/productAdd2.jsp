<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title><spring:message code="product.catalog.title"/></title>
		
		<!-- jQuery -->
    	<script src='<spring:url value="/jquery/jquery.min.js"/>'></script>
    	
    	<!-- jQuery UI -->
    	<script src="<spring:url value="/jquery-ui/jquery-ui.min.js"/>"></script>
    	
    	<!-- jQuery Form -->
    	<script src="<spring:url value="/jquery-form/jquery.form.min.js"/>"></script>
		
		<!-- Bootstrap -->
		<link href="<spring:url value="/bootstrap/css/bootstrap.min.css"/>" rel="stylesheet" type="text/css"/>
		<script src="<spring:url value="/bootstrap/js/bootstrap.min.js"/>"></script>
		
		<!-- Bootstrap WYSIHTML5 -->
    	<script src="<spring:url value="/bootstrap-wysihtml5/bootstrap3-wysihtml5.all.min.js"/>"></script>
    	
    	<!-- Font Awesome -->
    	<link href="<spring:url value="/font-awesome/css/font-awesome.min.css"/>" rel="stylesheet"/>
    	
    	<!-- JS Tree -->
		<link href="<spring:url value="/jstree/themes/default/style.min.css"/>" rel="stylesheet" type="text/css"/>
		<script src="<spring:url value="/jstree/jstree.min.js"/>" type="text/javascript"></script>
    	
    	<!-- AdminLTE -->
    	<link href="<spring:url value="/admin-lte/css/Fonts.css"/>" rel="stylesheet"/>
    	<link href="<spring:url value="/admin-lte/css/AdminLTE.css"/>" rel="stylesheet"/>
		<link href="<spring:url value="/admin-lte/css/skins/_all-skins.min.css"/>" rel="stylesheet"/> 		
   		<script src="<spring:url value="/admin-lte/js/app.min.js"/>"></script>    	
    	<script src="<spring:url value="/admin-lte/js/demo.js"/>"></script>		
    	
    	<!-- FiscoFlex -->
    	<link href="<spring:url value="/fiscoflex/css/fiscoflex.css"/>" rel="stylesheet"/>
    	
    	<!-- TreeGrid -->
    	<script src="<spring:url value="/treegrid/js/jquery.treegrid.js"/>" type="text/javascript"></script>
		<link href="<spring:url value="/treegrid/css/jquery.treegrid.css"/>" rel="stylesheet"/>
					
	</head>
	
   <body class="hold-transition skin-blue sidebar-mini">
      <div class="wrapper">

      <header class="main-header">
        <!-- Logo -->
        <a href="index2.html" class="logo">
          <!-- mini logo for sidebar mini 50x50 pixels -->
          <span class="logo-mini"><b>A</b>LT</span>
          <!-- logo for regular state and mobile devices -->
          <span class="logo-lg"><b>Fisco</b>Flex</span>
        </a>
        <!-- Header Navbar: style can be found in header.less -->
        <nav class="navbar navbar-static-top" role="navigation">
          <!-- Sidebar toggle button-->
          <a href="#" class="sidebar-toggle" data-toggle="offcanvas" role="button">
            <span class="sr-only">Toggle navigation</span>
          </a>
          <div class="navbar-custom-menu">
            <ul class="nav navbar-nav">             
            
            </ul>
          </div>
        </nav>
      </header>
      <!-- Left side column. contains the logo and sidebar -->
      <aside class="main-sidebar">
        <!-- sidebar: style can be found in sidebar.less -->
        <section class="sidebar">                
          <!-- sidebar menu: : style can be found in sidebar.less -->
          <ul class="sidebar-menu">
            <li class="active treeview">
              <a href="#">
                <i class="fa fa-dashboard"></i> <span>Productos</span> <i class="fa fa-angle-left pull-right"></i>
              </a>              
            </li>           
          </ul>
        </section>
        <!-- /.sidebar -->
      </aside>

      <!-- Content Wrapper. Contains page content -->
      <div class="content-wrapper">
        <!-- Content Header (Page header) -->
        <section class="content-header">
        	<h1>
        	<span style="color: #798c9c">        		
            	<a href="<spring:url value="/product"/>"><spring:message code="product.catalog.title"/> / </a>       
        	</span>
        	<spring:message code="product.new.title"/>
          </h1>                    
        </section>

        <!-- Main content -->
        <section class="content">
          <!-- Main row -->
          <div class="row">                     
           <!-- content column -->
           <div class="col-md-12">
           	<div class="box box-primary">           		
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
								<input name="name" class="form-control"/>
							</div>
								
							<div class="form-group">
								<label>Codigo</label>
								<input name="SKU" class="form-control"/>
							</div>																								
						</div>																																							
					</div>
					<div class="row">
						<div class="col-xs-4"></div>
						<div class="col-xs-6">
						<div class="inventory product-image-upload">
							<div class="no-image-preview"></div>	
							<div class="button-actions">
								<button class="btn btn-default upload-btn" type="button">Cargar</button>
							</div>									
						</div>	
						</div>
					</div>
					<br/><br/>
					<div class="row">      
						<div class="col-xs-1"></div> 			
           				<div class="col-xs-3">
           					<label class="lead">Precio</label>
           				</div>
						<div class="col-xs-5">														
							<div class="form-group">
								<label>Precio</label>
								<input name="price" class="form-control"/>
							</div>		
							<div class="form-group">
								<label>Impuesto</label>
								<select name="price" class="form-control">
									<option>IVA 16%</option>
									<option>No aplica</option>
								</select>
							</div>		
						</div>																													
					</div>
					<div class="row">      
						<div class="col-xs-1"></div> 			
           				<div class="col-xs-3">
           					<label class="lead">Inventario</label>
           				</div>
						<div class="col-xs-5">														
							<table id="products-table" class="table table-bordered table-hover tree">
			           	    	<tbody>
			           	    		<tr>
			           	    			<th class="col-sm-6">Almacen</th>
			           	    			<th class="col-sm-4">Existencia</th>	           	    			
			           	    		</tr>
			           	    	</tbody>
			           	    	<tr><td><label>Almacén central</label></td><td><input /></td></tr>
			           	    </table>	
						</div>																													
					</div>
					<br/>
					<br/>
					<div class="col-xs-2">
				</div>
				<div class="col-xs-4">
					<button type="button" class="btn btn-default btn-lg pull-right">
            			<i class="fa fa-remove"></i> Cancelar
            		</button>
				</div>
					
            	<div class="col-xs-4">
            		<button type="button" class="btn btn-success btn-lg pull-left">
           	    		<i class="fa fa-credit-card"></i> Guardar</button>
            	</div>           	    	
<div class="col-xs-2">
				</div> 				
           		</div> <!-- /.box-body -->           		              	
				<br/>
				          	    	
           	</div>
           </div>
           
           
          </div><!-- /.row (main row) -->

        </section><!-- /.content -->
      </div><!-- /.content-wrapper -->
      <footer class="main-footer">
        <div class="pull-right hidden-xs">
          <b>Version</b> 2.3.0
        </div>
        <strong>Copyright &copy; 2014-2015 <a href="http://almsaeedstudio.com">Almsaeed Studio</a>.</strong> All rights reserved.
      </footer>

      <!-- Control Sidebar -->
      <aside class="control-sidebar control-sidebar-dark">
        <!-- Create the tabs -->
        <ul class="nav nav-tabs nav-justified control-sidebar-tabs">
          <li><a href="#control-sidebar-home-tab" data-toggle="tab"><i class="fa fa-home"></i></a></li>
          <li><a href="#control-sidebar-settings-tab" data-toggle="tab"><i class="fa fa-gears"></i></a></li>
        </ul>
        <!-- Tab panes -->
        <div class="tab-content">
          <!-- Home tab content -->
          <div class="tab-pane" id="control-sidebar-home-tab">
            <h3 class="control-sidebar-heading">Recent Activity</h3>
            <ul class="control-sidebar-menu">
              <li>
                <a href="javascript::;">
                  <i class="menu-icon fa fa-birthday-cake bg-red"></i>
                  <div class="menu-info">
                    <h4 class="control-sidebar-subheading">Langdon's Birthday</h4>
                    <p>Will be 23 on April 24th</p>
                  </div>
                </a>
              </li>
              <li>
                <a href="javascript::;">
                  <i class="menu-icon fa fa-user bg-yellow"></i>
                  <div class="menu-info">
                    <h4 class="control-sidebar-subheading">Frodo Updated His Profile</h4>
                    <p>New phone +1(800)555-1234</p>
                  </div>
                </a>
              </li>
              <li>
                <a href="javascript::;">
                  <i class="menu-icon fa fa-envelope-o bg-light-blue"></i>
                  <div class="menu-info">
                    <h4 class="control-sidebar-subheading">Nora Joined Mailing List</h4>
                    <p>nora@example.com</p>
                  </div>
                </a>
              </li>
              <li>
                <a href="javascript::;">
                  <i class="menu-icon fa fa-file-code-o bg-green"></i>
                  <div class="menu-info">
                    <h4 class="control-sidebar-subheading">Cron Job 254 Executed</h4>
                    <p>Execution time 5 seconds</p>
                  </div>
                </a>
              </li>
            </ul><!-- /.control-sidebar-menu -->

            <h3 class="control-sidebar-heading">Tasks Progress</h3>
            <ul class="control-sidebar-menu">
              <li>
                <a href="javascript::;">
                  <h4 class="control-sidebar-subheading">
                    Custom Template Design
                    <span class="label label-danger pull-right">70%</span>
                  </h4>
                  <div class="progress progress-xxs">
                    <div class="progress-bar progress-bar-danger" style="width: 70%"></div>
                  </div>
                </a>
              </li>
              <li>
                <a href="javascript::;">
                  <h4 class="control-sidebar-subheading">
                    Update Resume
                    <span class="label label-success pull-right">95%</span>
                  </h4>
                  <div class="progress progress-xxs">
                    <div class="progress-bar progress-bar-success" style="width: 95%"></div>
                  </div>
                </a>
              </li>
              <li>
                <a href="javascript::;">
                  <h4 class="control-sidebar-subheading">
                    Laravel Integration
                    <span class="label label-warning pull-right">50%</span>
                  </h4>
                  <div class="progress progress-xxs">
                    <div class="progress-bar progress-bar-warning" style="width: 50%"></div>
                  </div>
                </a>
              </li>
              <li>
                <a href="javascript::;">
                  <h4 class="control-sidebar-subheading">
                    Back End Framework
                    <span class="label label-primary pull-right">68%</span>
                  </h4>
                  <div class="progress progress-xxs">
                    <div class="progress-bar progress-bar-primary" style="width: 68%"></div>
                  </div>
                </a>
              </li>
            </ul><!-- /.control-sidebar-menu -->

          </div><!-- /.tab-pane -->
          <!-- Stats tab content -->
          <div class="tab-pane" id="control-sidebar-stats-tab">Stats Tab Content</div><!-- /.tab-pane -->
          <!-- Settings tab content -->
          <div class="tab-pane" id="control-sidebar-settings-tab">
            <form method="post">
              <h3 class="control-sidebar-heading">General Settings</h3>
              <div class="form-group">
                <label class="control-sidebar-subheading">
                  Report panel usage
                  <input type="checkbox" class="pull-right" checked>
                </label>
                <p>
                  Some information about this general settings option
                </p>
              </div><!-- /.form-group -->

              <div class="form-group">
                <label class="control-sidebar-subheading">
                  Allow mail redirect
                  <input type="checkbox" class="pull-right" checked>
                </label>
                <p>
                  Other sets of options are available
                </p>
              </div><!-- /.form-group -->

              <div class="form-group">
                <label class="control-sidebar-subheading">
                  Expose author name in posts
                  <input type="checkbox" class="pull-right" checked>
                </label>
                <p>
                  Allow the user to show his name in blog posts
                </p>
              </div><!-- /.form-group -->

              <h3 class="control-sidebar-heading">Chat Settings</h3>

              <div class="form-group">
                <label class="control-sidebar-subheading">
                  Show me as online
                  <input type="checkbox" class="pull-right" checked>
                </label>
              </div><!-- /.form-group -->

              <div class="form-group">
                <label class="control-sidebar-subheading">
                  Turn off notifications
                  <input type="checkbox" class="pull-right">
                </label>
              </div><!-- /.form-group -->

              <div class="form-group">
                <label class="control-sidebar-subheading">
                  Delete chat history
                  <a href="javascript::;" class="text-red pull-right"><i class="fa fa-trash-o"></i></a>
                </label>
              </div><!-- /.form-group -->
            </form>
          </div><!-- /.tab-pane -->
        </div>
      </aside><!-- /.control-sidebar -->
      <!-- Add the sidebar's background. This div must be placed
           immediately after the control sidebar -->
      <div class="control-sidebar-bg"></div>
    </div><!-- ./wrapper -->
    	
    <div id="product-dialog" class="modal fade" role="dialog">
	    <div class="modal-dialog">
	    	<div class="modal-content">
	    		<div class="modal-header">
	    			<button type="button" class="close" data-dismiss="modal">&times;</button>
	    			<h4 class="modal-title">Crear producto</h4>    			
	    		</div>
	    		<div class="modal-content">
					<form  id="product-create-form">			
						<div class="box-body">
							<div>
								<div class="col-xs-6">							
									<div class="form-group">
										<label>Name</label>
										<input name="name" class="form-control"/>
									</div>
										
									<div class="form-group">
										<label>SKU</label>
										<input name="SKU" class="form-control"/>
									</div>														
									
									<div class="form-group">
										<label>Precio</label>
										<input name="price" class="form-control"/>
									</div>		
									
								</div>
								
								<div class="col-xs-6">
									<div class="inventory product-image-upload">
										<div class="no-image-preview"></div>	
										<div class="button-actions">
											<button class="btn btn-default upload-btn" type="button">Cargar</button>
										</div>									
									</div>
								</div>																			
							</div>
							
														
						</div>
						<div class="box-body">		
							<div class="inventory product-stock">
								<div class="col-xs-6">		
								<label>Control de existencias del producto</label>					
									<div class="form-group">
										<label>Existencia inicial *</label>
										<input name="quantity" class="form-control"/>
									</div>
								</div>
								<div class="col-xs-6">		</div>
							</div>
						</div>			
					</form>
				</div>
	    		<div class="modal-footer">
	    			
		    			<div class="col-sm-6 text-left">
		    				<button class="btn btn-default" type="button" data-dismiss="modal">Cancelar</button>    				
		    			</div>
		    			
		    			<div class="col-sm-6 text-right">    				
		    				<button id="save-product-btn" class="btn btn-primary" type="button" data-dismiss="modal">Guardar</button>
		    			</div>
	    		</div>
	    	</div>
	    </div>
    </div>    
   
    
  </body>
</html>