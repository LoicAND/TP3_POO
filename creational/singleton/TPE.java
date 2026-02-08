package creational.singleton;

public class TPE {

    private static TPE instance;

    private double totalJournee;

    private TPE() {
        totalJournee = 0;
    }

    public static TPE getInstance() {
        if (instance == null) {
            instance = new TPE();
        }
        return instance;
    }

    public void encaisser(double montant) {
        totalJournee += montant;
        System.out.println("Transaction : +" + montant + "€");
    }

    public double getTotalJournee() {
        return totalJournee;
    }

    public void nouvelleJournee() {
        System.out.println("=== Nouvelle journée ===");
        totalJournee = 0;
    }
}
