package src;

public class Deplacement {

    private static int i, j;
    private static int[] coord;

    public static void moveRight(String tableau[][]) {
        coord = rechercheJoueur();
        i = coord[0];
        j = coord[1];
        if (tableau[i][j + 1].equals("0")) {
            tableau[i][j] = "0";
            tableau[i][j + 1] = "JR";
        } else {
            tableau[i][j] = "JR";
            System.out.println("La case de droite est occupée");
        }
        Launcher.initVal();
    }

    public static void moveLeft(String tableau[][]) {
        coord = rechercheJoueur();
        i = coord[0];
        j = coord[1];
        if (tableau[i][j - 1].equals("0")) {
            tableau[i][j] = "0";
            tableau[i][j - 1] = "JL";
        } else {
            tableau[i][j] = "JL";
            System.out.println("La case de gauche est occupée");
        }
        Launcher.initVal();
    }

    public static void moveUp(String tableau[][]) {
        coord = rechercheJoueur();
        i = coord[0];
        j = coord[1];
        if (tableau[i - 1][j].equals("0")) {
            tableau[i][j] = "0";
            tableau[i - 1][j] = "JU";
        } else {
            tableau[i][j] = "JU";
            System.out.println("La case du haut est occupée");
        }
        Launcher.initVal();
    }

    public static void moveDown(String tableau[][]) {
        coord = rechercheJoueur();
        i = coord[0];
        j = coord[1];
        if (tableau[i + 1][j].equals("0")) {
            tableau[i][j] = "0";
            tableau[i + 1][j] = "JD";
        } else {
            tableau[i][j] = "JD";
            System.out.println("La case du bas est occupée");
        }
        Launcher.initVal();
    }

    public static int[] rechercheJoueur() {
        boucle:
        for (i = 0; i < Tableau.tableau.length; i++) {
            for (j = 0; j < Tableau.tableau.length; j++) {
                if (Tableau.tableau[i][j].startsWith("J")) {
                    System.out.println("Le joueur se trouve aux coordonnées " + i + j);
                    break boucle;
                }
            }
        }
        return new int[]{i, j};
    }
}
