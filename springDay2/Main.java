package com.spring.springDay2;

import com.spring.springDay2.beans.ProjectConfig;
import com.spring.springDay2.beans.Vehicle;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Vehicle vehicle = context.getBean(Vehicle.class);

        System.out.println("Component Vehicle name from spring context is: " + vehicle.getName());

        vehicle.printHello();
        context.close();
    }
}