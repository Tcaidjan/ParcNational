package gestionParc;

import java.util.ArrayList;
import java.util.List;

public class Zone {
    private String nom;
    private double superficie; // en hectares
    private String type;
    private List<Animal> animaux;
    private List<GardeForestier> gardes;

    public Zone(String nom, double superficie, String type) {
        this.nom = nom;
        this.superficie = superficie;
        this.type = type;
        this.animaux = new ArrayList<>();
        this.gardes = new ArrayList<>();
    }

    // Getters et Setters
    public String getNom() {
        return nom;
    }

    public double getSuperficie() {
        return superficie;
    }

    public String getType() {
        return type;
    }

    public List<Animal> getAnimaux() {
        return animaux;
    }

    public List<GardeForestier> getGardes() {
        return gardes;
    }

    public void ajouterAnimal(Animal animal) {
        animaux.add(animal);
    }

    public void ajouterGarde(GardeForestier garde) {
        gardes.add(garde);
    }

    public String getDetails() {
        StringBuilder details = new StringBuilder();
        details.append("Nom: ").append(nom)
               .append(", Superficie: ").append(superficie)
               .append(" hectares, Type: ").append(type)
               .append(", Animaux: ");
        
        if (animaux.isEmpty()) {
            details.append("Aucun");
        } else {
            for (Animal animal : animaux) {
                details.append(animal.getEspece()).append(", ");
            }
        }

        return details.toString();
    }
}
