package item;
import items.Item;

public class BusketDecorator extends ItemDecorator {
    public BusketDecorator (Item item) {
        super(item);
    }

    public double price() {
        return 4 + item.getPrice();
    }

        @Override
    public String getDescribtion() {
        return "Done with BusketDecorator";
    }
}
