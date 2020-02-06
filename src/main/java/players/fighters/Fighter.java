package players.fighters;

import players.Player;

public abstract class Fighter extends Player implements IAttack {

    protected int weaponEquipped;


    public Fighter(int maxHp, int currentHP, int gold) {
        super(maxHp,currentHP,gold);
        weaponEquipped = 0;
    }

    public void changeWeapon(int weaponWanted){
        this.weaponEquipped = weaponWanted;
    }

    public void fight(){

    }



}
