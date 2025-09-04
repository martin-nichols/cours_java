import java.io.*; 

 

public class EcrireEntier { 
  public static void main(String args[]) { 
    DataOutputStream unFichier; 
    try { 
      unFichier = new DataOutputStream(new FileOutputStream("UnEntier.dat")); 
      int unEntier = 111;  
      // (97*2^24)+(35*2^16)+(50<<2^8)+49 = "a#21" en String; 

 

      unFichier.writeInt(unEntier); 
      unFichier.close(); 

 

    } catch (IOException e) { 
      System.err.println("Exception\n" + e.toString()); 
    } 
  } 
} 