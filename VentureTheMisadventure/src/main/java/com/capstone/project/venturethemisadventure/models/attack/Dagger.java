package com.capstone.project.venturethemisadventure.models.attack;

import com.capstone.project.venturethemisadventure.models.Character;

public class Dagger implements IAttack{


    public void attack(Character character) {
        character.takeDamage(20);
    }
}
