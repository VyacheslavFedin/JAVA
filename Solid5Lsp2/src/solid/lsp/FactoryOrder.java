package solid.lsp;

public class FactoryOrder {
    public Orderable create(int qnt, int price, boolean isBonus) {
        if (isBonus) {
            return new OrderBonus(price, qnt);
        }
        return new ClientOrder(price, qnt);
    }
}
