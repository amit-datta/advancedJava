package com.javatutor.functionalinterface.lambda;

import com.javatutor.functionalinterface.custom.data.Employee;
import com.javatutor.functionalinterface.custom.data.EmployeeDB;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

import static com.javatutor.functionalinterface.custom.data.EmployeeDB.getEmployees;

public class CommonUsagesLambda {

    public static void main(String[] args)
    {
        List<String> cities = Arrays.asList("Delhi", "Kolkata", "Chennai", "Mumbai");

        System.out.println("Print name of cities without using lambda");
        for(int i=0;i<cities.size();i++){

            System.out.println(cities.get(i));
        }

        System.out.println("Print name of cities using lambda");
        cities.forEach((city)->{
            System.out.println(city);
        });

        System.out.println("Access HashMap using Lambda");

        Map<String,String> cityMap = new HashMap<>();

        cityMap.put("id","456329");
        cityMap.put("name","Tushar Sharma");
        cityMap.put("designation","Manager");

        cityMap.forEach((k,v)->{
            System.out.print("Key: "+k+"\t");
            System.out.print("Value: "+v+"\n");
        });


       System.out.println("How to use Lambda as function parameter. ");
       List<Employee> empList = EmployeeDB.getEmployees();
       Employee emp = EmployeeDB.getEmployees().get(0);
       String empName =  getEmployeeName(empVar->empVar.getName(),emp);
       String empDesignation =  getEmployeeName(empVar->empVar.getDesignation(),emp);

       System.out.println("Employee Name: "+empName);
       System.out.println("Employee Designation: "+empDesignation);

    }

    public static String getEmployeeName(Function<Employee,String> getEmpInfoFn,Employee emp){

       return getEmpInfoFn.apply(emp);
    }
}
