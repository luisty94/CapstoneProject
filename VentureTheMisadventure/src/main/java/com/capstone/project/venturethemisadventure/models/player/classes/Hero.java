package com.capstone.project.venturethemisadventure.models.player.classes;

import com.capstone.project.venturethemisadventure.models.Character;
import com.capstone.project.venturethemisadventure.models.attack.Weapon;

import javax.persistence.*;

@Entity // NEW
@DiscriminatorValue("HERO")

public class Hero extends Character {

    public Hero(String name, int healthValue, Weapon weapon, int speed) {
        super(name, healthValue, weapon, speed);
        setType("HERO");
    }
    public Hero(){
    }
    public void heal(){
        this.setHealthValue(200);
    }

}