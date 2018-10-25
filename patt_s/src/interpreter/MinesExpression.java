package interpreter;

public class MinesExpression implements Expression {

    Expression left;
    Expression right;

    public MinesExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret() {
        return left.interpret() - right.interpret();
    }
}
