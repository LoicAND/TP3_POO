package behavioral.observer;

public class ClientVIP {
    private final String nom;

    public ClientVIP(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void recevoirNotification(Promotion promotion) {
        System.out.println("📩 Client VIP " + nom + " a reçu : " + promotion);
    }
}

