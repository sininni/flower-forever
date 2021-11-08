package flowers;

import items.Item;

import java.util.ArrayList;
import java.util.List;

class FlowerBucket extends Item {
    private List<FlowerPack> flowerPackList = new ArrayList<>();
    private double price;

    public double price() {
        for (FlowerPack flowerPack : flowerPackList) {
            price += flowerPack.price();
        }
        return price;
    }

    public void addFlowers(FlowerPack flowerPack) {
        flowerPackList.add(flowerPack);
    }
}

