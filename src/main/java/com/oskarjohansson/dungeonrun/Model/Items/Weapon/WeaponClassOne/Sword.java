package com.oskarjohansson.dungeonrun.Model.Items.Weapon.WeaponClassOne;


import com.oskarjohansson.dungeonrun.Model.Items.Weapon.WeaponParentModel;
import jakarta.persistence.Entity;

@Entity
public class Sword extends WeaponParentModel {

    public Sword(){
        this.setName("Sword");
        this.setDamageMin(1);
        this.setDamageMax(3);
        this.setTurnPoints(1);
        this.setMinimumLevel(1);
        this.setSoundOfAttack("Kling kling");
    }
}
