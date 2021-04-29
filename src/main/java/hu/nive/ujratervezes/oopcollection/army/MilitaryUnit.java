package hu.nive.ujratervezes.oopcollection.army;

public abstract class MilitaryUnit {

    private int hitPoints;
    private int damage;
    private boolean hasArmor;

    public MilitaryUnit(int hitPoints, int damage, boolean hasArmor) {

        this.hitPoints = hitPoints;
        this.damage = damage;
        this.hasArmor = hasArmor;


    }



    public int doDamage() {
        return damage;
    }

    public void sufferDamage(int damage) {

        if (hasArmor) hitPoints = hitPoints - (damage / 2);
        else {hitPoints = hitPoints - damage;}
    }

    public  int getHitPoints() {
        return hitPoints;
    }
}
