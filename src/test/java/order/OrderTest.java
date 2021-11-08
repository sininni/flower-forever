package order;

import customer.Receiver;
import customer.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrderTest {

    private User user;
    private Order order;

    @BeforeEach
    void setUp() {
        user = new Receiver();
        order = new Order();
        order.addUser(user);
    }

    @Test
    void addUser() {
        assertEquals(order.getUsers().size(), 1);
    }

    @Test
    void removeUser() {
        order.removeUser(user);
        assertEquals(order.getUsers().size(), 0);
    }
}