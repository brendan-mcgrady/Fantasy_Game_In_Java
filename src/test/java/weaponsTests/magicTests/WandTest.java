import org.junit.Before;
import org.junit.Test;
import weapons.magic.Wand;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class WandTest {

    Wand wand;

    @Before
    public void before() {
        wand = new Wand("Elder", .12);
    }

    @Test
    public void getName() {
        assertEquals("Elder", wand.getName());
    }

    @Test
    public void getDamageBuff() {
        assertEquals(.12, wand.getDamageBuff(), 0.00);
    }

}