public class Toys {

    public String name;
    private int id;
    private int weight;
    private int quantity;
    
    
    public Toys(String name, int id, int weight, int quantity) {
        this.name = name;
        this.id = id;
        this.weight = weight;
        this.quantity = quantity;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getWeight() {
        return weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "\ntoys [name = " + name + ", id = " + id + ", weight = " + weight + ", quantity = " + quantity + "]";
    }
}
