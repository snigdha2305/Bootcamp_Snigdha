package FunctionalInterface;

/**
 * Created by sahoos on 7/28/2017.
 */
public class CalculatorService {
    public void calculator(double a, double b, Calculator cal) {
        cal.calculate(a, b);
    }
}
