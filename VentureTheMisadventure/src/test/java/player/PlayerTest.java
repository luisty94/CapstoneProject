package player;

import com.capstone.project.venturethemisadventure.models.attack.Dagger;
import com.capstone.project.venturethemisadventure.models.attack.IAttack;
import com.capstone.project.venturethemisadventure.models.attack.Sword;
import com.capstone.project.venturethemisadventure.models.enemies.Goblin;
import com.capstone.project.venturethemisadventure.models.player.Player;
import com.capstone.project.venturethemisadventure.models.player.classes.ClassType;
import com.capstone.project.venturethemisadventure.models.player.classes.Hero;
import com.capstone.project.venturethemisadventure.models.player.classes.Warrior;
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
        sword = new Sword();
        goblin = new Goblin("Ungo", 70, dagger,90);
        player = new Player("Ferghus",ClassType.HERO,250, sword, 100);
    }

    @Test
    public void hasName() {
        assertEquals("Ferghus", player.getName());
    }

    @Test
    public void hasHealthValue() {
        assertEquals(250, player.getHealthValue());
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

