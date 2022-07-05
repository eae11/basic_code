package web.servlet;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

/*

 */
@WebServlet(urlPatterns = "/checkCodeServlet")
public class CheckCodeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //创建一对象,在内存中画图(验证码图片对象)
        int width = 100;
        int height = 50;
        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        //美化图片
        Graphics g = image.getGraphics();//画笔对象
        //填充背景色
        g.setColor(Color.PINK);
        g.fillRect(0, 0, width, height);
        //画边框
        g.setColor(Color.blue);
        g.drawRect(0, 0, width - 1, height - 1);
        String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder sb = new StringBuilder();
        //生成随机角标
        Random random = new Random();
        for (int i = 1; i <= 4; i++) {
            int index = random.nextInt(str.length());
            //获取字符
            char c = str.charAt(index);
            sb.append(c);
            //写验证码
            g.drawString(c + "", width / 5 * i, height / 2);
        }
        String s = sb.toString();
        HttpSession session = req.getSession();
        session.setAttribute("checkCode_server", s);
        //画干扰线
        g.setColor(Color.GREEN);
        //随机生成坐标点
        for (int i = 0; i < 7; i++) {
            int x1 = random.nextInt(width);
            int x2 = random.nextInt(width);
            int y1 = random.nextInt(height);
            int y2 = random.nextInt(height);
            g.drawLine(x1, x2, y1, y2);
        }

        //将图片输出到展示页面
        ImageIO.write(image, "jpg", resp.getOutputStream());
    }
}
