package ser.cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/*
Cookie快速入门
 */
@WebServlet(urlPatterns = "/CookieDemo3")
public class CookieDemo3 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //创建Cookie对象
        Cookie cookie1 = new Cookie("msg", "hello");
        Cookie cookie2 = new Cookie("name", "zhangsan");
        //发生Cookie
        response.addCookie(cookie1);
        response.addCookie(cookie2);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
