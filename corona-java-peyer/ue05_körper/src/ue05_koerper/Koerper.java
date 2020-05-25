package ue05_koerper;

public class Koerper {
    private double dichte;
    public static double DICHTE_EICHE = 670;
    public static double DICHTE_BUCHE = 690;

    public Koerper(double dichte) {
        this.dichte = dichte;
    }

    public double getDichte() {
        return dichte;
    }

    public void setDichte(double dichte) {
        this.dichte = dichte;
    }
    
    public double masse() {
        return volumen() * dichte;
    }
    
    public double oberfläche() {
        return 1;
    }
    
    public double volumen() {
        return 1;
    }
    
}
