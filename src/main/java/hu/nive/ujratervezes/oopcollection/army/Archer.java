package hu.nive.ujratervezes.oopcollection.army;

public class Archer extends MilitaryUnit {

    static final int HIT_POINTS = 50;
    static final int DAMAGE = 20;
    static boolean HAS_ARMOR = false;


    public Archer() {
        super (HIT_POINTS, DAMAGE, HAS_ARMOR);

    }
}