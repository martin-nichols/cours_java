import java.io.*;

public class ImpactBoutismeManuel {
    public static void main(String[] args) {
        String nomFichier = "entiers_manuel.txt";
        
        // Écriture en big-endian
        try (DataOutputStream sortie = new DataOutputStream(new FileOutputStream(nomFichier))) {
            int[] entiers = {100, 200, 300};
            for (int valeur : entiers) {
                sortie.writeInt(valeur); // Big-endian par défaut
            }
            System.out.println("Entiers écrits (big-endian) : 100, 200, 300");
        } catch (IOException e) {
            System.err.println("Erreur lors de l’écriture : " + e.getMessage());
            return;
        }
        
        // Lecture en supposant little-endian avec conversion manuelle
        try (DataInputStream entree = new DataInputStream(new FileInputStream(nomFichier))) {
            System.out.println("Lecture en supposant little-endian (conversion manuelle) :");
            for (int i = 0; i < 3; i++) {
                byte[] octets = new byte[4];
                if (entree.read(octets) != 4) {
                    System.err.println("Erreur : données insuffisantes.");
                    return;
                }
                // Conversion manuelle : inverser les octets pour little-endian
                int valeur = ((octets[3] & 0xFF) << 24) |
                             ((octets[2] & 0xFF) << 16) |
                             ((octets[1] & 0xFF) << 8)  |
                             (octets[0] & 0xFF);
                System.out.println("Entier lu : " + valeur);
            }
        } catch (IOException e) {
            System.err.println("Erreur lors de la lecture : " + e.getMessage());
        }
    }
}