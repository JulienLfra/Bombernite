package src;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Tableau {

    public static JPanel jPanel;

    public static String[][] tableau = {
            {"M","M","M","M","M","M","M","M","M","M","M","M","M"},
            {"M","JD","0","0","0","0","0","0","0","0","0","Monster","M"},
            {"M","0","M","0","M","0","M","0","M","0","M","0","M"},
            {"M","0","0","0","0","0","0","0","0","0","0","0","M"},
            {"M","0","M","0","M","0","M","0","M","0","M","0","M"},
            {"M","0","0","0","0","0","0","0","0","0","0","0","M"},
            {"M","0","M","Bomb","M","Bomb","M","0","M","0","M","0","M"},
            {"M","0","0","0","0","0","0","0","0","0","0","0","M"},
            {"M","0","M","0","M","0","M","0","M","0","M","0","M"},
            {"M","0","0","0","0","0","0","0","0","0","0","0","M"},
            {"M","0","M","0","M","Bomb","M","Bomb","M","0","M","0","M"},
            {"M","Monster","0","0","0","0","0","0","0","0","0","Monster","M"},
            {"M","M","M","M","M","M","M","M","M","M","M","M","M"},
    };
    private static int i,j;

    public static void afficherTableau() {
        ArrayList<JLabel> jLabelList = new ArrayList<>();
        jPanel = new JPanel();
        jPanel.setLayout(new GridLayout(13,13));
        for(i=0 ; i < tableau.length; i++) {
            for(j=0; j < tableau.length; j++) {
                Image image = new Image();
                JLabel jLabel = image.createImage(tableau[i][j]);
                jLabelList.add(jLabel);
                System.out.print(tableau[i][j]);
            }
            System.out.println();
        }
        for(JLabel jLabel : jLabelList) {
            jPanel.add(jLabel);
        }
        Launcher.jFrame.add(jPanel);
        Launcher.jFrame.setVisible(true);
        Launcher.initVal();
    }
}
