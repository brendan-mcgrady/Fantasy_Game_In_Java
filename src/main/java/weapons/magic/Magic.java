package weapons.magic;

import weapons.Weapon;

public abstract class Magic extends Weapon {

    private double damageBuff;

    public Magic(String name, double damageBuff) {
        super(name);
        this.damageBuff = damageBuff;
    }

    public double getDamageBuff() {
        return this.damageBuff;
    }

}
