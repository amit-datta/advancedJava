package com.javatutor.functionalinterface.bipredicate;

import com.javatutor.functionalinterface.custom.data.Employee;
import com.javatutor.functionalinterface.custom.data.EmployeeDB;

import java.util.List;
import java.util.function.BiPredicate;

public class BiPredicateExample {

    static BiPredicate<String,Double> empSalTest = (gender,salary)->{
        if(salary>50000 && gender.equals("M"))
            return true;
        else
            return false;
    };

    public static void main(String[] args){

        List<Employee> employeeList = EmployeeDB.getEmployees();

        System.out.println("List of male employees having salary more than 50000.");
        employeeList.forEach(employee -> {
            if(empSalTest.test(employee.getGender(),employee.getSalary()))
            {
                System.out.println(employee.getName());
            }
        });

    }
}
