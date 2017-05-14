package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class manager_005fproduct_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <!-- Tell the browser to be responsive to screen width -->\n");
      out.write("        <meta content=\"width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no\" name=\"viewport\">\n");
      out.write("        <!-- Bootstrap 3.3.6 -->\n");
      out.write("        <link href=\"content/bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <!-- Font Awesome -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.5.0/css/font-awesome.min.css\">\n");
      out.write("        <!-- Ionicons -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/ionicons/2.0.1/css/ionicons.min.css\">\n");
      out.write("        <!-- Theme style -->\n");
      out.write("        <link href=\"content/dist/css/AdminLTE.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <!-- AdminLTE Skins. Choose a skin from the css/skins\n");
      out.write("             folder instead of downloading all of them to reduce the load. -->\n");
      out.write("\n");
      out.write("        <link href=\"content/dist/css/skins/_all-skins.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
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
      out.write("                    <section class=\"content-header\">\n");
      out.write("                        <h1>\n");
      out.write("                            Sản phẩm\n");
      out.write("\n");
      out.write("                        </h1>\n");
      out.write("                        <ol class=\"breadcrumb\">\n");
      out.write("                            <li><a href=\"#\"><i class=\"fa fa-dashboard\"></i> Trang chủ</a></li>\n");
      out.write("                            <li><a href=\"#\">Sản phẩm</a></li>\n");
      out.write("                            <li class=\"active\">Danh sách</li>\n");
      out.write("                        </ol>\n");
      out.write("                    </section>\n");
      out.write("                    <!-- Main content -->\n");
      out.write("                    <section class=\"content\">\n");
      out.write("                        <!-- Default box -->\n");
      out.write("                        <div class=\"box\">\n");
      out.write("                            <div class=\"box-header with-border\">\n");
      out.write("                                <h3 class=\"box-title\">Sản phẩm</h3>\n");
      out.write("                                <div class=\"box-tools pull-right\">\n");
      out.write("                                    <button class=\"btn btn-box-tool\" data-widget=\"collapse\" data-toggle=\"tooltip\" title=\"Collapse\"><i class=\"fa fa-minus\"></i></button>\n");
      out.write("                                    <button class=\"btn btn-box-tool\" data-widget=\"remove\" data-toggle=\"tooltip\" title=\"Remove\"><i class=\"fa fa-times\"></i></button>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"box-body\">\n");
      out.write("                                <di class=\"row\">\n");
      out.write("                                    <div class=\"col-md-6\">\n");
      out.write("                                        <div class=\"input-group\">\n");
      out.write("                                            <input type=\"text\" class=\"form-control\" ng-model=\"keyword\" placeholder=\"Từ khóa\">\n");
      out.write("                                            <span class=\"input-group-btn\">\n");
      out.write("                                                <button class=\"btn btn-default\" type=\"button\" ng-click=\"search()\">Tìm kiếm</button>\n");
      out.write("                                            </span>\n");
      out.write("                                        </div><!-- /input-group -->\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-md-6\">\n");
      out.write("                                        <button class=\"btn btn-success\" ui-sref=\"product_add\">Thêm mới</button>\n");
      out.write("                                        <button class=\"btn btn-danger\" ng-click=\"deleteMultiple()\" id=\"btnDelete\" disabled>Xóa</button>\n");
      out.write("                                    </div>\n");
      out.write("                                </di>\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                    <div class=\"col-md-12\">\n");
      out.write("                                        <table class=\"table table-bordered\">\n");
      out.write("                                            <tr>\n");
      out.write("                                                <td><input name=\"all\" type=\"checkbox\" ng-click=\"selectAll()\" /></td>\n");
      out.write("                                                <th style=\"width: 5%\">ID</th>\n");
      out.write("                                                <th style=\"width:55%\">Tên sản phẩm</th>\n");
      out.write("                                                <th style=\"width: 20%\">Ngày tạo</th>\n");
      out.write("                                                <th style=\"width: 10%\">Trạng thái</th>\n");
      out.write("                                                <th style=\"width: 10%\">Thao tác</th>\n");
      out.write("                                            </tr>\n");
      out.write("                                            <tr ng-repeat=\"item in products\">\n");
      out.write("                                                <td><input type=\"checkbox\" ng-model=\"item.checked\" name=\"all\" /></td>\n");
      out.write("                                                <td>{{item.ID}}</td>\n");
      out.write("                                                <td>{{item.Name}}</td>\n");
      out.write("                                                <td>\n");
      out.write("                                                    {{item.CreatedDate| date:'dd/MM/yyyy hh:mm:ss'}}\n");
      out.write("                                                </td>\n");
      out.write("                                                <!--class=\"badge bg-red\"-->\n");
      out.write("                                                <td>\n");
      out.write("                                                    <span ng-class=\"{'badge bg-red':item.Status == false,'badge bg-green':item.Status == true}\">\n");
      out.write("                                                        {{item.Status| statusFilter}}\n");
      out.write("                                                    </span>\n");
      out.write("                                                </td>\n");
      out.write("                                                <td>\n");
      out.write("                                                    <button class=\"btn btn-sm btn-primary\" ui-sref=\"product_edit({id:item.ID})\"><i class=\"fa fa-pencil\"></i></button>\n");
      out.write("                                                    <button class=\"btn  btn-sm btn-danger\" ng-click=\"deleteProduct(item.ID)\"><i class=\"fa fa-trash\"></i></button>\n");
      out.write("                                                </td>\n");
      out.write("                                            </tr>\n");
      out.write("                                            <tfoot>\n");
      out.write("                                                <tr>\n");
      out.write("                                                    <td colspan=\"6\"><span class=\"pull-right\">Trang: {{page + 1}} - Tổng số bản ghi: {{totalCount}}</span></td>\n");
      out.write("                                                </tr>\n");
      out.write("                                            </tfoot>\n");
      out.write("                                        </table>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div><!-- /.box-body -->\n");
      out.write("                            <div class=\"box-footer\">\n");
      out.write("                                <pager-directive page=\"{{page}}\" custom-path=\"{{customPath}}\" pages-count=\"{{pagesCount}}\" total-count=\"{{totalCount}}\" search-func=\"getProducts(page)\"></pager-directive>\n");
      out.write("                            </div><!-- /.box-footer-->\n");
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
