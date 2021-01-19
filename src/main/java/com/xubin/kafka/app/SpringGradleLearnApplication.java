package com.xubin.kafka.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.xubin.kafka")
public class SpringGradleLearnApplication {


    public static void main(String[] args) {
		SpringApplication.run(SpringGradleLearnApplication.class, args);

	}

}
