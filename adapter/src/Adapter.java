public class Adapter {
    public static void main(String[] args) {
        KitchenAsAdapter kitchen = new KitchenAsAdapter();
        kitchen.work(new Kitchener());
    }
}


