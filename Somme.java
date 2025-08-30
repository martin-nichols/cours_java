public class Somme {
    private int a, b;

    public Somme(int x, int y) {
        a = x;
        b = y;
    }

    public int additionne() {
        return a + b;
    }

    public static void main(String[] args) {
        Somme s = new Somme(15, -125);
        System.out.println(s.additionne()); // affiche 8
    }
}
