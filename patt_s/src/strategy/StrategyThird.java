package strategy;

public class StrategyThird implements IStrategy {
    @Override
    public void doing(String str) {
        System.out.println(str.toUpperCase());
    }
}
