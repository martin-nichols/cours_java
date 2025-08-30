public class Variable {
    public int a = 2;

    public static void ajoute(Variable x) {
        x = new Variable();      // réaffectation locale → ne modifie pas l'objet original
        x.a = x.a + 1;
    }

    public int donne() {
        Variable x = new Variable(); // x.a = 2
        ajoute(x);                   // ajoute() crée un nouvel objet, mais ne touche pas x
        return x.a;                  // retourne 2
    }

    public static void main(String[] args) {
        Variable v = new Variable();
        int resultat = v.donne();
        System.out.println("Résultat = " + resultat); // Affiche : Résultat = 2
    }
}
