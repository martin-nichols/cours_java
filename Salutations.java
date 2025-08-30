import javax.swing.JOptionPane;

public class Salutations {
    public static String salutations(String x){
        return ("Bien le bonjour " + x + ", je suis très heureux de vous voir!");
    }

    public static void main(String args []){
        String prenom = JOptionPane.showInputDialog("Entrez votre prénom dans l'espace désigné.");
        JOptionPane.showMessageDialog(null, salutations(prenom));
    }
}
