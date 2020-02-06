package players.fighters;

import players.Player;
import weapons.Weapon;

public interface IAttack {

     void changeWeapon(int weaponWanted);

     void fight(Player player);
}
