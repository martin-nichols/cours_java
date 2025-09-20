package Question2;

public class Carre extends Forme implements Resizable {
    private double taille;

    public Carre(double taille) {
        setTaille(taille);
    }

    public double getTaille() {
        return taille;
    }

    @Override
    public double getPerimeter() {
        return 4 * taille;
    }

    @Override
    public void resize(double taille) {
        setTaille(taille);
    }

    private void setTaille(double t) {
        if (t <= 0) throw new IllegalArgumentException("La taille doit être > 0");
        this.taille = t;
    }

    @Override
    public String toString() {
        return String.format("Carre(cote=%.2f, perim=%.2f)", taille, getPerimeter());
    }
}