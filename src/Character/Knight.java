package Character;

import Item.Armor;
import Item.Weapon;

public class Knight extends Player{
    private int hpBonus = 50;

    public Knight(String playerName, Weapon weapon, Armor armor, int hp, int mp, int atk, int def){
        this.setPlayerName(playerName);
        this.setWeapon(weapon);
        this.setArmor(armor);

        //assign name
        this.setName("Knight");
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
                "HP: " + this.getHp() + " + " + this.getArmor().getHpBonus() + " + (" + this.hpBonus + ")" + "\n" +
                "MP: " + this.getMp() + " + " + this.getArmor().getMpBonus() + "\n" +
                "Atk: " + this.getAtk() + " + " + this.getWeapon().getAtkBonus() + "\n" +
                "Def: " + this.getDef() + " + " + this.getArmor().getDefBonus();
    }
}
