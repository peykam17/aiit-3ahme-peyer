package ue02_serienschaltung;

public class Serienschaltung {
    private double strom;
    private double spannung;
    private double[] widerstandsFeld;
    
    private void updateSpannung(){
        if(widerstandsFeld == null){
            return;
        }
        double gesamtwiderstand = 0;
        for(int i = 0; i < widerstandsFeld.length; i++){
            gesamtwiderstand += widerstandsFeld[i];
        }
        spannung = gesamtwiderstand * strom;
    }
    
    public void addWiderstand(double widerstandInOhm) throws InvalidResistorValueException{
        if(widerstandInOhm < 0 || widerstandInOhm > 10000000) {
            throw new InvalidResistorValueException(widerstandInOhm);
        }
        if(widerstandsFeld == null){
            widerstandsFeld = new double[1];
            widerstandsFeld[0] = widerstandInOhm;
        }else{
            double[] backupWiderstandsFeld = widerstandsFeld;
            widerstandsFeld = new double[widerstandsFeld.length + 1];
            widerstandsFeld[widerstandsFeld.length - 1] = widerstandInOhm;
            for(int i = 0; i < backupWiderstandsFeld.length; i++){
                widerstandsFeld[i] = backupWiderstandsFeld[i];
            }
        }
        
        updateSpannung();
    }

    public double getStrom() {
        return strom;
    }

    public double getSpannung() {
        return spannung;
    }

    public void setStrom(double strom) {
        this.strom = strom;
        updateSpannung();
    }
    
    @Override
    public String toString() {
        return "Serienschaltung{" + "strom=" + strom + ", spannung=" + spannung + ", widerstandsFeld=" + widerstandsFeld + '}';
    }

    
    
    
}
