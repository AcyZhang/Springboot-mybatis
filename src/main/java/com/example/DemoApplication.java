package com.example;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubboConfig;
import com.alibaba.dubbo.config.spring.context.annotation.EnableDubboConfigBinding;
import com.alibaba.dubbo.config.spring.context.annotation.EnableDubboConfigBindings;
import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;


@CrossOrigin
@SpringBootApplication
@MapperScan("com.example.dao")
@EnableDubboConfiguration
public class DemoApplication {
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		System.out.println("Springboot启动成功");
	}
}
