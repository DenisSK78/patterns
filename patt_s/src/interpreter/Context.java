package interpreter;

public class Context {
    Expression evaluate(String s){

        int pos = s.length()-1;
        while (pos > 0){
            if (Character.isDigit(s.charAt(pos))) {
                pos--;
            } else {
                Expression left = evaluate(s.substring(0, pos));
                Expression right = evaluate(s.substring(Integer.valueOf(s.substring(pos + 1, s.length()))));

                char operator = s.charAt(pos);
                switch (operator){
                    case '-': return new MinesExpression(left, right);
                    case '+': return new PlusExpression(left, right);
                }
            }
        }
       int result = Integer.valueOf(s);
       return new NumberExpression(result);
    }
}
