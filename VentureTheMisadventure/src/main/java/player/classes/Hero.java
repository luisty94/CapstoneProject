package player.classes;

import player.attack.IAttack;
import player.Player;

public class Hero extends Player {


    public Hero(String name, int healthValue, IAttack weapon, int speed) {
        super(name, ClassType.HERO ,healthValue, weapon, speed);
    }
}
