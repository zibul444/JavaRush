package com.javarush.task.task09.task0906;

/* 
Логирование стек трейса
*/

public class Solution {
    public static void main(String[] args) {
        log("In main method");
    }

    public static void log(String s) {
//        Solution s1 = new Solution();
//        System.out.println(s1.getClass().getName() + ": "  +  " : " + s);

        Throwable t = new Throwable();
        StackTraceElement trace[] = t.getStackTrace();

        // Глубина стэка должна быть больше 1-го, поскольку интересующий
        // нас элемент стэка находится под индексом 1 массива элементов
        // Элемент с индексом 0 - это текущий метод, т.е. log
        if (trace.length > 1) {
            StackTraceElement element = trace[1];
            System.out.format("%s: %s: %s", element.getClassName(), element.getMethodName(), s);
        }
        else
            System.out.format("[no info] %s", s);
    }
        //напишите тут ваш код

}
