package behavioral.observer;

public class Promotion {
    private final String titre;
    private final String description;
    private final int pourcentage;
    private final int dureeMinutes;

    public Promotion(String titre, String description, int pourcentage, int dureeMinutes) {
        this.titre = titre;
        this.description = description;
        this.pourcentage = pourcentage;
        this.dureeMinutes = dureeMinutes;
    }

    public String getTitre() {
        return titre;
    }

    public String getDescription() {
        return description;
    }

    public int getPourcentage() {
        return pourcentage;
    }

    public int getDureeMinutes() {
        return dureeMinutes;
    }

    @Override
    public String toString() {
        return "PROMO FLASH: " + titre +
                " (" + pourcentage + "%) - " + description +
                " | Durée: " + dureeMinutes + " min";
    }
}

