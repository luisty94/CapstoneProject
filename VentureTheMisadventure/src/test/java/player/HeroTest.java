package player;

import com.capstone.project.venturethemisadventure.models.attack.Dagger;
import com.capstone.project.venturethemisadventure.models.attack.Weapon;
import com.capstone.project.venturethemisadventure.models.attack.Sword;
import com.capstone.project.venturethemisadventure.models.enemies.Enemy;
import com.capstone.project.venturethemisadventure.models.player.classes.Hero;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class HeroTest {

    Enemy goblin;
    Hero hero;
    Weapon dagger;
    Weapon sword;


    @Before
    public void before() {
        dagger = new Dagger();
        sword = new Sword();
        goblin = new Enemy("Ungo", 70, dagger,90);
        hero = new Hero("The Hero", 200, sword, 200);
    }

    @Test
    public void hasName() {
        assertEquals("The Hero", hero.getName());
    }

    @Test
    public void hasHealthValue() {
        assertEquals(200, hero.getHealthValue());
    }

    @Test
    public void hasSpeed() {
        assertEquals(200, hero.getSpeed());
    }

    @Test
    public void canAttack() {
        hero.attack(goblin);
        assertEquals(40, goblin.getHealthValue());
    }

    @Test
    public void canTakeDamage(){
        hero.takeDamage(100);
        assertEquals(100, hero.getHealthValue());
    }
}

