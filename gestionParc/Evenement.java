package gestionParc;

public class Evenement {
    private String description;
    private String date;

    public Evenement(String description, String date) {
        this.description = description;
        this.date = date;
    }

    // Getters
    public String getDescription() {
        return description;
    }

    public String getDate() {
        return date;
    }
}
