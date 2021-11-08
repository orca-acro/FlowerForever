package order;

import lombok.Getter;

@Getter
public class Receiver implements User{
    private String status = "doesn't notified";
    @Override
    public void update() {
        this.status = "Notified";

    }
}
