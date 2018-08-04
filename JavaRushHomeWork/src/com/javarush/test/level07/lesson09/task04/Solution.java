package com.javarush.test.level07.lesson09.task04;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Буква «р» и буква «л»
1. Создай список слов, заполни его самостоятельно.
2. Метод fix должен:
2.1. удалять из списка строк все слова, содержащие букву «р»
2.2. удваивать все слова содержащие букву «л».
2.3. если слово содержит и букву «р» и букву «л», то оставить это слово без изменений.
2.4. с другими словами ничего не делать.
Пример:
роза
лира
лоза
Выходные данные:
лира
лоза
лоза
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<String>();
        list.add("роза");   //0
        list.add("лира");   //1     0
        list.add("лоза");   //2     1,2
        list.add("корень"); //3
        list.add("море");   //4
        list.add("лимон");  //5     3,4
        list.add("рор");    //6
        list.add("роза");   //7
        list.add("лира");   //8     5
        list.add("лоза");   //9     6,7
        list.add("лома");   //10    8,9
        list.add("роза");   //11
        list.add("мама");   //12    10
        list.add("зола");   //13    11,12
        list = fix(list);   //14

        for (String s : list) {
            System.out.println(s);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> list) {
        Boolean charR;
        Boolean charL;

        for (int i = 0; i < list.size(); i++){
            charR = list.get(i).contains("р");
            charL = list.get(i).contains("л");

            if (charR == true && charL == true){continue;}
            else if (charR == true){
                list.remove(i);
                i--;
                continue;
            }
            else if (charL == true){
                list.add(i,list.get(i));
                i++;
                continue;
            }
        }
        //напишите тут ваш код
        return list;
    }
}