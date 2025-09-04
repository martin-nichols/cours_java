import java.io.*; 

 

public class CopierFichier { 
  public static void main(String args[]) { 
    int unOctet; 
    FileInputStream unFileInputStream; 
    FileOutputStream unFileOutputStream; 
    try { 
      unFileInputStream = new FileInputStream("README.md"); 
      unFileOutputStream = new FileOutputStream("Fichier.txt"); 
      while ((unOctet = unFileInputStream.read()) != -1) unFileOutputStream.write(unOctet); 
      unFileInputStream.close(); 
      unFileOutputStream.close(); 
    } catch (IOException e) { 
      System.err.println("Exception\n" + e.toString()); 
    } 
  } 
} 