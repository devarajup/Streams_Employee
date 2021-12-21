package com.company;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("E1","ram",1400);
        Employee employee2 = new Employee("E2","deva",1500);
        Employee employee3 = new Employee("E3","raju",6000);
        Employee employee4 = new Employee("E4","king",1500);
        Employee employee5 = new Employee("E5","quick",1600);
        Employee employee6 = new Employee("E6","rani",8000);
        List<Employee> employeeList = Arrays.asList(employee1,employee2,employee3,employee4,employee5,employee6);
       /* for(Employee employee:employeeList){
            System.out.println(employee.getEmployeeId()+" "+employee.getName()+" "+employee.getSalary());
        }*/

        /*

      List<Employee>  emp = employeeList.stream().filter(employee -> employee.getSalary()>1500).map(e->{
           e.setName(e.getName()+"-dummy");
            return e;
        }).collect(Collectors.toList());
      emp.forEach(em->
              System.out.println(em.getEmployeeId()+" "+em.getName()+" "+em.getSalary())

        );*/

    }
}
