import org.junit.Before;
import org.junit.Test;
import weapons.melee.Sword;
import static org.junit.Assert.assertEquals;

public class SwordTest {

    Sword sword;

    @Before
    public void before() {
        sword = new Sword("Moonlight Blade", 5, 4);
    }
    @Test
    public void swordHasName() {
        assertEquals("Moonlight Blade", sword.getName());
    }
    
    @Test
    public void swordHasDamageValue() {
        assertEquals(5, sword.getDamage());
    }
    @Test
    public void swordHasStrengthReq() {
        assertEquals(4, sword.getStrengthReq());
    }

}