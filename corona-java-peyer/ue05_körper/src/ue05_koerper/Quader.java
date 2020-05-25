package ue05_koerper;

public final class Quader extends Koerper{
    private double a;
    private double b;
    private double h;

    public Quader(double a, double b, double h) {
        super(Koerper.DICHTE_EICHE);
        this.a = a;
        this.b = b;
        this.h = h;
    }
    
    public Quader(double a, double b, double h, double dichte) {
        super(dichte);
        this.a = a;
        this.b = b;
        this.h = h;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getH() {
        return h;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setH(double h) {
        this.h = h;
    }

    public double oberflaeche() {
        return 2 *(a * h + b * h + a * b);
    }
    
    public double volumen() {
        return a * b * h;
    }

    @Override
    public String toString() {
        return "Quader{" + "a=" + a + ", b=" + b + ", h=" + h + '}';
    }
    
    
}
