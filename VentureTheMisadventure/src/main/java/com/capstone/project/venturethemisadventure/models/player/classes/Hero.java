package com.capstone.project.venturethemisadventure.models.player.classes;

import com.capstone.project.venturethemisadventure.models.player.Player;
import com.capstone.project.venturethemisadventure.models.attack.IAttack;

public class Hero extends Player {


    public Hero(String name, int healthValue, IAttack weapon, int speed) {
        super(name, ClassType.HERO ,healthValue, weapon, speed);
    }
}
