package com.capstone.project.venturethemisadventure.models.enemies;

import com.capstone.project.venturethemisadventure.models.attack.Dagger;

public class Goblin extends Enemy {

    public Goblin(String name, int healthValue, int speed){
        super(name, healthValue, new Dagger(), speed);
    }
}
