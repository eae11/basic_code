package filter;

import jakarta.servlet.*;

import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter(urlPatterns = "/FilterDemo3")
public class FilterDemo3 implements Filter {
    /*
        在服务器启动后,会创建filter对象,然后调用init方法。只执行一次
         */
    @Override
    public void init(FilterConfig config) throws ServletException {
//        System.out.println("init...");
    }

    /*
       每一次请求被拦截资源时,会执行。
     */
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        System.out.println("doFilter....");
        filterChain.doFilter(request, response);
    }

    /*
    在服务器关闭后,filter对象被销毁。如果服务器正常关闭，则会执行destroy方法。只执行一次,用于释放资源
     */
    @Override
    public void destroy() {
        System.out.println("destroy");
    }


}
