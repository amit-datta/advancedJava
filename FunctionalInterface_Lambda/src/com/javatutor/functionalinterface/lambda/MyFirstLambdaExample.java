package com.javatutor.functionalinterface.lambda;

import java.util.function.BiFunction;
import java.util.function.Consumer;

public class MyFirstLambdaExample {

    public static void main(String[] args)
    {
        System.out.println("Addition of 3 and 4 is "+addition(3,4));

        System.out.println("Addition of 3 and 4 using lambda is "+addition_Lambda.apply(3,4));

        System.out.println("Addition of 3 and 4 using lambda by declared functional interface is "+additionLambda.addition(3,4));



    }

    static int addition(int a, int b)
    {
        return a+b;
    }

    static BiFunction<Integer,Integer,Integer> addition_Lambda = (a,b) -> {
        return a+b;
    };

    static AdditionLambda<Integer,Integer,Integer> additionLambda = (a,b) -> {
        return a + b;
    };
}
