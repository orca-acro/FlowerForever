package flowerstore;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class FlowerTest {

    private Flower flower1;
    private Flower flower2;
    private Flower flower3;

    @BeforeEach
    void setUp() {
        flower1 = new Flower(FlowerType.ROSE);
        flower2 = new Flower(FlowerType.TULIP);
        flower3 = new Flower(FlowerType.CHAMOMILE);
        //set price
        flower1.setPrice(33);
        flower2.setPrice(40);
        flower3.setPrice(10);
        //set color
        int[] red = {255, 0, 0};
        int[] peach = {255 ,218 ,185};
        int[] white = {255, 255, 255};
        flower1.setColor(red);
        flower2.setColor(peach);
        flower3.setColor(white);
        //set sepal lenght
        flower1.setSepalLenght(1.25);
        flower2.setSepalLenght(1.78);
        flower3.setSepalLenght(0.45);
    }

    @Test
    void getPrice() {
        assertEquals(33, flower1.getPrice());
        assertEquals(40, flower2.getPrice());
        assertEquals(10, flower3.getPrice());
    }

    @Test
    void getSepalLenght() {
        assertEquals(1.25, flower1.getSepalLenght());
        assertEquals(1.78, flower2.getSepalLenght());
        assertEquals(0.45, flower3.getSepalLenght());
    }

    @Test
    void getColor() {
        int[] red = {255, 0, 0};
        int[] peach = {255 ,218 ,185};
        int[] white = {255, 255, 255};
        assertEquals(Arrays.toString(red), Arrays.toString(flower1.getColor()));
        assertEquals(Arrays.toString(peach), Arrays.toString(flower2.getColor()));
        assertEquals(Arrays.toString(white), Arrays.toString(flower3.getColor()));

    }

    @Test
    void getFlowerType() {
        assertEquals(FlowerType.ROSE, flower1.getFlowerType());
        assertEquals(FlowerType.TULIP, flower2.getFlowerType());
        assertEquals(FlowerType.CHAMOMILE, flower3.getFlowerType());
    }
}