package hu.nive.ujratervezes.oopcollection.army;

public class Swordsman extends MilitaryUnit {

    static final int HIT_POINTS = 100;
    static final int DAMAGE = 10;
    //static boolean hasArmor = true;
    static boolean hasShield = true;

    public Swordsman(boolean hasArmor) {
        super(HIT_POINTS, DAMAGE, hasArmor);


    }


    @Override
    public void sufferDamage(int damage) {
        if (hasShield) {
        hasShield = false;}
        else super.sufferDamage(damage);
    }


}