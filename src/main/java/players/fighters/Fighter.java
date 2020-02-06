package players.fighters;

import players.Player;
import weapons.melee.Melee;

public abstract class Fighter extends Player implements IAttack {

    protected int weaponEquipped;


    public Fighter(int maxHP, int gold) {
        super(maxHP,gold);
        weaponEquipped = 0;
    }

    public void changeWeapon(int weaponWanted){
        this.weaponEquipped = weaponWanted;
    }

    public void fight(Player player){
        int currentHP = player.getCurrentHP();
        int newHP = currentHP - this.meleeWeapons.get(weaponEquipped).getDamage();
        player.setCurrentHP(newHP);
    }

    public void changeWeapon(Melee meleeWeapon){
        this.weaponEquipped = meleeWeapons.indexOf(meleeWeapon);
    }

    public void addMeleeWeapon(Melee weapon){
        this.meleeWeapons.add(weapon);
    }



}
