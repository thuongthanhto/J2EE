<%-- 
    Document   : menu
    Created on : May 13, 2017, 9:16:51 AM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <aside class="main-sidebar">
            <!-- sidebar: style can be found in sidebar.less -->
            <section class="sidebar">
                <!-- Sidebar user panel -->
                <div class="user-panel">
                    <div class="pull-left image">
                        <img src="content/dist/img/user2-160x160.jpg" class="img-circle" alt="User Image">
                    </div>
                    <div class="pull-left info">
                        <p>Alexander Pierce</p>
                        <a href="#"><i class="fa fa-circle text-success"></i> Online</a>
                    </div>
                </div>
                <!-- search form -->
                <form action="#" method="get" class="sidebar-form">
                    <div class="input-group">
                        <input type="text" name="q" class="form-control" placeholder="Search...">
                        <span class="input-group-btn">
                            <button type="submit" name="search" id="search-btn" class="btn btn-flat">
                                <i class="fa fa-search"></i>
                            </button>
                        </span>
                    </div>
                </form>
                <!-- /.search form -->
                <!-- sidebar menu: : style can be found in sidebar.less -->
                <ul class="sidebar-menu">
                    <li class="header">Chức năng chính</li>
                    
                    <li><a href="manager_category.jsp"><i class="fa fa-book"></i> <span>Quản lý danh mục</span></a></li>
                    <li><a href="manager_product.jsp"><i class="fa fa-book"></i> <span>Quản lý sản phẩm</span></a></li>
                    <li><a href="../../documentation/index.html"><i class="fa fa-book"></i> <span>Duyệt đơn hàng</span></a></li>
                </ul>
            </section>
            <!-- /.sidebar -->
        </aside>
    </body>
</html>
