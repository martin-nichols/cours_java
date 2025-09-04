import java.io.*;

public class EcrireEntierTexte {
    public static void main(String[] args){
        FileWriter unFichier;
        try{
            unFichier = new FileWriter("Texte.txt");
            unFichier.write("Hello World! \nC'est poche comme code...");
            unFichier.close();
        }catch (IOException e){
            System.err.println("Exception\n" + e.toString());
        }
    }
}
