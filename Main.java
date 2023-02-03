public class Main {
    public static void main(String[] args) {
       VendingMachine vendingMachine = new VendingMachine();
       vendingMachine.getProductList().add(new Product("Яблоко", 10));
        vendingMachine.getProductList().add(new Product("Груша", 20));
        vendingMachine.getProductList().add(new Product("Яблоко1", 10));
        vendingMachine.getProductList().add(new Baton("Батончик Марс", 10, 10.4324324234234));
        vendingMachine.getProductList().add(new Milk("Молоко", 11, 0.970));
        vendingMachine.getProductList().add(new SuperBaton("БОЛЬШОЙ Батончик Марс", 10, 10.4324324234234, TypeSize.BIG));
        for(Product product : vendingMachine.getProductList()) {
            System.out.println(product);
        }
    }


}
