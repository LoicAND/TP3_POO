package creational.builder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sandwich {
    private final String pain; 
    private final String viande; 
    private final String fromage; 
    private final List<String> legumes; 
    private final String sauce; 
    private final boolean grille;           
         

    Sandwich(String pain, String viande, String fromage, List<String> legumes, String sauce, boolean grille) {
        this.pain = pain;
        this.viande = viande;
        this.fromage = fromage;
        this.legumes = legumes == null ? Collections.emptyList() : Collections.unmodifiableList(new ArrayList<>(legumes));
        this.sauce = sauce;
        this.grille = grille;
    }

    public String getPain() { return pain; }
    public String getViande() { return viande; }
    public String getFromage() { return fromage; }
    public List<String> getLegumes() { return legumes; }
    public String getSauce() { return sauce; }
    public boolean isGrille() { return grille; }

    @Override
    public String toString() {
        return "Sandwich{" +
                "pain='" + pain + '\'' +
                ", viande=" + (viande == null ? "aucune" : "'" + viande + "'") +
                ", fromage=" + (fromage == null ? "aucun" : "'" + fromage + "'") +
                ", legumes=" + (legumes.isEmpty() ? "aucun" : legumes) +
                ", sauce=" + (sauce == null ? "aucune" : "'" + sauce + "'") +
                ", grille=" + (grille ? "oui" : "non") +
                '}';
    }
}

