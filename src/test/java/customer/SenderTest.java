package customer;

import static org.junit.jupiter.api.Assertions.*;

class SenderTest {
    private Sender sender;
    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        sender = new Sender();
    }

    @org.junit.jupiter.api.Test
    void update() {
        assertTrue(sender.getId() < 1000000);
        sender.update(false);
        assertFalse(sender.isOrderStatus());
    }
}