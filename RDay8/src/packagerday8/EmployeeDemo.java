package packagerday8;

import sun.reflect.generics.tree.Tree;

import java.io.*;
import java.util.*;

/**
 * Created by sahoos on 7/27/2017.
 */
public class EmployeeDemo implements Serializable{

    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<Employee>();

        employeeList.add(new Employee(102, "Ram", 35000));
        employeeList.add(new Employee(103, "Shyam", 45000));
        employeeList.add(new Employee(101, "Hari", 55000));
        employeeList.add(new Employee(104, "Kiran", 50000));
        employeeList.add(new Employee(107, "Harsh", 30000));
        employeeList.add(new Employee(105, "Aman", 40000));
        employeeList.add(new Employee(106, "Anukta", 38000));
        employeeList.add(new Employee(110, "Aditya", 48000));
        employeeList.add(new Employee(108, "Sumit", 25000));
        employeeList.add(new Employee(119, "Bikash", 45000));

        TreeSet<Employee> sortedEmployeeSet = new TreeSet<Employee>();

        for(Employee e : employeeList) {
            if(e.getSalary() > 40000)
                sortedEmployeeSet.add(e);
        }
        Iterator<Employee> iter = sortedEmployeeSet.iterator();

        FileOutputStream fos = null;
        ObjectOutputStream oos = null;

        try {
            fos = new FileOutputStream("C:/cdk java codes/day8/Employee.txt");
            oos = new ObjectOutputStream(fos);
            //oos.writeObject(sortedEmployeeSet);
            while (iter.hasNext()) {
                oos.writeObject(iter.next());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally{
            try{
                if(oos != null){
                    oos.close();
                }
                if(fos != null){
                    fos.close();
                }
            }catch(IOException e){
                e.printStackTrace();
            }
        }

        FileInputStream fis = null;
        ObjectInputStream ois = null;

        try {
            fis = new FileInputStream("C:/cdk java codes/day8/Employee.txt");
            ois = new ObjectInputStream(fis);
            Employee value = (Employee) ois.readObject();
            //System.out.println(value);
            while (value != null) {
                System.out.println(value);
                value = (Employee) ois.readObject();
            }
        } catch (EOFException e) {
            System.out.println("End of file");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally{
            try{
                if(ois != null){
                    ois.close();
                }
                if(fis != null){
                    fis.close();
                }
            }catch(IOException e){
                e.printStackTrace();
            }
        }
    }
}
