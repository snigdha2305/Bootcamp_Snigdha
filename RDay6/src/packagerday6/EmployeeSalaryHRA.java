package packagerday6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * Created by sahoos on 7/25/2017.
 */
public class EmployeeSalaryHRA {

    static List<Employee> employeeList = new ArrayList<Employee>();


    public static void main(String[] args) {

        /*static Integer a[] = new Integer[]{20000, 15000};

        static List employeeList = Arrays.asList(a);*/

        employeeList.add(new Employee(20000));
        employeeList.add(new Employee(15000));
        employeeList.add(new Employee(25000));
        employeeList.add(new Employee(30000));
        employeeList.add(new Employee(10000));
        employeeList.add(new Employee(12000));
        employeeList.add(new Employee(22000));
        employeeList.add(new Employee(32000));
        employeeList.add(new Employee(40000));
        employeeList.add(new Employee(35000));
        calculateSalary();
    }
    public static void calculateSalary() {
        Iterator<Employee> itr = employeeList.iterator();
        while (itr.hasNext()) {
            Employee employee = itr.next();
            System.out.println(employee.getSalary() * 0.3);
        }
    }
}
