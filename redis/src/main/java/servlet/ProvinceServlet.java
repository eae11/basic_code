package java.servlet;

import service.ProvinceService;
import service.impl.ProvinceServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/provinceServlet")
public class ProvinceServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("application/json;charset=utf-8");
        //1.调用service查询
//        ProvinceService service = new ProvinceServiceImpl();
//        List<Province> list = service.findAll();
//        //序列化list为json
//        ObjectMapper mapper = new ObjectMapper();
//        String json = mapper.writeValueAsString(list);
        // mapper.writeValue(response.getWriter(), list);

        ProvinceService service = new ProvinceServiceImpl();
        String json = service.findAllJson();
        System.out.println(json);
        //响应结果
        response.getWriter().write(json);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
