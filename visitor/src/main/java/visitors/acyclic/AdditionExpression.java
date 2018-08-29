package visitors.acyclic;

public class AdditionExpression extends Expression {
    private Expression left, right;

    public Expression getLeft() {
        return left;
    }

    public Expression getRight() {
        return right;
    }

    public AdditionExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    public void accept(Visitor visitor) {
        if (visitor instanceof AdditionExpressionVisitor) {
            AdditionExpressionVisitor additionExpressionVisitor = (AdditionExpressionVisitor) visitor;
            additionExpressionVisitor.visit(this);
        }
    }
}
