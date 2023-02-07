package player.attack;

import models.Character;

public class Sword implements IAttack {


    public void attack(Character character) {
        character.takeDamage(50);
    }
}