/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.87
 * Generated at: 2024-05-15 15:11:29 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class branches_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(3);
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("\r\n");
      out.write("/* CSS for the textile management system website */\r\n");
      out.write("\r\n");
      out.write("/* Resetting default browser styles */\r\n");
      out.write("* {\r\n");
      out.write("    margin: 0;\r\n");
      out.write("    padding: 0;\r\n");
      out.write("    box-sizing: border-box;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("body {\r\n");
      out.write("    font-family: Arial, sans-serif;\r\n");
      out.write("    background-color: #f5f5f5;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("section {\r\n");
      out.write("    padding: 50px 0;\r\n");
      out.write("    text-align: center;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".main_text {\r\n");
      out.write("    max-width: 600px;\r\n");
      out.write("    margin: 0 auto;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".main_text h1 {\r\n");
      out.write("    font-size: 3rem;\r\n");
      out.write("    margin-bottom: 20px;\r\n");
      out.write("    font-family: \"Times New Roman\", Times, serif;\r\n");
      out.write("   \r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".main_text p {\r\n");
      out.write("    font-size: 1.2rem;\r\n");
      out.write("    color: #000000;\r\n");
      out.write("    text-align: left;\r\n");
      out.write("     font-family: \"Times New Roman\", Times, serif;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".main_image img {\r\n");
      out.write("    max-width: 400px;\r\n");
      out.write("    height: auto;\r\n");
      out.write("    border-radius: 20px;\r\n");
      out.write("    box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);\r\n");
      out.write("   \r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".row {\r\n");
      out.write("    display: flex;\r\n");
      out.write("    flex-wrap: wrap;\r\n");
      out.write("    justify-content: space-around;\r\n");
      out.write("    margin-top: 50px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".column {\r\n");
      out.write("    flex-basis: 30%;\r\n");
      out.write("    margin-bottom: 30px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".card {\r\n");
      out.write("    background-color: #fff;\r\n");
      out.write("    border-radius: 10px;\r\n");
      out.write("    box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);\r\n");
      out.write("    overflow: hidden;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".card img {\r\n");
      out.write("    width: 100%;\r\n");
      out.write("    height: auto;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".container {\r\n");
      out.write("    padding: 20px;\r\n");
      out.write("    text-align: center;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".container h2 {\r\n");
      out.write("    font-size: 1.5rem;\r\n");
      out.write("    margin-bottom: 10px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".container p.title {\r\n");
      out.write("    font-size: 1.2rem;\r\n");
      out.write("    color: #666;\r\n");
      out.write("    margin-bottom: 5px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".container h4 {\r\n");
      out.write("    font-size: 1.2rem;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".button {\r\n");
      out.write("    display: inline-block;\r\n");
      out.write("    background-color: #007bff;\r\n");
      out.write("    color: #fff;\r\n");
      out.write("    padding: 10px 20px;\r\n");
      out.write("    border: none;\r\n");
      out.write("    border-radius: 5px;\r\n");
      out.write("    cursor: pointer;\r\n");
      out.write("    transition: background-color 0.3s ease;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".button:hover {\r\n");
      out.write("    background-color: #0056b3;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".header {\r\n");
      out.write("  background-color: #273444;\r\n");
      out.write("  color: white;\r\n");
      out.write("  padding: 20px;\r\n");
      out.write("  display: flex;\r\n");
      out.write("  align-items: center; /* Align items vertically */\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".logo {\r\n");
      out.write("  flex: 1;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".title {\r\n");
      out.write("  flex: 3;\r\n");
      out.write("  text-align: center;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".navbar {\r\n");
      out.write("  overflow: hidden;\r\n");
      out.write("  background-color: #333;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".navbar a {\r\n");
      out.write("  float: left;\r\n");
      out.write("  display: block;\r\n");
      out.write("  color: white;\r\n");
      out.write("  text-align: center;\r\n");
      out.write("  padding: 14px 20px;\r\n");
      out.write("  text-decoration: none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".navbar a:hover {\r\n");
      out.write("  background-color: #ddd;\r\n");
      out.write("  color: black;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".search-container {\r\n");
      out.write("  float: right;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".search-container input[type=text] {\r\n");
      out.write("  padding: 6px;\r\n");
      out.write("  margin-top: 8px;\r\n");
      out.write("  margin-bottom: 8px;\r\n");
      out.write("  margin-right: 16px;\r\n");
      out.write("  border: none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".search-container button {\r\n");
      out.write("  padding: 6px 10px;\r\n");
      out.write("  margin-top: 8px;\r\n");
      out.write("  margin-bottom: 8px;\r\n");
      out.write("  margin-right: 16px;\r\n");
      out.write("  background: #ddd;\r\n");
      out.write("  font-size: 14px;\r\n");
      out.write("  border: none;\r\n");
      out.write("  cursor: pointer;\r\n");
      out.write("}\r\n");
      out.write(".footer {\r\n");
      out.write("    background-color: #1a1a2e;\r\n");
      out.write("    color: #fff;\r\n");
      out.write("    padding: 5px 0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".footer .container {\r\n");
      out.write("    display: flex;\r\n");
      out.write("    justify-content: space-between; /* Aligns the content to the left and right */\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".footer .contact {\r\n");
      out.write("    flex: 1; /* Takes up remaining space */\r\n");
      out.write("    text-align: left; /* Align the content to the left */\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".footer .about {\r\n");
      out.write("    flex: 1; /* Takes up remaining space */\r\n");
      out.write("    text-align: right; /* Align the content to the right */\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".footer h5 {\r\n");
      out.write("    font-size: 25px;\r\n");
      out.write("    font-weight: 500;\r\n");
      out.write("    margin-bottom: 15px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".footer ul {\r\n");
      out.write("    list-style: none;\r\n");
      out.write("    padding-left: 0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".footer ul li {\r\n");
      out.write("    margin-bottom: 10px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".footer a {\r\n");
      out.write("    color: #fff;\r\n");
      out.write("    text-decoration: none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".footer a:hover {\r\n");
      out.write("    color: #ccc;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".footer .copy {\r\n");
      out.write("    text-align: center;\r\n");
      out.write("    margin-top: 10px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("		<div class=\"header\">\r\n");
      out.write(" 			\r\n");
      out.write("  			<div class=\"title\">\r\n");
      out.write("    		\r\n");
      out.write("    			<h3 class=\"moved-text\">Welcome To ServicePulse! Online Vehicle and Fuel Management System</h3>\r\n");
      out.write(" 			 </div>\r\n");
      out.write("		</div>\r\n");
      out.write("\r\n");
      out.write("	<div class=\"navbar\">\r\n");
      out.write("  		<a href=\"#home\">Home</a>\r\n");
      out.write("  		<a href=\"#about\">About Us</a>\r\n");
      out.write("  		<a href=\"#branches\">Branches</a>\r\n");
      out.write("  		<a href=\"#packages\">Packages</a>\r\n");
      out.write("  	<div class=\"search-container\">\r\n");
      out.write("    	<form action=\"/search\" method=\"get\">\r\n");
      out.write("      		<input type=\"text\" placeholder=\"Search...\" name=\"search\">\r\n");
      out.write("      		<button type=\"submit\">Search</button>\r\n");
      out.write("    	</form>\r\n");
      out.write("  		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("\r\n");
      out.write("	<section>\r\n");
      out.write("    <div class=\"main\" id=\"Home\">\r\n");
      out.write("        <div class=\"main_content\">\r\n");
      out.write("            <div class=\"main_text\">\r\n");
      out.write("                <h1>Branch Network</h1>\r\n");
      out.write("                <p>\r\n");
      out.write("                    High-quality vehicle servicing, maintenance, and repairs for all makes and models.\r\n");
      out.write("                    At guaranteed affordable quality with a personal touch. By one of the largest independent workshop SriLanka in the world.\r\n");
      out.write("                                  That's Bosch Car Service!\r\n");
      out.write("                </p>\r\n");
      out.write("            </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("  \r\n");
      out.write("\r\n");
      out.write("    <div class=\"row\">\r\n");
      out.write("        <div class=\"column\">\r\n");
      out.write("            <div class=\"card\">\r\n");
      out.write("                <img src=\"Image/1.jpg\" alt=\"Jane\" style=\"width:100%\">\r\n");
      out.write("                <div class=\"container\">\r\n");
      out.write("                    <h2>DELKANDA SERVICEPULSE GRAND 1</h2>\r\n");
      out.write("                    <p class=\"title\">Delkanda ServicePulse Grand 103. Old Kesbewa Road, Gangodawila</p>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"column\">\r\n");
      out.write("            <div class=\"card\">\r\n");
      out.write("                <img src=\"Image/2.jpg\" alt=\"Mike\" style=\"width:100%\">\r\n");
      out.write("                <div class=\"container\">\r\n");
      out.write("                    <h2>GAMPAHA SERVICEPULSE GRAND 1</h2>\r\n");
      out.write("                    <p class=\"title\">Gampaha ServicePulse Grand 100. Old asgiriya Road, Gampaha</p>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"column\">\r\n");
      out.write("            <div class=\"card\">\r\n");
      out.write("                <img src=\"Image/3.jpg\" alt=\"John\" style=\"width:100%\">\r\n");
      out.write("                <div class=\"container\">\r\n");
      out.write("                    <h2>KATUBEDDA SERVICEPULSE GRAND 1</h2>\r\n");
      out.write("                    <p class=\"title\">ServicePulse Katubedda Fast Fit 244 Galle Rd, Moratuwa, Sri Lanka</p>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("		\r\n");
      out.write("        <div class=\"column\">\r\n");
      out.write("            <div class=\"card\">\r\n");
      out.write("                <img src=\"Image/4.jpg\" alt=\"John\" style=\"width:100%\">\r\n");
      out.write("                <div class=\"container\">\r\n");
      out.write("                    <h2>KANDY SERVICEPULSE GRAND 1</h2>\r\n");
      out.write("                    <p class=\"title\">Kandy Grand 1 279 Kandy Rd, Gampola, Sri Lanka</p>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"column\">\r\n");
      out.write("            <div class=\"card\">\r\n");
      out.write("                <img src=\"Image/5.jpg\" alt=\"John\" style=\"width:100%\">\r\n");
      out.write("                <div class=\"container\">\r\n");
      out.write("                    <h2>COLOMBO SERVICEPULSE GRAND 1</h2>\r\n");
      out.write("                    <p class=\"title\">ServicePulse Colombo Premire 340 Park Rd</p>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"column\">\r\n");
      out.write("            <div class=\"card\">\r\n");
      out.write("                <img src=\"Image/6.jpg\" alt=\"John\" style=\"width:100%\">\r\n");
      out.write("                <div class=\"container\">\r\n");
      out.write("                    <h2>Moratuwa SERVICEPULSE Grand 1</h2>\r\n");
      out.write("                    <p class=\"title\"> Colombo Premire 340 Park Rd,340 Park Rd, Moratuwa</p>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</section>\r\n");
      out.write("\r\n");
      out.write("<footer class=\"footer\">\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("        \r\n");
      out.write("            <div class=\"contact\"> \r\n");
      out.write("                <h5>Contact Us</h5>\r\n");
      out.write("                <ul class=\"list-unstyled\">\r\n");
      out.write("                    <li><a href=\"#\">Email: info@servicepulse.com</a></li>\r\n");
      out.write("                    <li><a href=\"#\">Phone: 011-2222211</a></li>\r\n");
      out.write("                    <li><a href=\"#\">Address: No.34, Flower Road, Colombo 5</a></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"about\"> \r\n");
      out.write("                <h5>About Us</h5>\r\n");
      out.write("                <ul class=\"list-unstyled\">\r\n");
      out.write("                    <li><a href=\"#\">Company Overview</a></li>\r\n");
      out.write("                    <li><a href=\"#\">Our Team</a></li>\r\n");
      out.write("                    <li><a href=\"#\">Privacy Policy</a></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("  \r\n");
      out.write("    <div class=\"copy\">\r\n");
      out.write("        <p>&copy; 2023 ServicePulse. All rights reserved.</p>\r\n");
      out.write("    </div>\r\n");
      out.write("</footer>\r\n");
      out.write("	\r\n");
      out.write("     \r\n");
      out.write("        \r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
