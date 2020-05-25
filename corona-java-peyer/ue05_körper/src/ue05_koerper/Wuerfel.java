package ue05_koerper;

public final class Wuerfel extends Koerper{
    private double a;

    public Wuerfel(double a) {
        super(Koerper.DICHTE_EICHE);
        this.a = a;
    }
    
    public Wuerfel(double a, double dichte) {
        super(dichte);
        this.a = a;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }
    
    public double oberflaeche() {
        return 6 * (a * a);    
    }
    
    public double volumen() {
        return (a * a * a);
    }

    @Override
    public String toString() {
        return "Wuerfel{" + "a=" + a + '}';
    }
    
    
}
