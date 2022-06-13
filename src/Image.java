import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;


public class Image {
    public static void main(String[] args) throws Exception {
        File file = new File("C:\\Users\\Eliyahu toronto\\Dropbox\\PC\\Downloads\\images\\newImage.png");
        BufferedImage image = ImageIO.read(file);
        if (file.exists()) {
            System.out.println("OL");
        }
        for (int x = 0; x < image.getWidth(); x++) {
            for (int y = 0; y < image.getHeight(); y++) {
                int pixel = image.getRGB(x, y);
               Color color = new Color(pixel);
                int red = color.getRed();
                int blue = color.getBlue();
                int green = color.getGreen();
                Color color1 = increaseContrast(color);
                image.setRGB(x,y,color1.getRGB());
            }
            File newImage = new File("C:\\Users\\Eliyahu toronto\\Dropbox\\PC\\Downloads\\images\\Image61.jpg");
            ImageIO.write(image, "png", newImage);

        }


    }

    public static int intenseColor(int original, double by) {
        original *= by;
        if (original > 255) {
            original = 255;
        }
        return original;
    }
    public static Color increaseContrast (Color color) {
        int red = color.getRed();
        int blue = color.getBlue();
        int green = color.getGreen();
        if(red > 128){
            red = intenseColor(red, 1.6);
        }else {
            red = intenseColor(red, 0.6);
        }
        if(blue > 128){
            blue = intenseColor(blue, 1.6);
        }else {
            blue = intenseColor(blue, 0.6);
        }
        if(green > 128){
            green = intenseColor(green, 1.6);
        }else {
            green = intenseColor(green, 0.6);
        }
        return color;
    }
}
