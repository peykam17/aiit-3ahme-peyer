package ue03_serienschaltung;

public class TestSerienschaltung {
    public static void main(String[] args) {
        final Serienschaltung serienschaltung = new Serienschaltung();
        
        System.out.println("1: " + serienschaltung);
        try {
            serienschaltung.addWiderstand(10);
        } catch (InvalidResistorValueException ex) {
            System.out.println("Fehler aufgetreten");
            System.out.println(ex.getMessage());
            if(ex instanceof InvalidResistorValueException){
                double v = ((InvalidResistorValueException)ex).getInvalidValue();
            }
            throw new TestFailedException(ex);
        }
        System.out.println("2: " + serienschaltung);
        serienschaltung.setStrom(0.5);
        System.out.println("3: " + serienschaltung);
        try {
            serienschaltung.addWiderstand(15);
        } catch (InvalidResistorValueException ex) {
            System.out.println("Fehler aufgetreten");
            System.out.println(ex.getMessage());
        }
        System.out.println("4: " + serienschaltung);
        try {
            serienschaltung.addWiderstand(20);
        } catch (InvalidResistorValueException ex) {
            System.out.println("Fehler aufgetreten");
            System.out.println(ex.getMessage());
        }
        System.out.println("5: " + serienschaltung);
        serienschaltung.setStrom(1);
        System.out.println("6: " + serienschaltung);
    }
    
    public static class TestFailedException extends RuntimeException{

        public TestFailedException(Throwable cause) {
            super(cause);
    }
    
}
}
