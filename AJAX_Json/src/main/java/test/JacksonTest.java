package test;

import com.fasterxml.jackson.databind.ObjectMapper;
import domain.Person;
import org.junit.Test;

import java.io.File;
import java.io.FileWriter;
import java.util.*;

public class JacksonTest {

    //java对象转为JSON字符串
    @Test
    public void test1() throws Exception {
        //1.创建Person对象
        Person person = new Person();
        person.setName("张三");
        person.setAge(23);
        person.setGender("男");
        //2.创建Jackson核心对象  ObjectMapper
        ObjectMapper mapper = new ObjectMapper();
        //3.转换
        /*
            转换方法:
                writeValue(参数1,obj):
                    参数1:
                        File:将obj对象转换为JSON字符串,并保存到指定的文件中
                        writer:将obj对象转换为JSON字符串,并json数据填充到字符输出流中|
                        OutputStream:将obj对象转换为JSON字符串,并json数据填充到字节输出流中|
                writeValueAsString(obj):将对象转为json字符串
         */
        String json = mapper.writeValueAsString(person);
        //{"name":"张三","age":23,"gender":"男"}
        System.out.println(json);
        //writeValue,将数据写到d://a.txt文件中
        mapper.writeValue(new File("d://a.txt"), person);
        mapper.writeValue(new FileWriter("d://b.txt"), person);
    }

    @Test
    public void test2() throws Exception {
        //1.创建Person对象
        Person person = new Person();
        person.setName("张三");
        person.setAge(23);
        person.setGender("男");
        person.setBirthday(new Date());
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(person);
        System.out.println(json);//{"name":"张三","age":23,"gender":"男","birthday":"2021-04-18 05:17:11"}
    }

    @Test
    public void test3() throws Exception {
        //1.创建Person对象
        Person person1 = new Person();
        person1.setName("张三");
        person1.setAge(23);
        person1.setGender("男");
        person1.setBirthday(new Date());
        Person person2 = new Person();
        person2.setName("张三");
        person2.setAge(23);
        person2.setGender("男");
        person2.setBirthday(new Date());
        Person person3 = new Person();
        person3.setName("张三");
        person3.setAge(23);
        person3.setGender("男");
        person3.setBirthday(new Date());
        List<Person> list = new ArrayList<Person>();
        list.add(person1);
        list.add(person2);
        list.add(person3);
        //转换
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(list);
        System.out.println(json);
        //[{"name":"张三","age":23,"gender":"男","birthday":"2021-04-18 05:20:25"},{"name":"张三","age":23,"gender":"男","birthday":"2021-04-18 05:20:25"},{"name":"张三","age":23,"gender":"男","birthday":"2021-04-18 05:20:25"}]
    }

    @Test
    public void test4() throws Exception {
        //1.创建Person对象
        Map<String, Object> map = new HashMap<>();
        map.put("name", "李四");
        map.put("age", 23);
        map.put("gender", "男");
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(map);
        System.out.println(json);//{"gender":"男","name":"李四","age":23}
    }

    //演示JSON字符串转为Java对象
    @Test
    public void test5() throws Exception {
        //1.初始化JSON字符串
        String json = "{\"gender\":\"男\",\"name\":\"李四\",\"age\":23}";
        ObjectMapper mapper = new ObjectMapper();
        Person person = mapper.readValue(json, Person.class);
        System.out.println(person);

    }
}
