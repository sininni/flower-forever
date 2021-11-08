package item;
import items.Item;

public class PaperDecorator extends ItemDecorator {
    public PaperDecorator (Item item) {
        super(item);
    }

    public double price() {
        return 13 + item.getPrice();
    }

    @Override
    public String getDescribtion() {
        return "Done with PaperDecorator";
    }
}
