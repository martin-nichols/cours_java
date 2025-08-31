public class SommeFiltree {
    public static void main(String[] args) {
        int somme = 0;
        int totalDesInclus = 0;
        for (int n = 100; n <= 199; n++) {
            int centaines = (n / 100) % 10;
            if (n % 3 != 0 && centaines != 2 && centaines != 3) {
                somme += n;
                totalDesInclus++;
            }
        }
        System.out.println("Total des nombres inclus : " + totalDesInclus);
        System.out.println("La somme est : " + somme);
    }
}
