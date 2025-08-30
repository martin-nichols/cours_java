public class TestCercle {
    public static void main(String[] args) {
        Cercle c = new Cercle(3.1415);
        Cercle c2 = new Cercle(3);
        System.out.println("Aire : " + c.aire());
        System.out.println("Périmètre : " + c.perimetre());
        System.out.println("Périmètre c2 : " + c2.perimetre() + ", Aire c2 : " + c2.aire());
    }
}
