package flowerstore;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StoreTest {
    private Flower flower1;
    private Flower flower2;
    private Flower flower3;
    private Flower flower4;
    private FlowerPack pack1;
    private FlowerPack pack2;
    private FlowerPack pack3;
    private FlowerPack pack4;
    private FlowerBucket bucket1;
    private FlowerBucket bucket2;
    private Store  store;

    @BeforeEach
    void setUp() {
        flower1 = new Flower(FlowerType.TULIP);
        flower2 = new Flower(FlowerType.TULIP);
        flower3 = new Flower(FlowerType.CHAMOMILE);
        flower4 = new Flower(FlowerType.CHAMOMILE);
        pack1 = new FlowerPack();
        pack2 = new FlowerPack();
        pack3 = new FlowerPack();
        pack4 = new FlowerPack();
        bucket1 = new FlowerBucket();
        bucket2 = new FlowerBucket();
        store = new Store();
        //
        flower1.setPrice(33);
        flower2.setPrice(33);
        flower3.setPrice(10);
        flower4.setPrice(10);
        //
        pack1.setFlower(flower1);
        pack2.setFlower(flower2);
        pack3.setFlower(flower3);
        pack4.setFlower(flower4);
        pack1.setAmount(21);
        pack2.setAmount(5);
        pack3.setAmount(79);
        pack4.setAmount(79);
        bucket1.setFlowerPacks(pack1);
        bucket2.setFlowerPacks(pack2);
        bucket1.setFlowerPacks(pack3);
        bucket2.setFlowerPacks(pack3);
        //
        store.setFlowerBucket(bucket1);
        store.setFlowerBucket(bucket2);

    }

    @Test
    void search() {
        assertEquals("Sorry, no flowers left :(", store.search(FlowerType.ROSE));
        assertEquals("[FlowerBucket(flowerPacks=[FlowerPack(flower=Flower(price=33.0, sepalLenght=0.0, color=null, flowerType=TULIP), amount=21)," +
                " FlowerPack(flower=Flower(price=10.0, sepalLenght=0.0, color=null, flowerType=CHAMOMILE), " +
                "amount=79)]), FlowerBucket(flowerPacks=[FlowerPack(flower=Flower(price=33.0, sepalLenght=0.0, " +
                "color=null, flowerType=TULIP), amount=5), FlowerPack(flower=Flower(price=10.0, " +
                "sepalLenght=0.0, color=null, flowerType=CHAMOMILE), amount=79)])]", store.search(FlowerType.TULIP));
    }

}