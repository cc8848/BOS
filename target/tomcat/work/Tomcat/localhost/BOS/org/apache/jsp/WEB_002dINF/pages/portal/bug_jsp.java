/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2016-09-16 11:58:10 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.pages.portal;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class bug_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<div style=\"padding:10px;\">\r\n");
      out.write("<div style=\"margin-bottom:8px;\">您的意见会让系统做得更好<br /></div>\r\n");
      out.write("<form id=\"bug_form\" method=\"post\" enctype=\"application/x-www-form-urlencoded\">\r\n");
      out.write("<textarea name=\"bug_c\" id=\"bug_c\" cols=\"50\" rows=\"7\" style=\" border:solid 3px #E2E2E2;line-height:16px; padding:5px;\"></textarea>\r\n");
      out.write("<br />\r\n");
      out.write("<div style=\"margin-top:8px;\"><a href=\"javascript:void(0);\" onclick=\"$('#bug_form').submit();\" id=\"bug_form_but\" class=\"easyui-linkbutton\">提交</a></div>\r\n");
      out.write("</form>\r\n");
      out.write("</div>\r\n");
      out.write("<script>\r\n");
      out.write("//功能相对独立，应该单独放置\r\n");
      out.write("$('#bug_form').form({  \r\n");
      out.write("\turl:\"post.html\",  \r\n");
      out.write("\tonSubmit: function(){  \r\n");
      out.write("\t\tif($('#bug_c').val()==\"\"){\r\n");
      out.write("\t\t\t$.messager.alert('Warning',\"内容太少\");\t\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}, \r\n");
      out.write("\tsuccess:function(data){  \r\n");
      out.write("\t\t$.messager.alert('Warning',\"提交成功\"); \r\n");
      out.write("\t\t$('#bug_c').val(\"\");\r\n");
      out.write("\t}  \r\n");
      out.write("});   \r\n");
      out.write("</script>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
