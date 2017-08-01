package package8;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by sahoos on 7/20/2017.
 */
public class PersonTest {

    public static List<Person> createTestData() {

        Person p1 = new Person("Suresh", "M");
        Person p2 = new Person("Ramesh", "M");
        Person p3 = new Person("Geeta", "F");
        Person p4 = new Person("Suresh", "M");
        Person p5 = new Person("Suresh", "M");

        List<Person> PersonList = new ArrayList<Person>();

        PersonList.add(p1);
        PersonList.add(p2);
        PersonList.add(p3);
        PersonList.add(p4);
        PersonList.add(p5);

        return PersonList;
    }

        public static void main(String[] args) {
            List<Person> PersonList = createTestData();
            for (int i = 0; i < PersonList.size(); i++) {
                System.out.println(PersonList.get(i));
            }
        }


}
