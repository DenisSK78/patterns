package abstractFactory;

public class LenovoLaptop implements Laptop {

    String name = "Lenovo laptop";

    @Override
    public void doSomething() {
        System.out.println("New Lenovo laptop loaded!");
    }

    @Override
    public String toString() {
        return "LenovoLaptop{" +
                "name='" + name + '\'' +
                '}';
    }
}
