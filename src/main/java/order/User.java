package order;

import java.util.Random;

public interface User {
     Random rand = new Random(100000);
     String status = "doesn't notified";
     void update();
     String getStatus();
}
