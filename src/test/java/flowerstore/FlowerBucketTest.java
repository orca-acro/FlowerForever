package flowerstore;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FlowerBucketTest {
    private Flower flower1;
    private Flower flower2;
    private Flower flower3;
    private Flower flower4;
    private FlowerBucket bucket;

    @BeforeEach
    void setUp() {
        flower1 = new Flower(FlowerType.ROSE);
        flower2 = new Flower(FlowerType.TULIP);
        flower3 = new Flower(FlowerType.CHAMOMILE);
        flower4 = new Flower(FlowerType.ROSE);
        bucket = new FlowerBucket();
        //set price
        flower1.setPrice(33);
        flower2.setPrice(40);
        flower3.setPrice(10);
        //set amount and create packs
        bucket.addFlowers(flower1);
        bucket.addFlowers(flower2);
        bucket.addFlowers(flower3);
    }

    @Test
    void getPrice() {
        assertEquals(83, bucket.getPrice());
    }

    @Test
    void searchFlower() {
        assertEquals( "There is Flower(price=33.0, sepalLenght=0.0, color=null, flowerType=ROSE) in your bucket", bucket.searchFlower(flower1));
        assertEquals( "There is no such item in your bucket", bucket.searchFlower(flower4));
    }
}