package player;

import models.attack.Dagger;
import models.attack.IAttack;
import models.enemies.Goblin;
import models.player.Player;
import models.player.classes.ClassType;
import models.player.classes.Hero;
import models.player.classes.Warrior;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HeroTest {

    Goblin goblin;
    Hero hero;
    IAttack dagger;
    IAttack sword;
    Player player;
    Warrior warrior;


    @Before
    public void before() {
        dagger = new Dagger();
        goblin = new Goblin("Ungo", 70, 90);
        player = new Player("Ferghus",ClassType.HERO,250, sword, 100);
        hero = new Hero("The Hero", 500, sword, 200);
        warrior = new Warrior("Brutus",350, 150);
    }

    @Test
    public void hasName() {
        assertEquals("Ferghus", player.getName());
    }

    @Test
    public void hasHealthValue() {
        assertEquals(70, goblin.getHealthValue());
    }

    @Test
    public void hasSpeed() {
        assertEquals(90, goblin.getSpeed());
    }

    @Test
    public void canAttack() {
        goblin.attack(player);
        assertEquals(230, player.getHealthValue());
    }

    @Test
    public void canTakeDamage(){
        goblin.takeDamage(20);
        assertEquals(50, goblin.getHealthValue());
    }
}

