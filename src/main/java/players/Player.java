package players;

import weapons.Weapon;

import java.util.ArrayList;

public abstract class Player {

    private int maxHp;
    private int currentHP;
    protected ArrayList<Weapon> weapons;
    private int gold;

    public Player(int maxHp, int currentHP, int gold) {
        this.maxHp = maxHp;
        this.currentHP = currentHP;
        this.weapons = new ArrayList<Weapon>();
        this.gold = gold;
    }


}
