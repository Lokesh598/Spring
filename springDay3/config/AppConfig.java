package com.spring.springDay3.config;


import com.spring.springDay3.beans.Employee;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public Employee employee() {
        return new Employee(101, "Lokesh Singh", 120000);
    }
}
