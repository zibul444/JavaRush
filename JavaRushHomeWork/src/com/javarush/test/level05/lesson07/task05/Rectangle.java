package com.javarush.test.level05.lesson07.task05;

/* Создать класс прямоугольник (Rectangle)
Создать класс прямоугольник (Rectangle). Его данными будут top, left, width, height (левая координата, верхняя,
ширина и высота). Создать для него как можно больше методов initialize(…)
Примеры:
-	заданы 4 параметра: left, top, width, height
-	ширина/высота не задана (оба равны 0)
-	высота не задана (равно ширине) создаём квадрат
-	создаём копию другого прямоугольника (он и передаётся в параметрах)
*/

public class Rectangle
{
protected static int left, top, width, height;

    public void initialize(int left, int top, int width, int height)
    {
        this.left = left;
        this.top = top;
        this.width = width;
        this.height = height;
    }

    public void initialize(int left, int top)
    {
        this.left = left;
        this.top = top;
    }
    public void initialize(int left, int top, int height)
    {
        this.left = left;
        this.top = top;
        this.height = height;
        this.width = height;
    }

    public void initialize(Rectangle lalala)
    {
        this.left = lalala.left;
        this.top = lalala.top;
        this.width = lalala.width;
        this.height = lalala.height;
    }


   public static void main(String[] args)
    {

//        System.out.println(1/0);
        System.out.println(1./0);
        System.out.println(1/0.);
        System.out.println(1./0.);
        System.out.println('\n'+'\r');




Rectangle pupuup = new Rectangle();

        pupuup.initialize(1,2,3,4);
        Rectangle lasdasd = new Rectangle();
        lasdasd.initialize(pupuup);
    }
}



