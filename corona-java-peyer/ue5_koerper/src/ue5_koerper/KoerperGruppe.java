package ue5_koerper;

import java.util.List;
import java.util.ArrayList;
import java.util.Collection;

public class KoerperGruppe {
    private final List<Koerper> koerperListe = new ArrayList<>();
    private double dichte;
    
    public KoerperGruppe () {
        
    }
    
    public KoerperGruppe (Collection<Koerper> koerperListe, double dichte) {
        this.koerperListe.addAll(koerperListe);
        this.dichte = dichte;
        for (Koerper k : this.koerperListe) {
            k.setDichte(dichte);
        }
    }
}
