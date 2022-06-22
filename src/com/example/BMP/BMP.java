package com.example.BMP;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class BMP {
    public static void main(String args[])
            throws IOException
    {
        BufferedImage img = null;
        File bmp = null;



        try {
            bmp = new File(
                    "C:\\Users\\Bryon\\Documents\\GitHub\\Java Negative\\Java-Negative-Photo-Converter/sample.bmp");
            img = ImageIO.read(bmp);
        }
        catch (IOException e) {
            System.out.println(e);
        }

        int width = img.getWidth();
        int height = img.getHeight();


        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                int p = img.getRGB(x, y);
                int a = (p >> 24) & 0xff;
                int r = (p >> 16) & 0xff;
                int g = (p >> 8) & 0xff;
                int b = p & 0xff;


                r = 255 - r;
                g = 255 - g;
                b = 255 - b;


                p = (a << 24) | (r << 16) | (g << 8) | b;
                img.setRGB(x, y, p);
            }
        }

        try {
            bmp = new File(
                    "C:\\Users\\Bryon\\Documents\\GitHub\\Java Negative\\Java-Negative-Photo-Converter/sample1.bmp");
            ImageIO.write(img, "bmp", bmp);
        }
        catch (IOException e) {
            System.out.println(e);
        }
    }


        }

