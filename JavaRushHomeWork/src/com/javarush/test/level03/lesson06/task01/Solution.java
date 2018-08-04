package com.javarush.test.level03.lesson06.task01;

/* Мама мыла раму
Вывести на экран все возможные комбинации слов «Мама», «Мыла», «Раму».
Подсказка: их 6 штук. Каждую комбинацию вывести с новой строки. Слова не разделять. Пример:
МылаРамуМама
РамуМамаМыла
...
*/

import com.sun.xml.internal.fastinfoset.tools.FI_DOM_Or_XML_DOM_SAX_SAXEvent;

public class Solution
{
    public static void main(String[] args)
    {
        String text[] = new String[]{"Мама", "Мыла", "Раму"};

        System.out.println(text[0] + " " + text[1] + " " + text[2]);
        System.out.println(text[0] + " " + text[2] + " " + text[1]);
        System.out.println(text[1] + " " + text[0] + " " + text[2]);
        System.out.println(text[1] + " " + text[2] + " " + text[0]);
        System.out.println(text[2] + " " + text[1] + " " + text[0]);
        System.out.println(text[2] + " " + text[0] + " " + text[1]);

    }
}