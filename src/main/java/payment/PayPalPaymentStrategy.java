package payment;

public class PayPalPaymentStrategy implements Payment{
    @Override
    public String pay(double price) {
        return "You have to pay " + price + " for your order using PayPal";
    }
}
