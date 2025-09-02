public class SommeFiltree {
    public static void main(String[] args) {
        int somme = 0;
        for (int n = 1; n <= 10000; n++) {
            int centaines = (n / 100) % 10;
            if (n % 3 != 0 && centaines != 2 && centaines != 3) {
                somme += n;
            }
        }
        System.out.println("La somme est : " + somme);
    }
}
