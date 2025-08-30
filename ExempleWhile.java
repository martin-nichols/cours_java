import javax.swing.JOptionPane; 
public class ExempleWhile{ 
   public static void main (String args[]) { 
        int compteur = 5;     
        while(compteur >= -5){ 
            JOptionPane.showMessageDialog(null,"Valeur du compteur: "+compteur); 
            compteur = compteur - 1; 
        } 
        System.exit(0); 
    } 
} 