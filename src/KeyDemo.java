// 16/11/2018 - Guillaume Bozon
// Classe test récupérée permettant de gerer les touches du clavier du joueur
// Version : 1.0.0

import java.awt.*;
import java.awt.event.*;

public class KeyDemo extends Frame implements KeyListener
{
    public KeyDemo() {
       addKeyListener(this);                   // link the frame with KL

        // fermeture de la fenetre
        addWindowListener(new WindowAdapter(){public void windowClosing(WindowEvent e) {System.exit(0); }});
        setSize(300,300);
        setVisible(true);
    }


    @Override
    public void keyTyped(KeyEvent e) {

    }

    // Fonction permettant d'effectuer une action lors de la pression d'une touche
    @Override
    public void keyPressed(KeyEvent e) {
        int test = e.getKeyCode();
        System.out.println("Clavier : " + test);
        if(test == 68){
            System.out.println("direction est");
        }
    }

    // Fonction permettant d'effectuer une action lors du relachement d'une une touche
    @Override
    public void keyReleased(KeyEvent e) {

    }

    public static void main(String snrao[])
    {
        new KeyDemo();
    }
}