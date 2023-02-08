package player;

import com.capstone.project.venturethemisadventure.models.attack.Dagger;
import com.capstone.project.venturethemisadventure.models.attack.IAttack;
import com.capstone.project.venturethemisadventure.models.attack.Sword;
import com.capstone.project.venturethemisadventure.models.enemies.Goblin;
import com.capstone.project.venturethemisadventure.models.player.Player;
import com.capstone.project.venturethemisadventure.models.player.classes.ClassType;
import com.capstone.project.venturethemisadventure.models.player.classes.Hero;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class HeroTest {

    Goblin goblin;
    Hero hero;
    IAttack dagger;
    IAttack sword;
    Player player;


    @Before
    public void before() {
        dagger = new Dagger();
        sword = new Sword();
        goblin = new Goblin("Ungo", 70, 90);
        hero = new Hero("The Hero", 500, sword, 200);
    }

    @Test
    public void hasName() {
        assertEquals("The Hero", hero.getName());
    }

    @Test
    public void hasHealthValue() {
        assertEquals(500, hero.getHealthValue());
    }
    @Test
    public void hasType(){
        assertEquals(ClassType.HERO, hero.getType());
    }
    @Test
    public void hasSpeed() {
        assertEquals(200, hero.getSpeed());
    }

    @Test
    public void canAttack() {
        hero.attack(goblin, sword);
        assertEquals(20, goblin.getHealthValue());
    }

    @Test
    public void canTakeDamage(){
        hero.takeDamage(200);
        assertEquals(300, hero.getHealthValue());
    }
}

