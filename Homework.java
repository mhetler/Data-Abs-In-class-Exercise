import java.util.Stack;

public class Homework {
    public static double evaluatePostfix(String expr){
        String[] parts = expr.split(" +");
        Stack<Double> stank = new Stack<>();
        for(String p : parts) {
            switch(p) {
            case "+":
                stank.push(stank.pop() + stank.pop());
                break;
            case "-":
                Double secondOp = stack.pop();
                stank.push(stank.pop() - secondOp);
                break;
            case "*":
                stank.push(stank.pop() * stank.pop());
                break;
            case "/":
                Double forthOp = stack.pop();
                 stank.push(stank.pop() / forthOp);
                break;
            default:
                stank.push(Double.parseDouble(p));
        }
    }

    }
}