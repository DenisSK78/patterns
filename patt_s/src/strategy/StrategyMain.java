package strategy;

public class StrategyMain {
    public static void main(String[] args) {
        StrategyClient sc = new StrategyClient();

        sc.setStrategy(new StrategyFirst());
        sc.executeStrategy("Mimino!");

        sc.setStrategy(new StrategySecond());
        sc.executeStrategy("Mimino!");

        sc.setStrategy(new StrategyThird());
        sc.executeStrategy("Mimino!");
    }
}
