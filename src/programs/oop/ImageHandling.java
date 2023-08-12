package programs.oop;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;

public class ImageHandling {

    public static void main(String[] args) {

        //.jpg --> .png/.bmp/.gif
        try {
            //URL url = new URL("https://m.media-amazon.com/images/I/715eNm7P1hS._AC_UL320_.jpg"); //to read from online

            File file = new File("d:\\Users\\Sandeep\\Desktop\\MyPics\\2017.jpg");

            BufferedImage image = ImageIO.read(file);

            ImageIO.write(image,"jpg",new File("src/images/sandeep.jpg"));
            ImageIO.write(image,"gif",new File("src/images/sandeep.gif"));
            ImageIO.write(image,"png",new File("src/images/sandeep.png"));
            ImageIO.write(image,"bmp",new File("src/images/sandeep.bmp"));


        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
