package ue5_koerper;

public abstract class Koerper {
    public static final double DICHTE_EICHE = 670;
    public static final double DICHTE_BUCHE = 690;
    
    protected double dichte;
    
    public Koerper (double dichte) throws IllegalArgumentException {
        if (dichte < 0) {
            throw new IllegalArgumentException("invalid parameter dichte");
        }
        this.dichte = dichte;
    }

    public double getDichte() {
        return dichte;
    }

    public void setDichte(double dichte) {
        this.dichte = dichte;
    }

    public abstract double oberflaeche ();
    
    public abstract double volumen ();
    
    public double masse () {
        return volumen() * dichte;
    }
}
