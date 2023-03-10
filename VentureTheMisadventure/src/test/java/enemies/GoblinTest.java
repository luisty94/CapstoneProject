package enemies;

import com.capstone.project.venturethemisadventure.models.attack.Dagger;
import com.capstone.project.venturethemisadventure.models.attack.Weapon;
import com.capstone.project.venturethemisadventure.models.attack.Sword;
import com.capstone.project.venturethemisadventure.models.enemies.Enemy;
import com.capstone.project.venturethemisadventure.models.player.classes.Hero;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GoblinTest {

    Enemy goblin;
    Hero hero;
    Weapon dagger;
    Weapon sword;


    @Before()
    public void before() {
        dagger = new Dagger();
        sword = new Sword();
        goblin = new Enemy("Ungo", 70, dagger, 90);
        hero = new Hero("Ferghus",250, sword, 100);
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
        goblin.attack(hero);
        assertEquals(230, hero.getHealthValue());
    }

    @Test
    public void canTakeDamage(){
        goblin.takeDamage(20);
        assertEquals(50, goblin.getHealthValue());
    }
}
