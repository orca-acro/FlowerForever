package decorators;

import flowerstore.Item;

public class PaperDecorator extends ItemDecorator{
    private Item item;

    public PaperDecorator(Item item) {
        this.item = item;
    }

    @Override
    public double getPrice() {
        return this.item.getPrice() + 13;
    }

    @Override
    public String getDescription() {
        return "This bucket was decorated with paper";
    }
}
