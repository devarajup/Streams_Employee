package com.company;


public class Employee {

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    private String employeeId;
    private String name;
    private Integer salary;

    public Employee(String employeeId, String name, Integer salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.salary = salary;
    }

}
