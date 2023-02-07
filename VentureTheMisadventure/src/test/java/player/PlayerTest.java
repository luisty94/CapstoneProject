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

public class PlayerTest {

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
    }

    @Test
    public void hasName() {
        assertEquals("Ferghus", player.getName());
    }

    @Test
    public void hasHealthValue() {
        assertEquals(70, player.getHealthValue());
    }

    @Test
    public void hasType(){
        assertEquals(ClassType.HERO, player.getType());
    }

    @Test
    public void hasSpeed() {
        assertEquals(100, player.getSpeed());
    }

    @Test
    public void canAttack() {
        player.attack(goblin, sword);
        assertEquals(20, goblin.getHealthValue());
    }

    @Test
    public void canTakeDamage(){
        player.takeDamage(20);
        assertEquals(230, player.getHealthValue());
    }
}

