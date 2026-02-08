package creational.factory;

import java.util.List;

public class ChickenBurger implements Burger {
    @Override
    public String getNom() {
        return "ChickenBurger";
    }

    @Override
    public List<String> getIngredients() {
        return List.of("pain burger", "poulet pané croustillant", "sauce BBQ");
    }

    @Override
    public double getPrix() {
        return 9.0;
    }
}
