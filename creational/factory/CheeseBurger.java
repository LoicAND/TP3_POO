package creational.factory;

import java.util.List;

public class CheeseBurger implements Burger {
    @Override
    public String getNom() {
        return "CheeseBurger";
    }

    @Override
    public List<String> getIngredients() {
        return List.of("pain sesame", "steak haché", "cheddar fondu");
    }

    @Override
    public double getPrix() {
        return 10.0;
    }
}
