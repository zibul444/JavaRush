import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by ab.cherkashin on 15.03.2017.
 */

public class Lalalas {
    public static String[] getFilesList(File fl) {

        String[] listFiles = fl.list();

        for (int i = 0; i < listFiles.length; i++) {
        }
        return listFiles;
    }

    public static void main(String[] args) {

//        File fl =
//
//        File destFolder = new File("output"); // это папка, в которую будем перемещать
//        File[] files = fl.listFiles(); // получаем непосредственно файлы, не просто имена
//        for (File file : files) {
//            if (file.getName().indexOf(inpFilterName) != -1) {
//                file.renameTo(new File(destFolder, file.getName()));
//            }
//        }
    }


}