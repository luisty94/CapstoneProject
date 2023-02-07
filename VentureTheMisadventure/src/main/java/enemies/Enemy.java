package enemies;

import models.Character;
import player.attack.IAttack;

public abstract class Enemy extends Character {

    public Enemy(String name, int healthValue, IAttack weapon, int speed) {
        super(name, healthValue, weapon, speed);
    }

    public void attack(Character player){
        getWeapon().attack(player);
    }
}