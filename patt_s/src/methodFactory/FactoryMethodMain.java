package methodFactory;

public class FactoryMethodMain {
    public static void main(String[] args) {
        Factory italianFactory = new ItalianFactory();
        Factory sicilianFactory = new SicilianFactory();
        Pizza pizzaI = sicilianFactory.createPizza();
        Pizza pizzaS = italianFactory.createPizza();
        pizzaI.composition();
        pizzaS.composition();
    }
}
