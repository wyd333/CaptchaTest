import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 12569
 * Date: 2023-12-02
 * Time: 17:06
 */
public class Main {
    public static void main(String[] args) {
        int i = 5;
        while(i > 0) {
            CaptchaGenerator captchaGenerator = new CaptchaGenerator();
            BufferedImage image = captchaGenerator.getLoginCodeImage();
            // 保存图片到文件
            try {
                File output = new File("captcha" + i + ".png");
                ImageIO.write(image, "png", output);
            } catch (IOException e) {
                e.printStackTrace();
            }
            i--;
        }
    }

}
