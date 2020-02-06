package weapons.melee;

public abstract class Melee {

    private int damage;
    private int strengthReq;
    private String name;

    public Melee(String name, int damage, int strengthReq) {
        this.name = name;
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
