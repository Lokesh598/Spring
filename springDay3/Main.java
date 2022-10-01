package com.spring.springDay3;

import com.spring.springDay3.beans.Employee;
import com.spring.springDay3.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Employee e = context.getBean(Employee.class);

        System.out.println(e.getEid()+" "+e.getEname()+" "+e.getEsalary());

        context.close();
    }
}