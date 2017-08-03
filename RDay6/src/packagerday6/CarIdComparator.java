package packagerday6;

import java.util.Comparator;

/**
 * Created by sahoos on 7/25/2017.
 */
public class CarIdComparator implements Comparator<Car> {

    public int compare(Car car1,Car car2){
        if(car1.getId() == car2.getId())
            return 0;
        else if(car1.getId() > car2.getId()){
            return 1;
        }
        return -1;
    }
}
