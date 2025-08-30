public class Cercle {
    private double rayon;

    // Constructeur
    public Cercle(double rayon) {
        if (rayon < 0) {
            System.out.println ("Le rayon ne peut pas être négatif.");
            System.out.println("Fin du programme.");
            System.exit(1);
        }
        if (rayon == 0){
            System.out.println("Sans rayon il n'y a pas de cercle...");
            System.out.println("L'aire et le périmètre sont inexistants.");
            System.exit(1);
        }
        this.rayon = rayon;
    }

    // Méthode pour calculer l'aire du cercle
    public double aire() {
        return Math.PI * rayon * rayon;
    }

    // Méthode pour calculer le périmètre du cercle
    public double perimetre() {
        return 2 * Math.PI * rayon;
    }
}
