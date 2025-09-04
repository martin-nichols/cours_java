import java.io.*;

public class LireEntierEnOctets {
  public static void main(String[] args) {
    FileInputStream unFichier = null;
    try {
      unFichier = new FileInputStream("UnEntier.dat");

      byte[] tampon = new byte[4];              // 1) allouer UNE fois
      while (true) {
        int nbLus = unFichier.read(tampon);     // 2) lire un bloc
        if (nbLus == -1) break;                 //    fin de fichier
        if (nbLus < 4) throw new EOFException("Entier tronqué"); // sécurité

        int unEntier = 0;                       // 3) reconstruire l'int
        for (int i = 0; i < 4; i++) {
          unEntier <<= 8;
          unEntier += (tampon[i] & 0xFF);
        }

        System.out.println("Valeur décimale de l'entier : " + unEntier); // 4) afficher
      }
    } catch (IOException e) {
      System.err.println("Exception\n" + e);
    } finally {
      if (unFichier != null) try { unFichier.close(); } catch (IOException ignore) {}
    }
  }
}
