package com.javatutor.functionalinterface.lambda;

@FunctionalInterface
public interface AdditionLambda<T,S,R> {

    R addition(T t, S s);
}


