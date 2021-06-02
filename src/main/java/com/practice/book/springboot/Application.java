package com.practice.book.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing  // JPA Auditing 활성화
/*
    @SpringBootApplication로 인하여 스프링 부트의 자동 설정, 스프링 Bean 읽기와 생성 모두 자동 설정
    위 어노테이션 위치부터 설정을 읽기 때문에 항상 프로젝트 "최상단"에 위치
 */
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
