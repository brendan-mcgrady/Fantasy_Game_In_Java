package players.fighters;

        import players.Player;

public class Knight extends Fighter {

    public Knight(int maxHp, int currentHP, int gold) {
        super(maxHp,currentHP,gold);
    }

    public void changeWeapon(int weaponWanted){
        this.weaponEquipped = weaponWanted;
    }

    public void fight(Player player){

    }

}
