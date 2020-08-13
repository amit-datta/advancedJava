package com.javatutor.functionalinterface.predicate;

import com.javatutor.functionalinterface.custom.data.Employee;
import com.javatutor.functionalinterface.custom.data.EmployeeDB;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {

    static Predicate<Employee> testGender = (emp) -> {
        if(emp.getGender().equals("F"))
            return true;
        else
            return false;
    };

    public static void main(String[] args){

        List<Employee> femaleList = new ArrayList<>();

        Predicate<Integer> evenNumbers = (n) -> {return n%2==0;};

        System.out.println("4 is an even number: "+evenNumbers.test(4));

        List<Employee> employeeList = EmployeeDB.getEmployees();

        employeeList.forEach(emp->{
            if(testGender.test(emp))
                femaleList.add(emp);
        });

        System.out.println("List of female employees:-");
        femaleList.forEach(employee -> {
            System.out.println(employee.getName()+"\n");

        });

    }
}
