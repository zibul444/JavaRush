package com.javarush.test.level10.lesson11.home04;

/* Большая зарплата
Вывести на экран надпись «Я не хочу изучать Java, я хочу большую зарплату» 40 раз по образцу.
Образец:
Я не хочу изучать Java, я хочу большую зарплату
 не хочу изучать Java, я хочу большую зарплату
не хочу изучать Java, я хочу большую зарплату
е хочу изучать Java, я хочу большую зарплату
 хочу изучать Java, я хочу большую зарплату
хочу изучать Java, я хочу большую зарплату
…
*/

public class Solution
{
    public static void main(String[] args)
    {
        String s = "Я не хочу изучать Java, я хочу большую зарплату";

        for (int i = 0; i < 40; i++){
            if (i<s.length())
            System.out.println(s.substring(i));
            else
                System.out.println(s.substring(i-s.length()));
        }


//        char[] masiv = s.toCharArray();
//        for (int i = -1; i < masiv.length; i++) {
//            for (int y = i + 1; y < masiv.length; y++)
//            {
//                System.out.print(masiv[y]);
//            }
//            System.out.println();
//        }
        //напишите тут ваш код
    }

}
