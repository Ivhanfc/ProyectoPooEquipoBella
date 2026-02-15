public class Payment {
    public double amount;
    public String paymentStatus = "No pagado";

    public void confirmPayment(double amount, String paymentType) {
        this.amount = amount;
        this.paymentStatus = "Pagado";
        System.out.println("Pago de $" + this.amount + " realizado con " + paymentType);
    }
}
