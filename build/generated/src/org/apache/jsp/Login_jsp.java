package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=ISO-8859-1");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta charset=\"ISO-8859-1\">\n");
      out.write("<title>Insert title here</title>\n");
      out.write("<link rel=\"stylesheet\"\n");
      out.write(" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\"\n");
      out.write(" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\"\n");
      out.write(" crossorigin=\"anonymous\">\n");
      out.write("<link href=\"css/login.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write(" <div class=\"container col-md-8 col-md-offset-3\" style=\"overflow: auto\">\n");
      out.write("      <div class=\"text\"> Se connecter</div>\n");
      out.write("       <form method=\"post\" action=\"");
      out.print(request.getContextPath());
      out.write("/Login\">\n");
      out.write("   <div class=\"form-group\">\n");
      out.write("    <label for=\"uname\">Email:</label> <input type=\"text\"\n");
      out.write("     class=\"form-control\" id=\"email\" placeholder=\"nom@gmail.com\"\n");
      out.write("     name=\"email\" required>\n");
      out.write("   </div>\n");
      out.write("   <div class=\"form-group\">\n");
      out.write("    <label for=\"uname\">Mot de passe:</label> <input type=\"password\"\n");
      out.write("     class=\"form-control\" id=\"password\" placeholder=\"Mot de passe \"\n");
      out.write("     name=\"password\" required>\n");
      out.write("   </div>\n");
      out.write("   <button type=\"submit\" class=\"btn btn-primary\">Se connecter </button>\n");
      out.write("   <div class=\"signup-link\">  nouveau membre? <a href=\"registration.jsp\">S'inscrire</a>  </div>    \n");
      out.write("  </form>\n");
      out.write(" </div>\n");
      out.write("</body>\n");
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
