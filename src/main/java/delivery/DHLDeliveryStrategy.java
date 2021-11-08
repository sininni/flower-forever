package delivery;

import items.Item;

import java.util.List;

public class DHLDeliveryStrategy {

    public DHLDeliveryStrategy() {
    }

    public boolean deliver(List<Item> items) {
        System.out.printf("%s will be delivered with DHL", items.toString());
        return true;
    }
}
