package customer;

import lombok.Getter;
import lombok.Setter;

import java.util.Random;

@Setter @Getter
public class Sender implements User{
    private boolean orderStatus;
    private int id;

    public Sender() {
        Random random = new Random();
        id = random.nextInt(1000000);
    }

    public void update(boolean status) {
        orderStatus = status;
    }
}
