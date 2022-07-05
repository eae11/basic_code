package filter;

import jakarta.servlet.*;

import java.io.IOException;

//@WebFilter(urlPatterns = "/*")
public class FilterDemo2 implements Filter {
    @Override
    public void init(FilterConfig config) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        //对request对象请求消息增强
        System.out.println("filterDemo2执行了");
        //放行
        filterChain.doFilter(request, response);
        //对response对象的响应消息增强
        System.out.println("filterDemo2回来了");

    }

    @Override
    public void destroy() {
    }


}
