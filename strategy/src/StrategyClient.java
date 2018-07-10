public class StrategyClient {
    IStrategy strategy;

    public void setStrategy(IStrategy strategy) {
        this.strategy = strategy;
    }

    public void executeStrategy(String word){
        strategy.doing(word);
    }
}
