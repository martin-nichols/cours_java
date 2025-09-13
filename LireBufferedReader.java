import java.io.*;

public class LireBufferedReader 
{
    public static void main(String[] args) throws Exception
    {
        File unFichier = new File("Fichier plate.txt");
        if(!unFichier.exists())
        {
            System.out.println("Fichier inexistant");
            System.out.println("Création immédiate de " + unFichier);
            unFichier.createNewFile();
        } else
        {
            System.out.println("Cool, fichier existant!");
            try 
            {
                FileReader fichierALire = new FileReader(unFichier);
                BufferedReader leFichier = new BufferedReader(fichierALire);
                String uneLigne = leFichier.readLine();
                    while (uneLigne != null) {
                        System.out.println(uneLigne);
                        uneLigne = leFichier.readLine();
                    }
                FileWriter fichierEcriture = new FileWriter("Fichier plate.txt");
                int[] lesNotes = {2,5,6,9,8,7,5,8,9,5,4,1,2,3,6,5,7,8};
                for(int chiffres : lesNotes){
                    fichierEcriture.write(String.valueOf(chiffres));
                }
                System.out.println("Les notes ont été écrites. ");
            
                fichierALire.close();
                fichierEcriture.close();
            } catch (IOException e)
            {
                System.err.println("Erreur I/O : " + e.getMessage());
            }
        }
    }
}
