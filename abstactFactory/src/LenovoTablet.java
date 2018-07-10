public class LenovoTablet implements Tablet {

    String name = "Lenovo tablet";

    @Override
    public void doSamething() {
        System.out.println("New Lenovo tablet loaded!");
    }

    @Override
    public String toString() {
        return "LenovoTablet{" +
                "name='" + name + '\'' +
                '}';
    }
}
