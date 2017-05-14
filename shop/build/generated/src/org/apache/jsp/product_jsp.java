package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import tools.FormatPrice;
import dao.CategoryDAO;
import model.Category;
import java.util.ArrayList;
import model.Product;
import model.Cart;
import dao.ProductDAO;

public final class product_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE HTML>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Shop Thời Trang</title>\n");
      out.write("        <!--css-->\n");
      out.write("        <link href=\"css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\"/>\n");
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("        <link href=\"css/font-awesome.css\" rel=\"stylesheet\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/jquery-ui.css\">\n");
      out.write("        <!--css-->\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("        <meta name=\"keywords\" content=\"\" />\n");
      out.write("        <script type=\"application/x-javascript\"> addEventListener(\"load\", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>\n");
      out.write("        <script src=\"js/jquery.min.js\"></script>\n");
      out.write("        <link href='//fonts.googleapis.com/css?family=Cagliostro' rel='stylesheet' type='text/css'>\n");
      out.write("        <link href='//fonts.googleapis.com/css?family=Open+Sans:400,800italic,800,700italic,700,600italic,600,400italic,300italic,300' rel='stylesheet' type='text/css'>\n");
      out.write("        <!--search jQuery-->\n");
      out.write("        <script src=\"js/main.js\"></script>\n");
      out.write("        <!--search jQuery-->\n");
      out.write("\n");
      out.write("        <!--mycart-->\n");
      out.write("        <script type=\"text/javascript\" src=\"js/bootstrap-3.1.1.min.js\"></script>\n");
      out.write("        <!-- cart -->\n");
      out.write("        <script src=\"js/simpleCart.min.js\"></script>\n");
      out.write("        <!-- cart -->\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        ");

            ProductDAO productDAO = new ProductDAO();
            CategoryDAO categoryDAO = new CategoryDAO();
            
            long categoryID = 0;
            if (request.getParameter("categoryID") != null) {
                categoryID = (long) Long.parseLong(request.getParameter("categoryID"));
            }
            Cart cart = (Cart) session.getAttribute("cart");
            if (cart == null) {
                cart = new Cart();
                session.setAttribute("cart", cart);
            }
            int pages = 0, firstResult = 0, maxResult = 0, total = 0;
            if (request.getParameter("pages") != null) {
                pages = (int) Integer.parseInt(request.getParameter("pages"));
            }

            total = productDAO.countProductByCategory(categoryID);
            if (total <= 8) {
                firstResult = 1;
                maxResult = total;
            } else {
                firstResult = (pages - 1) * 8;
                maxResult = 8;
            }

            ArrayList<Product> listProduct = productDAO.getListProductByNav(
                    categoryID, firstResult, maxResult);
        
      out.write("\n");
      out.write("        <!--header-->\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("            <!--header-->\n");
      out.write("            <!--content-->\n");
      out.write("            <div class=\"content\">\n");
      out.write("                <div class=\"products-agileinfo\">\n");
      out.write("                    <div class=\"container\">\n");
      out.write("                        <div class=\"product-agileinfo-grids w3l\">\n");
      out.write("                            <div class=\"col-md-3 product-agileinfo-grid\">\n");
      out.write("                                <div class=\"categories\">\n");
      out.write("                                    <h3>Danh mục</h3>\n");
      out.write("                                    <ul class=\"tree-list-pad\">\n");
      out.write("                                        <li><input type=\"checkbox\" checked=\"checked\" id=\"item-0\" /><label for=\"item-0\"><span></span>Thời trang nữ</label>\n");
      out.write("                                            <ul>\n");
      out.write("                                            ");

                                                for (Category c : categoryDAO.getListCategoryForWomen()) {
                                            
      out.write("\n");
      out.write("                                                <li><a href=\"product.jsp?categoryID=");
      out.print(c.getCategoryID());
      out.write("&pages=1\">");
      out.print(c.getCategoryName());
      out.write("</a></li>\n");
      out.write("                                            ");

                                                }
                                            
      out.write("\n");
      out.write("                                            </ul>\n");
      out.write("                                        </li>\n");
      out.write("                                        <li><input type=\"checkbox\" checked=\"checked\" id=\"item-0\" /><label for=\"item-0\"><span></span>Thời trang nam</label>\n");
      out.write("                                            <ul>\n");
      out.write("                                            ");

                                                for (Category c : categoryDAO.getListCategoryForMen()) {
                                            
      out.write("\n");
      out.write("                                                <li><a href=\"product.jsp?categoryID=");
      out.print(c.getCategoryID());
      out.write("&pages=1\">");
      out.print(c.getCategoryName());
      out.write("</a></li>\n");
      out.write("                                            ");

                                                }
                                            
      out.write("\n");
      out.write("                                            </ul>\n");
      out.write("                                        </li>\n");
      out.write("                                    </ul>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-md-9 product-agileinfon-grid1 w3l\">\n");
      out.write("\n");
      out.write("                                <div class=\"bs-example bs-example-tabs\" role=\"tabpanel\" data-example-id=\"togglable-tabs\">\n");
      out.write("                                    <ul id=\"myTab\" class=\"nav1 nav1-tabs left-tab\" role=\"tablist\">\n");
      out.write("\n");
      out.write("                                        <div id=\"myTabContent\" class=\"tab-content\">\n");
      out.write("                                            <div role=\"tabpanel\" class=\"tab-pane fade in active\" id=\"home\" aria-labelledby=\"home-tab\">\n");
      out.write("                                                <div class=\"product-tab\">\n");
      out.write("                                                ");

                                                    FormatPrice format = new FormatPrice();
                                                    for (Product p : listProduct) {
                                                
      out.write("\n");
      out.write("                                                <div class=\"col-md-4 product-tab-grid simpleCart_shelfItem\" style=\"margin-bottom: 50px;\">\n");
      out.write("                                                    <div class=\"grid-arr\">\n");
      out.write("                                                        <div  class=\"grid-arrival\">\n");
      out.write("                                                            <figure>\t\t\n");
      out.write("                                                                <a href=\"single.jsp?productID=");
      out.print(p.getProductID());
      out.write("\" class=\"new-gri\" data-toggle=\"modal\" data-target=\"#myModal1\">\n");
      out.write("                                                                    <div class=\"grid-img\">\n");
      out.write("                                                                        <img  src=\"");
      out.print(p.getProductImage());
      out.write("\" class=\"img-responsive\" alt=\"");
      out.print(p.getProductName());
      out.write("\">\n");
      out.write("                                                                    </div>\t\t\n");
      out.write("                                                                </a>\t\t\n");
      out.write("                                                            </figure>\t\n");
      out.write("                                                        </div>\n");
      out.write("                                                        <div class=\"block\">\n");
      out.write("                                                            <div class=\"starbox small ghosting\"> </div>\n");
      out.write("                                                        </div>\n");
      out.write("                                                        <div class=\"women\">\n");
      out.write("                                                            <h6><a href=\"single.jsp?productID=");
      out.print(p.getProductID());
      out.write('"');
      out.write('>');
      out.print(p.getProductName());
      out.write("</a></h6>\n");
      out.write("                                                            <span class=\"size\">XL / XXL / S </span>\n");
      out.write("                                                            <p><em>");
      out.print(format.formatNumber(p.getProductPrice()));
      out.write("</em> VND</p>\n");
      out.write("                                                            <a href=\"CartServlet?command=plus&productID=");
      out.print(p.getProductID());
      out.write("&categoryID=");
      out.print(categoryID);
      out.write("\" data-text=\"Add To Cart\" class=\"my-cart-b item_add\">Thêm vào giỏ hàng</a>\n");
      out.write("                                                        </div>\n");
      out.write("                                                    </div>\n");
      out.write("                                                </div>\n");
      out.write("                                                ");

                                                    }
                                                
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"clearfix\"> </div>  \n");
      out.write("\n");
      out.write("                                            <nav aria-label=\"Page navigation\">\n");
      out.write("                                                <ul class=\"pagination pagination-lg\">\n");
      out.write("                                                    <li>\n");
      out.write("                                                        <a href=\"#\" aria-label=\"Previous\">\n");
      out.write("                                                            <span aria-hidden=\"true\">&laquo;</span>\n");
      out.write("                                                        </a>\n");
      out.write("                                                    </li>\n");
      out.write("                                                    ");
for(int i=1;i<=(total/8)+1;i++){
      out.write("\n");
      out.write("                                                    <li><a href=\"product.jsp?categoryID=");
      out.print(categoryID);
      out.write("&pages=");
      out.print(i);
      out.write('"');
      out.write('>');
      out.print(i);
      out.write("</a></li>\n");
      out.write("                                                    ");
}
      out.write("\n");
      out.write("                                                    <li>\n");
      out.write("                                                        <a href=\"#\" aria-label=\"Next\">\n");
      out.write("                                                            <span aria-hidden=\"true\">&raquo;</span>\n");
      out.write("                                                        </a>\n");
      out.write("                                                    </li>\n");
      out.write("                                                </ul>\n");
      out.write("                                            </nav>\n");
      out.write("                                            \n");
      out.write("                                        </div>\n");
      out.write("                                        <div role=\"tabpanel\" class=\"tab-pane fade\" id=\"profile\" aria-labelledby=\"profile-tab\">\n");
      out.write("                                            <div class=\"product-tab1\">\n");
      out.write("                                                <div class=\"col-md-4 product-tab1-grid\">\n");
      out.write("                                                    <div class=\"grid-arr\">\n");
      out.write("                                                        <div  class=\"grid-arrival\">\n");
      out.write("                                                            <figure>\t\t\n");
      out.write("                                                                <a href=\"#\" class=\"new-gri\" data-toggle=\"modal\" data-target=\"#myModal1\">\n");
      out.write("                                                                    <div class=\"grid-img\">\n");
      out.write("                                                                        <img  src=\"images/p6.jpg\" class=\"img-responsive\" alt=\"\">\n");
      out.write("                                                                    </div>\n");
      out.write("                                                                    <div class=\"grid-img\">\n");
      out.write("                                                                        <img  src=\"images/p5.jpg\" class=\"img-responsive\"  alt=\"\">\n");
      out.write("                                                                    </div>\t\t\t\n");
      out.write("                                                                </a>\t\t\n");
      out.write("                                                            </figure>\t\n");
      out.write("                                                        </div>\n");
      out.write("                                                    </div>\n");
      out.write("                                                </div>\n");
      out.write("                                                <div class=\"col-md-8 product-tab1-grid1 simpleCart_shelfItem\">\n");
      out.write("                                                    <div class=\"block\">\n");
      out.write("                                                        <div class=\"starbox small ghosting\"> </div>\n");
      out.write("                                                    </div>\n");
      out.write("                                                    <div class=\"women\">\n");
      out.write("                                                        <h6><a href=\"single.html\">Sed ut perspiciatis unde</a></h6>\n");
      out.write("                                                        <span class=\"size\">XL / XXL / S </span>\n");
      out.write("                                                        <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Atqui iste locus est, Piso, tibi etiam atque etiam confirmandus, inquam; Refert tamen, quo modo. Quod autem meum munus dicis non equidem recuso, sed te adiungo socium. </p>\n");
      out.write("                                                        <p ><del>$100.00</del><em class=\"item_price\">$70.00</em></p>\n");
      out.write("                                                        <a href=\"#\" data-text=\"Add To Cart\" class=\"my-cart-b item_add\">Add To Cart</a>\n");
      out.write("                                                    </div>\n");
      out.write("                                                </div>\n");
      out.write("                                                <div class=\"clearfix\"></div>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"product-tab1 prod3\">\n");
      out.write("                                                <div class=\"col-md-4 product-tab1-grid\">\n");
      out.write("                                                    <div class=\"grid-arr\">\n");
      out.write("                                                        <div  class=\"grid-arrival\">\n");
      out.write("                                                            <figure>\t\t\n");
      out.write("                                                                <a href=\"#\" class=\"new-gri\" data-toggle=\"modal\" data-target=\"#myModal1\">\n");
      out.write("                                                                    <div class=\"grid-img\">\n");
      out.write("                                                                        <img  src=\"images/i2.jpg\" class=\"img-responsive\" alt=\"\">\n");
      out.write("                                                                    </div>\n");
      out.write("                                                                    <div class=\"grid-img\">\n");
      out.write("                                                                        <img  src=\"images/i1.jpg\" class=\"img-responsive\"  alt=\"\">\n");
      out.write("                                                                    </div>\t\t\t\n");
      out.write("                                                                </a>\t\t\n");
      out.write("                                                            </figure>\t\n");
      out.write("                                                        </div>\n");
      out.write("                                                    </div>\n");
      out.write("                                                </div>\n");
      out.write("                                                <div class=\"col-md-8 product-tab1-grid1 simpleCart_shelfItem\">\n");
      out.write("                                                    <div class=\"block\">\n");
      out.write("                                                        <div class=\"starbox small ghosting\"> </div>\n");
      out.write("                                                    </div>\n");
      out.write("                                                    <div class=\"women\">\n");
      out.write("                                                        <h6><a href=\"single.html\">Sed ut perspiciatis unde</a></h6>\n");
      out.write("                                                        <span class=\"size\">XL / XXL / S </span>\n");
      out.write("                                                        <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Atqui iste locus est, Piso, tibi etiam atque etiam confirmandus, inquam; Refert tamen, quo modo. Quod autem meum munus dicis non equidem recuso, sed te adiungo socium. </p>\n");
      out.write("                                                        <p ><del>$100.00</del><em class=\"item_price\">$70.00</em></p>\n");
      out.write("                                                        <a href=\"#\" data-text=\"Add To Cart\" class=\"my-cart-b item_add\">Add To Cart</a>\n");
      out.write("                                                    </div>\n");
      out.write("                                                </div>\n");
      out.write("                                                <div class=\"clearfix\"></div>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"product-tab1\">\n");
      out.write("                                                <div class=\"col-md-4 product-tab1-grid\">\n");
      out.write("                                                    <div class=\"grid-arr\">\n");
      out.write("                                                        <div  class=\"grid-arrival\">\n");
      out.write("                                                            <figure>\t\t\n");
      out.write("                                                                <a href=\"#\" class=\"new-gri\" data-toggle=\"modal\" data-target=\"#myModal1\">\n");
      out.write("                                                                    <div class=\"grid-img\">\n");
      out.write("                                                                        <img  src=\"images/i4.jpg\" class=\"img-responsive\" alt=\"\">\n");
      out.write("                                                                    </div>\n");
      out.write("                                                                    <div class=\"grid-img\">\n");
      out.write("                                                                        <img  src=\"images/i3.jpg\" class=\"img-responsive\"  alt=\"\">\n");
      out.write("                                                                    </div>\t\t\t\n");
      out.write("                                                                </a>\t\t\n");
      out.write("                                                            </figure>\t\n");
      out.write("                                                        </div>\n");
      out.write("\n");
      out.write("                                                    </div>\n");
      out.write("                                                </div>\n");
      out.write("                                                <div class=\"col-md-8 product-tab1-grid1 simpleCart_shelfItem\">\n");
      out.write("                                                    <div class=\"block\">\n");
      out.write("                                                        <div class=\"starbox small ghosting\"> </div>\n");
      out.write("                                                    </div>\n");
      out.write("                                                    <div class=\"women\">\n");
      out.write("                                                        <h6><a href=\"single.html\">Sed ut perspiciatis unde</a></h6>\n");
      out.write("                                                        <span class=\"size\">XL / XXL / S </span>\n");
      out.write("                                                        <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Atqui iste locus est, Piso, tibi etiam atque etiam confirmandus, inquam; Refert tamen, quo modo. Quod autem meum munus dicis non equidem recuso, sed te adiungo socium. </p>\n");
      out.write("                                                        <p ><del>$100.00</del><em class=\"item_price\">$70.00</em></p>\n");
      out.write("                                                        <a href=\"#\" data-text=\"Add To Cart\" class=\"my-cart-b item_add\">Add To Cart</a>\n");
      out.write("                                                    </div>\n");
      out.write("                                                </div>\n");
      out.write("                                                <div class=\"clearfix\"></div>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"product-tab1 prod3\">\n");
      out.write("                                                <div class=\"col-md-4 product-tab1-grid\">\n");
      out.write("                                                    <div class=\"grid-arr\">\n");
      out.write("                                                        <div  class=\"grid-arrival\">\n");
      out.write("                                                            <figure>\t\t\n");
      out.write("                                                                <a href=\"#\" class=\"new-gri\" data-toggle=\"modal\" data-target=\"#myModal1\">\n");
      out.write("                                                                    <div class=\"grid-img\">\n");
      out.write("                                                                        <img  src=\"images/i6.jpg\" class=\"img-responsive\" alt=\"\">\n");
      out.write("                                                                    </div>\n");
      out.write("                                                                    <div class=\"grid-img\">\n");
      out.write("                                                                        <img  src=\"images/i5.jpg\" class=\"img-responsive\"  alt=\"\">\n");
      out.write("                                                                    </div>\t\t\t\n");
      out.write("                                                                </a>\t\t\n");
      out.write("                                                            </figure>\t\n");
      out.write("                                                        </div>\n");
      out.write("\n");
      out.write("                                                    </div>\n");
      out.write("                                                </div>\n");
      out.write("                                                <div class=\"col-md-8 product-tab1-grid1 simpleCart_shelfItem\">\n");
      out.write("                                                    <div class=\"block\">\n");
      out.write("                                                        <div class=\"starbox small ghosting\"> </div>\n");
      out.write("                                                    </div>\n");
      out.write("                                                    <div class=\"women\">\n");
      out.write("                                                        <h6><a href=\"single.html\">Sed ut perspiciatis unde</a></h6>\n");
      out.write("                                                        <span class=\"size\">XL / XXL / S </span>\n");
      out.write("                                                        <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Atqui iste locus est, Piso, tibi etiam atque etiam confirmandus, inquam; Refert tamen, quo modo. Quod autem meum munus dicis non equidem recuso, sed te adiungo socium. </p>\n");
      out.write("                                                        <p ><del>$100.00</del><em class=\"item_price\">$70.00</em></p>\n");
      out.write("                                                        <a href=\"#\" data-text=\"Add To Cart\" class=\"my-cart-b item_add\">Add To Cart</a>\n");
      out.write("                                                    </div>\n");
      out.write("                                                </div>\n");
      out.write("                                                <div class=\"clearfix\"></div>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"product-tab1\">\n");
      out.write("                                                <div class=\"col-md-4 product-tab1-grid\">\n");
      out.write("                                                    <div class=\"grid-arr\">\n");
      out.write("                                                        <div  class=\"grid-arrival\">\n");
      out.write("                                                            <figure>\t\t\n");
      out.write("                                                                <a href=\"#\" class=\"new-gri\" data-toggle=\"modal\" data-target=\"#myModal1\">\n");
      out.write("                                                                    <div class=\"grid-img\">\n");
      out.write("                                                                        <img  src=\"images/i8.jpg\" class=\"img-responsive\" alt=\"\">\n");
      out.write("                                                                    </div>\n");
      out.write("                                                                    <div class=\"grid-img\">\n");
      out.write("                                                                        <img  src=\"images/i7.jpg\" class=\"img-responsive\"  alt=\"\">\n");
      out.write("                                                                    </div>\t\t\t\n");
      out.write("                                                                </a>\t\t\n");
      out.write("                                                            </figure>\t\n");
      out.write("                                                        </div>\n");
      out.write("                                                    </div>\n");
      out.write("                                                </div>\n");
      out.write("                                                <div class=\"col-md-8 product-tab1-grid1 simpleCart_shelfItem\">\n");
      out.write("                                                    <div class=\"block\">\n");
      out.write("                                                        <div class=\"starbox small ghosting\"> </div>\n");
      out.write("                                                    </div>\n");
      out.write("                                                    <div class=\"women\">\n");
      out.write("                                                        <h6><a href=\"single.html\">Sed ut perspiciatis unde</a></h6>\n");
      out.write("                                                        <span class=\"size\">XL / XXL / S </span>\n");
      out.write("                                                        <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Atqui iste locus est, Piso, tibi etiam atque etiam confirmandus, inquam; Refert tamen, quo modo. Quod autem meum munus dicis non equidem recuso, sed te adiungo socium. </p>\n");
      out.write("                                                        <p ><del>$100.00</del><em class=\"item_price\">$70.00</em></p>\n");
      out.write("                                                        <a href=\"#\" data-text=\"Add To Cart\" class=\"my-cart-b item_add\">Add To Cart</a>\n");
      out.write("                                                    </div>\n");
      out.write("                                                </div>\n");
      out.write("                                                <div class=\"clearfix\"></div>\n");
      out.write("                                            </div>\n");
      out.write("\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"clearfix\"> </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!--content-->\n");
      out.write("        <!---footer--->\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\n");
      out.write("        <!---footer--->\n");
      out.write("\n");
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
