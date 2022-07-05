package filter;

import jakarta.servlet.*;

import java.io.IOException;

//@WebFilter(urlPatterns = "/index.jsp")//具体资源路径： /index.jsp   只有访问index.jsp资源时，过滤器才会被执行
//@WebFilter(urlPatterns = "/user/*")//拦截目录： /user/*	访问/user下的所有资源时，过滤器都会被执行
//@WebFilter(urlPatterns = "*.jsp")//后缀名拦截： *.jsp		访问所有后缀名为jsp资源时，过滤器都会被执行
public class FilterDemo4 implements Filter {
    @Override
    public void init(FilterConfig config) throws ServletException {
    }

    /*
       每一次请求被拦截资源时,会执行。
     */
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        System.out.println("FilterDemo4....");
        filterChain.doFilter(request, response);
    }

    /*
    在服务器关闭后,filter对象被销毁。如果服务器正常关闭，则会执行destroy方法。只执行一次,用于释放资源
     */
    @Override
    public void destroy() {
    }


}
