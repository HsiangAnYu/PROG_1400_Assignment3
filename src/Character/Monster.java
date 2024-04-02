package Character;

import Item.Armor;
import Item.Weapon;

import java.util.Random;

public class Monster extends Character{
    private int exp = 5;

    public Monster(){
        this.setName("Slime");
        this.setMp(new Random().nextInt(50,80));
        this.setHp(new Random().nextInt(50,80));
        this.setAtk(new Random().nextInt(5,10));
        this.setDef(new Random().nextInt(5,10));
    }

    @Override
    public String toString() {
        return "Class: " + this.getName() + "\n" +
                "Name: Bob"  +
                "HP: " + this.getHp() + "\n" +
                "MP: " + this.getMp() + "\n" +
                "Atk: " + this.getAtk() +  "\n" +
                "Def: " + this.getDef() + "\n" +
                "Exp: " + this.exp;
    }
}
