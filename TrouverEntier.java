public class TrouverEntier {
        final static int NOMBRE_A_TROUVER = 4;
        public static void main(String[] args) {
            int nombre = 0;
            int[] tableau = {2,4,3,4,6,2,4,6,8,0,2,4,2};
            for(int i = 0; i < tableau.length; i++) {
                if(NOMBRE_A_TROUVER == tableau[i]) {
                    nombre++;
                }   
            }
            System.out.println("Nombre de 4 dans le tableau : " + nombre);
        }
}
