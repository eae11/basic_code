package ser.servletcontext;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/servletContextDemo5")
public class ServletContextDemo5 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletContext context = this.getServletContext();
        //获取文件的服务器路径
        String path = context.getRealPath("/b.txt");//web目录下资源访问
        System.out.println(path);
//        File file = new File(path);
        //WEB-INF里面的文件
        String path2 = context.getRealPath("/WEB-INF/c.txt");
        System.out.println(path2);
        //src下的文件也可以通过classloader来获取
        String path3 = context.getRealPath("/WEB-INF/classes/a.txt");
        System.out.println(path3);
    }
}
