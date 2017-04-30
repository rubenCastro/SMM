/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sm.jaci.image;

import java.awt.image.BufferedImage;

/**
 *
 * @author jacortes
 */
public class SepiaOP extends sm.image.BufferedImageOpAdapter {

    public SepiaOP() {
    }

    @Override
    public BufferedImage filter(BufferedImage src, BufferedImage dest) {
        if (src == null) {
            throw new NullPointerException("src image is null");
        }
        if (dest == null) {
            dest = createCompatibleDestImage(src, null);
        }
        int pixel[];
        for (int x = 0; x < src.getWidth(); x++) {
            for (int y = 0; y < src.getHeight(); y++) {
                pixel = src.getRaster().getPixel(x, y, new int[3]);
                pixel[0] = (int) Math.min(255, 0.393 * pixel[0] + 0.769 * pixel[1] + 0.189 * pixel[2]);
                pixel[1] = (int) Math.min(255, 0.349 * pixel[0] + 0.686 * pixel[1] + 0.168 * pixel[2]);
                pixel[2] = (int) Math.min(255, 0.272 * pixel[0] + 0.534 * pixel[1] + 0.131 * pixel[2]);
                dest.getRaster().setPixel(x, y, pixel);
            }
        }
        return dest;
    }
}
/*
sepiaR = min(255 , 0.393·R + 0.769·G + 0.189·B)
sepiaG = min(255, 0.349·R + 0.686·G + 0.168·B)
sepiaB = min(255, 0.272·R + 0.534·G + 0.131·B)
 */
