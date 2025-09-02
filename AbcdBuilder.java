public class AbcdBuilder {
    public static void main(String[] args) {
        char[] lettres = {'a','b','c','d'};
        int total = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 4; k++) {
                    for (int l = 0; l < 4; l++) {

                        // Construction avec StringBuilder
                        StringBuilder sb = new StringBuilder();
                        sb.append(lettres[i]);
                        sb.append(lettres[j]);
                        sb.append(lettres[k]);
                        sb.append(lettres[l]);
                        String chaine = sb.toString();

                        boolean valide = true;
                        boolean vuA = false, vuD = false;

                        for (int m = 0; m < 4; m++) {
                            char c = chaine.charAt(m);

                            // Règle b→a
                            if (c == 'b') {
                                if (m == 3 || chaine.charAt(m + 1) != 'a') {
                                    valide = false;
                                    break;
                                }
                            }

                            // Règle a+d
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
