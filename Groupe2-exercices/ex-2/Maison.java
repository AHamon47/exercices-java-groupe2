package ExerciceBatiment;


public class Maison extends Batiment {
    private int nombrePiece;

    public Maison(String adresse, int nombrePiece) {
        super(adresse);
        this.nombrePiece = nombrePiece;
    }

    public Maison() {
        setAdresse("");
        nombrePiece = 1;
    }

    public int getNombrePiece() {
        return nombrePiece;
    }

    public void setNombrePiece(int nombrePiece) {
        this.nombrePiece = nombrePiece;
    }

    public String toString() {
        return String.format("Message : Le batiment à l adresse %s contient %d pieces", getAdresse(), nombrePiece);
    }
}

