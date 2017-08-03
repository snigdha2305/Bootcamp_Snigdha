package FunctionalInterface;

/**
 * Created by sahoos on 7/28/2017.
 */
public class NumberDemo {
    public static void main(String[] args) {
        Integer[] values = new Integer[] {12, 34, 2, 5, 8, 10, 36};

        NumberManipulation ns = new NumberManipulation(values);

        ns.manipulateNumbers((Integer value) -> {
            System.out.printf("Change value of : %d%n", value);
        });

        ns.manipulateNumbers((Integer value) -> {
            System.out.printf("Change value of : %d%n", value-2);
        });
    }
}
