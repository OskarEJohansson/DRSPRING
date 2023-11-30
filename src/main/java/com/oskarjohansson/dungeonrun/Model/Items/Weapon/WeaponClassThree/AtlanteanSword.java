package com.oskarjohansson.dungeonrun.Model.Items.Weapon.WeaponClassThree;


import com.oskarjohansson.dungeonrun.Model.Items.Weapon.WeaponParentModel;
import jakarta.persistence.Entity;

@Entity
public class AtlanteanSword extends WeaponParentModel {

    public AtlanteanSword(){
        this.setName("Atlantean - Sword of Conan The Barbarian");
        this.setWeaponClass("Sword");
        this.setDamageMin(7);
        this.setDamageMax(10);
        this.setTurnPoints(3);
        this.setMinimumLevel(5);
        this.setCost(50);
        this.setSoundOfAttack("TASTE THE POWER OF CONAN!");
    }
}
