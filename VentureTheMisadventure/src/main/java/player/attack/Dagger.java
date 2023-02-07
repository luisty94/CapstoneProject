package player.attack;

import models.Character;

public class Dagger implements IAttack{


    public void attack(Character character) {
        character.takeDamage(20);
    }
}
