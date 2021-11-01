package flowerstore;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.LinkedList;
import java.util.List;

@ToString
public class FlowerBucket extends Item{
    List<Item> bucket = new LinkedList<>();

    public FlowerBucket() {
    }

    @Override
    public double getPrice() {
        double price = 0;
        for (int i=0; i < bucket.size(); i++){
            price += bucket.get(i).getPrice();
        }
        return price;
    }
    public void addFlowers(Item item) {

        bucket.add(item);
    }

    public String searchFlower(Item item) {
        String msg;
        if (bucket.contains(item)) {
            msg = "There is " + item + " in your bucket";
        }
        else {
            msg = "There is no such item in your bucket";
        }
        return msg;
    }
}
