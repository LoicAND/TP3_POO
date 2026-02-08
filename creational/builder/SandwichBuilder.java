package creational.builder;

import java.util.ArrayList;
import java.util.List;

public class SandwichBuilder {
    private final String pain;

    
    private String viande;
    private String fromage;
    private final List<String> legumes = new ArrayList<>();
    private String sauce;
    private boolean grille = false;

    
    public SandwichBuilder(String pain) {
        if (pain == null || pain.isBlank()) {
            throw new IllegalArgumentException("Le pain est obligatoire.");
        }
        this.pain = pain;
    }

    public SandwichBuilder viande(String viande) {
        this.viande = viande;
        return this;
    }

    public SandwichBuilder fromage(String fromage) {
        this.fromage = fromage;
        return this;
    }

    public SandwichBuilder ajouterLegume(String legume) {
        if (legume != null && !legume.isBlank()) {
            this.legumes.add(legume);
        }
        return this;
    }

    public SandwichBuilder sauce(String sauce) {
        this.sauce = sauce;
        return this;
    }

    public SandwichBuilder grille(boolean grille) {
        this.grille = grille;
        return this;
    }

    public Sandwich build() {
        return new Sandwich(pain, viande, fromage, legumes, sauce, grille);
    }
}
