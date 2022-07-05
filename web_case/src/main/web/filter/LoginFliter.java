package web.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@WebFilter(urlPatterns = "/*")
public class LoginFliter implements Filter {
    @Override
    public void init(FilterConfig config) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        //1.强转
        HttpServletRequest request2 = (HttpServletRequest) request;
        //2.获取资源请求的路径
        String uri = request2.getRequestURI();
        //3.判断是否包含登录相关资源路径,要注意排除css/js/图片/验证码等资源
        if (uri.contains("/login.jsp") || uri.contains("/loginServlet") || uri.contains("/css/") || uri.contains("/js/")
                || uri.contains("/fonts/") || uri.contains("/checkCodeServlet")) {
            //包含,用户就是想登录。放行
            filterChain.doFilter(request, response);
        } else {
            //不包含,需要验证用户是否登录
            //3.从获取session中获取user
            Object user = request2.getSession().getAttribute("user");
            if (user != null) {
                //登录了
                filterChain.doFilter(request, response);
            } else {
                //没有登录。跳转登录页面
                request2.setAttribute("login_msg", "您尚未登录,请登录");
                request2.getRequestDispatcher("/login.jsp").forward(request, response);
            }
        }
    }

    @Override
    public void destroy() {
    }


}
