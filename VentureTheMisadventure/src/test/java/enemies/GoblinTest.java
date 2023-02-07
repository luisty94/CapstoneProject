package enemies;

import org.junit.Before;
import org.junit.Test;
import player.Player;
import player.attack.Dagger;
import player.attack.IAttack;
import player.attack.Sword;
import player.classes.ClassType;
import player.classes.Hero;

import static org.junit.Assert.assertEquals;

public class GoblinTest {

    Goblin goblin;
    Hero hero;
    IAttack dagger;
    IAttack sword;
    Player player;


    @Before
    public void before() {
        dagger = new Dagger();
        goblin = new Goblin("Ungo", 70, 90);
        player = new Player("The Hero", ClassType.HERO, 250, sword, 100);
    }

    @Test
    public void hasName() {
        assertEquals("Ungo", goblin.getName());
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
