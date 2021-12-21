
import java.awt.Image;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author Admin
 */
public class Startsc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Splash sp = new Splash();
        sp.setVisible(true);

        Image img;
        try {

            img = ImageIO.read(sp.getClass().getResource("abc.gif"));

        } catch (IOException ex) {

            ex.printStackTrace();
        }

        try {
            for (int i = 0; i <= 100; i++) {
                Thread.sleep(20);
                sp.lbl.setText(Integer.toString(i) + "%");
                sp.jpb.setValue(i);

                if (i == 100) {
                    login object = new login();
                    object.setVisible(true);

                    sp.setVisible(false);

                }
            }

        } catch (Exception e) {

        }

    }

}
