import management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before(){
        manager = new Manager("Dave Manager", 1234567, 40_000, "sales");
    }

    @Test
    public void hasName(){
        assertEquals("Dave Manager", manager.getName());
    }

    @Test
    public void hasNINumber(){
        assertEquals(1234567, manager.getNiNumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(40_000, manager.getSalary(), 0.0);
    }

    @Test
    public void hasDept(){
        assertEquals("sales", manager.getDeptName());
    }

    @Test
    public void canRaiseSalary(){
        manager.raiseSalary(0.1);
        assertEquals(44_000, manager.getSalary(), 0.0);
    }

    @Test
    public void hasPayBonus(){
        assertEquals(400, manager.payBonus(), 0.0);
    }
}



