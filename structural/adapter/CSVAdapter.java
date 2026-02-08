import java.util.HashMap;
import java.util.Map;

public class CSVAdapter implements AnalyseurVentes {

    private final LecteurCSV lecteur;

    private double totalVentes = 0.0;
    private int nbCommandes = 0;
    private final Map<String, Double> caParProduit = new HashMap<>();

    public CSVAdapter(LecteurCSV lecteur) {
        this.lecteur = lecteur;
        analyserCSV();
    }

    private void analyserCSV() {
        // Ligne 0 = en-têtes, donc on commence à 1
        for (int i = 1; i < lecteur.getNbLignes(); i++) {
            String[] cols = lecteur.getColonnes(i);

            // sécurité minimale
            if (cols.length < 3) continue;

            String produit = cols[1].trim();
            String prixQuantite = cols[2].trim(); // ex: "8.50x3"

            String[] parts = prixQuantite.split("x");
            if (parts.length != 2) continue;

            double prix = Double.parseDouble(parts[0]);
            int quantite = Integer.parseInt(parts[1]);

            double caLigne = prix * quantite;

            nbCommandes += 1;
            totalVentes += caLigne;

            caParProduit.put(produit, caParProduit.getOrDefault(produit, 0.0) + caLigne);
        }
    }

    @Override
    public double getTotalVentes() {
        return totalVentes;
    }

    @Override
    public int getNbCommandes() {
        return nbCommandes;
    }

    @Override
    public Map<String, Double> getCAParProduit() {
        return caParProduit;
    }
}
