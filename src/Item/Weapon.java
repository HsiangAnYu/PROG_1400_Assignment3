package Item;

public class Weapon extends Item {
    private int atkBonus;

    public Weapon(String name, int atkBonus){
        this.setName(name);
        this.atkBonus = atkBonus;
    }

    @Override
    public String toString() {
        return this.getName() + "\n" +
                "Atk + " + this.atkBonus;
    }

    public int getAtkBonus() {
        return atkBonus;
    }
}
