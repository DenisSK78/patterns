package strategy;

public class StrategySecond implements IStrategy {
    @Override
    public void doing(String str) {
        System.out.println(str.toLowerCase());
    }
}
