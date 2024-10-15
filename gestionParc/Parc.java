package gestionParc;

import java.util.ArrayList;

public class Parc {
    private ArrayList<Zone> zones;

    public Parc() {
        zones = new ArrayList<>();
    }

    // Méthode pour ajouter une zone
    public void ajouterZone(Zone zone) {
        zones.add(zone);
    }

    // Méthode pour obtenir une zone par son nom
    public Zone getZoneParNom(String nom) {
        for (Zone zone : zones) {
            if (zone.getNom().equals(nom)) {
                return zone;
            }
        }
        return null; // Retourne null si la zone n'est pas trouvée
    }

    // Méthode pour supprimer une zone par son nom
    public void supprimerZone(String nom) {
        zones.removeIf(zone -> zone.getNom().equals(nom));
    }
}
