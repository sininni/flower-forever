package order;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuickOrderTest {

    private QuickOrder quickOrder;

    @Test
    void createQuickOrder() {
        assertInstanceOf(QuickOrder.createQuickOrder(), Order.class);
    }
}