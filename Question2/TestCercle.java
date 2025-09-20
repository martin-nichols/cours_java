package Question2;

public class TestCercle {
    public static void main(String[] args) {
        System.out.println("Bonjour, INF 1220 !");

        Cercle c = new Cercle(1.9);
        System.out.println(c);
        c.resize(3.0);
        System.out.println("Après resize: " + c);

        Carre s = new Carre(2.0);
        System.out.println(s);
        s.resize(5.0);
        System.out.println("Après resize: " + s);

        Forme f1 = c;
        Forme f2 = s;
        System.out.println("Périmètres via Forme: " + f1.getPerimeter() + " ; " + f2.getPerimeter());

        Forme[] formes = { new Cercle(2), new Carre(1) };
        for (Forme f : formes) {
            System.out.println(f.getClass().getSimpleName() + " : " + f.getPerimeter());
            ((Resizable) f).resize(10); 
            System.out.println("Après resize: " + f.getPerimeter());
        }
    }
}
