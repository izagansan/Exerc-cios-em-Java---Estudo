public class IllegalOperationException extends RuntimeException {
    public IllegalOperationException(String errorMessage) {
        super(errorMessage);
    }

    public IllegalOperationException(String errorMessage, Throwable cause) {
        super(errorMessage, cause);
    }
}

class CalculatorConundrum {

    public String calculate(int operand1, int operand2, String operation) {

        if (operation == null) {
            throw new IllegalArgumentException("Operation cannot be null");
        }

        if (operation.isEmpty()) {
            throw new IllegalArgumentException("Operation cannot be empty");
        }

        switch (operation) {
            case "+":
                return operand1 + " + " + operand2 + " = " + (operand1 + operand2);

            case "*":
                return operand1 + " * " + operand2 + " = " + (operand1 * operand2);

            case "/":
                try {
                    return operand1 + " / " + operand2 + " = " + (operand1 / operand2);
                } catch (ArithmeticException e) {
                    throw new IllegalOperationException(
                        "Division by zero is not allowed", e
                    );
                }

            default:
                throw new IllegalOperationException(
                    "Operation '" + operation + "' does not exist"
                );
        }
    }

    public static void main(String[] args) {

        CalculatorConundrum calc = new CalculatorConundrum();

        System.out.println(calc.calculate(22, 25, "+"));
        System.out.println(calc.calculate(3, 5, "*"));

        try {
            System.out.println(calc.calculate(10, 0, "/"));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(calc.calculate(10, 1, "-"));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
