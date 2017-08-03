package packagerday7;

/**
 * Created by sahoos on 7/26/2017.
 */
public class MovieService {

    public void buy (User user, Double price) throws InvalidPriceException{

            if(price < 0) {
                InvalidPriceException e1 = new InvalidPriceException("Price is invalid");
                throw e1;
            }
    }

    public void watch(User user) throws InvalidAgeException, AgeLessThanTenException, AgeLessThanTwentyException, RatingException{

        if(user.getAge() < 0) {
            InvalidAgeException e2 = new InvalidAgeException("User age is invalid");
            throw e2;
        }

        if(user.getAge() < 10) {
            AgeLessThanTenException e3 = new AgeLessThanTenException("User age is less than 10");
            throw e3;
        }

        if(user.getAge() < 20) {
            AgeLessThanTwentyException e4 = new AgeLessThanTwentyException("User age is less than 20");
            throw e4;
        }

        if(user.getRating() < 3) {
            RatingException e5 = new RatingException("User rating is less than 3");
            throw e5;
        }
    }

}
