package ue06_serialcurcit;

public abstract class Resistor extends Component{
    
    private double voltage;
    private double current;
    private double value;
    
    public Resistor(double value) {
        super("R?", value);
    }
    
    public Resistor(String id, double value) {
        super(id, value);
    }

    @Override
    public void setVoltage(double voltage) {
        super.setVoltage(voltage);
        super.setCurrent(voltage / getValue());
    }
    
    @Override
    public void setCurrent(double current) {
        super.setCurrent(current);
        super.setVoltage(current * getValue());
    }
    
    @Override
    public String unit() {
        return "\u2126";
    }
    
    @Override
    public double energy() {
        return 0;
    }
}
