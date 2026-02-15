public class Customer {
    public String name;
    public int tableNumber;

    public Customer(String name, int tableNumber) {
        this.name = name;
        this.tableNumber = tableNumber;
    }

    public Order createOrder() {
        System.out.println("Cliente " + name + " (Mesa " + tableNumber + ") inicia pedido.");
        return new Order();
    }
}
