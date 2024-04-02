package Character;

import Item.Armor;
import Item.Weapon;

import java.util.Random;

public abstract class Player extends Character {
    //variable
    private String description;
    private String playerName;
    private Weapon weapon;
    private Armor armor;

    //function
    public void randomState(){
        this.setMp(new Random().nextInt(100,200));
        this.setHp(new Random().nextInt(100,200));
        this.setAtk(new Random().nextInt(10,20));
        this.setDef(new Random().nextInt(10,20));
    }


    //getter and setter
    public String getDescription() {
        return description;
    }

    public String getPlayerName() {
        return playerName;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public Armor getArmor() {
        return armor;
    }

    public void setDescription(String description) {
        this.description = description;
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
