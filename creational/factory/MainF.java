package creational.factory;


public class MainF {
    public static void main(String[] args) {
        BurgerFactory factory = new BurgerFactory();

        Burger veggie = factory.create(BurgerType.VEGGIE);
        Burger cheese = factory.create(BurgerType.CHEESE);
        Burger chicken = factory.create(BurgerType.CHICKEN);

        System.out.println("=== Test Factory BurgerFast ===");
        veggie.afficherRecette();
        System.out.println();

        cheese.afficherRecette();
        System.out.println();

        chicken.afficherRecette();
    }
}
