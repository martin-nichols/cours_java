public class AfficheDeplacer {
    public static void main(String[] args) {
        int[] tableau = {11, 22, 33, 44};

        print(tableau);
        deplacerADroite(tableau);
        print(tableau);
    }

    private static void deplacerADroite(int[] tableau) {
        int last = tableau[tableau.length - 1];

        for (int i = tableau.length - 1; i > 0; i--) {
            tableau[i] = tableau[i - 1];
        }

        tableau[0] = last;
    }

    private static void print(int[] tableau) {

        for (int i = 0; i < tableau.length; i++) {
            System.out.print(tableau[i] + " ");
        }

        System.out.println();
    }

}