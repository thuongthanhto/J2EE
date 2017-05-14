package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.Users;
import model.Cart;
import java.util.Map;
import model.Item;

public final class checkout_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html><head>\n");
      out.write("        <title>Shop Thời Trang</title>\n");
      out.write("        <!--css-->\n");
      out.write("        <link href=\"css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\">\n");
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\">\n");
      out.write("        <link href=\"css/font-awesome.css\" rel=\"stylesheet\">\n");
      out.write("        <!--css-->\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">\n");
      out.write("        <meta name=\"keywords\" content=\"New Shop Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, \n");
      out.write("              Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design\">\n");
      out.write("        <script type=\"application/x-javascript\"> addEventListener(\"load\", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>\n");
      out.write("        <script src=\"js/jquery.min.js\"></script>\n");
      out.write("        <link href=\"//fonts.googleapis.com/css?family=Cagliostro\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("        <link href=\"//fonts.googleapis.com/css?family=Open+Sans:400,800italic,800,700italic,700,600italic,600,400italic,300italic,300\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("        <!--search jQuery-->\n");
      out.write("        <script src=\"js/main.js\"></script>\n");
      out.write("        <!--search jQuery-->\n");
      out.write("        <script src=\"js/responsiveslides.min.js\"></script>\n");
      out.write("        <script>\n");
      out.write("            $(function () {\n");
      out.write("                $(\"#slider\").responsiveSlides({\n");
      out.write("                    auto: true,\n");
      out.write("                    nav: true,\n");
      out.write("                    speed: 500,\n");
      out.write("                    namespace: \"callbacks\",\n");
      out.write("                    pager: true,\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("        <!--mycart-->\n");
      out.write("        <script type=\"text/javascript\" src=\"js/bootstrap-3.1.1.min.js\"></script>\n");
      out.write("        <!-- cart -->\n");
      out.write("        <script src=\"js/simpleCart.min.js\"></script>\n");
      out.write("        <!-- cart -->\n");
      out.write("        <!--start-rate-->\n");
      out.write("        <script src=\"js/jstarbox.js\"></script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/jstarbox.css\" type=\"text/css\" media=\"screen\" charset=\"utf-8\">\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            jQuery(function () {\n");
      out.write("                jQuery('.starbox').each(function () {\n");
      out.write("                    var starbox = jQuery(this);\n");
      out.write("                    starbox.starbox({\n");
      out.write("                        average: starbox.attr('data-start-value'),\n");
      out.write("                        changeable: starbox.hasClass('unchangeable') ? false : starbox.hasClass('clickonce') ? 'once' : true,\n");
      out.write("                        ghosting: starbox.hasClass('ghosting'),\n");
      out.write("                        autoUpdateAverage: starbox.hasClass('autoupdate'),\n");
      out.write("                        buttons: starbox.hasClass('smooth') ? false : starbox.attr('data-button-count') || 5,\n");
      out.write("                        stars: starbox.attr('data-star-count') || 5\n");
      out.write("                    }).bind('starbox-value-changed', function (event, value) {\n");
      out.write("                        if (starbox.hasClass('random')) {\n");
      out.write("                            var val = Math.random();\n");
      out.write("                            starbox.next().text(' ' + val);\n");
      out.write("                            return val;\n");
      out.write("                        }\n");
      out.write("                    })\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("        <!--//End-rate-->\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        ");

            Cart cart = (Cart) session.getAttribute("cart");
            if (cart == null) {
                cart = new Cart();
                session.setAttribute("cart", cart);
            }
            Users users = (Users) session.getAttribute("user");
            if (users == null) {
                response.sendRedirect("/shop/login.jsp");
            }
        
      out.write("\n");
      out.write("\n");
      out.write("        <!--header-->\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("            <!--header-->\n");
      out.write("            <!--content-->\n");
      out.write("            <div class=\"content\">\n");
      out.write("                <div class=\"cart-items\">\n");
      out.write("                    <div class=\"container\">\n");
      out.write("                    ");
if (cart.countItem() == 0) {
                    
      out.write("\n");
      out.write("                    <h1>Giỏ Hàng Rỗng</h1>\n");
      out.write("                    ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope['javax.servlet.forward.request_uri']}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("                    ");

                    } else {
                    
      out.write("\n");
      out.write("\n");
      out.write("                    <table class=\"table\" style=\"text-align: center;\">\n");
      out.write("                        <tr style=\"background-color: #4CAF50; color: white;\">\n");
      out.write("                            <td style=\"background-color: #4CAF50; color: white;\">Mã SP</td>\n");
      out.write("                            <td style=\"background-color: #4CAF50; color: white;\">Tên SP</td>\n");
      out.write("                            <td style=\"background-color: #4CAF50; color: white;\">Hình ảnh</td>\n");
      out.write("                            <td style=\"background-color: #4CAF50; color: white;\">Số lượng</td>\n");
      out.write("                            <td style=\"background-color: #4CAF50; color: white;\">Đơn giá</td>\n");
      out.write("                            <td style=\"background-color: #4CAF50; color: white;\">Thành tiền</td>\n");
      out.write("                            <td></td>\n");
      out.write("                        </tr>\n");
      out.write("                        ");

                            for (Map.Entry<Long, Item> item : cart.getCartItems().entrySet()) {
                        
      out.write("\n");
      out.write("                        <tr style=\"background-color: #f2f2f2;\">\n");
      out.write("                            <td>");
      out.print(item.getValue().getProduct().getProductID());
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(item.getValue().getProduct().getProductName());
      out.write("</td>\n");
      out.write("                            <td><img src=\"");
      out.print(item.getValue().getProduct().getProductImage());
      out.write("\" width=\"100\" height=\"100\" /></td>\n");
      out.write("                            <td>");
      out.print(item.getValue().getQuantity());
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(item.getValue().getProduct().getProductPrice());
      out.write(" VNĐ</td>\n");
      out.write("                            <td>");
      out.print(item.getValue().getProduct().getProductPrice() * item.getValue().getQuantity());
      out.write(" VNĐ</td>\n");
      out.write("                            <td>\n");
      out.write("                                <a href=\"CartServlet?command=remove&productID=");
      out.print(item.getValue().getProduct().getProductID());
      out.write("\">Xóa</a> \n");
      out.write("                            </td>\n");
      out.write("\n");
      out.write("                        </tr>\n");
      out.write("\n");
      out.write("                        ");

                            }
                        
      out.write("\n");
      out.write("                    </table>\n");
      out.write("                    \n");
      out.write("                    <br/>\n");
      out.write("                    <br/>\n");
      out.write("                    <form action=\"CheckOutServlet\" method=\"post\">\n");
      out.write("                        <div class=\"clearfix\"></div>\n");
      out.write("                        <br/>\n");
      out.write("                        <div><h2 style=\"text-align: center;\">Thông tin khách hàng</h2></div>\n");
      out.write("                        <br/>\n");
      out.write("                        <div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label for=\"DiaChi\">Địa chỉ:</label>\n");
      out.write("                                <textarea class=\"form-control\" rows=\"5\" id=\"DiaChi\" name=\"address\" data-error=\"#errDiaChi\"></textarea>\n");
      out.write("                                <span style=\"color: red\" id=\"errDiaChi\"></span>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label for=\"SoDienThoai\">Số điện thoại:</label>\n");
      out.write("                                <input type=\"text\" class=\"form-control\" id=\"SoDienThoai\" name=\"phone\" data-error=\"#errSDT\">\n");
      out.write("                                <span style=\"color: red\" id=\"errSDT\"></span>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <input type=\"submit\" value=\"Đặt hàng\" class=\"btn btn-success\" id=\"btnDatHang\"/>\n");
      out.write("                    </form>\n");
      out.write("                    ");

                        }
                    
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <!-- checkout -->\t\n");
      out.write("        </div>\n");
      out.write("        <!--content-->\n");
      out.write("        <!---footer--->\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\n");
      out.write("        <!---footer--->\n");
      out.write("    </body>\n");
      out.write("</html>");
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
