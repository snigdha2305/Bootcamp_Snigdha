package Stream;

import java.util.*;

/**
 * Created by sahoos on 7/29/2017.
 */
public class EmployeeStream {
    public static void main(String[] args) {
        List<Employee> employeeList = Arrays.asList(new Employee(102, "Ram", 35000),
        new Employee(103, "Shyam", 45000),
        new Employee(101, "Hari", 55000),
        new Employee(104, "Kiran", 50000),
        new Employee(107, "Harsh", 60000),
        new Employee(105, "Aman", 54000),
        new Employee(106, "Anukta", 58000),
        new Employee(110, "Aditya", 48000),
        new Employee(108, "Sumit", 25000),
        new Employee(119, "Bikash", 45000));

        double sum = employeeList.stream()
                .filter((e)-> e.getSalary() > 50000)
                .map((e)-> e.getSalary()*0.1)
                .reduce((a,b)->a+b).get();

        System.out.println("TDS : " + sum);

        double count = employeeList.stream()
                .map((e)->1)
                .reduce((a,b)->a+b).get();

        System.out.println("Number of Employees : " + count);

        double total = employeeList.stream()
                .map((e)-> e.getSalary())
                .reduce((a,b)->a+b).get();

        System.out.println("Total salary : " + total);

        System.out.println("Avg salary : " + total/count);

        Optional min = employeeList.stream().min((e,b)->{return (int)(e.getSalary() - b.getSalary());});
        System.out.println(min.get());

        Optional max = employeeList.stream().max((e,b)->{return (int)(e.getSalary() - b.getSalary());});
        System.out.println(max.get());

    }
}
