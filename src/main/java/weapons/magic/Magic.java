package weapons.magic;

import weapons.Weapon;

public abstract class Magic extends Weapon {

    private double damageBuff;

    public Magic(String name, int damage, double damageBuff) {
        super(name, damage);
        this.damageBuff = damageBuff;
    }

    public double getDamageBuff() {
        return this.damageBuff;
    }


}
