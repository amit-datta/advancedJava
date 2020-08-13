package com.javatutor.functionalinterface.custom.data;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Employee {
    private String name;
    private String designation;
    private int employeeId;
    private double salary;
    private String gender;
    private List<String> projectExecuted;



    public Employee(){

    }

    public Employee(String name,String designation, int employeeId, double salary, String gender, List<String> projectExecuted) {
        this.name = name;
        this.designation = designation;
        this.employeeId = employeeId;
        this.salary = salary;
        this.gender = gender;
        this.projectExecuted = projectExecuted;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public List<String> getProjectExecuted() {
        return projectExecuted;
    }

    public void setProjectExecuted(List<String> projectExecuted) {
        this.projectExecuted = projectExecuted;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", employeeId=" + employeeId +
                ", salary=" + salary +
                ", gender='" + gender + '\'' +
                ", projectExecuted=" + projectExecuted +
                '}';
    }
}
