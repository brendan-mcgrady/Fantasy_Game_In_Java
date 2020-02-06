package playersTests.magesTests;

import org.junit.Before;
import org.junit.Test;
import players.mages.Spell;

import static org.junit.Assert.assertEquals;

public class SpellTest {

    Spell freezeBolt;

    @Before
    public void before() {
        freezeBolt = new Spell(2, "Freeze", 50, 4);
    }

    @Test
    public void getName() {
        assertEquals(2, freezeBolt.getDamage());
    }

    @Test
    public void getEffect() {
        assertEquals("Freeze", freezeBolt.getEffect());
    }

    @Test
    public void getManaCost() {
        assertEquals(50, freezeBolt.getManaCost());
    }

    @Test
    public void getRange() {
        assertEquals(4, freezeBolt.getRange());
    }

}
