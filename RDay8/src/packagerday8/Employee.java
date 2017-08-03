package packagerday8;

import org.jetbrains.annotations.NotNull;

import java.io.Serializable;

/**
 * Created by sahoos on 7/27/2017.
 */
public class Employee implements Comparable<Employee>, Serializable{

    private int id;
    private String name;
    private transient int salary;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public int compareTo(Employee e) {
        if(this.id == e.id)
            return 0;
        else if(this.id > e.id){
            return 1;
        }
        return -1;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
