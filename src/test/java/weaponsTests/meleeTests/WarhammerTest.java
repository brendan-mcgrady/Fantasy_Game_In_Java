import org.junit.Before;
import org.junit.Test;
import weapons.melee.Warhammer;
import static org.junit.Assert.assertEquals;

public class WarhammerTest {

    Warhammer warhammer;

    @Before
    public void before() {
        warhammer = new Warhammer("Blades of Chaos", 10, 8);
    }

    @Test
    public void warhammerHasName() {
        assertEquals("Blades of Chaos", warhammer.getName());
    }

    @Test
    public void warhammerHasDamageValue() {
        assertEquals(10, warhammer.getDamage());
    }

    @Test
    public void warhammerHasStrengthReq() {
        assertEquals(8, warhammer.getStrengthReq());
    }

}