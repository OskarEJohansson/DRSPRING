package com.oskarjohansson.dungeonrun.Model.Monster.Monster;


import com.oskarjohansson.dungeonrun.Model.Monster.EnemyParentModel;

public class Minion extends EnemyParentModel {

    public Minion() {
        this.setName("Minion");
        this.setHealthPoints(3);
        this.setHealthPointsBase(3);
        this.setDamageMin(1);
        this.setDamageMax(2);
        this.setAttackCost(1);
        this.setTurningPoints(1);
        this.setTurningPointsBase(1);
        this.setExperiencePoints(1);
        this.setGold(1);
        this.setLevel(1);
        this.setBlockLevel(1);
    }
}
