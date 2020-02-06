import org.junit.Before;
import players.fighters.Knight;
import weapons.melee.Axe;
import weapons.melee.Sword;

public class KnightTest {

    private Knight knight;
    private Sword sword;
    private Axe axe;

    @Before
    public void before(){
        knight = new Knight(200,200,50);

        sword = new Sword("Excalibur",100,7);
        axe = new Axe("Two head",150, 9);
    }
}