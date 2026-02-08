package creational.builder;

public class Main {
    public static void main(String[] args) {
        Sandwich s1 = new SandwichBuilder("baguette")
                .ajouterLegume("laitue")
                .ajouterLegume("tomate")
                .build();

        Sandwich s2 = new SandwichBuilder("ciabatta")
                .viande("poulet")
                .fromage("cheddar")
                .ajouterLegume("oignon")
                .ajouterLegume("cornichon")
                .sauce("mayo")
                .grille(true)
                .build();

        Sandwich s3 = new SandwichBuilder("complet")
                .fromage("emmental")
                .ajouterLegume("tomate")
                .sauce("moutarde")
                .grille(false)
                .build();

        System.out.println("Sandwich 1 : " + s1);
        System.out.println("Sandwich 2 : " + s2);
        System.out.println("Sandwich 3 : " + s3);
    }
}
