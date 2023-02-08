package player;

import com.capstone.project.venturethemisadventure.models.attack.Dagger;
import com.capstone.project.venturethemisadventure.models.attack.IAttack;
import com.capstone.project.venturethemisadventure.models.enemies.Goblin;
import com.capstone.project.venturethemisadventure.models.player.classes.ClassType;
import com.capstone.project.venturethemisadventure.models.player.classes.Thief;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ThiefTest {
    Thief thief;
    Goblin goblin;
    IAttack dagger;
    IAttack sword;


    @Before
    public void before() {
        dagger = new Dagger();
        goblin = new Goblin("Ungo", 70, dagger,90);
        thief = new Thief("Shadow", 100, 300);
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
    public void hasType(){
        assertEquals(ClassType.THIEF, thief.getType());
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
