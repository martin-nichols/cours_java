public class Etudiant {
    private int identifiant;   // attribut en "private" par bonne pratique

    // Constructeur
    public Etudiant(int id) {
        identifiant = id;
    }

    // Méthode qui retourne l'identifiant
    public int monIdentifiant() {
        return identifiant;
    }
}