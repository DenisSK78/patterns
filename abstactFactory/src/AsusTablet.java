public class AsusTablet implements Tablet {

    String name = "Asus tablet";

    @Override
    public void doSamething() {
        System.out.println("New Asus tablet loaded!");
    }

    @Override
    public String toString() {
        return "AsusTablet{" +
                "name='" + name + '\'' +
                '}';
    }
}
