package com.capstone.project.venturethemisadventure.models.enemies;

import com.capstone.project.venturethemisadventure.models.attack.Weapon;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity // NEW
@DiscriminatorValue("KOBOLD")
public class Kobold extends Enemy{

    public Kobold(String name, int healthValue, Weapon weapon, int speed) {
        super(name, healthValue, weapon, speed);
        setType("KOBOLD");
    }
    public Kobold(){
    }
    public void heal(){
        this.setHealthValue(10);
    }
}
