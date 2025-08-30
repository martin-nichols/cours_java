public class SwitchExpressionExample {
    public static void main(String[] args) {
        String mois = "Février";
        
        int jours = switch (mois) {
            case "Janvier", "Mars", "Mai", "Juillet", "Août", 
              "Octobre", "Décembre" -> 31;
            case "Avril", "Juin", "Septembre", "Novembre" -> 30;
            case "Février" -> {
                int annee = 2025; // Exemple d'année
                if (annee % 4 == 0 && (annee % 100 != 0 
                  || annee % 400 == 0)) {
                    yield 29; // Année bissextile
                } else {
                    yield 28;
                }
            }
            default -> 
              throw new IllegalArgumentException("Mois invalide : " + mois);
        };
        
        System.out.println("Le mois de " + mois + " a " + jours + " jours.");
    }
}
