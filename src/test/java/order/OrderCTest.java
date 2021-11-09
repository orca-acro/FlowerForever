package order;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrderCTest {
    User u1;
    User u2;
    User u3;
    User u4;
    OrderC orderC;

    @BeforeEach
    void setUp() {
        u1 = new Receiver();
        u2 = new Sender();
        u3 = new Receiver();
        u4 = new Sender();
        orderC = new OrderC();
        orderC.addUser(u1);
        orderC.addUser(u2);
    }

    @Test
    void addUser() {
        ///orderC.addUser(u3);
        ///assertEquals("OrderC(users=[order.Receiver@6025e1b6, order.Sender@22ff4249, order.Receiver@2d1ef81a])", orderC.toString());
        ///orderC.addUser(u2);
        ///assertEquals("OrderC(users=[order.Receiver@6025e1b6, order.Sender@22ff4249, order.Receiver@2d1ef81a])", orderC.toString());
    }

    @Test
    void removeUser() {
        ///orderC.addUser(u3);
        ///orderC.removeUser(u4);
        ///assertEquals("OrderC(users=[order.Receiver@198b6731, order.Sender@7c6908d7, order.Receiver@3c9754d8])", orderC.toString());
        ///orderC.removeUser(u3);
        ///assertEquals("OrderC(users=[order.Receiver@198b6731, order.Sender@7c6908d7])", orderC.toString());
    }

    @Test
    void order() {
        assertEquals("doesn't notified", u1.getStatus());
        assertEquals("doesn't notified", u2.getStatus());
        orderC.order();
        assertEquals("Notified", u1.getStatus());
        assertEquals("Notified", u2.getStatus());
    }
}