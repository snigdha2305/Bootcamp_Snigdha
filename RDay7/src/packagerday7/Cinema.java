package packagerday7;

/**
 * Created by sahoos on 7/26/2017.
 */
public class Cinema {
    public static void main(String[] args) {
        User user = new User(123, "Ram",45,4);
        MovieService mv = new MovieService();
        try {
            mv.buy(user, -15.00);
        }catch (InvalidPriceException e){
            System.out.println(e.getMessage());
        }
    }
}
