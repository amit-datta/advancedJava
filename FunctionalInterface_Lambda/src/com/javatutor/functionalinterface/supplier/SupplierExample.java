package com.javatutor.functionalinterface.supplier;

import com.javatutor.functionalinterface.custom.data.Employee;

import java.util.Arrays;
import java.util.function.Supplier;

public class SupplierExample {

    static Supplier<String> helloWorld = () -> {
        return "Hello World";
    };

    static Supplier<Employee> employeeSupplier = ()->{
        return new Employee("Amit","IT_Architect",876908,76000,"M", Arrays.asList("JP Morgan", "AIG","RBS"));
    };

    public static void main(String[] args){

    String greeting = helloWorld.get();
    System.out.println("The greeting message: "+greeting);

    Employee emp = employeeSupplier.get();

    System.out.println("Employee is "+emp);

    }


}
