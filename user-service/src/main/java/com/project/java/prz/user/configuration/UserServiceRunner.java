package com.project.java.prz.user.configuration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication(scanBasePackages = "com.project.java.prz.user")
@EnableJpaRepositories(basePackages = "com.project.java.prz.user.core.repository")
@EnableTransactionManagement
@EntityScan(basePackages = "com.project.java.prz.common.core.domain.security")
public class UserServiceRunner {

    public static void main(String[] args) {
        SpringApplication.run(UserServiceRunner.class, args);
    }

}
