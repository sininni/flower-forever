package flowers;


import items.Item;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
public class Flower extends Item {
    private double sepalLength;
    private double price;
    private FlowerType flowerType;
    private Color color;

    public Flower(FlowerType flowerType) {
        this.flowerType = flowerType;
    }

    @Override
    public double price() {
        return getPrice();
    }
}
