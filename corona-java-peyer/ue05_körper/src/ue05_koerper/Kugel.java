package ue05_koerper;

public final class Kugel extends Koerper{
    private double r;

    public Kugel(double r) {
        super(Koerper.DICHTE_EICHE);
        this.r = r;
    }
    
    public Kugel(double r, double dichte) {
        super(dichte);
        setR(r);
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }
    
    public double oberflaeche() {
        return 4 * (r*r) * (22/7);
    }
    
    public double volumen() {
        return (4.0/3.0) * (22.0/7.0) * (r * r * r);
    }

    @Override
    public String toString() {
        return "Kugel{" + "r=" + r + '}';
    }
    
    
}
