import management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class DirectorTest {

    Director director;

    @Before
    public void before(){
        director = new Director("Jane Director", 3456789, 80_000, "computers", 500_000);
    }

    @Test
    public void hasName(){
        assertEquals("Jane Director", director.getName());
    }

    @Test
    public void hasNINumber(){
        assertEquals(3456789, director.getNiNumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(80_000, director.getSalary(), 0.0);
    }

    @Test
    public void hasDept(){
        assertEquals("computers", director.getDeptName());
    }

    @Test
    public void canRaiseSalary(){
        director.raiseSalary(0.1);
        assertEquals(88_000, director.getSalary(), 0.0);
    }

    @Test
    public void hasPayBonus(){
        assertEquals(1600, director.payBonus(), 0.0);
    }

    @Test
    public void hasBudget(){
        assertEquals(500_000, director.getBudget(), 0.0);
    }
}
