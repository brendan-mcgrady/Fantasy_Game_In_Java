import org.junit.Before;
import org.junit.Test;
import weapons.melee.Axe;
import static org.junit.Assert.assertEquals;


public class AxeTest {

    Axe axe;

    @Before
    public void before() {
        axe = new Axe("Big Choppa", 7, 6);
    }

    @Test
    public void axeHasName() {
        assertEquals("Big Choppa", axe.getName());
    }

    @Test
    public void axeHasDamageValue() {
        assertEquals(7, axe.getDamage());
    }

    @Test
    public void axeHasStrengthReq() {
        assertEquals(6, axe.getStrengthReq());
    }

}
