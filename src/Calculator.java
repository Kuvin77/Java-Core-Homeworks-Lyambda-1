import java.util.function.*;

public class Calculator {
    static Supplier<Calculator> instance = Calculator::new;

    BinaryOperator<Integer> plus = (x, y) -> x + y;
    BinaryOperator<Integer> minus = (x, y) -> x - y;
    BinaryOperator<Integer> multiply = (x, y) -> x * y;
    BinaryOperator<Integer> devide = (x, y) -> {
        try {
            if (y == 0)
                throw new ArithmeticException("Деление на ноль");
            return x / y;
        }
        catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            return 0;
        }
    };

    UnaryOperator<Integer> pow = x -> x * x; // перемножение
    UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;// в положительное число

    Predicate<Integer> isPositive = x -> x > 0; // проверка на положительное

    Consumer<Integer> println = System.out::println;
}
