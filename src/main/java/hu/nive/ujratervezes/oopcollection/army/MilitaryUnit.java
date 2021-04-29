package hu.nive.ujratervezes.oopcollection.army;

public abstract class MilitaryUnit {

    private int hitPoints;
    private int damage;
    private boolean hasArmor;

    public MilitaryUnit() {
        /*
        this.hitPoints = hitPoints;
        this.damage = damage;
        this.hasArmor = hasArmor;

         */
    }



    public int doDamage() {
        return damage;
    }

    public int sufferDamage(int damage) {

        if (hasArmor) return hitPoints - (damage / 2);
        else {return hitPoints - damage;}
    }

    public  int getHitPoints() {
        return hitPoints;
    }
}
