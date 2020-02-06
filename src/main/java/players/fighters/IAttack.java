package players.fighters;

import players.Player;

public interface IAttack {

     void changeWeapon(int weaponWanted);

     void fight(Player player);
}
