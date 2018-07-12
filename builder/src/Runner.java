public class Runner {
    public static void main(String[] args) {
        Director director = new Director("Concrete");
        Product product = director.constract("body");
        System.out.println(product);
    }
}
