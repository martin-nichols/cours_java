import javax.swing.JOptionPane; 
public class ExerciceWhile3 extends Object { 
    public static void main (String args[]) { 
        int entier = 1; 
        int compteur = 1; 
        int somme = 0; 

        while (entier != 0){  
            entier = Integer.parseInt (javax.swing.JOptionPane.showInputDialog("Entrez un entier")); 
            somme = somme + entier; 
            compteur = compteur + 1; 
        } 
        JOptionPane.showMessageDialog(null,"La somme des entiers est " + somme); 
        System.exit(0); 
    } 
}