package ser.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//@WebServlet(urlPatterns = {"/d4","/dd4","/ddd4"})
//@WebServlet(urlPatterns = "/user/demo4")
//@WebServlet(urlPatterns = "/user/*")
//@WebServlet(urlPatterns = "*.do")
@WebServlet(urlPatterns = "/demo5")
public class ServletDemo05 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doget");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("dopost");
    }
}

