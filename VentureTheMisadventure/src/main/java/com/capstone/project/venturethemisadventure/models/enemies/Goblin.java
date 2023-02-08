package com.capstone.project.venturethemisadventure.models.enemies;

import com.capstone.project.venturethemisadventure.models.attack.Dagger;
import com.capstone.project.venturethemisadventure.models.attack.IAttack;

import javax.persistence.Entity;

@Entity
public class Goblin extends Enemy {

    public Goblin(String name, int healthValue, IAttack weapon, int speed){
        super(name, healthValue, weapon, speed);
    }
}
