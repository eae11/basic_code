package filter;

import jakarta.servlet.*;

import java.io.IOException;

//浏览器直接请求资源时,该过滤器会被执行
//@WebFilter(urlPatterns = "/index.jsp", dispatcherTypes = DispatcherType.REQUEST)默认值
//只有转发访问index.jsp时,该过滤器才会被执行
//@WebFilter(urlPatterns = "/index.jsp", dispatcherTypes = {DispatcherType.FORWARD})
//览器直接请求资源时或发访问index.jsp时该过滤器才会被执行
//@WebFilter(urlPatterns = "/index.jsp", dispatcherTypes = {DispatcherType.FORWARD, DispatcherType.REQUEST})
//@WebFilter(urlPatterns = "/*", dispatcherTypes = {DispatcherType.FORWARD, DispatcherType.REQUEST})
public class FilterDemo5 implements Filter {
    @Override
    public void init(FilterConfig config) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        System.out.println("FilterDemo5...");
        filterChain.doFilter(request, response);
    }

    @Override
    public void destroy() {
    }


}
