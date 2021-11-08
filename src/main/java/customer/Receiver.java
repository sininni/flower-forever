package customer;

import lombok.Getter;
import lombok.Setter;

import java.util.Random;

@Getter @Setter
public class Receiver implements User{
    public boolean orderStatus;
    private int id;

    public Receiver() {
        Random random = new Random();
        id = random.nextInt(1000000);
    }

    public void update(boolean status) {
        orderStatus = status;
    }
}
