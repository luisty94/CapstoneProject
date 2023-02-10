package com.capstone.project.venturethemisadventure.models.player.classes;

import com.capstone.project.venturethemisadventure.models.Character;
import com.capstone.project.venturethemisadventure.models.attack.Dagger;
import com.capstone.project.venturethemisadventure.models.attack.IAttack;
import com.capstone.project.venturethemisadventure.models.player.Player;

public class Thief extends Player {

    public Thief(String name, int healthValue, IAttack weapon, int speed) {
        super(name, healthValue, weapon, speed);
    }
    public void attack (Character enemy){
        getWeapon().attack(enemy);
        getWeapon().attack(enemy);

    }
}
