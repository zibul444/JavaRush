package tren;

import java.util.Calendar;
import java.util.Objects;

/**
 * Created by ab.cherkashin on 06.12.2016.
 */
public class Lalalasss{
    public static void main(String[] args) {


        String asdasd = "qwe";
        String zxc = "qwe";

        if (asdasd.equals(zxc)){
            System.out.println("equals()");
        }
        if (asdasd == zxc){
            System.out.println("==");
        }



//        String s = new String();
//        int i = 0;
//        while (true){
////            try {
//                s = s+"a";
////            }catch (Exception e){
////                break;
////            }
////            finally {
//                i++;
////            }
//        }
//        System.out.println(i + " = " + s);
//
//        Object asd = new Qweqweqwe();
//        Qwe qwe = new Qwe();
//        Qwe qwe1 = new Qweqwe();
//        Qwe qwe2 = new Qweqweqwe();
//        Qweqweqwe qweqweqwe = (Qweqweqwe) new Qwe();
//
////        asd
//        qwe.qwe();
//        qwe1.qwe();
//        qwe2.qwe();
//        qweqweqwe.qweqweqwe();
    }

    public static class Qwe {
        public String qwe(){
            return "qwe";
        }
    }
    public static class Qweqwe extends Qwe {
        public String qweqwe(){
            return "qweqwe";
        }
    }

    public static class Qweqweqwe extends Qweqwe {
        public String qweqweqwe(){
            return "qweqweqwe";
        }
    }

}
