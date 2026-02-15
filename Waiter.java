
import java.util.ArrayList;
import java.util.List;

public class Waiter extends Employee {

    public String section;
    public List<Table> assignedTables = new ArrayList<>();

    public Waiter(String name, String section) {
        this.name = name;
        this.role = "Waiter";
        this.section = section;
    }

    @Override
    public void work() {
        System.out.println("Mesero " + name + " atendiendo la seccion: " + section);
    }

    public void takeOrder(Order order) {
        System.out.println(name + " esta tomando el pedido...");
        order.state = "En cocina";
    }

    public void assignTable(Table table) {
        assignedTables.add(table);
        System.out.println("Mesa " + table.numberTable + " asignada a " + name);
    }

    public void clearTable(Table table) {
        System.out.println("Waiter: " + name + "is cleaning the table: " + table.numberTable);
    }

    public void processPayment(Table table) {
        System.out.println("Waiter: " + name + "is processing the payment on table: " + table.numberTable);
    }

    public void serverFood(Table table) {
        System.out.println("The waiter: " + name + " is serving food on the table " + table.numberTable);
    }
}
