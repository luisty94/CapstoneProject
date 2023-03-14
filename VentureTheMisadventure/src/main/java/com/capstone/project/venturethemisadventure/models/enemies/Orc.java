package com.capstone.project.venturethemisadventure.models.enemies;

import com.capstone.project.venturethemisadventure.models.attack.Weapon;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity // NEW
@DiscriminatorValue("ORC")
public class Orc extends Enemy{

    public Orc(String name, int healthValue, Weapon weapon, int speed) {
        super(name, healthValue, weapon, speed);
        setType("ORC");
    }
    public Orc(){
    }
    public void heal(){
        this.setHealthValue(150);
    }
}
