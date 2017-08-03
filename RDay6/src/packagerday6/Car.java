package packagerday6;

/**
 * Created by sahoos on 7/25/2017.
 */
public class Car implements Comparable<Car> {

    private int id;
    private int price;
    private String brand;

    public Car(int id, int price, String brand) {
        this.id = id;
        this.price = price;
        this.brand = brand;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    //default natural sorting
    public int compareTo(Car car){
        if(this.price == car.price)
            return 0;
        else if(this.price > car.price){
            return -1;
        }
        return 1;
    }

    public boolean equals(Object object){
        if(object instanceof Car){
            Car c = (Car)object;
            if(this.id == c.id && this.brand.equals(c.brand) && this.price == c.price ){
                return true;
            }else{
                return false;
            }
        }
        return false;
    }
}
