package packagerday6;
import org.junit.Test;

import java.util.*;
/**
 * Created by sahoos on 7/25/2017.
 */
public class CarDemo {

    public static void main(String[] args) {

        Set<Car> carSet = new TreeSet<Car>();

        carSet.add(new Car(110, 300000, "Toyota"));
        carSet.add(new Car(103, 400000, "BMW"));
        carSet.add(new Car(101, 200000, "Renault"));
        carSet.add(new Car(102, 250000, "Maruti"));
        carSet.add(new Car(104, 350000, "Mercedes"));
        carSet.add(new Car(109, 500000, "Rolls Royce"));
        carSet.add(new Car(105, 450000, "Honda"));
        carSet.add(new Car(107, 400000, "Toyota"));
        carSet.add(new Car(106, 420000, "Audi"));
        carSet.add(new Car(108, 340000, "Ford"));
        carSet.add(new Car(115, 390000, "Bentley"));
        carSet.add(new Car(113, 430000, "Aston Martin"));
        carSet.add(new Car(112, 230000, "Volvo"));
        carSet.add(new Car(114, 560000, "Porsche"));
        carSet.add(new Car(116, 600000, "Jaguar"));
        carSet.add(new Car(120, 550000, "Ferrari"));
        carSet.add(new Car(117, 650000, "Volkswagen"));
        carSet.add(new Car(119, 370000, "Chevrolet"));
        carSet.add(new Car(118, 730000, "Dodge"));
        carSet.add(new Car(111, 680000, "Fiat"));

        /*CarPriceComparator priceComparator = new CarPriceComparator();
        CarIdComparator idComparator = new CarIdComparator();
        CarBrandComparator brandComparator = new CarBrandComparator();*/

       for(Car c : carSet) {
           System.out.println("id = " + c.getId() + " price = " + c.getPrice() + " brand = " + c.getBrand());
       }

    }
}
