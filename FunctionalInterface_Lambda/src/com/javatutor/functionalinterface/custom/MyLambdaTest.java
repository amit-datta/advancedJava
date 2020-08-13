package com.javatutor.functionalinterface.custom;

public class MyLambdaTest {

    static Area<Double, Double, Double> area = (a, b) ->(a*b);

    public static void main(String[] args){

        System.out.println("The total area is "+ area.calculateArea(1.1,1.1));

    }
}
