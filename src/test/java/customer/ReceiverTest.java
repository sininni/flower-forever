package customer;

import static org.junit.jupiter.api.Assertions.*;

class ReceiverTest {

    private Receiver receiver;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        receiver = new Receiver();
    }

    @org.junit.jupiter.api.Test
    void update() {
        assertTrue(receiver.getId() < 1000000);
        receiver.update(false);
        assertFalse(receiver.isOrderStatus());
    }
}