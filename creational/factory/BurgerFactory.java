package creational.factory;

public class BurgerFactory {

    public Burger create(BurgerType type) {
        if (type == null) {
            throw new IllegalArgumentException("Le type de burger est obligatoire.");
        }

        switch (type) {
            case VEGGIE:
                return new BurgerVeggie();
            case CHEESE:
                return new CheeseBurger();
            case CHICKEN:
                return new ChickenBurger();
            default:
                throw new IllegalArgumentException("Type de burger inconnu: " + type);
        }
    }
}
