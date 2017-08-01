package package9;

/**
 * Created by sahoos on 7/21/2017.
 */
public class PersonTest {
    public static void main(String[] args) {

        Person p1 = new Person("Ramesh", "M");
        Person p2 = new Person("Ramesh", "M");
        System.out.println(p1.equals(p2));
        System.out.println(p1.equals(null));
        System.out.println(Integer.valueOf(1000) == Integer.valueOf(1000));
        System.out.println(Integer.valueOf(1) == Integer.valueOf(1));
        System.out.println(p1.hashCode()==p2.hashCode());
        System.out.println(p1.getName().hashCode()==p2.getName().hashCode());
        System.out.println(p1.getGender().hashCode()==p2.getGender().hashCode());
        /*for (int i = 0 ; i < 200 ; i++) {
            System.out.println("i = " + i + (Integer.valueOf(i) == Integer.valueOf(i)));
        }*/
    }
}
