package package10;
import java.lang.annotation.Retention;
import java.util.Comparator;

        public class EmployeeComparator implements Comparator<Employee> {

            @Override
            public int compare(Employee e1, Employee e2) {
                int v = e1.getLocation().compareTo(e2.getLocation());

                if(v!=0)
                    return v;

                v = e1.getDept().compareTo(e2.getDept());

                if(v!=0)
                    return v;

                v = e1.getFName().compareTo(e2.getFName());

                if(v!=0)
                    return v;

                v = e1.getLName().compareTo(e2.getLName());

                if(v!=0)
                    return v;

                v = e1.getEmpid() - e2.getEmpid();

                return v;
            }
        }

