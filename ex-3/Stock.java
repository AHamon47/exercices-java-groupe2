package exoPoo;

import java.util.ArrayList;
import java.util.Scanner;

public class Stock {
    ArrayList<Article> ArticleList = new ArrayList<Article>();


    public void rechercher(int numeroReference){
        ArticleList.forEach((article) -> {
            if (numeroReference==article.getNumeroReference()) {
                System.out.println(article.toString());
            }
        });
    }


    public void ajouter(String nom, double prix, int quantite){
        Article Article = new Article(nom,prix,quantite);
        ArticleList.add(Article);
    }


    public void supprimer(int numeroReference){
        ArticleList.remove(numeroReference);
    }


    public void modifier(int numeroReference){
        ArticleList.forEach((article) -> {
            if (numeroReference==article.getNumeroReference()) {
                String choix="";
                do {
                    System.out.print("Que souhaitez vous modifier ? (nom / prix / quantite / quitter)");
                    Scanner keyboardInput = new Scanner(System.in);
                    choix = keyboardInput.nextLine().toLowerCase();
                    switch (choix) {
                        case "nom":
                            System.out.println("Entrer le nouveau nom du produit : ");
                            Scanner keyboardInput2 = new Scanner(System.in);
                            article.setNom(keyboardInput2.nextLine());
                            break;
                        case "prix":
                            System.out.println("Entrer le nouveau prix du produit : ");
                            Scanner keyboardInput3 = new Scanner(System.in);
                            article.setPrix(keyboardInput3.nextDouble());
                            break;
                        case "quantite":
                            System.out.println("Entrer la nouvelle quantité du produit : ");
                            Scanner keyboardInput4 = new Scanner(System.in);
                            article.setQuantite(keyboardInput4.nextInt());
                            break;
                    }
                    if (choix.equals("quitter")) {
                        break;
                    }
                } while (!choix.equals("nom") ||
                        !choix.equals("prix") ||
                        !choix.equals("quantite") ||
                        !choix.equals("quitter"));
            }
        });
    }


    public void recherchernom(String nom){
        ArticleList.forEach((article) -> {
            if (nom.equals(article.getNom())) {
                System.out.println(article.toString());
            }
        });
    }


    public void rechercherprix(int prixMin,int prixMax){
        ArticleList.forEach((article) -> {
            if (prixMin <= article.getPrix() && prixMax >= article.getPrix()) {
                System.out.println(article.toString());
            }
        });
    }


    public void afficher(){
        ArticleList.forEach((article) -> {
            System.out.println(article.toString());
        });
    }
}
