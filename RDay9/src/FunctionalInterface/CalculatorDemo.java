package FunctionalInterface;

/**
 * Created by sahoos on 7/28/2017.
 */
public class CalculatorDemo {
    public static void main(String[] args) {
        CalculatorService cs = new CalculatorService();
        cs.calculator(10,20,(double a, double b) -> {
            System.out.println(a+b);
        });
        cs.calculator(40,20,(double a, double b) -> {
            System.out.println(a-b);
        });
        cs.calculator(2,3,(double a, double b) -> {
            System.out.println(a*b);
        });
        cs.calculator(10,5,(double a, double b) -> {
            System.out.println(a/b);
        });
        cs.calculator(6,5,(double a, double b) -> {
            System.out.println(a%b);
        });
    }
}
