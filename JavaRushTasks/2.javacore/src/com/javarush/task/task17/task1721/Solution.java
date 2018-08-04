package com.javarush.task.task17.task1721;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) throws CorruptedDataException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1;
        String fileName2;
        try {
            fileName1 = reader.readLine();
            fileName2 = reader.readLine();
            //C:\Users\ab.cherkashin\Downloads\qwe.doc
            reader = new BufferedReader( new FileReader(fileName1));
            allLines.add(reader.readLine());
            for (int i = 0; !allLines.get(i).equals(null); i++) {
                allLines.add(reader.readLine());
            }
            reader = new BufferedReader( new FileReader(fileName2));
            forRemoveLines.add(reader.readLine());
            for (int i = 0; !forRemoveLines.get(i).equals(null); i++) {
                forRemoveLines.add(reader.readLine());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        /*for (int i = 0; i < 15; i++) {
            allLines.add("" + i);
            if (i%2 == 0){
                forRemoveLines.add("" + i);
            }
        }
        new Solution().joinData();

        for (String s:forRemoveLines) {
            System.out.println("forRemoveLines: " + s);
        }
        for (String s :
                allLines) {
            System.out.println("allLines: " + s);
        }*/
    }

    public void joinData () throws CorruptedDataException {
        List<String> result = new ArrayList<>();

        try{
            for (int i = 0; i < forRemoveLines.size(); i++) {
                for (int j = 0; j < allLines.size(); j++) {
                    if (forRemoveLines.get(i).equals(allLines.get(j))){
                        result.add(allLines.get(j));
                    }
                }
            }
            if (result.containsAll(forRemoveLines)){
                allLines.removeAll(forRemoveLines);
            } else {
                allLines = new ArrayList<>();
                throw new CorruptedDataException();
            }
        } catch (CorruptedDataException e){

        }

    }
}
