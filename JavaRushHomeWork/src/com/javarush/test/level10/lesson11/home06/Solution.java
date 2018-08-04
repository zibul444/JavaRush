package com.javarush.test.level10.lesson11.home06;

/* Конструкторы класса Human
Напиши класс Human с 6 полями. Придумай и реализуй 10 различных конструкторов для него. Каждый конструктор должен иметь смысл.
*/

public class Solution
{
    public static void main(String[] args)
    {

    }

    public static class Human
    {
        public String name;
        public String surname;
        public String lastname;
        public int age;
        public String cityOfBirth;
        public int growth; //рост



        public Human(){

        }

        public Human(String name){
            this.name = name;
        }

        public Human (String name, String surname){
            this.name = name;
            this.surname = surname;
        }

        public Human (String name, String surname, String lastname){

            this.name = name;
            this.surname = surname;
            this.lastname = lastname;
        }

        public Human (String name, String surname, String lastname, int age){

            this.name = name;
            this.surname = surname;
            this.lastname = lastname;
            this.age = age;
        }

        public Human (String name, String surname, String lastname, int age, String cityOfBirth){

            this.name = name;
            this.surname = surname;
            this.lastname = lastname;
            this.age = age;
            this.cityOfBirth = cityOfBirth;
        }

        public Human (String name, String surname, String lastname, int age, String cityOfBirth, int growth){

            this.name = name;
            this.surname = surname;
            this.lastname = lastname;
            this.age = age;
            this.cityOfBirth = cityOfBirth;
            this.growth = growth;
        }

        public Human (String name, int age){

            this.name = name;
            this.age = age;
        }

        public Human (String name, int age, String cityOfBirth){

            this.name = name;
            this.age = age;
            this.cityOfBirth = cityOfBirth;
        }

        public Human (String name, int age, String cityOfBirth, int growth){

            this.name = name;
            this.age = age;
            this.cityOfBirth = cityOfBirth;
            this.growth = growth;
        }

        //напишите тут ваши переменные и конструкторы
    }
}
