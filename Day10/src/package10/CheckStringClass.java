package package10;

/**
 * Created by sahoos on 7/22/2017.
 */
public class CheckStringClass {

    public static void main(String[] args) {
        String name = new String("Harry");
        String name1 = name.intern();
        String name2 = "Harry";
        /*System.out.println(name.equals(name1));
        System.out.println(name.equals(name2));
        System.out.println(name1.equals(name2));*/
        System.out.println(name == name1);
        System.out.println(name == name2);
        System.out.println(name1 == name2);
    }
}
