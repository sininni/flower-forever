package store;

import flowers.FlowerPack;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private List<FlowerPack> flowers = new ArrayList<FlowerPack>();

    // checks if there is needed number of flowers in the store
    public boolean search(FlowerPack searchFlowers) {
        for (FlowerPack f : flowers) {
            if (f.getFlower().equals(searchFlowers.getFlower()) && f.getAmount() >= searchFlowers.getAmount()) {
                return true;
            }
        }
        return false;
    }

    public void addFlowers (FlowerPack flowerPack){
        flowers.add(flowerPack);
    }
}
