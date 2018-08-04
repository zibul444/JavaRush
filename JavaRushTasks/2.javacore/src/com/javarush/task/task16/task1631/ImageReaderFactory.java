package com.javarush.task.task16.task1631;

import com.javarush.task.task16.task1631.common.*;

/**
 * Created by ab.cherkashin on 23.03.2017.
 */
public class ImageReaderFactory {
    public static ImageReader getImageReader(ImageTypes imageTypes) {
        if (imageTypes == ImageTypes.JPG){
            return new JpgReader();
        } else if (imageTypes == ImageTypes.BMP){
            return new BmpReader();
        } else if (imageTypes == ImageTypes.PNG){
            return new PngReader();
        } else {
            IllegalArgumentException e = new IllegalArgumentException();
            throw e;
        }
    }
}
