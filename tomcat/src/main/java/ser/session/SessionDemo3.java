package ser.session;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet(urlPatterns = "/sessionDemo3")
public class SessionDemo3 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        String id = session.getId();
        System.out.println(session);
        System.out.println(id);
        Cookie cookie = new Cookie("JSESSIONID", session.getId());
        cookie.setMaxAge(30 * 30);
        response.addCookie(cookie);
        //1.获取session
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
