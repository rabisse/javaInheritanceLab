import Management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before() {
        manager = new Manager("Bob", "JN05061985", 12000, "Bobs Dept");
    }

    @Test
    public void canGetDeptName() {
        assertEquals("Bobs Dept", manager.getDeptName());
    }

    @Test
    public void canGetSalary() {
        assertEquals(12000, manager.getSalary(), 0.0);
    }

    @Test
    public void canRaiseSalary() {
        manager.raiseSalary(1000);
        assertEquals(13000, manager.getSalary(), 0.0);
    }

    @Test
    public void canPayBonus() {
        assertEquals(120, manager.payBonus(), 0.0);
    }


}
