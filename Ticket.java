public class Ticket {
    public void printTicket(Order order) {
        System.out.println("\n--- PIZZA BELLA TICKET ---");
        for (Product product : order.plates) {
            System.out.println("- " + product.productName + ": $" + product.priceProduct);
        }
        System.out.println("TOTAL A PAGAR: $" + order.calculateTotal());
        System.out.println("ESTADO: " + order.state);
        System.out.println("--------------------------\n");
    }
}
