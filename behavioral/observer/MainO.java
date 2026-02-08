package behavioral.observer;

public class MainO {
    public static void main(String[] args) {

        BurgerFastRestaurant restaurant = new BurgerFastRestaurant("BurgerFast - Centre Ville");

        ClientVIP alice = new ClientVIP("Alice");
        ClientVIP bob = new ClientVIP("Bob");
        ClientVIP charlie = new ClientVIP("Charlie");

        restaurant.abonner(alice);
        restaurant.abonner(bob);
        restaurant.abonner(charlie);

        Promotion promo1 = new Promotion(
                "Chicken Burger",
                "1 ChickenBurger acheté = -30% sur le 2ème",
                30,
                20
        );

        restaurant.lancerPromotionFlash(promo1);

        restaurant.desabonner(bob);

        Promotion promo2 = new Promotion(
                "Menu Veggie",
                "Menu BurgerVeggie + boisson à prix réduit",
                25,
                15
        );

        restaurant.lancerPromotionFlash(promo2);
    }
}
