package ser.response;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/responseDemo4")
public class ResponseDemo4 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取流对象之前,设置流的默认编码:ISO-8859-1设置为:GBK
//        resp.setCharacterEncoding("GBK");
        //设置流的编码并告诉浏览器,服务器发送的消息体数据的编码。建议浏览器使用该编码解码
        resp.setHeader("content-type", "text/html;charset=GBK");
        //等效下面这句
//        resp.setContentType("text/html;charset=utf-8");
        PrintWriter writer = resp.getWriter();
        writer.write("你好");
    }
}
