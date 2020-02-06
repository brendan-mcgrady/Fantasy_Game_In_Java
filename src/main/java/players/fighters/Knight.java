package players.fighters;

        import players.Player;

public class Knight extends Fighter {

    public Knight(int maxHp, int gold) {
        super(maxHp,gold);
    }

    public void changeWeapon(int weaponWanted){
        this.weaponEquipped = weaponWanted;
    }



}
