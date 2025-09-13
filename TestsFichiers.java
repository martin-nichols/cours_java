import java.io.*;
import javax.swing.JOptionPane;


public class TestsFichiers {
    public static void main(String[] args){

        try {
        FileWriter unFichier;
        PrintWriter unPrintWriter;
            unFichier = new FileWriter("TestFichiers.txt");
            unPrintWriter = new PrintWriter(unFichier);
            for (int i = 0; i<5; i++){
            String chaine = JOptionPane.showInputDialog("Entre un texte: ");
            unPrintWriter.println(chaine);
            }
            unPrintWriter.println("Fin");
            unPrintWriter.println("Martin, tu es le KING!");
            unFichier.close();
        } catch (Exception e) {
            System.err.println("Une erreur" + e.toString());
        }
    }    
}
