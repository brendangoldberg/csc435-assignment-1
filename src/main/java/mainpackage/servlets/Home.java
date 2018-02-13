package mainpackage.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mainpackage.helpers.PrintHelper;

public class Home extends HttpServlet {
  private static final long serialVersionUID = 459012421686181870L;

  public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
    res.setContentType("text/html");
    PrintWriter out = res.getWriter();
    String cssPath = req.getContextPath() + "/css/styles.css";
    PrintHelper.instance().printTop(out, cssPath);
    out.println("<center>Welcome to my Library Web Application!</center>");
    PrintHelper.instance().printBottom(out);
  }

}