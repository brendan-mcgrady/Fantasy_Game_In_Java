import org.junit.Before;
import org.junit.Test;
import weapons.magic.Deathcap;

import static org.junit.Assert.assertEquals;

public class DeathcapTest {

    Deathcap deathcap;

    @Before
    public void before () {
        deathcap = new Deathcap("Deathcap", .65);
    }

    @Test
    public void hasName() {
        assertEquals("Deathcap", deathcap.getName());
    }

    @Test
    public void hasDamageBuff() {
        assertEquals(.65, deathcap.getDamageBuff(), .00);
    }

}