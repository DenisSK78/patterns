public class AsusLaptop implements Laptop {

    String name = "Asus laptop";

    @Override
    public void doSomething() {
        System.out.println("New Asus laptop loaded!");
    }

    @Override
    public String toString() {
        return "AsusLaptop{" +
                "name='" + name + '\'' +
                '}';
    }
}
