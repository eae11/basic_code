package ser.request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(urlPatterns = "/requestDemo3")
public class requestDemo3 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String agent = request.getHeader("user-agent");
        if (agent.contains("Chrome")) {
            System.out.println("谷歌来了");
        }
        //获取请求头:referer
        String referer = request.getHeader("referer");
        System.out.println(referer);//http://localhost:8080/tomcat/login.html
        //防盗链
        if (referer != null) {
            if (referer.contains("/tomcat")) {
                //正常访问
                System.out.println("正常访问");
            } else {
                //盗链
                System.out.println("想看电影吗,来优酷");
            }
        }
    }
}
