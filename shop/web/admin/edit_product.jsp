<%-- 
    Document   : update_product
    Created on : May 15, 2017, 23:36:31 AM
    Author     : ThuyenBu
--%>

<%@page import="model.Category"%>
<%@page import="java.util.ArrayList"%>
<%@page import="dao.CategoryDAO"%>
<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <title>Cập nhật sản phẩm</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"> 
        <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
        <link href="content/bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.5.0/css/font-awesome.min.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/ionicons/2.0.1/css/ionicons.min.css">
        <link href="content/dist/css/AdminLTE.min.css" rel="stylesheet" type="text/css"/>
        <link href="content/dist/css/skins/_all-skins.min.css" rel="stylesheet" type="text/css"/>
    </head>
    <body class="hold-transition skin-blue sidebar-mini">

        <%
                long idPro = Long.parseLong(request.getParameter("productid"));
                long category = Long.parseLong(request.getParameter("cateId"));
                String productName = request.getParameter("productName");
                long proPrice = Long.parseLong(request.getParameter("productPrice"));
                String proDes = request.getParameter("productDes");
                String imgPro = request.getParameter("imgPro");
        %>

        <!-- Site wrapper -->
        <div class="wrapper">
            <jsp:include page="header.jsp"></jsp:include>
                <!-- =============================================== -->
                <!-- Left side column. contains the sidebar -->
            <jsp:include page="menu.jsp"></jsp:include>
                <!-- =============================================== -->
                <!-- Content Wrapper. Contains page content -->
                <div class="content-wrapper">
                    <!-- Content Header (Page header) -->
                    <!-- Content Header (Page header) -->
                    <section class="content-header">
                        <h1>
                            Cập nhật sản phẩm
                        </h1>
                        <ol class="breadcrumb">
                            <li><a href="#"><i class="fa fa-dashboard"></i> Trang chủ</a></li>
                            <li><a href="manager_product">Sản phẩm</a></li>
                            <li class="active">Cập nhật</li>
                        </ol>
                    </section>
                    <!-- Main content -->
                    <section class="content">
                        <!-- Horizontal Form -->
                        <div class="box box-info">
                            <div class="box-header with-border">
                                <h3 class="box-title">Thông tin sản phẩm</h3>
                            </div><!-- /.box-header -->
                            <!-- form start -->
                            <form action="/shop/UpdateProductServlet" method="post" class="form-horizontal" enctype="multipart/form-data">
                                <div class="box-body">
                                    <div class="col-sm-11">
                                         <input type="text" hidden name="product_id" value="<%=idPro%>">
		                    <div class="form-group">
                                        <label class="col-sm-2 control-label">Sản phẩm</label>
                                        <div class="col-sm-8">
                                            <input id="proname" type="text" class="form-control" name="productname" value="<%=productName%>" placeholder="<%=productName%>">		                      	
                                            <span id="msgProductName" style="color:red" hidden>Vui lòng nhập tên sản phẩm!</span>
                                        </div>		                      
		                    </div>  
		                    
		                    <div class="form-group">
                                        <label class="col-sm-2 control-label">Thể loại</label>
                                        <div class="col-sm-8">                             
                                            <select name="categoryid" id="categoryid" class="form-control">
                                            <% 
                        			//out.print("<option value="+0+">--- Chọn thể loại ---</option>");
                        			CategoryDAO categoryDAO = new CategoryDAO();
		                    		ArrayList<Category>  listCategory = categoryDAO.getListCategory();
                        			if(listCategory != null){
                                                    
                                                    for(Category cate : listCategory){   
                                                        if(cate.getCategoryID() == category)
                                                        {
                                                            out.print("<option value="+cate.getCategoryID()+">"+ cate.getCategoryName() +"</option>");
                                                            
                                                        }
                                                        
                                                    }
                                                    
                                                    for(Category cate : listCategory){
                                                        if(cate.getCategoryID() != category)
                                                        {
                                                            out.print("<option value="+cate.getCategoryID()+">"+ cate.getCategoryName() +"</option>");
                                                        }
                                                        
                            			}
                           			}
                                            %> 
                                            </select>	
                                            <span id="msgCate" style="color:red" hidden>Vui lòng chọn thể loại!</span>
                                        </div>		                      
		                    </div> 
		                    
		                    <div class="form-group">
                                        <label class="col-sm-2 control-label">Đơn giá</label>
                                        <div class="col-sm-8">
                                            <input onkeypress="return isNumberKey(event)" id="price" type="text" class="form-control" value="<%=proPrice%>" name="price" placeholder="Đơn giá">		                      	
                                            <span id="msgPrice" style="color:red" hidden>Vui lòng nhập đơn giá!</span>
                                        </div>		                      
		                    </div>
                                            
                                    <div class="form-group">
                                        <label class="col-sm-2 control-label">Hình ảnh</label>
                                        <div class="col-sm-8">
                                            <input onchange="readURL(this);" value="<%=imgPro%>" type="file" id="file" name="files[]"  class="btn btn-white btn-warning btn-bold">	                                            
                                        </div>		                      
		                    </div>       
		                    	                   
		                    <div class="form-group">
                                        <label class="col-sm-2 control-label">Diễn giải</label>
                                        <div class="col-sm-8">
                                            <input id="des" type="text" class="form-control" value="<%=proDes%>" name="description" placeholder="Diễn giải">		                      	
                                            <span id="msgDes" style="color:red" hidden>Vui lòng nhập diễn giải!</span>
                                        </div>		                      
		                    </div> 
                                        
                                    </div>
                                            
                                    <div class="col-sm-1">
                                        <img width="160" height="230" alt="Hình ảnh" style="margin-left: -130px; border:1px solid black;" id="showAvatar" >            
                                    </div>
                                     
                                </div>
		                 
		                 <div class="box-footer">
                                    <a href='manager_product.jsp' class="btn btn-default">Hủy</a> 
                                    <input type="hidden" name="command" value="update"> 
                                    <input onclick="return SaveProduct();" id="btnUpdate" type="submit" class="btn btn-success pull-right" value='Cập nhật'/>
                                </div>
                            </form>                        
                        </div><!-- /.box -->
                    </section><!-- /.content -->
                </div>
                <!-- /.content-wrapper -->
            <jsp:include page="footer.jsp"></jsp:include>
            <!-- Control Sidebar -->

        </div>
        <!-- ./wrapper -->
        <!-- jQuery 2.2.3 -->
        <script src="content/plugins/jQuery/jquery-2.2.3.min.js" type="text/javascript"></script>
        <script src="content/bootstrap/js/bootstrap.min.js" type="text/javascript"></script>
        <!-- Bootstrap 3.3.6 -->
        <!-- SlimScroll -->
        <script src="content/plugins/slimScroll/jquery.slimscroll.min.js"></script>
        <!-- FastClick -->
        <script src="content/plugins/fastclick/fastclick.js"></script>
        <!-- AdminLTE App -->
        <script src="content/dist/js/app.min.js"></script>
        <!-- AdminLTE for demo purposes -->
        <script src="content/dist/js/demo.js"></script>
        <script src="content/dist/js/autoNumeric.js"></script>
        
         <script language="javascript">  
            $(document).ready(function () {
                $('#price').bind('blur focusout keypress keyup', function () {
                    $('#price').autoNumeric('init');
                })
            });
            
        </script>
        
        <script language="javascript">  
                function readURL(input) {
                    if (input.files && input.files[0]) {
                        var reader = new FileReader();
                        reader.onload = function(e) {
                            $('#showAvatar').attr('src', e.target.result);
                        };
                        reader.readAsDataURL(input.files[0]);
                    }
                }
        </script>
        
        <script language="javascript">  
            
            function isNumberKey(evt){
                var charCode = (evt.which) ? evt.which : event.keyCode
                if (charCode > 31 && (charCode < 48 || charCode > 57))
                    return false;
                return true;
            }
            
            function SaveProduct(){
                if($('#proname').val() == "")
                {
                    $('#msgProductName').prop('hidden', false);
                    
                    if($('#des').val() == "")
                    {
                        $('#msgDes').prop('hidden', false);
                    }
                    else
                    {
                        $('#msgDes').prop('hidden', true);
                    }
                    
                    if($('#price').val() == "")
                    {
                        $('#msgPrice').prop('hidden', false);
                    }
                    else
                    {
                        $('#msgPrice').prop('hidden', true);
                    }
                    
                    if($('#categoryid').val() == 0)
                    {
                        $('#msgCate').prop('hidden', false);
                    }
                    else
                    {
                        $('#msgCate').prop('hidden', true);
                    }
                          
                    return false;
                }
                else if($('#des').val() == "")
                {
                    $('#msgDes').prop('hidden', false);
                    
                    if($('#proname').val() == "")
                    {
                        $('#msgProductName').prop('hidden', false);
                    }
                    else
                    {
                        $('#msgProductName').prop('hidden', true);
                    }
                    
                    if($('#price').val() == "")
                    {
                        $('#msgPrice').prop('hidden', false);
                    }
                    else
                    {
                        $('#msgPrice').prop('hidden', true);
                    }
                    
                    if($('#categoryid').val() == 0)
                    {
                        $('#msgCate').prop('hidden', false);
                    }
                    else
                    {
                        $('#msgCate').prop('hidden', true);
                    }
                   
                    return false;
                }            
                else if($('#price').val() == "")
                {
                    $('#msgPrice').prop('hidden', false);
                    
                    if($('#proname').val() == "")
                    {
                        $('#msgProductName').prop('hidden', false);
                    }
                    else
                    {
                        $('#msgProductName').prop('hidden', true);
                    }
                    
                    if($('#file').val() == "")
                    {
                        $('#msgImg').prop('hidden', false);
                    }
                    else
                    {
                        $('#msgImg').prop('hidden', true);
                    }
                    
                    if($('#categoryid').val() == 0)
                    {
                        $('#msgCate').prop('hidden', false);
                    }
                    else
                    {
                        $('#msgCate').prop('hidden', true);
                    }
                    
                     if($('#des').val() == "")
                    {
                        $('#msgDes').prop('hidden', false);
                    }
                    else
                    {
                        $('#msgDes').prop('hidden', true);
                    }
                    return false;
                }
                else if($('#categoryid').val() == "")
                {
                    $('#msgCate').prop('hidden', false);
                    
                    if($('#proname').val() == "")
                    {
                        $('#msgProductName').prop('hidden', false);
                    }
                    else
                    {
                        $('#msgProductName').prop('hidden', true);
                    }               
                    
                    if($('#price').val() == "")
                    {
                        $('#msgPrice').prop('hidden', false);
                    }
                    else
                    {
                        $('#msgCate').prop('hidden', true);
                    }
                    
                     if($('#des').val() == "")
                    {
                        $('#msgDes').prop('hidden', false);
                    }
                    else
                    {
                        $('#msgDes').prop('hidden', true);
                    }
                    return false;
                }
               
                
                return true;
            }
        </script>
        
    </body>
</html>
