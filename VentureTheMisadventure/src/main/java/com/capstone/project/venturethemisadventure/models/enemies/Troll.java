package com.capstone.project.venturethemisadventure.models.enemies;

import com.capstone.project.venturethemisadventure.models.attack.Weapon;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity // NEW
@DiscriminatorValue("TROLL")
public class Troll extends Enemy{

    public Troll(String name, int healthValue, Weapon weapon, int speed) {
        super(name, healthValue, weapon, speed);
        setType("TROLL");
    }
    public Troll(){
    }
    public void heal(){
        this.setHealthValue(200);
    }
}
