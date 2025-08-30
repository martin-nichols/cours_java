import javax.swing.JOptionPane;

public class ExerciceWhileIf {
    public static void main(String args []){
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Entrez un premier nombre"));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Entrez un second nombre"));
        int n3 = Integer.parseInt(JOptionPane.showInputDialog("Entrez un troisième nombre"));
        int n4 = n1+n2+n3;
        JOptionPane.showMessageDialog(null, "Juste pour pas avoir d'erreur conne la somme des trois est " +n4);
    }
}
