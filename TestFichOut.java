import java.io.*;
import java.util.*;
class TestFichOut {
    public static void main(String[] args) {
        File fichier = new File("Lasortie.txt");
        try (
         FileOutputStream streamFich = new FileOutputStream(fichier);
         DataOutputStream d = new DataOutputStream(streamFich);
         PrintStream out = new PrintStream(d);
         Scanner sc = new Scanner(System.in);
        )
        {
            //String ligne = "";
            System.out.println("==> Taper des lignes terminées  par ctrl-D");
            System.out.print("?");
            for(int i = 0; i <= 10; i++) {
                out.println("" + sc.nextLine());
                System.out.print("?");
                
            }
            System.out.println();
        } catch (java.io.IOException e) {
            System.out.println("Il y a une erreur de lecture ou  écriture");
        } finally {}
    }
}
