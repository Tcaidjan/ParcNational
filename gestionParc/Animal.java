package gestionParc;
public class Animal {
    private String espece;
    private int age;
    private String etatDeSante;

    public Animal(String espece, int age, String etatDeSante) {
        setEspece(espece);
        setAge(age);
        this.etatDeSante = etatDeSante;
    }

    public String getEspece() {
        return espece;
    }

    public void setEspece(String espece) {
        if (espece == null || espece.isEmpty()) {
            throw new IllegalArgumentException("L'espèce ne peut pas être vide.");
        }
        this.espece = espece;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("L'âge ne peut pas être négatif.");
        }
        this.age = age;
    }

    public String getEtatDeSante() {
        return etatDeSante;
    }
}
