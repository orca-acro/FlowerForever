package delivery;

import flowerstore.Item;

import java.util.List;

public class DHLDeliveryStrategy implements Delivery{
    @Override
    public String deliver(List<Item> items) {
        String msg = "The items will be delivered via DHL post service";
        return msg;
    }
}
