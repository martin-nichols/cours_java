import javax.swing.JOptionPane;

public class PlusGrand {
    public static String plusGrand(int x, int y){
        if (x>y){
            return ("Le plus grand est " + x);
        }
        if (x<y){
            return ("Le plus grand est " + y);
        }
        else{
            return ("Les nombres sont égaux");
        }
    }

    public static void main(String args[]){
        int premierNombre = Integer.parseInt(JOptionPane.showInputDialog("Entrez un nombre à vérifier"));
        int secondNombre = Integer.parseInt(JOptionPane.showInputDialog("Entrez un nombre à vérifier"));
        JOptionPane.showMessageDialog(null, plusGrand(premierNombre, secondNombre));
    }
}
