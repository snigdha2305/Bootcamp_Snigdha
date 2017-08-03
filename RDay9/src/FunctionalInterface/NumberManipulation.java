package FunctionalInterface;

/**
 * Created by sahoos on 7/28/2017.
 */
public class NumberManipulation {

    Integer[] values;

    public NumberManipulation(Integer[] values) {
        this.values = values;
    }

    public void manipulateNumbers(Numbers numbers) {
        for(Integer value : values) {
            numbers.manipulate(value);
        }
    }
}
