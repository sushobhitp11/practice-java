package com.java.collection.streamAPI;

public class EmployeeSalary {

    private String name;
    private Integer salary;

    public EmployeeSalary(String name, Integer salary){
        this.name = name;
        this.salary = salary;
    }
    public String getName(){
        return name;
    }
    public Integer getSalary(){
        return salary;
    }
}
