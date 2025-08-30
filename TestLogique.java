public class TestLogique {
    public static void main(String[] args) {
        boolean a = false;
        boolean b = false;

        int entier = (!a && (b | !a)) ? 10 : 20;

        System.out.println("Valeur de entier : " + entier);
    }
}
