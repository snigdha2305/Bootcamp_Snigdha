package package10;

import org.junit.Test;

import java.util.*;

/**
 * Created by sahoos on 7/22/2017.
 */
public class EmployeeTest {

    public static List<Employee> createTestData() {

        Employee emp1 = new Employee("Rakesh", "Sahoo", "HR", 101, "Pune");
        Employee emp2 = new Employee("Mukesh", "Pradhan", "HR", 102, "Pune");
        Employee emp3 = new Employee("Rakesh", "Dash", "HR", 103, "Pune");
        Employee emp4 = new Employee("Sushant", "Manda", "Finance", 104, "Pune");
        Employee emp5 = new Employee("Binay", "Mohanty", "R&D", 105, "Pune");
        Employee emp6 = new Employee("Harshita", "Marwah", "R&D", 106, "Pune");
        Employee emp7 = new Employee("Mukesh", "Chavan", "HR", 107, "Pune");
        Employee emp8 = new Employee("Aditya", "Mukherjee", "HR", 108, "Hyderabad");
        Employee emp9 = new Employee("Swagat", "Sahoo", "Finance", 109, "Hyderabad");
        Employee emp10 = new Employee("Harshala", "Chavan", "R&D", 110, "Hyderabad");
        Employee emp11 = new Employee("Snigdha", "Sahoo", "Finance", 111, "Hyderabad");
        Employee emp12 = new Employee("Bhoomi", "Chheda", "R&D", 112, "Hyderabad");
        Employee emp13 = new Employee("Arshi", "Saifi", "R&D", 113, "Hyderabad");
        Employee emp14 = new Employee("Mukta", "Kulkarni", "Finace", 114, "Hyderabad");
        Employee emp15 = new Employee("Mukta", "Saifi", "Finance", 115, "Hyderabad");
        Employee emp16 = new Employee("Bikash", "Sahoo", "Finance", 116, "Hyderabad");
        Employee emp17 = new Employee("Manmath", "Sahoo", "R&D", 117, "Hyderabad");
        Employee emp18 = new Employee("Sunil", "Sarangi", "R&D", 118, "Pune");
        Employee emp19 = new Employee("Ruchira", "Naskar", "R&D", 119, "Pune");
        Employee emp20 = new Employee("Subash", "Manda", "Finance", 120, "Pune");

        ArrayList<Employee> employeeList = new ArrayList<Employee>();

        employeeList.add(emp1);
        employeeList.add(emp2);
        employeeList.add(emp3);
        employeeList.add(emp4);
        employeeList.add(emp5);
        employeeList.add(emp6);
        employeeList.add(emp7);
        employeeList.add(emp8);
        employeeList.add(emp9);
        employeeList.add(emp10);
        employeeList.add(emp11);
        employeeList.add(emp12);
        employeeList.add(emp13);
        employeeList.add(emp14);
        employeeList.add(emp15);
        employeeList.add(emp16);
        employeeList.add(emp17);
        employeeList.add(emp18);
        employeeList.add(emp19);
        employeeList.add(emp20);

        return employeeList;
    }

    @Test
    public void test() {

        List<Employee> employees = createTestData();
        employees.sort(new EmployeeComparator());
        for (Employee e : employees) {
            System.out.println(e);
        }
    }
}