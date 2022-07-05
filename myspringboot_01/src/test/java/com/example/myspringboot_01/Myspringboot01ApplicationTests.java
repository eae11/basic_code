package com.example.myspringboot_01;

import com.example.myspringboot_01.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.context.WebApplicationContext;

@SpringBootTest
class Myspringboot01ApplicationTests {
    @Autowired
    WebApplicationContext applicationContext;

    @Test
    void contextLoads() {
        User bean = applicationContext.getBean(User.class);
        System.out.println(bean);
    }

}
