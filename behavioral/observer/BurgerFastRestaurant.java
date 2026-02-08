package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class BurgerFastRestaurant {

    private final String nom;
    private final List<ClientVIP> clientsVIP = new ArrayList<>();

    public BurgerFastRestaurant(String nom) {
        this.nom = nom;
    }

    public void abonner(ClientVIP client) {
        clientsVIP.add(client);
        System.out.println("✅ " + client.getNom() + " est abonné aux promos VIP (" + nom + ")");
    }

    public void desabonner(ClientVIP client) {
        clientsVIP.remove(client);
        System.out.println("❎ " + client.getNom() + " est désabonné des promos VIP (" + nom + ")");
    }

    public void lancerPromotionFlash(Promotion promotion) {
        System.out.println("\n=== " + nom + " lance une promotion flash ===");
        notifierClients(promotion);
    }

    private void notifierClients(Promotion promotion) {
        for (ClientVIP client : clientsVIP) {
            client.recevoirNotification(promotion);
        }
    }
}
