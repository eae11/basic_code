package ser.login;

import org.apache.commons.beanutils.BeanUtils;
import ser.dao.UserDao;
import ser.domain.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

@WebServlet(urlPatterns = "/loginServlet")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=utf-8");
        //获取请求参数
//        String username = req.getParameter("username");//用户传过来的数据
//        String password = req.getParameter("password");
        //获取所有请求参数
        Map<String, String[]> parameterMap = req.getParameterMap();
        //创建User对象
        User loginuser = new User();
        //使用BeanUtils封装
        try {
            BeanUtils.populate(loginuser, parameterMap);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        User user = new UserDao().login(loginuser);//数据库查询后返回的数据
        if (user == null) {
            //登录失败
            req.getRequestDispatcher("/failServlet").forward(req, resp);
        } else {
            //登录成功
            //存储数据
            req.setAttribute("user", user);
            //转发
            req.getRequestDispatcher("/successServlet").forward(req, resp);
        }
    }
}
