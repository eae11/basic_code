package ser.request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(urlPatterns = "/requestDemo8")
public class requestDemo8 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("demo8被访问了");
        //存储数据到request域当中
        request.setAttribute("msg", "hello");
        //转发到demo9
        /*RequestDispatcher requestDispatcher = request.getRequestDispatcher("/requestDemo9");
        requestDispatcher.forward(request, response);*/
        request.getRequestDispatcher("/requestDemo9").forward(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        String username = request.getParameter("username");
//        System.out.println("get");
//        System.out.println(username);
        this.doPost(request, response);
    }
}
