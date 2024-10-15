package gestionParc;

public class GardeForestier {
    private String nom;
    private String qualifications;

    public GardeForestier(String nom, String qualifications) {
        this.nom = nom;
        this.qualifications = qualifications;
    }

    // Getters
    public String getNom() {
        return nom;
    }

    public String getQualifications() {
        return qualifications;
    }
}
