
import javax.swing.JOptionPane;

public class PairImpair {
    public static boolean isEven(int x){
        return x % 2 == 0;
    }
    
    public static void main(String args[]){
        int result = Integer.parseInt(JOptionPane.showInputDialog("Entrez un nombre à vérifier"));
        if (isEven(result)){
            JOptionPane.showMessageDialog(null, "C'est un nombre pair!");
        }
        else{
            JOptionPane.showMessageDialog(null, "C'est un nombre impair!");
        }
    }
}
