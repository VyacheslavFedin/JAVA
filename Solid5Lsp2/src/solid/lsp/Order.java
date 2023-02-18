package solid.lsp;

public abstract class Order implements Orderable{
    protected int price;
    protected int qnt;


    public Order(int price, int qnt) {
        this.price = price;
        this.qnt = qnt;
    }
    public int getPrice() {
        return price;
    }
    public int getQnt() {
        return qnt;
    }

    @Override
    public String toString() {
        return String.format("Количество = %d, Цена = %d", qnt, price);
    }
}
