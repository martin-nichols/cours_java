public class PremierPlusPetit100 {
    public static void main(String args[]){
int n = 2;
int nombreDePremiers=0;
while (n < 100) {
    boolean premier = false;
    int d = 2;
    while (d * d <= n) {
        if (n % d == 0) { premier = true; break; }
        d++;
    }
    if (premier) {
        System.out.println(n);
        nombreDePremiers++;
}
    n++;
}
System.out.println("Il y a " + nombreDePremiers + " nombres non-premiers entre 0 et " + n );
    }
}