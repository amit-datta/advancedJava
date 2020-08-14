package com.javatutor.functionalinterface.bifunction;

import com.javatutor.functionalinterface.custom.data.Employee;
import com.javatutor.functionalinterface.custom.data.EmployeeDB;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;

public class BiFunctionExample {

    static Map<Integer,Double> empMap = new HashMap<>();
    static BiFunction<Integer,Double, Map<Integer,Double>> biFunctionEmp = (empId,salary)->{



        Double increment = 0.0;

        if(salary<40000){
            increment = salary * 0.1;
            empMap.put(empId,increment);
        }


        return empMap;

    };

    public static void main(String[] args){

    List<Employee> employees = EmployeeDB.getEmployees();

    employees.forEach(emp->{
        biFunctionEmp.apply(emp.getEmployeeId(),emp.getSalary());
    });
    System.out.println("Employee Id and Salary increment:-");
    System.out.println(empMap);

    }
}
