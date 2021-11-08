package items;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public abstract class Item {
    private String describtion;
    private double price;

    public abstract double price();
}
