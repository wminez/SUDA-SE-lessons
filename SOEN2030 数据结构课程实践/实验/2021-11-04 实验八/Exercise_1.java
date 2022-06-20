import java.util.Scanner;

public class Exercise_1 {
    public static double calculate_suffix_expression(String expression) {
        Stack<String> stack = new Stack<String>();
        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);
            if (c == '+' || c == '-' || c == '*' || c == '/') {
                double d2 = Double.parseDouble(stack.pop());
                double d1 = Double.parseDouble(stack.pop());
                double d3 = 0;
                if (c == '+') {
                    d3 = d1 + d2;
                } else if (c == '-') {
                    d3 = d1 - d2;
                } else if (c == '*') {
                    d3 = d1 * d2;
                } else if (c == '/') {
                    d3 = d1 / d2;
                }
                stack.push(Double.toString(d3));
            } else {
                stack.push(Character.toString(c));
            }
        }
        return Double.parseDouble(stack.pop());
    }

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        String expression = in.nextLine();
        in.close();
        double result = calculate_suffix_expression(expression);
        // double result = calculate_suffix_expression("0123/-4*+");
        System.out.println(result);
    }
}
