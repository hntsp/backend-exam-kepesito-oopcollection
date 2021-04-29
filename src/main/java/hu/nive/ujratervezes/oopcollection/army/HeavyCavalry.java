package hu.nive.ujratervezes.oopcollection.army;

public class HeavyCavalry extends MilitaryUnit {

    static final int HIT_POINTS = 150;
    static final int DAMAGE = 20;
    static boolean HAS_ARMOR = true;
    static boolean isFirstAttack = true;

    public HeavyCavalry() {
        super (HIT_POINTS, DAMAGE, HAS_ARMOR);


    }

    @Override
    public int doDamage() {
        if(isFirstAttack) {
            isFirstAttack = false;
            return super.doDamage() * 3;
        }
        return super.doDamage();
    }
}