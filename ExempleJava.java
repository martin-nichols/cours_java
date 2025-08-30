
public class ExempleJava {
    public static void modifierValeur(int nombre) {
        //nombre = nombre*10;
        System.out.println("Valeur dans la méthode : " + nombre);
    }

    public static void main(String[] args) {
        int valeur = 10;
        System.out.println("Avant appel : " + valeur);
        modifierValeur(valeur);
        System.out.println("Après appel : " + valeur);
    }
}
