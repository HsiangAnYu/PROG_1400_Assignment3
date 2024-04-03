package Character;

import Item.Armor;
import Item.Weapon;

import java.util.Random;

public abstract class Player extends Character {
    //variable
    private String playerName;
    private Weapon weapon;
    private Armor armor;


    //getter and setter

    public String getPlayerName() {
        return playerName;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public Armor getArmor() {
        return armor;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }
}
