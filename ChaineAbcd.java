public class ChaineAbcd {
    public static void main(String[] args) {
        char[] lettres = {'a','b','c','d'};
        int total = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 4; k++) {
                    for (int l = 0; l < 4; l++) {
                        String chaine ="" + lettres[i] + lettres[j] + lettres[k] + lettres[l];

                        boolean valide = true;
                        boolean vuA = false, vuD = false;

                        for (int m = 0; m < 4; m++) {
                            char c = chaine.charAt(m);

                            if (c == 'b') {
                                if (m == 3 || chaine.charAt(m + 1) != 'a') {
                                    valide = false;
                                    break;
                                }
                            }

                            if (c == 'a') vuA = true;
                            if (c == 'd') vuD = true;
                            if (vuA && vuD) {
                                valide = false;
                                break;
                            }
                        }

                        if (valide) {
                            System.out.println(chaine);
                            total++;
                        }
                    }
                }
            }
        }

        System.out.println("Total: " + total);
    }
}