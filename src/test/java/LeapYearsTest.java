import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class LeapYearsTest {

    private static final LeapYears learYears = new LeapYears();

    @Test
    public void isLeapYear_should_return_true_if_year_is_dividable_by_400() {
        int year = 2000;

        assertEquals("Should return true if year is dividable by 400", true, learYears.isLeapYear(year));
    }
}
