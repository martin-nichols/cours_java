import java.io.*;

public class TestCopie {
    public static void main(String[] args) {
        try {
            FileOutputStream Sortie = new FileOutputStream("100A.txt");
            for (int i = 0; i < 100; i++) {   // 100 fois
                Sortie.write('a');
                Sortie.write('\n');
            }
            Sortie.close();
            System.out.println("Fichier créé avec succès !");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
