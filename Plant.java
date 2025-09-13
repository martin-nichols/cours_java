import java.io.*;

public class Plant implements Serializable {
    private int noPlant;
    private String description;
    private double prixUnitaire;

    public Plant(int noPlant, String description, double prixUnitaire) {
        this.noPlant = noPlant;
        this.description = description;
        this.prixUnitaire = prixUnitaire;
    }

    public int getNoPlant() {
        return noPlant;
    }

    public String getDescription() {
        return description;
    }

    public double getPrixUnitaire() {
        return prixUnitaire;
    }

    public String toString() {
        return noPlant + " " + description + " " + prixUnitaire;
    }
}
