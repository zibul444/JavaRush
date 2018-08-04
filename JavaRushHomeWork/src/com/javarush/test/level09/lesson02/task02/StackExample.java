package com.javarush.test.level09.lesson02.task02;

/**
 * Created by arm83 on 26.02.16.
 */
import java.util.Stack;
import java.util.EmptyStackException;
class StackExample {
    static void showpush() {
        StackTraceElement[] element = Thread.currentThread().getStackTrace();
        System.out.println(element[1].getMethodName());
        showpop();
    }
    static void showpop() {
        StackTraceElement[] element = Thread.currentThread().getStackTrace();
        System.out.println(element[1].getMethodName());
    }
    public static void main(String args[]) {

        try {
            showpush();
        }
        catch (EmptyStackException e) {
            System.out.println("empty stack");
        }
    }
}