import java.util.function.*;

public class Main {

    public static void main(String[] args) {

        Calculator calc = Calculator.instance.get();
        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);
        int c = calc.devide.apply(a, b);
        int d = calc.multiply.apply(a, b);

        int q = calc.pow.apply(20);
        int w = calc.abs.apply(-15);

        boolean t = calc.isPositive.test(-10);

        calc.println.accept(a);
        calc.println.accept(b);
        calc.println.accept(c);
        calc.println.accept(d);
        calc.println.accept(q);
        calc.println.accept(w);
        System.out.println(t);








    }
}
