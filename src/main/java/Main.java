import decorators.RibbonDecorator;
import delivery.DHLDeliveryStrategy;
import delivery.Delivery;
import flowerstore.*;
import payment.CreditCardPaymentStrategy;
import payment.Payment;

public class Main {
    public static void main(String[] args) {
        Flower flower1 = new Flower(FlowerType.ROSE);
        Item cactus = new CactusFlower();
        flower1.setPrice(45);
        FlowerBucket bucket = new FlowerBucket();
        bucket.addFlowers(flower1);
        bucket.addFlowers(cactus);
        Item items = bucket;
        items = new RibbonDecorator(items);
        System.out.println(items.getDescription());
        System.out.println(items.getPrice());


    }
}
