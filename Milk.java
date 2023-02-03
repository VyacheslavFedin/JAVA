public class Milk extends Product {
    private double volume;
    public Milk(String name, double cost, double volume) {
        super(name, cost);
        this.volume = volume;
    }

    @Override
    public String toString() {
        return String.format(super.toString() + " volume: %f",this.volume);
    }

    public double getVolume() {
        return volume;
    }
}
