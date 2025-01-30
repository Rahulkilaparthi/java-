public class cal_4942 {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("follow the format.");
            return;
        }
        double num1 = Double.parseDouble(args[0]);
        double num2 = Double.parseDouble(args[1]);
        String operator = args[2];

        double result = 0;
        switch (operator) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                    return;
                }
                break;
            default:
                System.out.println("Invalid operator. Use +, -, *, or /.");
                return;
        }

        System.out.println("Result: " + result);
    }
}
