package com.javarush.task.task17.task1710;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/*
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws IOException, ParseException {
        //start here - начни тут
        int index = 2;
        SimpleDateFormat formatIn = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat formatOut = new SimpleDateFormat("dd-MMM-yyyy");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String parser[] = reader.readLine().split(" ");

        if (parser[0].equalsIgnoreCase("-c")){

            if (parser[2].equalsIgnoreCase("м")){
                allPeople.add(Person.createMale(parser[1], formatIn.parse(parser[3])));
            }else if (parser[2].equalsIgnoreCase("ж")){
                allPeople.add(Person.createFemale(parser[1], formatIn.parse(parser[3])));
            }

            System.out.println(index);
            index++;
        }if (parser[0].equalsIgnoreCase("-u")){
            Sex sex = parser[3].equalsIgnoreCase("м") ? Sex.MALE : Sex.FEMALE;

            allPeople.get(Integer.parseInt(parser[1])).setName(parser[2]);
            allPeople.get(Integer.parseInt(parser[1])).setSex(sex);
            allPeople.get(Integer.parseInt(parser[1])).setBirthDay(formatIn.parse(parser[4]));

            System.out.println("Изменен: " + Integer.parseInt(parser[1]));
//            -u 1 ИвановаИвана ж 15/04/1990
        }if (parser[0].equalsIgnoreCase("-d")){
            allPeople.get(Integer.parseInt(parser[1])).setName(null);
            allPeople.get(Integer.parseInt(parser[1])).setSex(null);
            allPeople.get(Integer.parseInt(parser[1])).setBirthDay(null);

            System.out.println(parser[0]);
        }if (parser[0].equalsIgnoreCase("-i")){
            String s = "м";
            if (allPeople.get(Integer.parseInt(parser[1])).getSex().equals(Sex.FEMALE)){
                s = "ж";
            }

            System.out.println(allPeople.get(Integer.parseInt(parser[1])).getName() + " " +
                    s + " " +
                    formatOut.format(allPeople.get(Integer.parseInt(parser[1])).getBirthDay()));
        }
    }
}
