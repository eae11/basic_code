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
@WebServlet(urlPatterns = "/CookieDemo4")
public class CookieDemo4 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //创建Cookie对象
        Cookie cookie = new Cookie("msg", "setMaxAge");
        //设置Cookie的存活时间
        //cookie.setMaxAge(30);//将cookie持久化到硬盘,30秒后会自动删除文件
        //cookie.setMaxAge(-1);//负值浏览器退出就删除
        cookie.setMaxAge(0);//直接删除删除
        //发生Cookie
        response.addCookie(cookie);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
