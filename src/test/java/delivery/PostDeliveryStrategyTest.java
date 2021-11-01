package delivery;

import flowerstore.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PostDeliveryStrategyTest {
    private Flower flower1;
    private Flower flower2;
    private Flower flower3;
    private FlowerBucket bucket;
    private Delivery delivery;
    private List<Item> items;

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
        items = new LinkedList<>();
        //
        delivery = new PostDeliveryStrategy();
        items.add(bucket);

    }

    @Test
    void deliver() {
        assertEquals("The items will be delivered via local post service", delivery.deliver(items));
    }
}