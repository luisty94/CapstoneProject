package com.capstone.project.venturethemisadventure.components;

import com.capstone.project.venturethemisadventure.models.Character;
import com.capstone.project.venturethemisadventure.models.attack.*;
import com.capstone.project.venturethemisadventure.models.enemies.Enemy;
import com.capstone.project.venturethemisadventure.models.player.classes.Hero;
import com.capstone.project.venturethemisadventure.repositories.CharacterRepository;
import com.capstone.project.venturethemisadventure.repositories.EnemyRepository;
import com.capstone.project.venturethemisadventure.repositories.WeaponRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

        @Autowired
        CharacterRepository characterRepository;

        @Autowired
        EnemyRepository enemyRepository;

        @Autowired
        WeaponRepository weaponRepository;


    public DataLoader() {}


    public void run(ApplicationArguments args) {
        Weapon dagger = new Dagger();
        weaponRepository.save(dagger);

        Weapon sword = new Sword();
        weaponRepository.save(sword);

        Weapon fist = new Fist();
        weaponRepository.save(fist);

        Weapon club = new Club();
        weaponRepository.save(club);

        Enemy goblin = new Enemy("Mongo the Goblin", 70, dagger,90);
        enemyRepository.save(goblin);

        Enemy orc = new Enemy("Borkan the Orc", 150, sword,80);
        enemyRepository.save(orc);

        Enemy troll = new Enemy("Bobo the Troll", 200,club, 50);
        enemyRepository.save(troll);

        Enemy kobold = new Enemy("Sir Reginald Frost III", 10, fist, 500);
        enemyRepository.save(kobold);

        Character luis = new Hero("Luis", 200, sword, 200);
        characterRepository.save(luis);
    }
}
