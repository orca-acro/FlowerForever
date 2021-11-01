package payment;

import flowerstore.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PayPalPaymentStrategyTest {
    private Flower flower1;
    private Flower flower2;
    private Flower flower3;
    private FlowerBucket bucket;
    private Payment payment;

    @BeforeEach
    void setUp() {
        flower1 = new Flower(FlowerType.ROSE);
        flower2 = new Flower(FlowerType.TULIP);
        flower3 = new Flower(FlowerType.CHAMOMILE);
        bucket = new FlowerBucket();
        //set price
        flower1.setPrice(33);
        flower2.setPrice(40);
        flower3.setPrice(10);
        //set amount and create packs
        bucket.addFlowers(flower1);
        bucket.addFlowers(flower2);
        bucket.addFlowers(flower3);
        //
        payment = new PayPalPaymentStrategy();

    }

    @Test
    void pay() {
        assertEquals("You have to pay 1683.0 for your order using PayPal", payment.pay(bucket.getPrice()));
    }
}