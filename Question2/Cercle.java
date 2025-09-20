package Question2;

public class Cercle extends Forme implements Resizable {
    private double diametre;

    public Cercle(double diametre) {
        setDiametre(diametre);
    }

    public double getDiametre() {
        return diametre;
    }

    @Override
    public double getPerimeter() {
        return Math.PI * diametre; // périmètre d'un cercle = π * diamètre
    }

    @Override
    public void resize(double diametre) {
        setDiametre(diametre);
    }

    private void setDiametre(double d) {
        if (d <= 0) throw new IllegalArgumentException("Le diamètre doit être > 0");
        this.diametre = d;
    }

    @Override
    public String toString() {
        return String.format("Cercle(diam=%.2f, perim=%.2f)", diametre, getPerimeter());
    }
}