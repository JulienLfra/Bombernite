import javafx.scene.transform.Scale;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;

public class Entite extends JLabel {

    public ImageIcon image;

    public Entite() {
                try {
                    this.image = new ImageIcon(
                            ImageIO.read(
                                    new File("D:\\Documents\\Ecole CPE Lyon\\Génie Logiciel\\bombernite\\src\\vide.gif")));
                } catch (Exception e) {
                    System.out.println("Ca marche pas");
                }
                this.setIcon(image);

        this.setLayout(new BorderLayout());
        this.setVisible(true);
        this.setOpaque(true);
    }
}