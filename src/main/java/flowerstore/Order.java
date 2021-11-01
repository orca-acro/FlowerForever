package flowerstore;

import delivery.Delivery;
import lombok.Getter;
import payment.Payment;

import java.util.LinkedList;
import java.util.List;

@Getter
public class Order {
    private Payment payment;
    private Delivery delivery;
    private List<Item> items = new LinkedList<>();

    public void setPaymentStrategy(Payment payment) {
        this.payment = payment;
    }

    public void setDeliveryStrategy(Delivery delivery) {

        this.delivery = delivery;
    }

    public double calculateTotalPrice() {
        double price = 0;
        for (int i=0; i < items.size(); i++) {
            price += items.get(i).getPrice();
        }
        return price;
    }

    public void processOrder() {
        System.out.println("Processing your order \n" +
                "---------------------------");
        System.out.println(this.delivery.deliver(this.items));
        System.out.println(this.payment.pay(this.calculateTotalPrice()));

    }
    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(Item item) {
        if (items.contains(item)) {
            items.remove(item);
        }
        else {
            System.out.println("There is no such item in your order");
        }
    }



}
