package enemies;

import player.attack.Dagger;
import player.attack.IAttack;

public class Goblin extends Enemy {

    public Goblin(String name, int healthValue, int speed){
        super(name, healthValue, new Dagger(), speed);
    }
}
