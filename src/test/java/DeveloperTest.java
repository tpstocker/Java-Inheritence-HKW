import org.junit.Before;
import org.junit.Test;
import techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {
    Developer developer;

    @Before
    public void before(){
        developer = new Developer("Alice", "JN213465G", 18500);
    }

    @Test
    public void developerHasName(){
        assertEquals("Alice", developer.getName());
    }

    @Test
    public void developerHasNin(){
        assertEquals("JN213465G", developer.getNin());
    }

    @Test
    public void developerHasSalary(){
        assertEquals(18500, developer.getSalary(), 0.0);
    }

    @Test
    public void canChangeEmployeeName(){
        developer.setName("");
        assertEquals("", developer.getName());
    }


}
