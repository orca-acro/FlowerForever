package order;

import lombok.Getter;

@Getter
public class Sender implements User{
    public String status = "doesn't notified";
    @Override
    public void update() {
        this.status = "Notified";

    }
}
