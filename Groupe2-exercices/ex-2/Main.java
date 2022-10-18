package ExerciceBatiment;

public class Main {
    public static void main(String[] args) {
        Maison maison1 = new Maison("1 Rue Machin",3);
        Maison maison2 = new Maison();
        maison2.setAdresse("2 Rue Machin");
        maison2.setNombrePiece(4);

        System.out.println(maison1.toString());
        System.out.println(maison2.toString());
    }
}
