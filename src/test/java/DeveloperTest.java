import management.Manager;
import org.junit.Before;
import org.junit.Test;
import techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before(){
        developer = new Developer("Jim Developer", 7654321, 20_000);
    }

    @Test
    public void hasName(){
        assertEquals("Jim Developer", developer.getName());
    }

    @Test
    public void hasNINumber(){
        assertEquals(7654321, developer.getNiNumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(20_000, developer.getSalary(), 0.0);
    }

    @Test
    public void canRaiseSalary(){
        developer.raiseSalary(0.1);
        assertEquals(22_000, developer.getSalary(), 0.0);
    }

    @Test
    public void hasPayBonus(){
        assertEquals(200, developer.payBonus(), 0.0);
    }
}
