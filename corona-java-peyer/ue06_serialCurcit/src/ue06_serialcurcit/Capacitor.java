package ue06_serialcurcit;

public abstract class Capacitor extends Component{

    public Capacitor(double value) {
        super("C?", value);
    }
    
    public Capacitor(String id, double value) {
        super(id, value);
    }
    
    @Override
    public String unit() {
        return "F";
    }
    
    @Override
    public double energy() {
        return super.getValue() * Math.pow(super.getVoltage(), 2) / 2; 
    }
}
