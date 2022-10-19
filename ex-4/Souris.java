package ExerciceSouris;

public class Souris {
    private int poids; // grammes
    private String couleur;
    private int age; // nombre de mois
    private int esperanceVie; // nombre de mois
    private boolean clonee;
    private static int ESPERANCE_VIE_DEFAUT = 36;

    public Souris(){
        poids = 20;
        couleur = "grise";
        age = 0;
        esperanceVie = ESPERANCE_VIE_DEFAUT;
        System.out.println("Une nouvelle souris !");
    }

    public Souris(int poids, String couleur){
        this.poids = poids;
        this.couleur = couleur;
        age = 0;
        esperanceVie = ESPERANCE_VIE_DEFAUT;
        System.out.println("Une nouvelle souris !");
    }

    public Souris(Souris souris){
        poids = souris.poids;
        couleur = souris.couleur;
        age = 0;
        esperanceVie = souris.esperanceVie *4/5;
        clonee = true;
        System.out.println("Clonage d'une souris !");
    }

    public String toString(){
        String message;
        if(clonee){
            message = "Une souris %s, clonée de %d mois et pesant %d grammes.";
        }else{
            message = "Une souris %s de %d mois et pesant %d grammes.";
        }
        return String.format(message,couleur,age,poids);
    }

    public void vieillir(){
        age += 1;
        if(clonee && age >= (esperanceVie /2)){
            couleur = "verte";
        }
    }

    public void evolue(){
        age = esperanceVie;
        if(clonee){
            couleur = "verte";
        }
    }
}
