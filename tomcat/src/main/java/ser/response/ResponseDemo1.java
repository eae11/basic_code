package ser.response;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/*
重定向
 */
@WebServlet(urlPatterns = "/responseDemo1")
public class ResponseDemo1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //访问/responseDemo01会自动跳转到/responseDemo2资源
        resp.getWriter().write("hhh");
        //1.设置状态码为302
        //2.设置响应头location
//        resp.setStatus(302);
//        resp.setHeader("location", "/tomcat/responseDemo2");
        //等效于下面这个
        String contextPath = req.getContextPath();//动态获取虚目录

        resp.sendRedirect(contextPath + "/responseDemo2");
        System.out.println("demo1被访问了");
    }
}
