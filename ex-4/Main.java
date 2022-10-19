package ExerciceSouris;

public class Main {
    public static void main(String[] args) {
        Souris souris1 = new Souris(30,"blanche");
        Souris souris2 = new Souris();
        Souris sourisClonee1 = new Souris(souris1);

        souris1.vieillir();
        souris1.vieillir();
        System.out.println(souris1.toString());

        souris2.evolue();
        System.out.println(souris2.toString());

        System.out.println(sourisClonee1.toString());
        sourisClonee1.evolue();
        System.out.println(sourisClonee1.toString());
    }
}
