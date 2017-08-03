import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

class YearValues {

	public static final int Y1 = 2015;
	public static final int Y2 = 2016;
	public static final int Y3 = 2017;
	public static final int Y4 = 2018;
	public static final int Y5 = 2019;
	public static final int Y6 = 2020;
}


enum Day{
		MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
	}
enum Month{
		JAN, FEB, MAR, APR, MAY, JUN, JUL, AUG, SEPT, OCT, NOV, DEC
	}
enum Year{
		Y1, Y2, Y3, Y4, Y5, Y6
	}


@Retention(RetentionPolicy.SOURCE)
@Target({ElementType.TYPE, ElementType.METHOD})
@interface Timestamp {

	Day day();
	Month month();
	Year year();
}


