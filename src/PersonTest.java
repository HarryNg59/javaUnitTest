import static org.junit.jupiter.api.Assertions.assertEquals;
import java.time.LocalDate;

import org.junit.Test;

public class PersonTest {
    private final Person person = new Person("ChauHNM", LocalDate.now().getYear());

    @Test
    public void checkAgeForCinestar1() {
        person.setyOB(2008);
        assertEquals(true, person.checkAge());
    }
    @Test
    public void checkAgeForCinestar2() {
        person.setyOB(2007);
        assertEquals(true, person.checkAge());
    }
    @Test
    public void checkAgeForCinestar3() {
        person.setyOB(2006);
        assertEquals(false, person.checkAge());
    }
    @Test
    public void checkAgeForCinestar4() {
        person.setyOB(2005);
        assertEquals(true, person.checkAge());
    }
    @Test
    public void checkAgeForCinestar5() {
        person.setyOB(2004);
        assertEquals(false, person.checkAge());
    }
}
