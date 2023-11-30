package com.oskarjohansson.dungeonrun.Model.Monster.Monster;

import com.oskarjohansson.dungeonrun.Model.Monster.EnemyParentModel;

public class Grunt extends EnemyParentModel {

    public Grunt() {
        super();
        this.setName("Grunt");
        this.setHealthPoints(5);
        this.setHealthPointsBase(5);
        this.setDamageMin(1);
        this.setDamageMax(3);
        this.setAttackCost(1);
        this.setTurningPoints(2);
        this.setTurningPointsBase(2);
        this.setExperiencePoints(5);
        this.setGold(3);
        this.setLevel(2);
        this.setBlockLevel(2);
    }
}
