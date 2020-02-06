import org.junit.Before;
import org.junit.Test;
import weapons.magic.Staff;

import static org.junit.Assert.assertEquals;

public class StaffTest {

    Staff staff;

    @Before
    public void before() {
        staff = new Staff("Haunted Skeletal Pole", .2);
    }

    @Test
    public void hasName() {
        assertEquals("Haunted Skeletal Pole", staff.getName());
    }

    @Test
    public void hasDamageBuff() {
        assertEquals(.2, staff.getDamageBuff(), 0.00);
    }

}