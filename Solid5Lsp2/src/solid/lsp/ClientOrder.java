package solid.lsp;

public class ClientOrder extends Order{

    public ClientOrder(int qnt, int price) {
        super (price, qnt); 
    }

    public int getAmount() {
        return qnt * price;
    }


}
