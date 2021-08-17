public class Kitchen {

    private String doSmth = "doSmth";

    public void work(MealCook mealCook){
        doSmth();
        mealCook.cook();
        doSmth();
    }

    public void doSmth(){
        System.out.println(doSmth);
    }
}
