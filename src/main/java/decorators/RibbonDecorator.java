package decorators;

import flowerstore.FlowerBucket;
import flowerstore.Item;

public class RibbonDecorator extends ItemDecorator{
    private Item item;

    public RibbonDecorator(Item item) {
        this.item = item;
    }

    @Override
    public double getPrice() {
        return this.item.getPrice() + 40;
    }

    @Override
    public String getDescription() {
        return "This bucket was decorated with ribbon";
    }
}
