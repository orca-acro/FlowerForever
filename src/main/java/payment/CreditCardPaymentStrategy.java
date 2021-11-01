package payment;

public class CreditCardPaymentStrategy implements Payment{
    @Override
    public String pay(double price) {
        String msg = "You have to pay " + price + " for your order using credit card";
        return msg;
    }
}
