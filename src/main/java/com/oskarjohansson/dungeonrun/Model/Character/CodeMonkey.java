package com.oskarjohansson.dungeonrun.Model.Character;


import com.oskarjohansson.dungeonrun.Model.Items.Weapon.WeaponClassOne.Drone;
import jakarta.persistence.Entity;

@Entity
public class CodeMonkey extends Hero {

    public CodeMonkey() {
        this.setHeroClass("Code Monkey");
        this.setStrength(this.getStrength() + 5);
        this.setIntelligence(this.getIntelligence() + 5);
        this.setAgility(this.getAgility() + 5);
        this.setHealthPoints(this.getHealthPoints() + 5);
        this.setHealthPointsBase(this.getHealthPointsBase() + 5);
        this.setTurningPoints(this.getTurningPoints() + 3);
        this.setTurningPointsBase(this.getTurningPointsBase() + 3);
        this.setWeapon(new Drone());
    }
}
