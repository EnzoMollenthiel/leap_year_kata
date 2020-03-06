import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class LeapYearsTest {

    private static final LeapYears learYears = new LeapYears();

    @Test
    public void isLeapYear_should_return_true_if_year_is_dividable_by_400() {
        int year = 2000;

        assertEquals("Should return true if year is dividable by 400", true, learYears.isLeapYear(year));
    }

    @Test
    public void isLeapYear_should_return_false_if_year_is_dividable_by_100_but_not_by_400() {
        int year = 2100;

        assertEquals("Should return true if year is dividable by 100 but not by 400", false, learYears.isLeapYear(year));
    }

    @Test
    public void isLeapYear_should_return_true_if_year_is_dividable_by_4_but_not_by_100() {
        int year = 2008;

        assertEquals("Should return true if year is dividable by 4 but not by 100", true, learYears.isLeapYear(year));
    }

    @Test
    public void isLeapYear_should_return_false_if_year_is_not_dividable_by_4() {
        int year = 2017;

        assertEquals("Should return false if year is not dividable by 4", false, learYears.isLeapYear(year));
    }
}
