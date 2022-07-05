package web.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;

@WebFilter(urlPatterns = "/*")
public class SensitiveWordsFilter implements Filter {
    private final List<String> list = new ArrayList<>();

    @Override
    public void init(FilterConfig config) throws ServletException {
        try {
            //获取文件真实路径
            ServletContext servletContext = config.getServletContext();
            String realPath = servletContext.getRealPath("/WEB-INF/classes/敏感词汇.txt");
            //读取文件
            BufferedReader br = new BufferedReader(new FileReader(realPath));
            //将文件的每一行数据添加到list中
            String line = null;
            while ((line = br.readLine()) != null) {
                list.add(line);
            }
            br.close();
            System.out.println(list);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        System.out.println("过滤器");
        //创建代理对象,增强getParameter方法
        ServletRequest proxy_request = (ServletRequest) Proxy.newProxyInstance(request.getClass().getClassLoader(), request.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                //增强getParameter方法
                if (method.getName().equals("getParameter")) {
                    //增强返回值
                    String value = (String) method.invoke(request, args);
                    if (value != null) {
                        for (String s : list) {
                            System.out.println(list);
                            if (value.contains(s)) {
                                value = value.replaceAll(s, "xxx");
                            }
                        }
                    }
                    return value;
                } else {
                    return method.invoke(request, args);
                }

            }
        });
        //放行
        filterChain.doFilter(proxy_request, response);
    }

    @Override
    public void destroy() {
    }


}
