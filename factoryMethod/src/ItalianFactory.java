public class ItalianFactory implements Factory {
    @Override
    public Pizza createPizza() {
        return new ItalianPizza();
    }
}
