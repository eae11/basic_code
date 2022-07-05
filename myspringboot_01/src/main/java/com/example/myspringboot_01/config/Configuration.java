package com.example.myspringboot_01.config;

import com.example.myspringboot_01.model.User;

@org.springframework.context.annotation.Configuration
public class Configuration {
    //@ConditionalOnProperty("user.name")
    //@Bean
    User user01() {
        return new User("zhangsan", 15);
    }

}
