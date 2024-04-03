package Character;

import Item.Armor;
import Item.Weapon;

public class Archer extends Player{
    private int atkBonus = 5;

    public Archer(String playerName, Weapon weapon, Armor armor, int hp, int mp, int atk, int def){
        this.setPlayerName(playerName);
        this.setWeapon(weapon);
        this.setArmor(armor);

        //assign name
        this.setName("Archer");
        //assign random number to states
        this.setHp(hp);
        this.setMp(mp);
        this.setAtk(atk);
        this.setDef(def);
    }

    @Override
    public String toString() {
        return "Class: " + this.getName() + "\n" +
                "Name: " + this.getPlayerName() + "\n" +
                "HP: " + this.getHp() + " + " + this.getArmor().getHpBonus() + "\n" +
                "MP: " + this.getMp() + " + " + this.getArmor().getMpBonus() + "\n" +
                "Atk: " + this.getAtk() + " + " + this.getWeapon().getAtkBonus() + " + (" + this.atkBonus + ")" + "\n" +
                "Def: " + this.getDef() + " + " + this.getArmor().getDefBonus();
    }
}
