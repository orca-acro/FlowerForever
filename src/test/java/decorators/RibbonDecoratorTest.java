package decorators;

import flowerstore.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RibbonDecoratorTest {
    private Flower flower;
    private CactusFlower cactus;
    private RomashkaFlower romashka;
    private FlowerBucket bucket;
    private Item item;


    @BeforeEach
    void setUp() {
        flower = new Flower(FlowerType.ROSE);
        cactus = new CactusFlower();
        romashka = new RomashkaFlower();
        flower.setPrice(45);
        bucket = new FlowerBucket();
        bucket.addFlowers(flower);
        bucket.addFlowers(cactus);
        bucket.addFlowers(romashka);
        item = bucket;
        item = new RibbonDecorator(item);
    }

    @Test
    void getPrice() {
        assertEquals(195, item.getPrice());
    }
}