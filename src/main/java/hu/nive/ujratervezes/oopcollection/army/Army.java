package hu.nive.ujratervezes.oopcollection.army;

import java.util.ArrayList;
import java.util.List;

public class Army {


    private List<MilitaryUnit> army = new ArrayList<>();

    public void addUnit(MilitaryUnit militaryUnit) {
        army.add(militaryUnit);
    }

    public void damageAll(int damage) {
        army.forEach(militaryUnit -> militaryUnit.sufferDamage(damage));
        army.removeIf(militaryUnit -> militaryUnit.getHitPoints() < 25);
    }


    public int getArmyDamage() {
        return army.stream().mapToInt(MilitaryUnit::doDamage).sum();

    }

    public int getArmySize() {
        return army.size();
    }
}