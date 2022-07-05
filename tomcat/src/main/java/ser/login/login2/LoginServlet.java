package ser.login.login2;


import ser.dao.UserDao;
import ser.domain.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(urlPatterns = "/loginServlet2")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=utf-8");

        //获取请求参数
        String username = req.getParameter("username");//用户传过来的数据
        String password = req.getParameter("password");
        String checkCode = req.getParameter("checkCode");
        HttpSession session = req.getSession();
        String checkCode_session = (String) session.getAttribute("checkCode_session");
        session.removeAttribute("checkCode_session");
        //判断验证码是否正确
        if (checkCode_session != null && checkCode_session.equalsIgnoreCase(checkCode)) {
            //判断用户名和密码是否一致
            User loginuser = new User();
            loginuser.setUsername(username);
            loginuser.setPassword(password);
            User user = new UserDao().login(loginuser);
            if (user == null) {
                //登录失败
                req.setAttribute("login_error", "用户名或密码错误");
                req.getRequestDispatcher("/login.jsp").forward(req, resp);
            } else {
                //登录成功
                //存储数据
                session.setAttribute("user", user);
                //转发
                String contextPath = req.getContextPath();//动态获取虚目录
                resp.sendRedirect(contextPath + "/success.jsp");
            }
        } else {
            //验证码不一致
            req.setAttribute("cc_error", "验证码错误");
            req.getRequestDispatcher("/login.jsp").forward(req, resp);
        }
    }
}
