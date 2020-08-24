package com.javatutor.functionalinterface.lambda;

public class RunnableLambda {

    //Define Runnable prior to Java8
    static Runnable runnable = new Runnable() {
        @Override
        public void run() {
            System.out.println("Runnable Task");
        }
    };

    //Define Runnable using Runnable
    static Runnable runnableLambda = () -> {
        System.out.println("Runnable Task 1");
        System.out.println("Runnable Task 2");
    };


    public static void main(String[] args){

        //Invocation of Runnable prior to Java8
        new Thread(runnable).start();

        //Invocation of Runnable Lambda
        new Thread(runnableLambda).start();

        //Define and invocation of Runnable using lambda in more precise way
        new Thread(() -> {
            System.out.println("Runnable Task 1");
            System.out.println("Runnable Task 2");
        }).start();

    }
}
