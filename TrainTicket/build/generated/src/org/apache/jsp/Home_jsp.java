package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class Home_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write('\n');
session.setAttribute("UserName", "ram");
      out.write("\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("function go() {\n");
      out.write("window.location.replace(\"Logout.jsp\",'window','toolbar=1,location=1,directories=1,status=1,menubar=1,scrollbars=1,resizable=1');\n");
      out.write("self.close()\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("<head>\n");
      out.write("  <meta charset=\"UTF-8\">\n");
      out.write("  <title>Simple, CSS only, responsive menu</title>\n");
      out.write("  \n");
      out.write("  <link rel=\"stylesheet\" href=\"css/reset.min.css\">\n");
      out.write("\n");
      out.write("  \n");
      out.write("      <link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("\n");
      out.write("  \n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("  <head>\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width\">\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<form>\n");
      out.write("<div class=\"wrap\">\n");
      out.write("<span class=\"decor\"></span>\n");
      out.write("<nav>\n");
      out.write("  <ul class=\"primary\">\n");
      out.write("    <li>\n");
      out.write("      <a href=\"newjsp.jsp\">Home</a>\n");
      out.write("    </li>\n");
      out.write("    <li>\n");
      out.write("      <a href=\"\">Courses</a>\n");
      out.write("      <ul class=\"sub\">\n");
      out.write("        <li><a href=\"\">CSE</a></li>\n");
      out.write("        <li><a href=\"\">EEE</a></li>\n");
      out.write("        <li><a href=\"\">Mech</a></li>\n");
      out.write("      </ul>\n");
      out.write("    </li>\n");
      out.write("    <li>\n");
      out.write("      <a href=\"\">Faculty</a>\n");
      out.write("      <ul class=\"sub\">\n");
      out.write("        <li><a href=\"\">B.Tech</a></li>\n");
      out.write("        <li><a href=\"\">MBA</a></li>\n");
      out.write("      </ul>  \n");
      out.write("    </li>\n");
      out.write("    <li>\n");
      out.write("      <a href=\"\">Students</a>\n");
      out.write("      <ul class=\"sub\">\n");
      out.write("        <li><a href=\"\">B.Tech</a></li>\n");
      out.write("        <li><a href=\"\">ASCOM</a></li>\n");
      out.write("        <li><a href=\"\">MBA</a></li>\n");
      out.write("      </ul>  \n");
      out.write("    </li>\n");
      out.write("    <li>\n");
      out.write("      <a href=\"\">Contact us</a>\n");
      out.write("      <ul class=\"sub\">\n");
      out.write("        <li><a href=\"\">Phone</a></li>\n");
      out.write("        <li><a href=\"\">Email</a></li>\n");
      out.write("        <li><a href=\"\">Address</a></li>\n");
      out.write("      </ul>  \n");
      out.write("    </li>\n");
      out.write("    \n");
      out.write("   \n");
      out.write("  </ul>\n");
      out.write("</nav>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class=\"imgcontainer\">\n");
      out.write("  <img src=\"Login.jpg\" alt=\"Avatar\" class=\"avatar\" >\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("</form>\n");
      out.write("\n");
      out.write("  \n");
      out.write("</body>\n");
      out.write("\n");
      out.write("\n");
 if (session.getAttribute("UserName").equals("")){
      out.write("\n");
      out.write("<a href=\"Login.jsp\"><b>Login </b></a>\n");
}
else{
      out.write("\n");
      out.write("<a href=\"javascript:go()\"><b>Logout</b></a>\n");
}

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
