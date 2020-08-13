package com.javatutor.functionalinterface.custom.data;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

public class EmployeeDB {



    public static List<Employee> getEmployees(){


        Employee employee1 = new Employee("John","IT_Analyst",237890,31000,"M",Arrays.asList("X Retail", "Y Insurance","C Retail"));
        Employee employee2 = new Employee("Brian","IT_Analyst",233789,51000,"M",Arrays.asList("X1 Retail", "Y1 Insurance","C1 Retail"));
        Employee employee3 = new Employee("Emily","IT_Associate",234562,72000,"F",Arrays.asList("X1E Retail", "Y1E Insurance","C1E Retail"));

        Employee employee4 = new Employee("Sophia","IT_Manager",235467,71000,"F",Arrays.asList("X1ES Retail", "Y1ES Insurance","C1ES Retail"));
        Employee employee5 = new Employee("James","IT_Manager",235656,67000,"M",Arrays.asList("X1EJ Retail", "Y1EJ Insurance","C1EJ Retail"));

        List<Employee> employees = Arrays.asList(employee1,employee2,employee3,employee4,employee5);


        return employees;
    }
}
