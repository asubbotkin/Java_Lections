package lecture_nr_10.lambda2;

public class Main {
    public static void main(String[] args) {
        int firstNumber = 6;
        int secondNumber = 3;

        Functionable addition = (int x, int y) -> {
            return x + y;
        };

        Functionable subtraction = (int x, int y) -> {
            return x - y;
        };

        Functionable multiply = (int x, int y) -> {
            return x * y;
        };

        Functionable divide = (int x, int y) -> {
            return x / y;
        };


        System.out.println(addition.apply(firstNumber, secondNumber));
        System.out.println(multiply.apply(firstNumber, secondNumber));

        calculationResult(firstNumber, secondNumber, addition);
        calculationResult(firstNumber, secondNumber, subtraction);
        calculationResult(firstNumber, secondNumber, multiply);
        calculationResult(firstNumber, secondNumber, divide);
    }

    public static void calculationResult(int x, int y, Functionable algorithm) {
        System.out.println("Result is " + algorithm.apply(x, y));
    }
}
