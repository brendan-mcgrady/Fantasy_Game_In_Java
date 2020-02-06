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

    public int getMaxHp() {
        return maxHp;
    }

    public int getCurrentHP() {
        return currentHP;
    }

    public ArrayList<Weapon> getWeapons() {
        return weapons;
    }

    public int getGold() {
        return gold;
    }

    public void setMaxHp(int maxHp) {
        this.maxHp = maxHp;
    }

    public void setCurrentHP(int currentHP) {
        this.currentHP = currentHP;
    }

    public void setWeapons(ArrayList<Weapon> weapons) {
        this.weapons = weapons;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }
}
