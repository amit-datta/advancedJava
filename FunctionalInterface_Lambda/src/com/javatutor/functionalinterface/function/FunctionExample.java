package com.javatutor.functionalinterface.function;

import com.javatutor.functionalinterface.custom.data.Employee;
import com.javatutor.functionalinterface.custom.data.EmployeeDB;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class FunctionExample {

    // A function which will create a hashmap containing the employee salary against employee id
    // for the employees having more than 30000 salary.
    static Function<List<Employee>, Map<Integer,Double>> salaryGreaterThan30K = (employees) ->{

        Map<Integer,Double> empMap = new HashMap<>();

        employees.forEach(emp->{
            if(emp.getSalary()>30000)
                empMap.put(emp.getEmployeeId(),emp.getSalary());

        });

        return empMap;
    };

    public static void main(String[] args){
        //Accepting one string argument and also returning one string value
        Function<String,String> uppercaseFunction = (str)-> str.toUpperCase();

        System.out.println("The upper case conversion result : "+uppercaseFunction.apply("function"));

        Map<Integer,Double> empleeMap = salaryGreaterThan30K.apply(EmployeeDB.getEmployees());

        System.out.println("\nList of employees salary greater than 30000");
        empleeMap.forEach((key,value)->{

            System.out.print("\nEmployee Id: "+key+"\t");
            System.out.print("Employee Salary: "+value);
        });


    }
}
