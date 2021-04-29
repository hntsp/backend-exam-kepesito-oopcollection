package hu.nive.ujratervezes.oopcollection.army;

import java.util.ArrayList;
import java.util.List;

public class Army {


    private List<MilitaryUnit> army = new ArrayList<>();


   // public Army(List<MilitaryUnit> army) {
     //   this.army = army;
    //}

    public Army() {
    }

    public void addUnit(MilitaryUnit militaryUnit) {
        army.add(new MilitaryUnit() {});
    }

    public int damageAll(int damage) {
        return 0;

    }

    public List<MilitaryUnit> getArmy() {
        return army;
    }

    public int getArmyDamage() {
        return army.stream().mapToInt(MilitaryUnit::doDamage).sum();

    }

    public int getArmySize() {
        return army.size();
    }
}