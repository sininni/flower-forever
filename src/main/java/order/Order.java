package order;

import customer.User;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Setter @Getter
public class Order {
    private List<User> users = new ArrayList<User>();

    public void addUser(User user) {
        users.add(user);
    }

    public void removeUser(User user) {
        users.remove(user);
    }

    public void notifyUsers() {
        for (User user : users) {
            user.update(true);
        }
    }

    public void order() {
        this.notifyUsers();
    }
}

class QuickOrder {
    public static Order createQuickOrder() {
        return new Order();
    }
}
