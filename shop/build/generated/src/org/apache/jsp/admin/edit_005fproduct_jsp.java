package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import dao.ProductDAO;
import model.Product;
import model.Category;
import java.util.ArrayList;
import dao.CategoryDAO;

public final class edit_005fproduct_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <title>Cập nhật sản phẩm</title>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\"> \n");
      out.write("        <meta content=\"width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no\" name=\"viewport\">\n");
      out.write("        <link href=\"content/bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.5.0/css/font-awesome.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/ionicons/2.0.1/css/ionicons.min.css\">\n");
      out.write("        <link href=\"content/dist/css/AdminLTE.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"content/dist/css/skins/_all-skins.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    </head>\n");
      out.write("    <body class=\"hold-transition skin-blue sidebar-mini\">\n");
      out.write("\n");
      out.write("        ");

            ProductDAO productDAO = new ProductDAO();
            Product product = new Product();
            String productID = "";
            if (request.getParameter("categoryID") != null) {
                productID = request.getParameter("productid");
                product = productDAO.getProduct(Long.parseLong(productID));
            }
        
      out.write("\n");
      out.write("\n");
      out.write("        <!-- Site wrapper -->\n");
      out.write("        <div class=\"wrapper\">\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("                <!-- =============================================== -->\n");
      out.write("                <!-- Left side column. contains the sidebar -->\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "menu.jsp", out, false);
      out.write("\n");
      out.write("                <!-- =============================================== -->\n");
      out.write("                <!-- Content Wrapper. Contains page content -->\n");
      out.write("                <div class=\"content-wrapper\">\n");
      out.write("                    <!-- Content Header (Page header) -->\n");
      out.write("                    <!-- Content Header (Page header) -->\n");
      out.write("                    <section class=\"content-header\">\n");
      out.write("                        <h1>\n");
      out.write("                            Cập nhật sản phẩm\n");
      out.write("                        </h1>\n");
      out.write("                        <ol class=\"breadcrumb\">\n");
      out.write("                            <li><a href=\"#\"><i class=\"fa fa-dashboard\"></i> Trang chủ</a></li>\n");
      out.write("                            <li><a href=\"manager_product\">Sản phẩm</a></li>\n");
      out.write("                            <li class=\"active\">Cập nhật</li>\n");
      out.write("                        </ol>\n");
      out.write("                    </section>\n");
      out.write("                    <!-- Main content -->\n");
      out.write("                    <section class=\"content\">\n");
      out.write("                        <!-- Horizontal Form -->\n");
      out.write("                        <div class=\"box box-info\">\n");
      out.write("                            <div class=\"box-header with-border\">\n");
      out.write("                                <h3 class=\"box-title\">Thông tin sản phẩm</h3>\n");
      out.write("                            </div><!-- /.box-header -->\n");
      out.write("                            <!-- form start -->\n");
      out.write("                            <form action=\"/shop/UpdateProductServlet\" method=\"post\" class=\"form-horizontal\">\n");
      out.write("                                <div class=\"box-body\">\n");
      out.write("                                    <input type=\"text\" hidden name=\"product_id\" value=\"");
      out.print(productID);
      out.write("\">\n");
      out.write("\t\t                    <div class=\"form-group\">\n");
      out.write("                                        <label class=\"col-sm-2 control-label\">Sản phẩm</label>\n");
      out.write("                                        <div class=\"col-sm-8\">\n");
      out.write("                                            <input id=\"proname\" type=\"text\" class=\"form-control\" name=\"productname\" value=\"");
      out.print(product.getProductName());
      out.write("\" placeholder=\"");
      out.print(product.getProductName());
      out.write("\">\t\t                      \t\n");
      out.write("                                            <span id=\"msgProductName\" style=\"color:red\" hidden>Vui lòng nhập tên sản phẩm!</span>\n");
      out.write("                                        </div>\t\t                      \n");
      out.write("\t\t                    </div>  \n");
      out.write("\t\t                    \n");
      out.write("\t\t                    <div class=\"form-group\">\n");
      out.write("                                        <label class=\"col-sm-2 control-label\">Thể loại</label>\n");
      out.write("                                        <div class=\"col-sm-8\">                             \n");
      out.write("                                            <select name=\"categoryid\" id=\"categoryid\" class=\"form-control\">\n");
      out.write("                                            ");
 
                        			//out.print("<option value="+0+">--- Chọn thể loại ---</option>");
                        			CategoryDAO categoryDAO = new CategoryDAO();
		                    		ArrayList<Category>  listCategory = categoryDAO.getListCategory();
                        			if(listCategory != null){
                                                    
                                                    for(Category category : listCategory){   
                                                        if(category.getCategoryID() == product.getCategoryID())
                                                        {
                                                            out.print("<option value="+category.getCategoryID()+">"+ category.getCategoryName() +"</option>");
                                                            
                                                        }
                                                        
                                                    }
                                                    
                                                    for(Category cate : listCategory){
                                                        if(cate.getCategoryID() != product.getCategoryID())
                                                        {
                                                            out.print("<option value="+cate.getCategoryID()+">"+ cate.getCategoryName() +"</option>");
                                                        }
                                                        
                            			}
                           			}
                                            
      out.write(" \n");
      out.write("                                            </select>\t\n");
      out.write("                                            <span id=\"msgCate\" style=\"color:red\" hidden>Vui lòng chọn thể loại!</span>\n");
      out.write("                                        </div>\t\t                      \n");
      out.write("\t\t                    </div> \n");
      out.write("\t\t                    \n");
      out.write("\t\t                    <div class=\"form-group\">\n");
      out.write("                                        <label class=\"col-sm-2 control-label\">Đơn giá</label>\n");
      out.write("                                        <div class=\"col-sm-8\">\n");
      out.write("                                            <input onkeypress=\"return isNumberKey(event)\" id=\"price\" type=\"text\" class=\"form-control\" value=\"");
      out.print(product.getProductPrice());
      out.write("\" name=\"price\" placeholder=\"Đơn giá\">\t\t                      \t\n");
      out.write("                                            <span id=\"msgPrice\" style=\"color:red\" hidden>Vui lòng nhập đơn giá!</span>\n");
      out.write("                                        </div>\t\t                      \n");
      out.write("\t\t                    </div>\n");
      out.write("                                </div>\n");
      out.write("\t\t                 \n");
      out.write("\t\t                 <div class=\"box-footer\">\n");
      out.write("                                    <a href='manager_product.jsp' class=\"btn btn-default\">Hủy</a> \n");
      out.write("                                    <input type=\"hidden\" name=\"command\" value=\"update\"> \n");
      out.write("                                    <input onclick=\"return SaveProduct();\" id=\"btnUpdate\" type=\"submit\" class=\"btn btn-success pull-right\" value='Cập nhật'/>\n");
      out.write("                                </div>\n");
      out.write("                            </form>                        \n");
      out.write("                        </div><!-- /.box -->\n");
      out.write("                    </section><!-- /.content -->\n");
      out.write("                </div>\n");
      out.write("                <!-- /.content-wrapper -->\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\n");
      out.write("            <!-- Control Sidebar -->\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <!-- ./wrapper -->\n");
      out.write("        <!-- jQuery 2.2.3 -->\n");
      out.write("        <script src=\"content/plugins/jQuery/jquery-2.2.3.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"content/bootstrap/js/bootstrap.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <!-- Bootstrap 3.3.6 -->\n");
      out.write("        <!-- SlimScroll -->\n");
      out.write("        <script src=\"content/plugins/slimScroll/jquery.slimscroll.min.js\"></script>\n");
      out.write("        <!-- FastClick -->\n");
      out.write("        <script src=\"content/plugins/fastclick/fastclick.js\"></script>\n");
      out.write("        <!-- AdminLTE App -->\n");
      out.write("        <script src=\"content/dist/js/app.min.js\"></script>\n");
      out.write("        <!-- AdminLTE for demo purposes -->\n");
      out.write("        <script src=\"content/dist/js/demo.js\"></script>\n");
      out.write("        <script src=\"content/dist/js/autoNumeric.js\"></script>\n");
      out.write("        \n");
      out.write("         <script language=\"javascript\">  \n");
      out.write("            $(document).ready(function () {\n");
      out.write("                $('#price').bind('blur focusout keypress keyup', function () {\n");
      out.write("                    $('#price').autoNumeric('init');\n");
      out.write("                })\n");
      out.write("            });\n");
      out.write("            \n");
      out.write("        </script>\n");
      out.write("        \n");
      out.write("        <script language=\"javascript\">  \n");
      out.write("            \n");
      out.write("            function isNumberKey(evt){\n");
      out.write("                var charCode = (evt.which) ? evt.which : event.keyCode\n");
      out.write("                if (charCode > 31 && (charCode < 48 || charCode > 57))\n");
      out.write("                    return false;\n");
      out.write("                return true;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            function SaveProduct(){\n");
      out.write("                if($('#proname').val() == \"\")\n");
      out.write("                {\n");
      out.write("                    $('#msgProductName').prop('hidden', false);\n");
      out.write("                    \n");
      out.write("                    if($('#des').val() == \"\")\n");
      out.write("                    {\n");
      out.write("                        $('#msgDes').prop('hidden', false);\n");
      out.write("                    }\n");
      out.write("                    else\n");
      out.write("                    {\n");
      out.write("                        $('#msgDes').prop('hidden', true);\n");
      out.write("                    }\n");
      out.write("                    \n");
      out.write("                    if($('#price').val() == \"\")\n");
      out.write("                    {\n");
      out.write("                        $('#msgPrice').prop('hidden', false);\n");
      out.write("                    }\n");
      out.write("                    else\n");
      out.write("                    {\n");
      out.write("                        $('#msgPrice').prop('hidden', true);\n");
      out.write("                    }\n");
      out.write("                    \n");
      out.write("                    if($('#categoryid').val() == 0)\n");
      out.write("                    {\n");
      out.write("                        $('#msgCate').prop('hidden', false);\n");
      out.write("                    }\n");
      out.write("                    else\n");
      out.write("                    {\n");
      out.write("                        $('#msgCate').prop('hidden', true);\n");
      out.write("                    }\n");
      out.write("                          \n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("                else if($('#des').val() == \"\")\n");
      out.write("                {\n");
      out.write("                    $('#msgDes').prop('hidden', false);\n");
      out.write("                    \n");
      out.write("                    if($('#proname').val() == \"\")\n");
      out.write("                    {\n");
      out.write("                        $('#msgProductName').prop('hidden', false);\n");
      out.write("                    }\n");
      out.write("                    else\n");
      out.write("                    {\n");
      out.write("                        $('#msgProductName').prop('hidden', true);\n");
      out.write("                    }\n");
      out.write("                    \n");
      out.write("                    if($('#price').val() == \"\")\n");
      out.write("                    {\n");
      out.write("                        $('#msgPrice').prop('hidden', false);\n");
      out.write("                    }\n");
      out.write("                    else\n");
      out.write("                    {\n");
      out.write("                        $('#msgPrice').prop('hidden', true);\n");
      out.write("                    }\n");
      out.write("                    \n");
      out.write("                    if($('#categoryid').val() == 0)\n");
      out.write("                    {\n");
      out.write("                        $('#msgCate').prop('hidden', false);\n");
      out.write("                    }\n");
      out.write("                    else\n");
      out.write("                    {\n");
      out.write("                        $('#msgCate').prop('hidden', true);\n");
      out.write("                    }\n");
      out.write("                   \n");
      out.write("                    return false;\n");
      out.write("                }            \n");
      out.write("                else if($('#price').val() == \"\")\n");
      out.write("                {\n");
      out.write("                    $('#msgPrice').prop('hidden', false);\n");
      out.write("                    \n");
      out.write("                    if($('#proname').val() == \"\")\n");
      out.write("                    {\n");
      out.write("                        $('#msgProductName').prop('hidden', false);\n");
      out.write("                    }\n");
      out.write("                    else\n");
      out.write("                    {\n");
      out.write("                        $('#msgProductName').prop('hidden', true);\n");
      out.write("                    }\n");
      out.write("                    \n");
      out.write("                    if($('#file').val() == \"\")\n");
      out.write("                    {\n");
      out.write("                        $('#msgImg').prop('hidden', false);\n");
      out.write("                    }\n");
      out.write("                    else\n");
      out.write("                    {\n");
      out.write("                        $('#msgImg').prop('hidden', true);\n");
      out.write("                    }\n");
      out.write("                    \n");
      out.write("                    if($('#categoryid').val() == 0)\n");
      out.write("                    {\n");
      out.write("                        $('#msgCate').prop('hidden', false);\n");
      out.write("                    }\n");
      out.write("                    else\n");
      out.write("                    {\n");
      out.write("                        $('#msgCate').prop('hidden', true);\n");
      out.write("                    }\n");
      out.write("                    \n");
      out.write("                     if($('#des').val() == \"\")\n");
      out.write("                    {\n");
      out.write("                        $('#msgDes').prop('hidden', false);\n");
      out.write("                    }\n");
      out.write("                    else\n");
      out.write("                    {\n");
      out.write("                        $('#msgDes').prop('hidden', true);\n");
      out.write("                    }\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("                else if($('#categoryid').val() == \"\")\n");
      out.write("                {\n");
      out.write("                    $('#msgCate').prop('hidden', false);\n");
      out.write("                    \n");
      out.write("                    if($('#proname').val() == \"\")\n");
      out.write("                    {\n");
      out.write("                        $('#msgProductName').prop('hidden', false);\n");
      out.write("                    }\n");
      out.write("                    else\n");
      out.write("                    {\n");
      out.write("                        $('#msgProductName').prop('hidden', true);\n");
      out.write("                    }               \n");
      out.write("                    \n");
      out.write("                    if($('#price').val() == \"\")\n");
      out.write("                    {\n");
      out.write("                        $('#msgPrice').prop('hidden', false);\n");
      out.write("                    }\n");
      out.write("                    else\n");
      out.write("                    {\n");
      out.write("                        $('#msgCate').prop('hidden', true);\n");
      out.write("                    }\n");
      out.write("                    \n");
      out.write("                     if($('#des').val() == \"\")\n");
      out.write("                    {\n");
      out.write("                        $('#msgDes').prop('hidden', false);\n");
      out.write("                    }\n");
      out.write("                    else\n");
      out.write("                    {\n");
      out.write("                        $('#msgDes').prop('hidden', true);\n");
      out.write("                    }\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("               \n");
      out.write("                \n");
      out.write("                return true;\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
