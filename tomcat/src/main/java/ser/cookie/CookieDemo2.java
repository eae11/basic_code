package ser.cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLDecoder;

/*
Cookie快速入门
 */
@WebServlet(urlPatterns = "/CookieDemo2")
public class CookieDemo2 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //获取Cookie
        Cookie[] cookies = request.getCookies();
        //遍历Cookie
        if (cookies != null) {
            for (Cookie c : cookies) {
                String name = c.getName();
                String value = URLDecoder.decode(c.getValue(), "utf-8");
                System.out.println(name + ">>>" + value);
            }
        }

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
