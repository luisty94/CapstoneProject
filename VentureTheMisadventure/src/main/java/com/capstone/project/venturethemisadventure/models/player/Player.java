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

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public int getHealthValue() {
        return super.getHealthValue();
    }

    @Override
    public void setHealthValue(int healthValue) {
        super.setHealthValue(healthValue);
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