package com.revengemission.sso.oauth2.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
*
* https://github.com/eugenp/tutorials/tree/master/spring-security-sso
*
*
* https://projects.spring.io/spring-security-oauth/docs/oauth2.html
* */
@SpringBootApplication
public class SSOServertApplication {

    public static void main(String[] args) {
        SpringApplication.run(SSOServertApplication.class, args);
    }
}
