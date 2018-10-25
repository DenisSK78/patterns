package interpreter;

public class InterpreterApp {
    public static void main(String[] args) {

        Context context = new Context();
        Expression a = context.evaluate("1+2-3");

        System.out.println(a.interpret());
    }
}
