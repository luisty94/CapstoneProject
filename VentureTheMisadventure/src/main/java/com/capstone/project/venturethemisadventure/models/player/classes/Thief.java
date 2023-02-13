package com.capstone.project.venturethemisadventure.models.player.classes;

import com.capstone.project.venturethemisadventure.models.Character;
import com.capstone.project.venturethemisadventure.models.attack.IAttack;
import com.capstone.project.venturethemisadventure.models.attack.ITakeDamage;
import com.capstone.project.venturethemisadventure.models.attack.Weapon;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("THIEF")

public class Thief extends Character {

    public Thief(String name, int healthValue, Weapon weapon, int speed) {
        super(name, healthValue, weapon, speed);
    }

    public Thief(){
    }

    public void attack (ITakeDamage enemy){
        super.attack(enemy);
        super.attack(enemy);
    }
}
