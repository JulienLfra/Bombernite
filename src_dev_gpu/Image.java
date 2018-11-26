package src;

import javax.swing.*;
import java.awt.*;

public class Image extends JFrame {

    ImageIcon image;
    JLabel jLabel;

    public JLabel createImage(String typeEntite) {

        switch (typeEntite) {
            case "JD":
                this.image = new ImageIcon("src/JoueurFace.gif");
                this.jLabel = new JLabel(this.image);
                this.jLabel.setSize(this.image.getIconWidth(), this.image.getIconHeight());
                return this.jLabel;

            case "JU":
                this.image = new ImageIcon("src/JoueurDos.gif");
                this.jLabel = new JLabel(this.image);
                this.jLabel.setSize(this.image.getIconWidth(), this.image.getIconHeight());
                return this.jLabel;

            case "JR":
                this.image = new ImageIcon("src/JoueurProfilDroit.gif");
                this.jLabel = new JLabel(this.image);
                this.jLabel.setSize(this.image.getIconWidth(), this.image.getIconHeight());
                return this.jLabel;

            case "JL":
                this.image = new ImageIcon("src/JoueurProfilGauche.gif");
                this.jLabel = new JLabel(this.image);
                this.jLabel.setSize(this.image.getIconWidth(), this.image.getIconHeight());
                return this.jLabel;

            case "B":
                this.image = new ImageIcon("src/Brique.gif");
                this.jLabel = new JLabel(this.image);
                this.jLabel.setSize(this.image.getIconWidth(), this.image.getIconHeight());
                return this.jLabel;

            case "Bomb":
                this.image = new ImageIcon("src/Bombe0.gif");
                this.jLabel = new JLabel(this.image);
                this.jLabel.setSize(this.image.getIconWidth(), this.image.getIconHeight());
                return this.jLabel;

            case "Monster":
                this.image = new ImageIcon("src/Monstre.gif");
                this.jLabel = new JLabel(this.image);
                this.jLabel.setSize(this.image.getIconWidth(), this.image.getIconHeight());
                return this.jLabel;

            case "M":
                this.image = new ImageIcon("src/Mur.gif");
                this.jLabel = new JLabel(this.image);
                this.jLabel.setSize(this.image.getIconWidth(), this.image.getIconHeight());
                return this.jLabel;

            default:
                this.image = new ImageIcon("src/Vide.gif");
                this.jLabel = new JLabel(this.image);
                this.jLabel.setSize(this.image.getIconWidth(), this.image.getIconHeight());
                return this.jLabel;
        }
    }
}
