package player;

import com.capstone.project.venturethemisadventure.models.attack.Dagger;
import com.capstone.project.venturethemisadventure.models.attack.Weapon;
import com.capstone.project.venturethemisadventure.models.enemies.Enemy;
import com.capstone.project.venturethemisadventure.models.player.classes.Thief;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ThiefTest {
    Thief thief;
    Enemy goblin;
    Weapon dagger;
    Weapon sword;


    @Before
    public void before() {
        dagger = new Dagger();
        goblin = new Enemy("Ungo", 70, dagger,90);
        thief = new Thief("Shadow", 100, dagger, 300);
    }

    @Test
    public void hasName() {
        assertEquals("Shadow", thief.getName());
    }

    @Test
    public void hasHealthValue() {
        assertEquals(100, thief.getHealthValue());
    }

    @Test
    public void hasSpeed() {
        assertEquals(300, thief.getSpeed());
    }

    @Test
    public void canAttack() {
        thief.attack(goblin);
        assertEquals(30, goblin.getHealthValue());
    }

    @Test
    public void canTakeDamage(){
        thief.takeDamage(50);
        assertEquals(50, thief.getHealthValue());
    }
}
