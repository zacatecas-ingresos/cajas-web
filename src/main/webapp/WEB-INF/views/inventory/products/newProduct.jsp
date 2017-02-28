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
		        			<h4 class="modal-title">Categor&iacutea</h4>        			
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
	
	<script type="text/javascript">   			   		   	
	
	
	
	$(document).ready(function() {		
				
		$.ajax({
			url: '${pageContext.request.contextPath}/api/inventory/warehouses',
			type:'GET',
			success: updateInventory
			
		});
		
		$.ajax({
			url: '${pageContext.request.contextPath}/api/company/taxes',
			type:'GET',
			success: updateTaxes
			
		}); 
		
		$.ajax({
			url: '${pageContext.request.contextPath}/api/config/prices',
			type:'GET',
			success: updatePrice
		});
		
		//setup ajax error handling
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
		
	   
		
		function updateInventory(warehouseList) {
				
			var $warehouseListTable = $('#warehouse-list');
				
			$warehouseListTable.append('<div class="form-group"><div class="col-xs-6"><label>Almacen</label></div> <div class="col-xs-6"><label>Existencia</label></div></div>');
			
			// Add warehouse validators
			warehouseValidators = {
	            trigger: 'blur',
	            validators: {
	                notEmpty: {
	                    message: 'La existencia es requerida'
	                },
	                numeric: {
	                    message: 'La existencia debe ser un valor numerico'
	                },
	                between: {
	                	min: 0,
                        max: 100000,
	                	message: 'La existencia debe ser positiva'
	                }
	            }
	        }
							
			for(var i=0; i < warehouseList.length; i++) {
				var warehouse = warehouseList[i];
				$warehouseListTable.append('<div class="form-group"><div class="col-xs-6">' + warehouse.name + '</div> <div class="col-xs-6"><input type="hidden" value="' + warehouse.id  + '" name="warehouse-id[' + i + ']"/><input class="form-control" name="warehouse-quantity[' + i + ']"/></div></div>');
				$('#product-form').formValidation('addField', 'warehouse-quantity[' + i + ']', warehouseValidators)
			}			
		}		
		
		
		
		function updatePrice(priceList) {
			
			var $priceListTable = $('#price-list');
			
			$priceListTable.append('<div class="form-group"><div class="col-xs-6"><label>Tipo precio</label></div> <div class="col-xs-6"><label>Cantidad</label></div></div>');
			
			// Add price validators
			priceValidators = {
	            trigger: 'blur',
	            validators: {
	                notEmpty: {
	                    message: 'El precio es requerido'
	                },
	                numeric: {
	                    message: 'El precio debe ser un valor numerico'
	                },
	                between: {
	                	min: 0,
                        max: 100000,
	                	message: 'El precio debe ser positivo'
	                }
	            }
	        }
						
			for(var i=0; i < priceList.length; i++) {
				var price = priceList[i];
				$priceListTable.append('<div class="form-group"><div class="col-xs-6">' + price.priceName + '</div> <div class="col-xs-6"><input type="hidden" value="' + price.id  + '" name="config-price[' + i + ']-id"/><input class="form-control" name="price[' + i + '].amount"/></div></div>');
				$('#product-form').formValidation('addField', 'price[' + i + '].amount', priceValidators)
			}			
		}
		
		function updateTaxes(taxList) {
			$tax = $('#tax');
			for(var i=0; i < taxList.length; i++) {
				$tax.append('<option value="' + taxList[i].id +'">' + taxList[i].name +'</option>');
			}
		}	
		
		function categoryTreeData(parent, category, treeNodeList) {
			
			var treeNode = {};
			treeNode.id = category.id;
			
			if(!parent) {
				treeNode.parent = "#";
			} else {
				treeNode.parent = parent.id;
			}
			treeNode.text  = category.name;
			
			treeNodeList.push(treeNode);
			
			if(category.children) {
				console.log(category.children.length);
				for(var i = 0; i < category.children.length;i++) {
					categoryTreeData(category, category.children[i], treeNodeList);
				}
			}
			
			return treeNodeList;
		}
		
		function updateCategories(categoryList) {
								
			var treeData = categoryTreeData(null, categoryList[0], []);
			console.log(treeData);
			$categoryTree = $('#category-tree')
			  .on('changed.jstree', function (node, action) {
				    			    
				  })
			
			.jstree({
				'core': {
					'data' : treeData
				}
			});			
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
		
		$('#category-btn').click(function(){
			
			
			$.ajax({
				url: '${pageContext.request.contextPath}/api/inventory/categories',
				type:'GET',
				success: updateCategories
			});
			 
			
		});

		
		$('#save-btn').click(function() {
			var formValidation = $('#product-form').data('formValidation');
			formValidation.validate();
						
			if(formValidation.isValid()) {
				
				// Product data
				var product = {};
				var $productName = $('#product-name'),
					$productCode = $('#product-code'),
					$tax = $('#tax'),
					$categoryId = $('#category-id');
				product.name = $productName.val();
				product.code = $productCode.val();
				product.tax = $tax.val();
				product.categoryId = $categoryId.val();
				
				// Get product price
				var prices = [];
				
				$('input[name*="price["').each(function(index, element){					
					if(element.getAttribute('type') == 'hidden') {
						var price = {};
						price.amount = $(this).val();
						prices.push(price);					
					}
				});
				 console.log(prices);
				$('input[name*="config-price["').each(function(index, element){
					var price = prices[index];
					price.configPriceId = $(this).val();
					console.log(index);
				});
				product.prices = prices;
				
				// Get the stock
				var stock = [];
				 
				$('input[name*="warehouse-id"]').each(function(index, element){
					var warehouse = {};
					warehouse.warehouseId = $(this).val();
					stock.push(warehouse);	
				});
				
				$('input[name*="warehouse-quantity"]').each(function(index, element){
					var warehouse = stock[index];
					warehouse.quantity = $(this).val();					
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
		
		$('#category-ok-btn').click(function(){
			var nodes = $('#category-tree').jstree().get_selected(true);
			if(nodes.length > 0) {
				$('#category-name').val(nodes[0].text);
				$('#category-id').val(nodes[0].id);
			}			
		});
		
	});	
	
	</script>
	
</html>