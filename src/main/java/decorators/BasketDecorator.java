package decorators;

import flowerstore.Item;

public class BasketDecorator extends ItemDecorator{
    private Item item;

    public BasketDecorator(Item item) {
        this.item = item;
    }

    @Override
    public double getPrice() {
        return this.item.getPrice() + 4;
    }

    @Override
    public String getDescription() {
        return "This bucket was decorated with basket";
    }

}
