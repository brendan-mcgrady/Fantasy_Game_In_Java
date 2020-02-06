package players;

import weapons.magic.Magic;
import weapons.melee.Melee;

import java.util.ArrayList;

public abstract class Player {

    private int maxHp;
    private int currentHP;
    protected ArrayList<Melee> meleeWeapons;
    protected ArrayList<Magic> magicWeapons;
    private int gold;

    public Player(int maxHp, int currentHP, int gold) {
        this.maxHp = maxHp;
        this.currentHP = currentHP;
        this.meleeWeapons = new ArrayList<Melee>();
        this.magicWeapons = new ArrayList<Magic>();
        this.gold = gold;
    }

    public int getMaxHp() {
        return maxHp;
    }

    public int getCurrentHP() {
        return currentHP;
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

    public void setGold(int gold) {
        this.gold = gold;
    }

    public ArrayList<Melee> getMeleeWeapons() {
        return meleeWeapons;
    }

    public void setMeleeWeapons(ArrayList<Melee> meleeWeapons) {
        this.meleeWeapons = meleeWeapons;
    }
}
