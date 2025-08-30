import javax.swing.JOptionPane;

public class Switch2 {
    public static  void main(String [] args){
        int n = Integer.parseInt(JOptionPane.showInputDialog("Donnez un nombre entier >=0: "));
        switch(n){
            case 0 -> System.out.println("null");
            case 2, 4 -> System.out.println("Nombres pairs, soit 2, soit 4. ");
            case 1 -> System.out.println("Un");
            case 3 -> System.out.println("Trois");
            default -> System.out.println("FUCKALL");
        }
        System.out.println("Au revoir");
    }
}
