package com.capstone.project.venturethemisadventure.models.player.classes;

import com.capstone.project.venturethemisadventure.models.Character;
import com.capstone.project.venturethemisadventure.models.attack.Sword;
import com.capstone.project.venturethemisadventure.models.player.Player;

public class Warrior extends Player {

    public Warrior(String name, int healthValue, int speed) {
        super(name, ClassType.WARRIOR ,healthValue, new Sword(), speed);
    }
    public void attack (Character enemy){
        getWeapon().attack(enemy);
    }

}
