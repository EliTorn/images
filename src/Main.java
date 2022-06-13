import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\Eliyahu toronto\\Dropbox\\PC\\Downloads\\images\\image.jpg");
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
                int average = (green+red+blue)/3;
                Color newColor = new Color(average,average,average);
                image.setRGB(x, y, newColor.getRGB());
            }

            File newImage = new File("C:\\Users\\Eliyahu toronto\\Dropbox\\PC\\Downloads\\images\\image90.png");
            ImageIO.write(image, "png", newImage);

        }
    }
}
