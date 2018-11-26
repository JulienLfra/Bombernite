package src;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Clavier {

    public static KeyListener listener = new KeyListener() {
        @Override
        public void keyTyped(KeyEvent e) {

        }

        @Override
        public void keyPressed(KeyEvent e) {
            switch (e.getKeyCode()) {
                case KeyEvent.VK_UP:
                    Deplacement.moveUp(Tableau.tableau);
                    Tableau.afficherTableau();
                    break;

                case KeyEvent.VK_LEFT:
                    Deplacement.moveLeft(Tableau.tableau);
                    Tableau.afficherTableau();
                    break;

                case KeyEvent.VK_RIGHT:
                    Deplacement.moveRight(Tableau.tableau);
                    Tableau.afficherTableau();
                    break;

                case KeyEvent.VK_DOWN:
                    Deplacement.moveDown(Tableau.tableau);
                    Tableau.afficherTableau();
                    break;

                case KeyEvent.VK_SPACE:
                    Bombe.putBomb(Tableau.tableau);
            }
        }

        @Override
        public void keyReleased(KeyEvent e) {

        }
    };
}
