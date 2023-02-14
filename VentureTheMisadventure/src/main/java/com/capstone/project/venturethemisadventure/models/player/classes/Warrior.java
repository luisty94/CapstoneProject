package com.capstone.project.venturethemisadventure.models.player.classes;

import com.capstone.project.venturethemisadventure.models.Character;
import com.capstone.project.venturethemisadventure.models.attack.ITakeDamage;
import com.capstone.project.venturethemisadventure.models.attack.Weapon;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("WARRIOR")

public class Warrior extends Character {

    public Warrior(String name, int healthValue, Weapon weapon, int speed) {
        super(name,healthValue, weapon, speed);
        setType("WARRIOR");
    }

    public Warrior(){}

        public void attack (ITakeDamage enemy){
            super.attack(enemy);
            super.attack(enemy);
        }
}
