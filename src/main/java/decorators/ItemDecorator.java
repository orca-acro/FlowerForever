package decorators;

import flowerstore.Item;

public abstract class ItemDecorator extends Item {
    public Item item;

    public void ItemDecorator(Item item) {
        this.item = item;
    }

    @Override
    public double getPrice() {
        return this.item.getPrice();
    }

    @Override
    public String getDescription() {
        return this.item.getDescription();
    }
}
