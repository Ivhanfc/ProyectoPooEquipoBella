
public class Employee {

    public String name;
    public String role;

    public Employee() {
    }

    public Employee(String name, String role) {
        this.name = name;
        this.role = role;
    }

    public void work() {
        System.out.println(name + " esta trabajando como " + role);
    }
}
