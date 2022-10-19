package exoPoo;

public class Article {
    private static int nbReference=0;
    private int numeroReference;
    private String nom;
    private double prix;
    private int quantite;

    public Article(String nom, double prix, int quantite){
        this.numeroReference=nbReference;
        nbReference++;
        this.nom=nom;
        this.prix=prix;
        this.quantite=quantite;
    }

    public int getNumeroReference() {
        return numeroReference;
    }
    public void setNumeroReference(int numeroReference) {
        this.numeroReference = numeroReference;
    }

    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getPrix() {
        return prix;
    }
    public void setPrix(double prix) {
        this.prix = prix;
    }

    public int getQuantite() {
        return quantite;
    }
    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public String toString(){
        return String.format(" - Id       : %d\n - Nom      : %s\n - Prix     : %.2f\n - Quantité : %d\n",numeroReference,nom,prix,quantite);
    }
}
