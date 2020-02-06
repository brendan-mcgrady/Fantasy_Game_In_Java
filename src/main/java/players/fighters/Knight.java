package players.fighters;

import players.Player;
import weapons.Weapon;

import java.util.ArrayList;

public class Knight extends Fighter {

    public Knight(int maxHp, int currentHP, int gold) {
       super(maxHp,currentHP,gold);
    }

    public void changeWeapon(int weaponWanted){
        this.weaponEquipped = weaponWanted;
    }

    public void fight(Player player){
        int playerHP = player.getCurrentHP();
        int newplayerHP = playerHP - this.weapons.get(weaponEquipped).getDamage();
        player.setCurrentHP(newplayerHP);
    }

}
