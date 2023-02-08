package com.capstone.project.venturethemisadventure.models.player.classes;

import com.capstone.project.venturethemisadventure.models.Character;
import com.capstone.project.venturethemisadventure.models.attack.IAttack;
import com.capstone.project.venturethemisadventure.models.attack.Sword;
import com.capstone.project.venturethemisadventure.models.player.Player;

import javax.persistence.*;

@Entity // NEW
public class Hero extends Player {

    public Hero(String name, int healthValue, IAttack weapon, int speed) {
        super(name, ClassType.HERO ,healthValue, weapon, speed);
    }

    public void attack (Character enemy){
        getWeapon().attack(enemy);
    }

}