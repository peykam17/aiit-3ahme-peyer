package ue03_serienschaltung;

import java.util.ArrayList;

public class Serienschaltung {
    private double strom;
    private double spannung;
    ArrayList<Double> widerstandsFeld = new ArrayList<>();
    
    private void updateSpannung(){
        if(widerstandsFeld.isEmpty()){
            return;
        }
        double gesamtwiderstand = 0;
        for(int i = 0; i < widerstandsFeld.size(); i++){
            gesamtwiderstand += widerstandsFeld.get(i);
        }
        spannung = gesamtwiderstand * strom;
    }
    
    public void addWiderstand(double widerstandInOhm) throws InvalidResistorValueException{
        if(widerstandInOhm < 0 || widerstandInOhm > 10000000) {
            throw new InvalidResistorValueException(widerstandInOhm);
        }
        widerstandsFeld.add(widerstandInOhm);
        
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
