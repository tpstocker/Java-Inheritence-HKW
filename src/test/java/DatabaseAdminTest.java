import org.junit.Before;
import org.junit.Test;
import techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {
    DatabaseAdmin databaseAdmin;

    @Before
    public void before(){
        databaseAdmin = new DatabaseAdmin("Paul", "JN785467Y", 19200);
    }

    @Test
    public void databaseAdminHasName(){
        assertEquals("Paul", databaseAdmin.getName());
    }

    @Test
    public void databaseAdminHasNin(){
        assertEquals("JN785467Y", databaseAdmin.getNin());
    }

    @Test
    public void databaseAdminHasSalary(){
        assertEquals(19200, databaseAdmin.getSalary(), 0.0);
    }


}
