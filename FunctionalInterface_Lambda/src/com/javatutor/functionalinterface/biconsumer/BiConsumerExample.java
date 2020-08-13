package com.javatutor.functionalinterface.biconsumer;

import com.javatutor.functionalinterface.custom.data.Employee;
import com.javatutor.functionalinterface.custom.data.EmployeeDB;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;

public class BiConsumerExample {



   static Map<String,List<String>> empProjects = new HashMap<>();

   static BiConsumer<String, List<String>> empBiloyeeConsumer = (name,projects)->{
       empProjects.put(name,projects);
    };

    public static void main(String[] args){

        BiConsumer<String,String> strConsumer = (x,y)->{
            System.out.println("x: "+x+" y:"+y);
        };

        strConsumer.accept("Sun", "Moon");

        List<Employee> employeeList = EmployeeDB.getEmployees();
        employeeList.forEach(emp->{

            empBiloyeeConsumer.accept(emp.getName(),emp.getProjectExecuted());

        });

        System.out.println("Employee and corresponding projects are given below.\n");
        System.out.println(empProjects);


    }
}
