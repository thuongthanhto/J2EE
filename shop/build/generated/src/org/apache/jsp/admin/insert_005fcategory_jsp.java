package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class insert_005fcategory_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <title>Admin</title>\n");
      out.write("        <link rel=\"icon\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/images/icon.ico\" type=\"image/png\" />\n");
      out.write("\n");
      out.write("    <a href=\"\"></a>\n");
      out.write("        <!-- Tell the browser to be responsive to screen width -->\n");
      out.write("        <meta content=\"width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no\" name=\"viewport\">\n");
      out.write("        <!-- Bootstrap 3.3.6 -->\n");
      out.write("        <link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/admin/content/bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <!-- Font Awesome -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.5.0/css/font-awesome.min.css\">\n");
      out.write("        <!-- Ionicons -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/ionicons/2.0.1/css/ionicons.min.css\">\n");
      out.write("        <!-- Theme style -->\n");
      out.write("        <link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/admin/content/dist/css/AdminLTE.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <!-- AdminLTE Skins. Choose a skin from the css/skins\n");
      out.write("             folder instead of downloading all of them to reduce the load. -->\n");
      out.write("\n");
      out.write("        <link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/admin/content/dist/css/skins/_all-skins.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->\n");
      out.write("        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->\n");
      out.write("        <!--[if lt IE 9]>\n");
      out.write("        <script src=\"https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js\"></script>\n");
      out.write("        <script src=\"https://oss.maxcdn.com/respond/1.4.2/respond.min.js\"></script>\n");
      out.write("        <![endif]-->\n");
      out.write("    </head>\n");
      out.write("    <body class=\"hold-transition skin-blue sidebar-mini\">\n");
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
      out.write("                            Danh mục sản phẩm\n");
      out.write("\n");
      out.write("                        </h1>\n");
      out.write("                        <ol class=\"breadcrumb\">\n");
      out.write("                            <li><a href=\"#\"><i class=\"fa fa-dashboard\"></i> Trang chủ</a></li>\n");
      out.write("                            <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/admin/manager_category.jsp\">Danh mục</a></li>\n");
      out.write("                            <li class=\"active\">Thêm mới</li>\n");
      out.write("                        </ol>\n");
      out.write("                    </section>\n");
      out.write("                    <!-- Main content -->\n");
      out.write("                    <section class=\"content\">\n");
      out.write("                        <!-- Horizontal Form -->\n");
      out.write("                        <div class=\"box box-info\">\n");
      out.write("                            <div class=\"box-header with-border\">\n");
      out.write("                                <h3 class=\"box-title\">Thêm mới</h3>\n");
      out.write("                            </div><!-- /.box-header -->\n");
      out.write("                            <!-- form start -->\n");
      out.write("                            <form class=\"form-horizontal\" action=\"/shop/ManagerCategoryServlet\" method=\"post\">\n");
      out.write("                                <div class=\"box-body\">\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label for=\"inputEmail3\" class=\"col-sm-2 control-label\">Tên danh mục</label>\n");
      out.write("                                        <div class=\"col-sm-10\">\n");
      out.write("                                            <input type=\"text\" class=\"form-control\" name=\"tenDanhMuc\">\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label for=\"inputEmail3\" class=\"col-sm-2 control-label\">Nhóm danh mục</label>\n");
      out.write("                                        <div class=\"col-sm-10\">\n");
      out.write("                                            <input type=\"radio\" name=\"groupDanhMuc\" value='Nam'> Nam            \n");
      out.write("                                            <input type=\"radio\" name=\"groupDanhMuc\" value='Nữ'> Nữ\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div><!-- /.box-body -->\n");
      out.write("                                <div class=\"box-footer\">\n");
      out.write("                                    <a href='manager_category.jsp' class=\"btn btn-default\">Hủy</a> \n");
      out.write("                                    <input type=\"hidden\" name=\"command\" value=\"insert\">\n");
      out.write("                                    <input type=\"hidden\" name=\"category_id\" value=\"hiddenValue\">\n");
      out.write("                                    <input type=\"submit\" class=\"btn btn-success pull-right\" value='Thêm'/>\n");
      out.write("                                </div><!-- /.box-footer -->\n");
      out.write("                            </form>\n");
      out.write("                        </div><!-- /.box -->\n");
      out.write("                    </section><!-- /.content -->\n");
      out.write("                </div>\n");
      out.write("                <!-- /.content-wrapper -->\n");
      out.write("                ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\n");
      out.write("            <!-- Control Sidebar -->\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <!-- ./wrapper -->\n");
      out.write("        <!-- jQuery 2.2.3 -->\n");
      out.write("       <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/admin/content/plugins/jQuery/jQuery-2.1.4.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/admin/content/bootstrap/js/bootstrap.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <!-- Bootstrap 3.3.6 -->\n");
      out.write("        <!-- SlimScroll -->\n");
      out.write("        <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/admin/content/plugins/slimScroll/jquery.slimscroll.min.js\"></script>\n");
      out.write("        <!-- FastClick -->\n");
      out.write("        <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/admin/content/plugins/fastclick/fastclick.js\"></script>\n");
      out.write("        <!-- AdminLTE App -->\n");
      out.write("        <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/admin/content/dist/js/app.min.js\"></script>\n");
      out.write("        <!-- AdminLTE for demo purposes -->\n");
      out.write("        <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/admin/content/dist/js/demo.js\"></script>\n");
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
