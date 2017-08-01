package package9;

/**
 * Created by sahoos on 7/21/2017.
 */
public class Person {
    private String name;
    private String gender;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Person(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }

    @Override
    public boolean equals(Object obj) {

        if(obj == null)
            return false;

        String s1 = ((Person)obj).getName();
        String s2 = this.getName();
        String s3 = ((Person)obj).getGender();
        String s4 = this.getGender();
        /*if(((Person)obj).getName() == this.getName() && ((Person)obj).getGender() == this.getGender())
            return true;
        //return super.equals(obj);
        //this is p1 and obj is p2
        return false;*/

        if(s1.equals(s2) && s3.equals(s4))
            return true;
        else
            return false;
    }
}
