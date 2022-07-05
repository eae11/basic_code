package ser.request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;
import java.util.Set;


@WebServlet(urlPatterns = "/requestDemo6")
public class requestDemo6 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //根据参数名称获取参数值
//        String username = request.getParameter("username");
//        System.out.println("post");
//        System.out.println(username);
        //根据参数名称获取参数值的数组
//        String[] hobby = request.getParameterValues("hobby");
//        for (String s : hobby) {
//            System.out.println(s);
//        }
        //获取所有请求的参数名称
//        Enumeration<String> parameterNames = request.getParameterNames();
//        while (parameterNames.hasMoreElements()) {
//            String name = parameterNames.nextElement();
//            String[] values = request.getParameterValues(name);
//            for (String value : values) {
//                System.out.println(name + "---" + value);
//            }
//        }
        //获取所有参赛的map集合
//        Map<String, String[]> map = request.getParameterMap();
//        Set<Map.Entry<String, String[]>> entries = map.entrySet();
//        for (Map.Entry<String, String[]> entry : entries) {
//            String key = entry.getKey();
//            String[] values = entry.getValue();
//            for (String value : values) {
//                System.out.println(key + "--" + value);
//            }
//        }
        Map<String, String[]> map = request.getParameterMap();
        Set<String> keySet = map.keySet();
        for (String key : keySet) {
            String[] values = map.get(key);
            for (String value : values) {
                System.out.println(key + "--" + value);
            }
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        String username = request.getParameter("username");
//        System.out.println("get");
//        System.out.println(username);
        this.doPost(request, response);
    }
}
