package weapons.melee;

import weapons.Weapon;

public abstract class Melee extends Weapon {

    private int damage;
    private int strengthReq;

    public Melee(String name, int damage, int strengthReq) {
        super(name);
        this.damage = damage;
        this.strengthReq = strengthReq;
    }

    public int getDamage() {
        return this.damage;
    }

    public int getStrengthReq() {
        return this.strengthReq;
    }

}
