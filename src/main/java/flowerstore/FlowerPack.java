package flowerstore;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter @Setter @ToString
public class FlowerPack  {
    private  Flower flower;
    private int amount;

    public double getPrice() {
        return flower.getPrice() * amount;
    }
}
