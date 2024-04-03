package Character;

import Item.Armor;
import Item.Weapon;

public class Shaman extends Player{
    private int mpBonus = 50;

    public Shaman(String playerName, Weapon weapon, Armor armor, int hp, int mp, int atk, int def){
        this.setPlayerName(playerName);
        this.setWeapon(weapon);
        this.setArmor(armor);

        //assign name
        this.setName("Shaman");
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
                "MP: " + this.getMp() + " + " + this.getArmor().getMpBonus() + " + (" + this.mpBonus + ")" + "\n" +
                "Atk: " + this.getAtk() + " + " + this.getWeapon().getAtkBonus() + "\n" +
                "Def: " + this.getDef() + " + " + this.getArmor().getDefBonus();
    }
}
