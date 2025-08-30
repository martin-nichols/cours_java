import javax.swing.JOptionPane;

public class Multiple {
    public static String estMultiple(int x, int y){
        if (x % y == 0){
            return (y + " est un multiple de " + x + " !");
        }
        else{
            return (y +" n'est pas un multiple de " + x + " ...");
        }
    }

    public static void main(String args[]){
        int premierNombre = Integer.parseInt(JOptionPane.showInputDialog(null, "Entrez un premier nombre"));
        int deuxiemeNombre = Integer.parseInt(JOptionPane.showInputDialog(null, "Entrez un second nombre"));
        JOptionPane.showMessageDialog(null, estMultiple(premierNombre, deuxiemeNombre));
    }
}
