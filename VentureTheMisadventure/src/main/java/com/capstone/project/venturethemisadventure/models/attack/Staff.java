package com.capstone.project.venturethemisadventure.models.attack;

import com.capstone.project.venturethemisadventure.models.Character;

import javax.persistence.Entity;

@Entity
public class Staff extends IAttack{

    public void attack(Character character) {
        character.takeDamage(15);
    }
}
