package behavior.interpreter;

public class InterpreterRunner  {

    public static void main(String[] args) {

        Expression isJava = getJavaExpression();
        Expression isJavaEEdeveloper = getJavaEEExpression();

        System.out.println("Does developer know Java core : " + isJava.interpret("java core"));
        System.out.println("Does developer know Java EE : " + isJavaEEdeveloper.interpret("java ee"));
    }

    public static Expression getJavaExpression() {
        Expression java = new TerminalExpression("java");
        Expression javaCore = new TerminalExpression("java core");

        return new OrExpression(java, javaCore);
    }

    public static Expression getJavaEEExpression() {
        Expression java = new TerminalExpression("java");
        Expression spring = new TerminalExpression("spring");

        return new AndExpression(java, spring);
    }
}
