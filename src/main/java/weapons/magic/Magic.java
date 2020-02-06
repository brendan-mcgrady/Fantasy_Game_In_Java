package weapons.magic;

public abstract class Magic {

    private double damageBuff;
    private String name;

    public Magic(String name, double damageBuff) {
        this.name = name;
        this.damageBuff = damageBuff;
    }

    public double getDamageBuff() {
        return this.damageBuff;
    }

}
