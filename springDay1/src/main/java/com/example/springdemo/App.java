package com.example.springdemo;

import com.example.springdemo.beans.Wisher;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext Container = new ClassPathXmlApplicationContext("C:\\Users\\lsingh\\programs-and-projects\\springdemo\\springdemo\\src\\main\\java\\beans.xml");
		Wisher w = Container.getBean("wsh1", Wisher.class);
		System.out.println(w.getMessage());
	}
}
