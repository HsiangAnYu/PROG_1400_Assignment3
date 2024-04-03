package Character;

import Item.Armor;
import Item.Weapon;

import java.util.Random;

public class Monster extends Character{
    private int exp;

    public Monster(String name, int hp, int mp, int atk, int def, int exp){
        this.setName(name);
        this.setMp(mp);
        this.setHp(hp);
        this.setAtk(atk);
        this.setDef(def);
        this.exp = exp;
    }

    @Override
    public String toString() {
        return "Type: " + this.getName() + "\n" +
                "HP: " + this.getHp() + "\n" +
                "MP: " + this.getMp() + "\n" +
                "Atk: " + this.getAtk() +  "\n" +
                "Def: " + this.getDef() + "\n" +
                "Exp: " + this.exp;
    }
}
