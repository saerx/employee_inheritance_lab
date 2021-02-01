import org.junit.Before;
import org.junit.Test;
import techStaff.DatabaseAdmin;
import techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void before(){
        databaseAdmin = new DatabaseAdmin("Carol Database", 2345678, 20_000);
    }

    @Test
    public void hasName(){
        assertEquals("Carol Database", databaseAdmin.getName());
    }

    @Test
    public void hasNINumber(){
        assertEquals(2345678, databaseAdmin.getNiNumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(20_000, databaseAdmin.getSalary(), 0.0);
    }

    @Test
    public void canRaiseSalary(){
        databaseAdmin.raiseSalary(0.1);
        assertEquals(22_000, databaseAdmin.getSalary(), 0.0);
    }

    @Test
    public void hasPayBonus(){
        assertEquals(200, databaseAdmin.payBonus(), 0.0);
    }
}
