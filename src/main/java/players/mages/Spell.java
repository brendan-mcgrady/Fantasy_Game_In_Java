package players.mages;

public class Spell {

    private int damage;
    private String effect;
    private int manaCost;
    private int range;

    public Spell(int damage, String effect, int manaCost, int range) {
        this.damage = damage;
        this.effect = effect;
        this.manaCost = manaCost;
        this.range = range;
    }

    public int getDamage() {
        return damage;
    }

    public String getEffect() {
        return effect;
    }

    public int getManaCost() {
        return manaCost;
    }

    public int getRange() {
        return range;
    }

}
