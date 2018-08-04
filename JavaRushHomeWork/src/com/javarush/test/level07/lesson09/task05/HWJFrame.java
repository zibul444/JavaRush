package com.javarush.test.level07.lesson09.task05;

import jdk.nashorn.internal.runtime.Source;

import javax.swing.*;

/**
 * Created by Михаил Алексеевич on 12.01.2016.
 */
public class HWJFrame {
    public static class HelloWorldJFrame extends JFrame {
        public static void main(String[] args){
            new HelloWorld();
        }
        { add(new JLabel("Hello world"));
            setSize(200,200);
            setVisible(true);
            setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        }
    }
}
