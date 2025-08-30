import javax.swing.JOptionPane; 
public class ExempleForSentinelle { 
    public static void main (String args[]) { 
        String serie; 
        int somme = 0; 
        for (int entier = 1; entier != 0;){ 
            serie = JOptionPane.showInputDialog("Entrez un nombre, entrez 0 pour terminer"); 
            entier = Integer.parseInt (serie); 
            somme = somme + entier; 
        } 
        JOptionPane.showMessageDialog(null,"La somme de tous les nombres est de " +somme+ "."); 
        System.exit(0); 
    } 
}