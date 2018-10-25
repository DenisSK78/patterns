package interpreter;

public class NumberExpression implements Expression {

    int number;

    public NumberExpression(int number) {
        this.number = number;
    }

    @Override
    public int interpret() {
        //do something
        return number;
    }

    @Override
    public String toString() {
        return "NumberExpression{" +
                "number=" + number +
                '}';
    }
}
