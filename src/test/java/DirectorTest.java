import org.junit.Before;
import org.junit.Test;
import staff.Director;

import static org.junit.Assert.assertEquals;

public class DirectorTest {
    Director director;

    @Before
    public void before() {
        director = new Director("Jason", "JN223465D", 55000, "Commercial",100000);
    }

    @Test
    public void directorHasName() {
        assertEquals("Jason", director.getName());
    }

    @Test
    public void directorHasNin() {
        assertEquals("JN223465D", director.getNin());
    }

    @Test
    public void directorHasSalary() {
        assertEquals(55000, director.getSalary(), 0.0);
    }

    @Test
    public void directorHasDept() {
        assertEquals("Commercial", director.getDeptName());
    }

    @Test
    public void directorCanRaiseSalary() {
        assertEquals(55100, director.raiseSalary(), 0.0);
    }

    @Test
    public void directorHasBudget(){
        assertEquals(100000, director.getBudget(),0.0);}


    @Test
    public void directorGetBonus(){
        assertEquals(1100, director.payBonus(), 0.0);}
    }
