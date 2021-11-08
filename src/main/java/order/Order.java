package order;

import java.util.ArrayList;
import java.util.List;

public class Order {
    List<User> users = new ArrayList<>();

    public void addUser(User user) {
        if (users.contains(user)) {
            System.out.println("There is already such user in system");
        }
        else {
            users.add(user);
        }
    }

    public void removeUser(User user) {
        if (users.contains(user)) {
            users.remove(user);
        }
        else {
            System.out.println("There is no such user in system");
        }
    }

    public void notifyUsers() {
        for (User user : users) {
            user.update();
        }
    }
    public void order() {
        notifyUsers();
    }

}
