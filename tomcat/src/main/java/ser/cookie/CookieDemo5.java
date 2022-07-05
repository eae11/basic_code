package ser.cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLEncoder;

/*
Cookie快速入门
 */
@WebServlet(urlPatterns = "/CookieDemo5")
public class CookieDemo5 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //创建Cookie对象
        Cookie cookie3 = new Cookie("msg", URLEncoder.encode("哈哈", "utf-8"));
        //设置path,让当前服务器下部署的所有项目共享Cookie信息
        cookie3.setPath("/");
        //发生Cookie
        response.addCookie(cookie3);
        this.getServletContext();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
