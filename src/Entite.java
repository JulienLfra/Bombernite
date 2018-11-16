import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;

public class Entite extends JLabel {

    public ImageIcon image;

    public Entite(String type) {
        switch(type) {
            case "0" :
                try {
                    this.image = new ImageIcon(
                            ImageIO.read(
                                    new File("D:\\Documents\\Ecole CPE Lyon\\Génie Logiciel\\bombernite\\src\\vide.gif")));
                } catch (Exception e) {
                    System.out.println("Img error");
                }
                this.setIcon(image);
                break;
            case "1" :
                try {
                    this.image = new ImageIcon(
                            ImageIO.read(
                                    new File("D:\\Documents\\Ecole CPE Lyon\\Génie Logiciel\\bombernite\\src\\Bombe2.gif")));
                } catch (Exception e) {
                    System.out.println("Img error");
                }
                this.setIcon(image);
                break;
            case "2" :
                try {
                    this.image = new ImageIcon(
                            ImageIO.read(
                                    new File("D:\\Documents\\Ecole CPE Lyon\\Génie Logiciel\\bombernite\\src\\Deflagration_Vert.gif")));
                } catch (Exception e) {
                    System.out.println("Img error");
                }
                this.setIcon(image);
                break;
            case "3" :
                try {
                    this.image = new ImageIcon(
                            ImageIO.read(
                                    new File("D:\\Documents\\Ecole CPE Lyon\\Génie Logiciel\\bombernite\\src\\storm.gif")));
                } catch (Exception e) {
                    System.out.println("Img error");
                }
                this.setIcon(image);
                break;
            case "4" :
                try {
                    this.image = new ImageIcon(
                            ImageIO.read(
                                    new File("D:\\Documents\\Ecole CPE Lyon\\Génie Logiciel\\bombernite\\src\\bonnus.gif")));
                } catch (Exception e) {
                    System.out.println("Img error");
                }
                this.setIcon(image);
                break;
            case "E" :
                try {
                    this.image = new ImageIcon(
                            ImageIO.read(
                                    new File("D:\\Documents\\Ecole CPE Lyon\\Génie Logiciel\\bombernite\\src\\Monstre.gif")));
                } catch (Exception e) {
                    System.out.println("Img error");
                }
                this.setIcon(image);
                break;
            case "J" :
                try {
                    this.image = new ImageIcon(
                            ImageIO.read(
                                    new File("D:\\Documents\\Ecole CPE Lyon\\Génie Logiciel\\bombernite\\src\\JoueurFace.gif")));
                } catch (Exception e) {
                    System.out.println("Img error");
                }
                this.setIcon(image);
                break;
            case "X" :
                try {
                    this.image = new ImageIcon(
                            ImageIO.read(
                                    new File("D:\\Documents\\Ecole CPE Lyon\\Génie Logiciel\\bombernite\\src\\Mur.gif")));
                } catch (Exception e) {
                    System.out.println("Img error");
                }
                this.setIcon(image);
                break;
            case "B" :
                try {
                    this.image = new ImageIcon(
                            ImageIO.read(
                                    new File("D:\\Documents\\Ecole CPE Lyon\\Génie Logiciel\\bombernite\\src\\Brique.gif")));
                } catch (Exception e) {
                    System.out.println("Img error");
                }
                this.setIcon(image);
                break;
        }

        this.setLayout(new BorderLayout());
        this.setVisible(true);
        this.setOpaque(true);
    }
}