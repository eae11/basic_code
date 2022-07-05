package ser.cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
在服务器中的Servlet判断是否有一个名为lastTime的cookie
1．有:不是第一次访问
    1．响应数据:欢迎回来，您上次访问时间为:2018年6月10日11:50:20
    2.写回Cookie: lastTime=2018年6月10日11:50:01
2．没有:是第一次访问
    1．响应数据:您好，欢迎您首次访问
    2．写回Cookie: lastTime=2018年6月10日11:50:01

 */
@WebServlet(urlPatterns = "/CookieTest")
public class CookieTest extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //设置编码
        response.setHeader("content-type", "text/html;charset=utf-8");
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        String s = simpleDateFormat.format(date);
        boolean flag = false;
        String s1 = URLEncoder.encode(s, "utf-8");//Cookie里面value编码
        Cookie[] cookies = request.getCookies();
        if (cookies != null && cookies.length > 0) {
            for (Cookie c : cookies) {
                String name = c.getName();
                if ("lastTime".equals(name)) {
                    flag = true;
                    String value = c.getValue();
                    String value1 = URLDecoder.decode(value, "utf-8");//Cookie里面解码
                    response.getWriter().write("欢迎回来，您上次访问时间为:" + value1);
                    c.setValue(s1);
                    c.setMaxAge(60 * 60);
                    response.addCookie(c);
                    break;
                }
            }
        }
        if (cookies == null || cookies.length == 0 || flag == false) {
            Cookie cookie = new Cookie("lastTime", s1);
            cookie.setMaxAge(60 * 60);
            response.addCookie(cookie);
            String value = cookie.getValue();
            String value1 = URLDecoder.decode(value, "utf-8");
            response.getWriter().write("您好，欢迎您首次访问" + value1);
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
