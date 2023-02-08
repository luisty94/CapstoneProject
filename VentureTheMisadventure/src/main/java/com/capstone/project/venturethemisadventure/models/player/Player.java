package com.capstone.project.venturethemisadventure.models.player;

import com.capstone.project.venturethemisadventure.models.Character;
import com.capstone.project.venturethemisadventure.models.attack.IAttack;
import com.capstone.project.venturethemisadventure.models.player.classes.ClassType;

public  class Player extends Character {

    private ClassType type;
    public Player(String name, ClassType type, int healthValue, IAttack weapon, int speed) {
        super(name, healthValue, weapon, speed);
        this.type=type;
    }

    public void attack (Character enemy, IAttack weapon){
        getWeapon().attack(enemy);
    }

    public ClassType getType() {
        return type;
    }

    public void setType(ClassType type) {
        this.type = type;
    }
}