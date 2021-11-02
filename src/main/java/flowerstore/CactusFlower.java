package flowerstore;

public class CactusFlower extends Item {

    @Override
    public double getPrice() {
        return 100;
    }

    @Override
    public String getDescription() {
        return "This is Cactus";
    }
}
