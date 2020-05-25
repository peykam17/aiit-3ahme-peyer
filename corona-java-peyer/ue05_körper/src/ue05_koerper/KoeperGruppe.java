package ue05_koerper;

import java.util.List;

public class KoeperGruppe {
    private List<Koerper> koerperListe;
    private double dichte;

    public KoeperGruppe() {
    }

    public KoeperGruppe(List<Koerper> koerperListe, double dichte) {
        this.koerperListe = koerperListe;
        this.dichte = dichte;
    }
    
    
}
