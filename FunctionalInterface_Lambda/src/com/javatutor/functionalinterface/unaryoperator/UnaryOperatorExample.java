package com.javatutor.functionalinterface.unaryoperator;

import java.util.function.UnaryOperator;

public class UnaryOperatorExample {

    public static void main(String[] args)
    {
        UnaryOperator<String> unaryOperatorStr = (str) -> str.concat(" Unary Operator");

        System.out.println(unaryOperatorStr.apply("Java8"));

    }
}
