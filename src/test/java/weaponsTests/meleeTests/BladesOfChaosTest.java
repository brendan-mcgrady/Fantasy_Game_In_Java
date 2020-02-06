import org.junit.Before;
import org.junit.Test;
import weapons.melee.BladesOfChaos;
import static org.junit.Assert.assertEquals;

public class BladesOfChaosTest {

    BladesOfChaos bladesOfChaos;

    @Before
    public void before() {
        bladesOfChaos = new BladesOfChaos("Blades of Chaos", 10, 8);
    }
    @Test
    public void bladesOfChaosHasName() {
        assertEquals("Blades of Chaos", bladesOfChaos.getName());
    }
    @Test
    public void bladesOfChaosHasDamageValue() {
        assertEquals(10, bladesOfChaos.getDamage());
    }
    @Test
    public void bladesOfChaosHasStrengthReq() {
        assertEquals(8, bladesOfChaos.getStrengthReq());
    }

}