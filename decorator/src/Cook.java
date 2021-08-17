public class Cook {
    public static void main(String[] args) {
        //Pattern decorator
        PizzaD pizzaD = new PizzaD(new Ham(new Ches(new Mushrooms(new Tomato()))));
        System.out.println(pizzaD.getDescription());
        System.out.println("Price: " + pizzaD.getCost());
    }
}
