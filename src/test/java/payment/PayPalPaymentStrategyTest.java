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
    private FlowerPack pack1;
    private FlowerPack pack2;
    private FlowerPack pack3;
    private FlowerBucket bucket;
    private Payment payment;

    @BeforeEach
    void setUp() {
        flower1 = new Flower(FlowerType.ROSE);
        flower2 = new Flower(FlowerType.TULIP);
        flower3 = new Flower(FlowerType.CHAMOMILE);
        pack1 = new FlowerPack();
        pack2 = new FlowerPack();
        pack3 = new FlowerPack();
        bucket = new FlowerBucket();
        //set price
        flower1.setPrice(33);
        flower2.setPrice(40);
        flower3.setPrice(10);
        //set amount and create packs
        pack1.setFlower(flower1);
        pack2.setFlower(flower2);
        pack3.setFlower(flower3);
        pack1.setAmount(21);
        pack2.setAmount(5);
        pack3.setAmount(79);
        bucket.setFlowerPacks(pack1);
        bucket.setFlowerPacks(pack2);
        bucket.setFlowerPacks(pack3);
        //
        payment = new PayPalPaymentStrategy();

    }

    @Test
    void pay() {
        assertEquals("You have to pay 1683.0 for your order using PayPal", payment.pay(bucket.getPrice()));
    }
}