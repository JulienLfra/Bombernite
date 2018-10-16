import javafx.scene.transform.Scale;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;

public class Entite extends JLabel {

    public ImageIcon image;

    public Entite(int typeEntity) {

        switch (typeEntity) {
            case 0:
                //Joueur
                try {
                    this.image = new ImageIcon(
                            ImageIO.read(
                                    new File("D:\\Documents\\Ecole CPE Lyon\\Génie Logiciel\\bombernite\\src\\44180458_1905504519538285_7881444801260814336_n.png")));
                } catch (Exception e) {
                    System.out.println("Ca marche pas");
                }
                break;

            case 1:
                try {
                    this.image = new ImageIcon(
                            ImageIO.read(
                                    new File("logo_ROG_.jpg")));
                } catch (Exception e) {
                    System.out.println("Ca marche pas");
                }
                break;
        }
                this.setIcon(image);

        this.setLayout(new BorderLayout());
        this.setVisible(true);
        this.setOpaque(true);
    }
}