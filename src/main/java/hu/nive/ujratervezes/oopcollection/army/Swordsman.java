package hu.nive.ujratervezes.oopcollection.army;

public class Swordsman extends MilitaryUnit {

    static final int HIT_POINTS = 100;
    static final int DAMAGE = 10;
    static boolean hasArmor = true;
    static boolean hasShield = true;

    public Swordsman(boolean hasArmor) {


    }


    @Override
    public int sufferDamage(int damage) {
        if (hasShield) { damage = 0;
        hasShield = false;}
        return super.sufferDamage(damage);
    }


}