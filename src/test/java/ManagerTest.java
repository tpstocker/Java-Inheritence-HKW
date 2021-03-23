import jdk.internal.org.objectweb.asm.tree.MultiANewArrayInsnNode;
import org.junit.Before;
import org.junit.Test;
import staff.Manager;

import static org.junit.Assert.assertEquals;

public class ManagerTest {
    Manager manager;

    @Before
    public void before(){
        manager = new Manager("Angus", "JN543489C", 23000, "Dog Biscuit Store");
    }

    @Test
    public void managerHasName(){
        assertEquals("Angus", manager.getName());
    }

    @Test
    public void managerHasNin(){
        assertEquals("JN543489C", manager.getNin());
    }

    @Test
    public void managerHasSalary(){
        assertEquals(23000, manager.getSalary(), 0.0);
    }

    @Test
    public void managerHasDept(){
        assertEquals("Dog Biscuit Store", manager.getDeptName());
    }

    @Test
    public void managerCanRaiseSalary(){
        assertEquals(23100, manager.raiseSalary(), 0.0);
    }

    @Test
    public void managerGetBonus(){
        assertEquals(230, manager.payBonus(), 0.0);
    }
}