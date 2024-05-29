package com.ll.dortdeveloping2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing // created_at, updated_at 자동 업데이트용
@SpringBootApplication
public class DortDeveloping2Application {

    public static void main(String[] args) {
        SpringApplication.run(DortDeveloping2Application.class, args);
    }

}
