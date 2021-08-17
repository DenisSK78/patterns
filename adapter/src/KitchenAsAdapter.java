public class KitchenAsAdapter {

    private String doSmth = "doSmth";

    public void work(Kitchener kitchener){
        doSmth();
        kitchener.cook();
        doSmth();
    }

    public void doSmth(){
        System.out.println(doSmth);
    }
}
