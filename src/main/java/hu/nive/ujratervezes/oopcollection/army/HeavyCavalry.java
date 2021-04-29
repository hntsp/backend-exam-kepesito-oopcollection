package hu.nive.ujratervezes.oopcollection.army;

public class HeavyCavalry extends MilitaryUnit {

    static final int HIT_POINTS = 150;
    static final int DAMAGE = 20;
    static boolean hasArmor = true;
    static boolean isFirstAttack = true;

    public HeavyCavalry() {


    }

    @Override
    public int doDamage() {
        if(isFirstAttack) {
            isFirstAttack = false;
            return doDamage()*3;
        }
        return super.doDamage();
    }
}