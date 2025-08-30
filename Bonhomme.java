public class Bonhomme {
    public String nom;

    public Bonhomme(String n) {
        nom = n;
    }

    public static void main(String[] args) {
        Bonhomme b1 = new Bonhomme("John");
        Bonhomme b2 = new Bonhomme("Billy");

        System.out.println("b1.nom = " + b1.nom);
        System.out.println("b2.nom = " + b2.nom);
    }
}
