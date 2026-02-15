public class Main {
    public static void main(String[] args) {
        Waiter waiter = new Waiter("Carlos", "Terraza");
        Table table = new Table(10);
        waiter.assignTable(table);

        Product pizza = new Product("Pizza Familiar", 25.5);
        Product drink = new Product("Refresco Grande", 3.0);

        Customer customer = new Customer("Ana Lopez", 10);
        Order order = customer.createOrder();

        order.addProduct(pizza);
        order.addProduct(drink);

        waiter.takeOrder(order);
        order.confirmOrder();

        Ticket ticket = new Ticket();
        ticket.printTicket(order);

        Payment payment = new Payment();
        PaymentMethod paymentMethod = new PaymentMethod("Efectivo");
        payment.confirmPayment(order.calculateTotal(), paymentMethod.type);
    }
}
