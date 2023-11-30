package com.oskarjohansson.dungeonrun.Model.Character;


import com.oskarjohansson.dungeonrun.Model.Items.Weapon.WeaponClassOne.Sword;
import jakarta.persistence.Entity;

@Entity
public class Barbarian extends Hero {

    public Barbarian() {
        this.setHeroClass("Barbarian");
        this.setStrength(this.getStrength() + 5);
        this.setIntelligence(this.getIntelligence() + 5);
        this.setAgility(this.getAgility() + 5);
        this.setHealthPoints(this.getHealthPoints() + 5);
        this.setHealthPointsBase(this.getHealthPointsBase() + 5);
        this.setTurningPoints(this.getTurningPoints() + 3);
        this.setTurningPointsBase(this.getTurningPointsBase() + 3);
        this.setWeapon(new Sword());
    }
}