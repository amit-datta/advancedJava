package com.javatutor.functionalinterface.lambda;

import java.util.*;

public class ComparatorLambda {

   static Comparator<Integer> comparator  = new Comparator<Integer>() {
        @Override
        public int compare(Integer intVar1, Integer intVar2) {
            return intVar1.compareTo(intVar2);
        }
    };

   static Comparator<Integer> comparatorByLambda = (a,b) -> a.compareTo(b);

    public static void main(String[] args){

        System.out.println("Comparator without using lambda");
        System.out.println(comparator.compare(6,4));

        System.out.println("Comparator Result using lambda: "+comparatorByLambda.compare(6,4));


    }


}
