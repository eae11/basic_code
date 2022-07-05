package ser.request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/requestDemo1")
public class requestDemo1 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
/*
方法：
				1. 获取请求方式 ：GET
					* String getMethod()
				2. (*)获取虚拟目录：/day14
					* String getContextPath()
				3. 获取Servlet路径: /demo1
					* String getServletPath()
				4. 获取get方式请求参数：name=zhangsan
					* String getQueryString()
				5. (*)获取请求URI：/day14/demo1
					* String getRequestURI():		/day14/demo1
					* StringBuffer getRequestURL()  :http://localhost/day14/demo1

					* URL:统一资源定位符 ： http://localhost/day14/demo1	中华人民共和国
					* URI：统一资源标识符 : /day14/demo1					共和国

				6. 获取协议及版本：HTTP/1.1
					* String getProtocol()

				7. 获取客户机的IP地址：
					* String getRemoteAddr()
 */
        //http://localhost:8080/requestDemo1
        //1.获取请求方式:GET
        //String getMethod()
        String method = request.getMethod();
        System.out.println(method);//GET
        //2. (*)获取虚拟目录：/     (tomcat上设置的路径)
        //String getContextPath()
        String contextPath = request.getContextPath();
        System.out.println(contextPath);
        //3. 获取Servlet路径: /requestDemo1
        //String getServletPath()
        String servletPath = request.getServletPath();
        System.out.println(servletPath);//requestDemo1
        //4. 获取get方式请求参数：name=zhangsan
        //String getQueryString()
        String queryString = request.getQueryString();
        System.out.println(queryString);//user=hhh
        //5. (*)获取请求URI：/day14/demo1
        //String getRequestURI():
        //StringBuffer getRequestURL()
        String requestURI = request.getRequestURI();
        System.out.println(requestURI);// /requestDemo1
        StringBuffer requestURL = request.getRequestURL();
        System.out.println(requestURL);//http://localhost:8080/requestDemo1
        //6. 获取协议及版本：HTTP/1.1
        //String getProtocol()
        String protocol = request.getProtocol();
        System.out.println(protocol);//HTTP/1.1
        //7. 获取客户机的IP地址：
        //String getRemoteAddr()
        String remoteAddr = request.getRemoteAddr();
        System.out.println(remoteAddr);//0:0:0:0:0:0:0:1
    }
}
