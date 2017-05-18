package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.Category;
import java.util.ArrayList;
import dao.CategoryDAO;

public final class manager_005fcategory_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <title>Admin</title>\n");
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
      out.write("\n");
      out.write("        ");

            CategoryDAO categoryDAO = new CategoryDAO();

            int pages = 1;
            int recordsPerPage = 5;

            if (request.getParameter("pages") != null) {
                pages = (int) Integer.parseInt(request.getParameter("pages"));
            }
            String keyword = "";
            if (request.getParameter("keyword") != null) {
                keyword = request.getParameter("keyword");
            }
            ArrayList<Category> listCategory = categoryDAO.getListCategoryPageList(keyword, (pages - 1) * recordsPerPage, recordsPerPage);

            int noOfRecords = categoryDAO.countCategory();
            int noOfPages = (int) Math.ceil(noOfRecords * 1.0 / recordsPerPage);
        
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
      out.write("                    <section class=\"content-header\">\n");
      out.write("                        <h1>\n");
      out.write("                            Danh mục sản phẩm\n");
      out.write("\n");
      out.write("                        </h1>\n");
      out.write("                        <ol class=\"breadcrumb\">\n");
      out.write("                            <li><a href=\"#\"><i class=\"fa fa-dashboard\"></i> Trang chủ</a></li>\n");
      out.write("                            <li><a href=\"#\">Sản phẩm</a></li>\n");
      out.write("                            <li class=\"active\">Danh mục sản phẩm</li>\n");
      out.write("                        </ol>\n");
      out.write("                    </section>\n");
      out.write("                    <!-- Main content -->\n");
      out.write("                    <section class=\"content\">\n");
      out.write("                        <!-- Default box -->\n");
      out.write("                        <div class=\"box\">\n");
      out.write("                            <div class=\"box-header with-border\">\n");
      out.write("                                <h3 class=\"box-title\">Danh sách</h3>\n");
      out.write("                                <div class=\"box-tools pull-right\">\n");
      out.write("                                    <button class=\"btn btn-box-tool\" data-widget=\"collapse\" data-toggle=\"tooltip\" title=\"Collapse\"><i class=\"fa fa-minus\"></i></button>\n");
      out.write("                                    <button class=\"btn btn-box-tool\" data-widget=\"remove\" data-toggle=\"tooltip\" title=\"Remove\"><i class=\"fa fa-times\"></i></button>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"box-body\">\n");
      out.write("                                <div class=\"row\">\n");
      out.write("\n");
      out.write("                                    <div class=\"col-md-6\">\n");
      out.write("                                        <form method=\"get\" action=\"/shop/ManagerCategoryServlet\">\n");
      out.write("                                            <div class=\"input-group\">\n");
      out.write("                                                <input type=\"text\" class=\"form-control\" name=\"keyword\" value=\"");
      out.print(keyword);
      out.write("\" placeholder=\"Từ khóa\">\n");
      out.write("                                            <input type=\"hidden\" name=\"command\" value=\"search\">\n");
      out.write("                                            <span class=\"input-group-btn\">  \n");
      out.write("                                                <button class=\"btn btn-default\" type=\"submit\" > \n");
      out.write("                                                    Tìm kiếm\n");
      out.write("                                                </button>\n");
      out.write("                                            </span>\n");
      out.write("                                        </div>\n");
      out.write("                                    </form>\n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-md-6\">\n");
      out.write("                                    <button onclick=\"window.location.href = '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/admin/insert_category.jsp'\" class=\"btn btn-success\">Thêm mới</button>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                                <div class=\"col-md-12\">\n");
      out.write("                                    <table class=\"table table-bordered\">\n");
      out.write("                                        <tr>\n");
      out.write("                                            <th style=\"width: 5%\">STT</th>\n");
      out.write("                                            <th style=\"width:10%\">Mã danh mục</th>\n");
      out.write("                                            <th style=\"width: 35%\">Tên danh mục</th>\n");
      out.write("                                            <th style=\"width: 35%\">Nhóm danh mục</th>\n");
      out.write("                                            <th style=\"width: 15%\">Thao tác</th>\n");
      out.write("                                        </tr>\n");
      out.write("                                        ");
                                            int count = 0;
                                            for (Category category : listCategory) {
                                                count++;
                                        
      out.write("\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td>");
      out.print(count);
      out.write("</td>\n");
      out.write("                                            <td>");
      out.print(category.getCategoryID());
      out.write("</td>\n");
      out.write("                                            <td>\n");
      out.write("                                                ");
      out.print(category.getCategoryName());
      out.write("\n");
      out.write("                                            </td>\n");
      out.write("                                            <!--class=\"badge bg-red\"-->\n");
      out.write("                                            <td>\n");
      out.write("                                                ");
      out.print(category.getCategoryGroup());
      out.write("\n");
      out.write("                                            </td>\n");
      out.write("                                            <td>\n");
      out.write("                                                <a class=\"btn btn-sm btn-primary\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/admin/edit_category.jsp?categoryID=");
      out.print(category.getCategoryID());
      out.write("\"><i class=\"fa fa-pencil\"></i></a>\n");
      out.write("                                                <a class=\"btn  btn-sm btn-danger\" href=\"/shop/ManagerCategoryServlet?command=delete&category_id=");
      out.print(category.getCategoryID());
      out.write("\"><i class=\"fa fa-trash\"></i></a>\n");
      out.write("                                            </td>\n");
      out.write("                                        </tr>\n");
      out.write("                                        ");
}
      out.write("\n");
      out.write("                                        <tfoot>\n");
      out.write("                                            <tr>\n");
      out.write("                                                <td colspan=\"6\"><span class=\"pull-right\">Trang: ");
      out.print((pages));
      out.write(" - Tổng số bản ghi: ");
      out.print(noOfRecords);
      out.write("</span></td>\n");
      out.write("                                            </tr>\n");
      out.write("                                        </tfoot>\n");
      out.write("                                    </table>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div><!-- /.box-body -->\n");
      out.write("                        <div class=\"box-footer\">\n");
      out.write("                            <ul class=\"pagination pagination-sm\">\n");
      out.write("                                <li>\n");
      out.write("                                    <a href=\"#\" aria-label=\"Previous\">\n");
      out.write("                                        <span aria-hidden=\"true\">&laquo;</span>\n");
      out.write("                                    </a>\n");
      out.write("                                </li>\n");
      out.write("                                ");
for (int i = 1; i <= noOfPages; i++) {
      out.write("\n");
      out.write("                                <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/admin/manager_category.jsp?pages=");
      out.print(i);
      out.write('"');
      out.write('>');
      out.print(i);
      out.write("</a></li>\n");
      out.write("                                    ");
}
      out.write("\n");
      out.write("                                <li>\n");
      out.write("                                    <a href=\"#\" aria-label=\"Next\">\n");
      out.write("                                        <span aria-hidden=\"true\">&raquo;</span>\n");
      out.write("                                    </a>\n");
      out.write("                                </li>\n");
      out.write("                            </ul>\n");
      out.write("                        </div><!-- /.box-footer-->\n");
      out.write("                    </div><!-- /.box -->\n");
      out.write("                </section><!-- /.content -->\n");
      out.write("                <!-- /.content -->\n");
      out.write("            </div>\n");
      out.write("            <!-- /.content-wrapper -->\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\n");
      out.write("                <!-- Control Sidebar -->\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <!-- ./wrapper -->\n");
      out.write("            <!-- jQuery 2.2.3 -->\n");
      out.write("            <script src=\"");
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
