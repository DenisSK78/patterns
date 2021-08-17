public class AdapterMain {
    public static void main(String[] args) {
        Kitchen kitchen = new Kitchen();
        kitchen.work(new Kitchener());
        kitchen.work(new AdapterForKitchenerSecond(new KitchenerSecond()));
    }
}


