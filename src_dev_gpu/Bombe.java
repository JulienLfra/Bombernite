package src;

public class Bombe {

    private static int i, j;
    private static int[] coord;


    public static void putBomb(String tableau[][]) {
        coord = rechercheJoueur();
        i = coord[0];
        j = coord[1];

            tableau[i][j] = "B";
            tableau[i][j + 1] = "J";
            System.out.println("La bombe est posée!");
        Launcher.initVal();
    }

    public static int[] rechercheJoueur() {
        boucle:
        for (i = 0; i < Tableau.tableau.length; i++) {
            for (j = 0; j < Tableau.tableau.length; j++) {
                if (Tableau.tableau[i][j].equals("J")) {
                    System.out.println("Le joueur se trouve aux coordonnées " + i + j);
                    break boucle;
                }
            }
        }
        return new int[]{i, j};
    }
}
