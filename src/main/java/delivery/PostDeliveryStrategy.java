package delivery;

import items.Item;

import java.util.List;

public class PostDeliveryStrategy implements Delivery{
    public boolean deliver (List<Item> items) {
        System.out.printf("%s will be delivered with Post", items.toString());
        return true;
    }
}
