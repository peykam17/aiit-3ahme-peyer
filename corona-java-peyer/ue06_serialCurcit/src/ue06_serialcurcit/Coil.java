package ue06_serialcurcit;

public abstract class Coil extends Component{

    public Coil(double value) {
        super("L?", value);
    }
    
    public Coil(String id, double value) {
        super(id, value);
    }
    
    @Override
    public String unit() {
        return "H";
    }
    
    @Override
    public double energy() {
        return super.getValue() * Math.pow(super.getCurrent(), 2) / 2;
    }
}
