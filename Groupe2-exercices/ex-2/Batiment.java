package ExerciceBatiment;

public abstract class Batiment {
    private String adresse;

    public Batiment(String adresse) {
        this.adresse = adresse;
    }

    public Batiment () {
        adresse= "";
    }
    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    // methode tostring
    public abstract String toString();
}

