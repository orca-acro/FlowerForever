package order;


public class Receiver implements User{
    private String status = "doesn't notified";
    int id = rand.nextInt();
    @Override
    public void update() {
        this.status = "Notified";

    }

    @Override
    public String getStatus() {
        return this.status;
    }
}
