import java.io.*; 

 

public class EcrireTexteabc { 
  public static void main(String args[]) { 
    FileWriter unFichier; 
    PrintWriter unPrintWriter; 

 

    try { 
      unFichier = new FileWriter("Fichier1.txt"); 
      unPrintWriter = new PrintWriter(unFichier); 
      unPrintWriter.println("abc"); 
      unPrintWriter.println(12); 
      unFichier.close(); 
    } catch (IOException e) { 
      System.err.println("Exception\n" + e.toString()); 
    } 
  } 
}