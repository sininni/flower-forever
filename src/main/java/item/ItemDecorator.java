package item;

import items.Item;

abstract class ItemDecorator extends Item {
    public Item item;

    public ItemDecorator (Item item) {
        this.item = item;
    }

    public String getDescribtion() {
        return item.getDescribtion();
    }
}
