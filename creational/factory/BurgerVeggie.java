package creational.factory;

import java.util.List;

public class BurgerVeggie implements Burger {
    @Override
    public String getNom() {
        return "BurgerVeggie";
    }

    @Override
    public List<String> getIngredients() {
        return List.of("pain complet", "salade", "tomate", "carotte");
    }

    @Override
    public double getPrix() {
        return 8.0;
    }
}

