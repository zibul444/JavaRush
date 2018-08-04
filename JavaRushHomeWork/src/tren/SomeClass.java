package tren;

import java.io.File;

/**
 * Created by ab.cherkashin on 07.10.2016.
 */

public class SomeClass {
    private int weight=0;
    public int getWeight() {
        return weight;
    }
    void setWeight(int weight) throws Exception {
//        throw  new Exception();
    }

    public static void main(String[] args) throws Exception {
        SomeClass s = new SomeClass();
        s.setWeight(3);

        int[] in = new int[3];
        for (int i = 0; i < 5; i++) {
            in[i] = i;
        }
    }
}