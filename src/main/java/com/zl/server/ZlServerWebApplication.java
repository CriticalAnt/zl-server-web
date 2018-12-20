package com.zl.server;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

@MapperScan(basePackages = "com.zl.server.mapper")
@SpringBootApplication
public class ZlServerWebApplication {

    public static void main(String[] args) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        SpringApplication.run(ZlServerWebApplication.class, args);
//        System.out.println(Md5Utils.getEncryptedPwd("password"));
//        System.out.println(Md5Utils.getEncryptedPwd("password"));
//        System.out.println(Md5Utils.getEncryptedPwd("password"));
//        System.out.println(Md5Utils.getEncryptedPwd("password"));

    }
}

