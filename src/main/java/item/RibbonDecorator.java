package item;

import items.Item;

public class RibbonDecorator extends ItemDecorator {
    public RibbonDecorator (Item item) {
        super(item);
    }

        public double price() {
        return 13 + item.price();
    }

        @Override
        public String getDescribtion() {
        return "Done with RibbonDecorator";
    }
}
