import org.junit.Before;
import org.junit.Test;
import techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before() {
        developer = new Developer("Dave", "AS10111982", 30000);
    }

    @Test
    public void canGetName() {
        assertEquals("Dave", developer.getName());
    }

    @Test
    public void canGetNINumber() {
        assertEquals("AS10111982", developer.getNINumber());
    }

}
