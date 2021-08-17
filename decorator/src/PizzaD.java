public class PizzaD extends PizzaIngredient {
    //Concrete decorator
    public PizzaD(Ingredient ingredient) {
        super(ingredient);
    }

    @Override
    public Integer getCost() {
        return super.getCost() + 5;
    }

    @Override
    public String getDescription() {
        return "Pizza with:" + super.getDescription();
    }
}
