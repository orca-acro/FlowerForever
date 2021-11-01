package delivery;

import flowerstore.Item;

import java.util.List;

public class PostDeliveryStrategy implements Delivery{

    @Override
    public String deliver(List<Item> items) {
        String msg = "The items will be delivered via local post service";
        return msg;
    }
}
