package abstractFactory;

public class AsusTablet implements Tablet {

    String name = "Asus tablet";

    @Override
    public void doSomething() {
        System.out.println("New Asus tablet loaded!");
    }

    @Override
    public String toString() {
        return "AsusTablet{" +
                "name='" + name + '\'' +
                '}';
    }
}
