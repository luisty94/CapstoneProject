package com.capstone.project.venturethemisadventure.models.enemies;

import com.capstone.project.venturethemisadventure.models.Character;
import com.capstone.project.venturethemisadventure.models.attack.IAttack;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("ENEMY")

public  class Enemy extends Character {

    public Enemy(String name, int healthValue, IAttack weapon, int speed) {
        super(name, healthValue, weapon, speed);
    }

    public void attack(Character player){
        getWeapon().attack(player);
    }
}