//import javax.swing.JOptionPane; 
public class ExempleForSimple { 
   public static void main (String args[]) { 
    long debut = System.nanoTime();
    for (int compteur = 1; compteur <=10; compteur++) 
        System.out.println("Valeur du compteur: "+compteur); 
               long fin = System.nanoTime();    // temps à la fin
       long duree = (fin - debut)/1000000;                 // différence en millisecondes

       System.out.println("Temps écoulé: " + duree + " ms");
       System.out.println(debut);
       System.out.println((System.nanoTime())/1000000);



    System.exit(0); 
    } 
} 