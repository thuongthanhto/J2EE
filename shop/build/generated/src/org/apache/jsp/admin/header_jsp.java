package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <header class=\"main-header\">\n");
      out.write("            <!-- Logo -->\n");
      out.write("            <a href=\"content/index2.html\" class=\"logo\">\n");
      out.write("                <!-- mini logo for sidebar mini 50x50 pixels -->\n");
      out.write("                <span class=\"logo-mini\"><b>A</b>LT</span>\n");
      out.write("                <!-- logo for regular state and mobile devices -->\n");
      out.write("                <span class=\"logo-lg\"><b>Admin</b>LTE</span>\n");
      out.write("            </a>\n");
      out.write("            <!-- Header Navbar: style can be found in header.less -->\n");
      out.write("            <nav class=\"navbar navbar-static-top\">\n");
      out.write("                <!-- Sidebar toggle button-->\n");
      out.write("                <a href=\"#\" class=\"sidebar-toggle\" data-toggle=\"offcanvas\" role=\"button\">\n");
      out.write("                    <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                </a>\n");
      out.write("                <div class=\"navbar-custom-menu\">\n");
      out.write("                    <ul class=\"nav navbar-nav\">\n");
      out.write("                        <!-- Messages: style can be found in dropdown.less-->\n");
      out.write("                        <li class=\"dropdown messages-menu\">\n");
      out.write("                            <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">\n");
      out.write("                                <i class=\"fa fa-envelope-o\"></i>\n");
      out.write("                                <span class=\"label label-success\">4</span>\n");
      out.write("                            </a>\n");
      out.write("                            <ul class=\"dropdown-menu\">\n");
      out.write("                                <li class=\"header\">You have 4 messages</li>\n");
      out.write("                                <li>\n");
      out.write("                                    <!-- inner menu: contains the actual data -->\n");
      out.write("                                    <ul class=\"menu\">\n");
      out.write("                                        <li>\n");
      out.write("                                            <!-- start message -->\n");
      out.write("                                            <a href=\"#\">\n");
      out.write("                                                <div class=\"pull-left\">\n");
      out.write("                                                    <img src=\"content/dist/img/user2-160x160.jpg\" class=\"img-circle\" alt=\"User Image\">\n");
      out.write("                                                </div>\n");
      out.write("                                                <h4>\n");
      out.write("                                                    Support Team\n");
      out.write("                                                    <small><i class=\"fa fa-clock-o\"></i> 5 mins</small>\n");
      out.write("                                                </h4>\n");
      out.write("                                                <p>Why not buy a new awesome theme?</p>\n");
      out.write("                                            </a>\n");
      out.write("                                        </li>\n");
      out.write("                                        <!-- end message -->\n");
      out.write("                                    </ul>\n");
      out.write("                                </li>\n");
      out.write("                                <li class=\"footer\"><a href=\"#\">See All Messages</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </li>\n");
      out.write("                        <!-- Notifications: style can be found in dropdown.less -->\n");
      out.write("                        <li class=\"dropdown notifications-menu\">\n");
      out.write("                            <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">\n");
      out.write("                                <i class=\"fa fa-bell-o\"></i>\n");
      out.write("                                <span class=\"label label-warning\">10</span>\n");
      out.write("                            </a>\n");
      out.write("                            <ul class=\"dropdown-menu\">\n");
      out.write("                                <li class=\"header\">You have 10 notifications</li>\n");
      out.write("                                <li>\n");
      out.write("                                    <!-- inner menu: contains the actual data -->\n");
      out.write("                                    <ul class=\"menu\">\n");
      out.write("                                        <li>\n");
      out.write("                                            <a href=\"#\">\n");
      out.write("                                                <i class=\"fa fa-users text-aqua\"></i> 5 new members joined today\n");
      out.write("                                            </a>\n");
      out.write("                                        </li>\n");
      out.write("                                    </ul>\n");
      out.write("                                </li>\n");
      out.write("                                <li class=\"footer\"><a href=\"#\">View all</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </li>\n");
      out.write("                        <!-- Tasks: style can be found in dropdown.less -->\n");
      out.write("                        <li class=\"dropdown tasks-menu\">\n");
      out.write("                            <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">\n");
      out.write("                                <i class=\"fa fa-flag-o\"></i>\n");
      out.write("                                <span class=\"label label-danger\">9</span>\n");
      out.write("                            </a>\n");
      out.write("                            <ul class=\"dropdown-menu\">\n");
      out.write("                                <li class=\"header\">You have 9 tasks</li>\n");
      out.write("                                <li>\n");
      out.write("                                    <!-- inner menu: contains the actual data -->\n");
      out.write("                                    <ul class=\"menu\">\n");
      out.write("                                        <li>\n");
      out.write("                                            <!-- Task item -->\n");
      out.write("                                            <a href=\"#\">\n");
      out.write("                                                <h3>\n");
      out.write("                                                    Design some buttons\n");
      out.write("                                                    <small class=\"pull-right\">20%</small>\n");
      out.write("                                                </h3>\n");
      out.write("                                                <div class=\"progress xs\">\n");
      out.write("                                                    <div class=\"progress-bar progress-bar-aqua\" style=\"width: 20%\" role=\"progressbar\" aria-valuenow=\"20\" aria-valuemin=\"0\" aria-valuemax=\"100\">\n");
      out.write("                                                        <span class=\"sr-only\">20% Complete</span>\n");
      out.write("                                                    </div>\n");
      out.write("                                                </div>\n");
      out.write("                                            </a>\n");
      out.write("                                        </li>\n");
      out.write("                                        <!-- end task item -->\n");
      out.write("                                    </ul>\n");
      out.write("                                </li>\n");
      out.write("                                <li class=\"footer\">\n");
      out.write("                                    <a href=\"#\">View all tasks</a>\n");
      out.write("                                </li>\n");
      out.write("                            </ul>\n");
      out.write("                        </li>\n");
      out.write("                        <!-- User Account: style can be found in dropdown.less -->\n");
      out.write("                        <li class=\"dropdown user user-menu\">\n");
      out.write("                            <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">\n");
      out.write("                                <img src=\"content/dist/img/user2-160x160.jpg\" class=\"user-image\" alt=\"User Image\">\n");
      out.write("                                <span class=\"hidden-xs\">Alexander Pierce</span>\n");
      out.write("                            </a>\n");
      out.write("                            <ul class=\"dropdown-menu\">\n");
      out.write("                                <!-- User image -->\n");
      out.write("                                <li class=\"user-header\">\n");
      out.write("                                    <img src=\"content/dist/img/user2-160x160.jpg\" class=\"img-circle\" alt=\"User Image\">\n");
      out.write("                                    <p>\n");
      out.write("                                        Alexander Pierce - Web Developer\n");
      out.write("                                        <small>Member since Nov. 2012</small>\n");
      out.write("                                    </p>\n");
      out.write("                                </li>\n");
      out.write("                                <!-- Menu Body -->\n");
      out.write("                                <li class=\"user-body\">\n");
      out.write("                                    <div class=\"row\">\n");
      out.write("                                        <div class=\"col-xs-4 text-center\">\n");
      out.write("                                            <a href=\"#\">Followers</a>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"col-xs-4 text-center\">\n");
      out.write("                                            <a href=\"#\">Sales</a>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"col-xs-4 text-center\">\n");
      out.write("                                            <a href=\"#\">Friends</a>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <!-- /.row -->\n");
      out.write("                                </li>\n");
      out.write("                                <!-- Menu Footer-->\n");
      out.write("                                <li class=\"user-footer\">\n");
      out.write("                                    <div class=\"pull-left\">\n");
      out.write("                                        <a href=\"#\" class=\"btn btn-default btn-flat\">Profile</a>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"pull-right\">\n");
      out.write("                                        <a href=\"#\" class=\"btn btn-default btn-flat\">Sign out</a>\n");
      out.write("                                    </div>\n");
      out.write("                                </li>\n");
      out.write("                            </ul>\n");
      out.write("                        </li>\n");
      out.write("                        <!-- Control Sidebar Toggle Button -->\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"#\" data-toggle=\"control-sidebar\"><i class=\"fa fa-gears\"></i></a>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </nav>\n");
      out.write("        </header>\n");
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
