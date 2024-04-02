package Character;

import Item.Armor;
import Item.Weapon;

public class Ninja extends Player{
    private int defBonus = 5;

    public Ninja(String playerName, Weapon weapon, Armor armor){
        this.setPlayerName(playerName);
        this.setWeapon(weapon);
        this.setArmor(armor);

        //assign name
        this.setName("Ninja");
        //assign random number to states
        this.randomState();
        //assign description
        this.setDescription("This is a Ninja, has 5 def bonus");
    }

    @Override
    public String toString() {
        return "Class: " + this.getName() + "\n" +
                "Name: " + this.getPlayerName() + "\n" +
                "HP: " + this.getHp() + " + " + this.getArmor().getHpBonus() + "\n" +
                "MP: " + this.getMp() + " + " + this.getArmor().getMpBonus() + "\n" +
                "Atk: " + this.getAtk() + " + " + this.getWeapon().getAtkBonus() + "\n" +
                "Def: " + this.getDef() + " + " + this.getArmor().getDefBonus() + " + (" + this.defBonus + ")";
    }
}
