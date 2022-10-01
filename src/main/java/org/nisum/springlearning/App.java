package org.nisum.springlearning;


import org.nisum.springlearning.beans.Employee;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App {
    public static void main(String[] args) {
//        ClassPathXmlApplicationContext content = new ClassPathXmlApplicationContext("beans.xml");
//        ApplicationContext content =
        FileSystemXmlApplicationContext content = new FileSystemXmlApplicationContext("C:/Users/lsingh/Desktop/spring-framework/springframe1/src/main/java/beans.xml");
        Employee e1 = content.getBean("nisumEmployee",Employee.class);

        System.out.println(e1.getEid() +" "+e1.getName()+" "+e1.getSalary());
    }
}