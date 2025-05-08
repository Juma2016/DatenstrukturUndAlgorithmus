public class MyCalculator {

    private MySinglyLinkedList<Integer> stack = new MySinglyLinkedList<>();

    public int compute(String postfix_expression) {
        String[] tokens = postfix_expression.split(" ");

        for (String token : tokens) {
            if (isOperator(token)) {
                int b = stack.removeFirst();
                int a = stack.removeFirst();
                int result = applyOperator(a, b, token);
                stack.addFirst(result);
            } else {
                stack.addFirst(Integer.parseInt(token));
            }
        }

        return stack.removeFirst();
    }

    private boolean isOperator(String token) {
        return token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/");
    }

    private int applyOperator(int a, int b, String op) {
        switch (op) {
            case "+": return a + b;
            case "-": return a - b;
            case "*": return a * b;
            case "/": return a / b;
            default: throw new IllegalArgumentException("Unknown operator: " + op);
        }
    }
}