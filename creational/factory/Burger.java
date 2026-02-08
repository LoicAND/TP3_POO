package creational.factory;

import java.util.List;

public interface Burger {
    String getNom();
    List<String> getIngredients();
    double getPrix();

    default void afficherRecette() {
        System.out.println(getNom() + " - " + getPrix() + "€");
        System.out.println("Ingrédients : " + String.join(", ", getIngredients()));
    }
}
