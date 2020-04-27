package ue02_serienschaltung;

public class InvalidResistorValueException extends Exception{
    
    private final double invalidValue;
    
    InvalidResistorValueException(double widerstandInOhm) {
        super("Fehler aufgetreten");
        this.widerstandInOhm = invalidValue;
    }
    
    public double getInvalidValue(){
        return invalidValue;
    }
    
}
