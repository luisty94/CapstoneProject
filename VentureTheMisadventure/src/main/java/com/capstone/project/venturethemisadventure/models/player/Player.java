package com.capstone.project.venturethemisadventure.models.player;

import com.capstone.project.venturethemisadventure.models.Character;
import com.capstone.project.venturethemisadventure.models.attack.IAttack;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("PLAYER")
public  class Player extends Character {

    public Player(String name, int healthValue, IAttack weapon, int speed) {
        super(name, healthValue, weapon, speed);
    }

    public void attack (Character enemy, IAttack weapon){
        getWeapon().attack(enemy);
    }

}