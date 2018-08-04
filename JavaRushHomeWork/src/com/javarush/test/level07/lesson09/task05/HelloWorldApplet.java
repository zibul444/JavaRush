package com.javarush.test.level07.lesson09.task05;


/**
 * Created by Михаил Алексеевич on 12.01.2016.
 */

import java.applet.Applet;

        import java.awt.Graphics;

public class HelloWorldApplet extends Applet{
    public void paint(Graphics g){
        g.drawString("Hello World",15,15);
    }
}