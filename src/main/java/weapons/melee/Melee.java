package weapons.melee;

import weapons.Weapon;

public abstract class Melee extends Weapon {

    private int strengthReq;

    public Melee(String name, int damage, int strengthReq) {
        super(name, damage);
        this.strengthReq = strengthReq;
    }

    public int getStrengthReq() {
        return this.strengthReq;
    }
}
