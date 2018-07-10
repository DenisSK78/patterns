public class LenovoLaptop implements Laptop {

    String name = "Lenovo laptop";

    @Override
    public void doSamething() {
        System.out.println("New Lenovo laptop loaded!");
    }

    @Override
    public String toString() {
        return "LenovoLaptop{" +
                "name='" + name + '\'' +
                '}';
    }
}
