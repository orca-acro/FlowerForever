package flowerstore;

public class RomashkaFlower extends Item{
    @Override
    public double getPrice() {
        return 10;
    }

    @Override
    public String getDescription() {
        return "This is Romashka";
    }
}
