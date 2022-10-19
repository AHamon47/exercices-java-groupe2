package exoPoo;
import java.util.Scanner;

public class exo18aprem3 {
    public static void main(String[] args) {
        String choix = "";
        Stock Stock1 = new Stock();

//        Jeu d'essai
        Article Article1 = new Article("piscine",150.5,4);
        Stock1.ArticleList.add(Article1);
        Article Article2 = new Article("meuble",39.99,8);
        Stock1.ArticleList.add(Article2);
        Article Article3 = new Article("assiettes",120,3);
        Stock1.ArticleList.add(Article3);
        System.out.println("Rechercher : Recherche un article par référence,\n" +
                "Ajouter : Ajouter un article,\n" +
                "Supprimer : Supprimer un article,\n" +
                "Modifier : Modifier un article,\n" +
                "RechercherNom : Rechercher par nom,\n" +
                "RechercherPrix : Rechercher par intervalle de prix de vente,\n" +
                "Afficher : Afficher tous les articles,\n" +
                "Quitter : Quitter.");

        do {
            System.out.print("Que souhaitez vous faire ? ");
            Scanner keyboardInput = new Scanner(System.in);
            choix = keyboardInput.nextLine().toLowerCase();
            switch (choix) {
                case "rechercher":
                    System.out.print("Entrer le numéro de référence du produit à rechercher : ");
                    Scanner keyboardInput2 = new Scanner(System.in);
                    Stock1.rechercher(keyboardInput2.nextInt());
                    break;
                case "ajouter":
                    System.out.print("Entrer le nom du produit à ajouter : ");
                    Scanner keyboardInput3 = new Scanner(System.in);
                    String nom=keyboardInput3.nextLine();
                    System.out.print("Entrer le prix du produit à ajouter : ");
                    Scanner keyboardInput4 = new Scanner(System.in);
                    double prix=keyboardInput4.nextDouble();
                    System.out.print("Entrer la quantité du produit à ajouter : ");
                    Scanner keyboardInput5 = new Scanner(System.in);
                    int quantite=keyboardInput5.nextInt();
                    Stock1.ajouter(nom,prix,quantite);
                    break;
                case "supprimer":
                    System.out.print("Entrer le numéro de référence du produit à supprimer : ");
                    Scanner keyboardInput6 = new Scanner(System.in);
                    Stock1.supprimer(keyboardInput6.nextInt());
                    break;
                case "modifier":
                    System.out.println("Entrer le numéro de référence du produit à modifier : ");
                    Scanner keyboardInput7 = new Scanner(System.in);
                    Stock1.modifier(keyboardInput7.nextInt());
                    break;
                case "recherchernom":
                    System.out.print("Entrer le nom du produit à rechercher : ");
                    Scanner keyboardInput8 = new Scanner(System.in);
                    Stock1.recherchernom(keyboardInput8.nextLine());
                    break;
                case "rechercherprix":
                    System.out.print("Entrer le prix minimum du produit : ");
                    Scanner keyboardInput9 = new Scanner(System.in);
                    int prixMin = keyboardInput9.nextInt();
                    System.out.print("Entrer le prix maximum du produit : ");
                    Scanner keyboardInput10 = new Scanner(System.in);
                    int prixMax = keyboardInput10.nextInt();
                    Stock1.rechercherprix(prixMin,prixMax);
                    break;
                case "afficher":
                    Stock1.afficher();
                    break;
            }
            if (choix.equals("quitter")) {
                break;
            }
        } while (!choix.equals("rechercher") ||
                 !choix.equals("ajouter") ||
                 !choix.equals("supprimer") ||
                 !choix.equals("modifier") ||
                 !choix.equals("recherchernom") ||
                 !choix.equals("rechercherprix") ||
                 !choix.equals("afficher") ||
                 !choix.equals("quitter"));
    }
}
