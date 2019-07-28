package patterns.interpreter;

public class IntToBinaryExpression implements Expression {

    private int i;

    public IntToBinaryExpression(int i) {
        this.i = i;
    }

    public String interpreter(InterpreterContext interpreterContext) {
        return interpreterContext.getBinaryFormat(i);
    }
}
