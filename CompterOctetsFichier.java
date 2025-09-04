import java.io.*;

public class CompterOctetsFichier {
  public static void main(String args[]) {
    int unOctet;
    int compteurOctet;
    int lettreA = 0;
    FileInputStream unFichier;

    try {
      unFichier = new FileInputStream("README.md");
      compteurOctet = 0;

      while ((unOctet = unFichier.read()) != -1) {
        compteurOctet++;
        if ((char) unOctet == 'a') {   // on teste ici chaque caractère
          lettreA++;
        }
      }

      unFichier.close();

      System.out.println("Nombre d'octets du fichier Fichier1.txt : " + compteurOctet);
      System.out.println("Il y a " + lettreA + " lettres a.");
    } catch (IOException e) {
      System.err.println("Exception\n" + e.toString());
    }
  }
}
