package com.javatutor.functionalinterface.custom;

@FunctionalInterface
public interface Area<T,S,R> {

    R calculateArea(T a, S b);
}
