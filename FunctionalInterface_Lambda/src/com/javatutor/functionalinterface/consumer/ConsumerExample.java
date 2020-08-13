package com.javatutor.functionalinterface.consumer;

import com.javatutor.functionalinterface.custom.data.Employee;
import com.javatutor.functionalinterface.custom.data.EmployeeDB;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {

    static List<String> itAnalystList = new ArrayList<>();
    static Consumer<Employee> stringConsumer = (emp)->{
        if(emp.getDesignation().equals("IT_Analyst"))
            itAnalystList.add(emp.getName());

    };
    public static void main(String[] args){
        Consumer<String> nameConsumer = (name) -> System.out.println(name.toUpperCase()+" POTTER");
        Employee employee = new Employee("harry","IT_Manager",237765,89000,"M", Arrays.asList("ABC Retail", "ABC Insurance","XYZs Retail"));
        nameConsumer.accept(employee.getName());

        List<Employee> employees = EmployeeDB.getEmployees();

        employees.forEach(stringConsumer);

       System.out.println("List of IT Analysts:-\n");
        itAnalystList.forEach(name->{
            System.out.println("Employee Name: "+name+"\n");
        });



    }
}
