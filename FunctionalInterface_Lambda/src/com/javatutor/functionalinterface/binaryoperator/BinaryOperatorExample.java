package com.javatutor.functionalinterface.binaryoperator;

import java.util.function.BinaryOperator;

public class BinaryOperatorExample {

    public static void main(String[] args){

        BinaryOperator<Integer>  binaryOperatorAdd2No = (a,b) -> a + b;

        System.out.println(binaryOperatorAdd2No.apply(2,5));

    }
}
