package package9;

import java.util.HashSet;
import java.util.Iterator;

/**
 * Created by sahoos on 7/21/2017.
 */
public class HashSetDemoTest {

    public static void main(String[] args) {

        HashSet<String> hs = new HashSet<String>();
        hs.add("Suresh");
        hs.add("Ramesh");
        hs.add("Mahesh");
        hs.add("Gitesh");

        Iterator<String> i = hs.iterator();
        while (i.hasNext())
            System.out.println(i.next());

        System.out.println(hs.contains("Ramesh"));
        System.out.println(hs.contains("Hitesh"));
        System.out.println(hs.size());
        System.out.println(hs.remove("Suresh"));

        Iterator<String> j = hs.iterator();
        while (j.hasNext())
            System.out.println(j.next());

        System.out.println(hs.isEmpty());
    }
}
