package com.spring.springDay2.beans;


import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Vehicle {
    private String name;

    public Vehicle() {}

    public Vehicle(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * what is @PostConstruct Annotation ?
     *  @PostConstruct is an annotation used on a method that needs to be executed after dependency
     *  injection is done to perform any initialization.
     *
     */
    @PostConstruct
    public void initialize() {
        this.name = "Honda";
    }

    /**
     * @predestroy annotation can be used on top of the method and spring will make sure to call this method
     * just before clearing and destroying the context.
     */
    @PreDestroy
    public void destroy() {
        System.out.println("Destroying Vehicle Beans");
    }

    public void printHello() {
        System.out.println("printing hello to the console");
    }
}
