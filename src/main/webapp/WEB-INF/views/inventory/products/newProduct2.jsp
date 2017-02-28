<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title><spring:message code="product.catalog.title" /></title>
		
		<!-- jQuery -->
		<script src='<spring:url value="/jquery/jquery.min.js"/>'></script>
		
		<!-- jQuery UI -->
		<script src="<spring:url value="/jquery-ui/jquery-ui.min.js"/>"></script>
		
		<!-- jQuery Form -->
		<script src="<spring:url value="/jquery-form/jquery.form.min.js"/>"></script>
		
		<!-- Bootstrap -->
		<link href="<spring:url value="/bootstrap/css/bootstrap.min.css"/>" rel="stylesheet" type="text/css" />
		<script src="<spring:url value="/bootstrap/js/bootstrap.min.js"/>"></script>
		
		<!-- Bootstrap WYSIHTML5 -->
		<script src="<spring:url value="/bootstrap-wysihtml5/bootstrap3-wysihtml5.all.min.js"/>"></script>
		
		<!-- Font Awesome -->
		<link href="<spring:url value="/font-awesome/css/font-awesome.min.css"/>" rel="stylesheet" />
				
		<!-- AdminLTE -->
		<link href="<spring:url value="/admin-lte/css/Fonts.css"/>" rel="stylesheet" />
		<link href="<spring:url value="/admin-lte/css/AdminLTE.css"/>" rel="stylesheet" />
		<link href="<spring:url value="/admin-lte/css/skins/_all-skins.min.css"/>" rel="stylesheet" />
		<script src="<spring:url value="/admin-lte/js/app.min.js"/>"></script>
		<script src="<spring:url value="/admin-lte/js/demo.js"/>"></script>
		
		<!-- FiscoFlex -->
		<link href="<spring:url value="/fiscoflex/css/fiscoflex.css"/>" rel="stylesheet" />
		
		<!-- jsTree -->
		<link href="<spring:url value="/jstree/themes/default/style.css"/>" rel="stylesheet" />
		<script src="<spring:url value="/jstree/jstree.min.js"/>" type="text/javascript"></script>	
		
		<!-- Sweetalert -->
		<link href="<spring:url value="/sweetalert/sweetalert.css"/>" rel="stylesheet" type="text/css" >
		<script src="<spring:url value="/sweetalert/sweetalert.min.js"/>"> </script> 
			
		<!-- FormValidation -->
		<link rel="stylesheet" type="text/css" href="<spring:url value="/formvalidation/css/formValidation.min.css"/>">
		<script src="<spring:url value="/formvalidation/js/formValidation.min.js"/>"></script>
		<script src="<spring:url value="/formvalidation/js/framework/bootstrap.min.js"/>"></script>
		<script src="<spring:url value="/formvalidation/js/language/es_ES.min.js"/>"></script>			
	
	</head>

	<body class="hold-transition skin-blue sidebar-mini">
		<div class="wrapper">
	
			<header class="main-header">
				<!-- Logo -->
				<a href="index2.html" class="logo"> <!-- mini logo for sidebar mini 50x50 pixels -->
					<span class="logo-mini"><b>A</b>LT</span> <!-- logo for regular state and mobile devices -->
					<span class="logo-lg"><b>Fisco</b>Flex</span>
				</a>
				<!-- Header Navbar: style can be found in header.less -->
				<nav class="navbar navbar-static-top" role="navigation">
					<!-- Sidebar toggle button-->
					<a href="#" class="sidebar-toggle" data-toggle="offcanvas"
						role="button"> <span class="sr-only">Toggle navigation</span>
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
						<li class="active treeview"><a href="#"> <i
								class="fa fa-dashboard"></i> <span>Productos</span> <i
								class="fa fa-angle-left pull-right"></i>
						</a></li>
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
	            			<a href="<spring:url value="/inventory/products"/>">Productos / </a>       
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
												
																																				
												
											</div>	
											<div class="col-xs-2">
																																																	
											</div>		
										</div>								
										<div class="row">      
											<div class="col-xs-1"></div> 			
					           				<div class="col-xs-3">
					           					<label class="lead">Precio</label>
					           				</div>
											<div class="col-xs-5">														
												<table id="price-table" class="table table-bordered">
								           	    	<tbody>
								           	    		<tr>
								           	    			<th>Tipo precio</th>
								           	    			<th>Importe</th>	           	    			
								           	    		</tr>								           	    		
								           	    	</tbody>								           	    	
								           	    </table>		
												<div class="form-group">
													<label>Impuesto</label>
													<select id="tax" class="form-control">
														<option value="16">IVA 16%</option>
														<option value="0">No aplica</option>
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
												<div class="form-group">												
													<div class="btn-group">
													
													    <button type="button" class="btn btn-default dropdown-toggle" data-toggle="dropdown">Selecciona la categoria <span class="caret"></span>
													
													    </button>
													    <ul class="dropdown-menu" role="menu">
													        <li>
													          <div id="jstree_demo_div">
													          	  <ul>
																    <li>Root node 1</li>
																    <li>Root node 2</li>
																  </ul>													          	
													          </div>
													        </li>
													    </ul>
													</div>	
												</div>																					
																
												<table id="warehouse-table" class="table table-bordered">
								           	    	<tbody>
								           	    		<tr>
								           	    			<th>Ubicación</th>
								           	    			<th>Existencia</th>	           	    			
								           	    		</tr>								           	    		
								           	    	</tbody>
								           	    	
								           	    </table>	
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
	
	
	</body>
	
	<script type="text/javascript">   			   		   	
	
	var initValidation = false;
	
	$(document).ready(function() {
		
		//setup ajax error handling
	    $.ajaxSetup({
	        error: function (x, status, error) {	        	
	            if (x.status == 400) {
	            	var result = x.responseJSON;
	            	swal({
						title:"Nuevo producto", 
						text:result.message, 
						type:"error",
						closeOnCancel: false
					});	            		               
	            }
	        }
	    });
				
		$.ajax({
			url: '${pageContext.request.contextPath}/api/inventory/warehouses',
			type:'GET',
			success: updateInventory
			
		}); 
		
		function updateInventory(warehouseList) {
			
			var tbody = $('#warehouse-table').children('tbody');
			var table = tbody.length ? tbody : $('#warehouse-table');
			
			for(var i=0; i < warehouseList.length; i++) {
				var row;
				var warehouse = warehouseList[i];
				
				row = '<tr>';			
				row += '<td><input type="hidden" value="' + warehouse.id  + '" name="warehouse-id"/> ' + warehouse.name + ' </td>';
				row += '<td> <input class="form-control" name="count"/>' + ' </td>';
				row += '</tr>';
				
				table.append(row);		
			}		
		}
		
		$.ajax({
			url: '${pageContext.request.contextPath}/api/company/prices',
			type:'GET',
			success: updatePrice
		});
		
		function updatePrice(priceList) {
			var tbody = $('#price-table').children('tbody');
			var table = tbody.length ? tbody : $('#price-table');
			
			for(var i=0; i < priceList.length; i++) {
				var row;
				var price = priceList[i];
				
				row = '<tr>';
				row += '<td><input type="hidden" value="' + price.id  + '" name="price-id"/> ' + price.priceName + ' </td>';
				row += '<td> <input class="form-control" name="price[' + i +  '].amount"/>' + ' </td>';
				row += '</tr>';
				
				table.append(row);		
			}
			
			// Add price validators
			priceValidators = {
	            trigger: 'blur',
	            validators: {
	                notEmpty: {
	                    message: 'El precio es requerido'
	                },
	                numeric: {
	                    message: 'El precio debe ser un valor numerico'
	                }
	            }
	        }
			
			for(var i = 0; i < priceList.length; i++) {
				$('#product-form').formValidation('addField', 'price[' + i + '].amount', priceValidators)
			}
			
		}
		
		
		$('#product-form').formValidation({
			framework:'bootstrap',
			icon: {
	            valid: 'glyphicon glyphicon-ok',
	            invalid: 'glyphicon glyphicon-remove',
	            validating: 'glyphicon glyphicon-refresh'
	        },
	        fields: {
	            'product-name': {
	            	trigger: 'blur',
	                validators: {	                	
	                    notEmpty: {
	                        message: 'El nombre del producto es requerido'
	                    },
	                    stringLength: {
	                        min: 6,
	                        max: 60,
	                        message: 'El nombre del producto de tener entre 6 y 60 caracteres'
	                    },	                    
	                    remote: {
	                    	url: '${pageContext.request.contextPath}/api/inventory/products/name',	                    
	                        type: 'POST',
	                        message: 'Ya existe un producto con este nombre',
	                        data: function(validator, $field, value) {
	                            return {
	                            	// send {name: value}
	                                name: validator.getFieldElements('product-name').val()
	                            };
	                        }
	                    }
	                }
	            },
	            'product-code': {
	            	trigger: 'blur',
	                validators: {	                	
	                    notEmpty: {
	                        message: 'El código del producto es requerido'
	                    },
	                    stringLength: {
	                        min: 3,
	                        max: 25,
	                        message: 'El codigo de tener entre 3 y 25 caracteres'
	                    },
	                    regexp: {
	                        regexp: /^[a-zA-Z0-9_-]+$/,
	                        message: 'El codigo solo puede contener letras, números y guiones'
	                    },
	                    remote: {
	                    	url: '${pageContext.request.contextPath}/api/inventory/products/code',	                    
	                        type: 'POST',	                      
	                        message: 'Ya existe un producto con este código',
	                        data: function(validator, $field, value) {
	                        	
	                            return {
	                            	// send {code:value}	                            	
	                                code: validator.getFieldElements('product-code').val()
	                            };
	                        }
	                    }
	                }
	            }  
	        }
		});

		
		$('#save-btn').click(function() {
			var formValidation = $('#product-form').data('formValidation');
			formValidation.validate();
						
			if(formValidation.isValid()) {
				
				// Product data
				var product = {};
				var $productName = $('#product-name'),
					$productCode = $('#product-code'),
					$tax = $('#tax');
				product.name = $productName.val();
				product.code = $productCode.val();
				product.tax = $tax.val();
				
				// Get product price
				var prices = [];
				
				$('#price-table tr').each(function(i, row){
					// avoid table header
					if(i > 0) {
						var price = {};
						var $row = $(row),
							$priceId = $row.find('input[name="price-id"]')
							$priceAmount = $row.find('input[name="price-amount"]');
						price.companyPriceId = $priceId.val();
						price.amount = $priceAmount.val();
						prices.push(price);
					}
				});
				product.prices = prices;
				
				// Get the stock
				var stock = [];
				 
				$('#warehouse-table tr').each(function(i, row){
					// avoid table header
					if(i > 0) {
						var warehouseCount = {};
						var $row = $(row),
							$warehouseId = $row.find('input[name="warehouse-id"]')
							$warehouseCount = $row.find('input[name="count"]');
						warehouseCount.warehouseId = $warehouseId.val();
						warehouseCount.count = $warehouseCount.val();
						stock.push(warehouseCount);
					}
				});
				product.stock = stock;
				
				console.log(JSON.stringify(product));
				
				
				$.ajax({
					url: '${pageContext.request.contextPath}/api/inventory/products/product',
					type:'POST',
					dataType: 'json',
					data: JSON.stringify(product),
					contentType: "application/json",
					
					success:  function( data, textStatus, jQxhr ){
						
						swal({
							title:"Nuevo producto", 
							text:product.name, 
							type:"success",
							closeOnCancel: false
						},
						function(){
							window.location = '${pageContext.request.contextPath}/inventory/products';
						});
	                }
					
				});		
			}			
		});		
		
		$('#cancel-btn').click(function(){
			window.location = '${pageContext.request.contextPath}/inventory/products';
		});
		
	});	
	
	</script>
	
</html>