package packagerday6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by sahoos on 7/25/2017.
 */
public class EmployeeSalary {
    public static void main(String[] args){

        List<Integer> employeeList = new ArrayList<Integer>();

        employeeList.add(20000);
        employeeList.add(15000);
        employeeList.add(25000);
        employeeList.add(30000);
        employeeList.add(10000);
        employeeList.add(12000);
        employeeList.add(22000);
        employeeList.add(32000);
        employeeList.add(40000);
        employeeList.add(35000);

        Iterator<Integer> itr = employeeList.iterator();
        while (itr.hasNext()) {
            int val = itr.next();
            System.out.println(val * 0.3);
        }
    }
}
