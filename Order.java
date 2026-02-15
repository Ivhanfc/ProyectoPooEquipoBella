import java.util.ArrayList;
import java.util.List;

public class Order {
    public List<Product> plates;
    public String state;

    public Order() {
        this.plates = new ArrayList<>();
        this.state = "Pendiente";
    }

    public void addProduct(Product product) {
        plates.add(product);
        System.out.println("Agregado al pedido: " + product.productName);
    }

    public double calculateTotal() {
        double total = 0;
        for (Product product : plates) {
            total += product.priceProduct;
        }
        return total;
    }

    public void confirmOrder() {
        state = "Confirmado";
    }
}
