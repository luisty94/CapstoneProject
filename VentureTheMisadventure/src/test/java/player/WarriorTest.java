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


public class WarriorTest {

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
        goblin = new Goblin("Ungo", 70, 90);
        warrior = new Warrior("Brutus",350, 150);
    }

    @Test
    public void hasName() {
        assertEquals("Brutus", warrior.getName());
    }

    @Test
    public void hasHealthValue() {
        assertEquals(350, warrior.getHealthValue());
    }

    @Test
    public void hasSpeed() {
        assertEquals(90, goblin.getSpeed());
    }
    @Test
    public void hasType(){
        assertEquals(ClassType.WARRIOR, warrior.getType());
    }

    @Test
    public void canAttack(){
        warrior.attack(goblin);
        assertEquals(20, goblin.getHealthValue());
    }

    @Test
    public void canTakeDamage(){
        warrior.takeDamage(100);
        assertEquals(250, warrior.getHealthValue());
    }
}

