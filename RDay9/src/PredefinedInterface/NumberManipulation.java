package PredefinedInterface;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * Created by sahoos on 7/28/2017.
 */
public class NumberManipulation {
    Integer[] values;

    public NumberManipulation(Integer[] values) {
        this.values = values;
    }

    public void forEach(Consumer<Integer> a) {
        for (Integer value : values) {
            a.accept(value);
        }
    }

    public void modify(Function<Integer, Integer> a) {
        for (Integer value : values) {
            Integer e = a.apply(value);
            System.out.println(e);
        }
    }

    public void delete(int value, Predicate<Integer> a) {
        for (Integer i : values) {
            boolean val = a.test(i);
            if (val == true) {
                System.out.println(val + " found");
                break;
            }
        }
    }

    public void fold(BiFunction<Integer, Integer, Integer> a) {
        Integer sum = 0;
        for (Integer value : values) {
            sum = a.apply(value, sum);
            //System.out.println("array[j] = " + value + " sum = " + sum);
        }
        System.out.println("sum = " + sum);
    }
}
