package org.nisum.springlearning.beans;
import org.springframework.context.annotation.Bean;

//@Bean
public class Employee {
    private int eid;
    private String name;
    private double salary;

    public Employee() {}

    public Employee( int eid, String name, double salary ) {
        this.eid = eid; this.name = name;
        this.salary = salary;
    }

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
