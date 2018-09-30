package strategy;

public class StrategyFirst implements IStrategy {
    @Override
    public void doing(String str) {
        for (int i = 0; i < str.length() ; i++) {
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println();
    }
}
