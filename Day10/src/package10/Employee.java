package package10;

/**
 * Created by sahoos on 7/22/2017.
 */
public class Employee {

    private String FName;
    private String LName;
    private String Dept;
    private int empid;
    private String location;

    public String getFName() {
        return FName;
    }

    public void setFName(String FName) {
        this.FName = FName;
    }

    public String getLName() {
        return LName;
    }

    public void setLName(String LName) {
        this.LName = LName;
    }

    public String getDept() {
        return Dept;
    }

    public void setDept(String dept) {
        Dept = dept;
    }

    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Employee(String FName, String LName, String dept, int empid, String location) {
        this.FName = FName;
        this.LName = LName;
        this.Dept = dept;
        this.empid = empid;
        this.location = location;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "FName='" + FName + '\'' +
                ", LName='" + LName + '\'' +
                ", Dept='" + Dept + '\'' +
                ", empid=" + empid +
                ", location='" + location + '\'' +
                '}';
    }
}
