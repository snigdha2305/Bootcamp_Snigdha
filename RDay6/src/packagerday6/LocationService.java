package packagerday6;

/**
 * Created by sahoos on 7/25/2017.
 */
public class LocationService {

    public static String retrieveLocation(String email) {
        if(email.endsWith("@yahoo.com")) {
            return "USA";
        }else{
            return "Pakistan";
        }
    }

    public static boolean checkLocation(String location){
        //20 loc to check in DB
        if(location.equals("USA")) {
            return true;
        }else{
            return false;
        }
    }
}
