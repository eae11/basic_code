package filter;

import jakarta.servlet.*;

import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter(urlPatterns = "/*")
public class FilterDemo7 implements Filter {
    @Override
    public void init(FilterConfig config) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain) throws ServletException, IOException {
//        System.out.println("filterDemo7执行了");
//        filterChain.doFilter(request, response);
//        System.out.println("filterDemo7回来了");
    }

    @Override
    public void destroy() {
    }


}
