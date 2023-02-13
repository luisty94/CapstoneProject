package com.capstone.project.venturethemisadventure;

import com.capstone.project.venturethemisadventure.models.attack.Dagger;
import com.capstone.project.venturethemisadventure.models.attack.Sword;
import com.capstone.project.venturethemisadventure.models.enemies.Enemy;
import com.capstone.project.venturethemisadventure.models.player.classes.Hero;
import com.capstone.project.venturethemisadventure.repositories.CharacterRepository;
import com.capstone.project.venturethemisadventure.repositories.EnemyRepository;
import com.capstone.project.venturethemisadventure.repositories.WeaponRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ActiveProfiles("test")
@SpringBootTest
public class VenturethemisadventureApplicationTests {

	@Autowired
	CharacterRepository playerRepository;
	@Autowired
	WeaponRepository iAttackRepository;

	@Autowired
	EnemyRepository enemyRepository;

	@Test
	public void contextLoads() {
	}

	@org.junit.Test
	public void createHero() {
		Sword sword = new Sword();
		iAttackRepository.save(sword);
		Hero trial = new Hero("ABC", 200, sword, 200);
		System.out.println(trial.getName());
		playerRepository.save(trial);

	}

	@Test
	public void createEnemy(){
		Dagger dagger = new Dagger();
		iAttackRepository.save(dagger);
		Enemy trial2 = new Enemy("Malcom", 200,dagger,100);
		enemyRepository.save(trial2);
	}

}
