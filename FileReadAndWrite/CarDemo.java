package packagerday8;

import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

/**
 * Created by sahoos on 7/27/2017.
 */
public class CarDemo {

    public static void main(String[] args) {

        Set<Car> carSet = new HashSet<Car>();

        carSet.add(new Car("Toyota"));
        carSet.add(new Car("BMW"));
        carSet.add(new Car("Renault"));
        carSet.add(new Car("Maruti"));

        List<Car> carList = new ArrayList<Car>();
        carList.addAll(carSet);
        FileWriter fileWriter = null;
        try{
            fileWriter = new FileWriter("C:/cdk java codes/day8/Car.txt");
            Iterator<Car> itr = carSet.iterator();
            while (itr.hasNext()) {
               Car car = itr.next();
               fileWriter.write(car.getName()+"\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
