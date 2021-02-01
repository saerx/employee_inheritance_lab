import management.Manager;
import org.junit.Before;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class ManagerTest {

    Manager manager;
    public ExpectedException thrown = ExpectedException.none();

    @Before
    public void before(){
        manager = new Manager("Dave Manager", 1234567, 40_000, "sales");
    }

    @Test
    public void hasName(){
        assertEquals("Dave Manager", manager.getName());
    }

    @Test
    public void canChangeName(){
        manager.setName("Reggie Bigshot");
        assertEquals("Reggie Bigshot", manager.getName());
    }

    @Test
    public void cantMakeNameNull(){
        assertFalse(manager.setName(null));
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
    public void cannotEnterNegativeOrZeroRaise(){
        assertFalse(manager.raiseSalary(-4));
        assertEquals(40_000, manager.getSalary(), 0.0);

    }

    @Test
    public void hasPayBonus(){
        assertEquals(400, manager.payBonus(), 0.0);
    }
}



