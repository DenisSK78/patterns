package bridge;

public class BridgeApp {

    public static void main(String[] args) {
        Car c = new Sedan(new Toyota());
        c.showDetails();

        Car c2 = new Hatchback(new Geely());
        c2.showDetails();
    }
}
