package com.capstone.project.venturethemisadventure.models.enemies;
import com.capstone.project.venturethemisadventure.models.attack.Weapon;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;


@Entity // NEW
@DiscriminatorValue("GOBLIN")

public class Goblin extends Enemy{

    public Goblin(String name, int healthValue, Weapon weapon, int speed) {
        super(name, healthValue, weapon, speed);
        setType("GOBLIN");
    }
    public Goblin(){
    }
    public void heal(){
        this.setHealthValue(70);
    }
}
