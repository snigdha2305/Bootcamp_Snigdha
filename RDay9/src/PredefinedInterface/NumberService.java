package PredefinedInterface;

/**
 * Created by sahoos on 7/28/2017.
 */
public class NumberService {
    public static void main(String[] args) {
        Integer[] values = new Integer[]{12, 34, 2, 5, 8, 10, 36};

        NumberManipulation ns = new NumberManipulation(values);

        ns.forEach((Integer value) -> {
            System.out.printf("Change value of : %d%n", value);
        });

        ns.modify((Integer value) -> {
            return (value * 2);
        });

        /*ns.delete((Integer value) -> {
            return (2);
        });*/

        /*public void delete(int value, Predicate<Integer> a) {
            for (Integer integer : values) {
                boolean e = a.test(integer);
                if (e == true) {
                    System.out.println(e + "found");
                    break;
                }
            }

        }*/

        ns.fold((Integer value1, Integer value2) -> {
            return (value1 + value2);
        });
    }
}
