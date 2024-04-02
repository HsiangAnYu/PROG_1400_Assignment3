package Item;

public class Armor extends Item{
    private int hpBonus;
    private int mpBonus;
    private int defBonus;

    public Armor(String name, int hpBonus, int mpBonus, int defBonus){
        this.setName(name);
        this.hpBonus = hpBonus;
        this.mpBonus = mpBonus;
        this.defBonus = defBonus;
    }

    @Override
    public String toString() {
        return this.getName() + "\n" +
                "HP + " + this.hpBonus + "\n" +
                "MP + " + this.mpBonus + "\n" +
                "Def + " + this.defBonus;

    }

    public int getHpBonus() {
        return hpBonus;
    }

    public int getMpBonus() {
        return mpBonus;
    }

    public int getDefBonus() {
        return defBonus;
    }
}
