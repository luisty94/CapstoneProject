package com.capstone.project.venturethemisadventure.components;

import com.capstone.project.venturethemisadventure.models.attack.Dagger;
import com.capstone.project.venturethemisadventure.models.attack.IAttack;
import com.capstone.project.venturethemisadventure.models.attack.Sword;
import com.capstone.project.venturethemisadventure.models.enemies.Enemy;
import com.capstone.project.venturethemisadventure.models.enemies.Goblin;
import com.capstone.project.venturethemisadventure.repositories.EnemyRepository;
import com.capstone.project.venturethemisadventure.repositories.IAttackRepository;
import com.capstone.project.venturethemisadventure.repositories.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

        @Autowired
        PlayerRepository playerRepository;

        @Autowired
        EnemyRepository enemyRepository;

        @Autowired
        IAttackRepository iAttackRepository;


    public DataLoader() {}


    public void run(ApplicationArguments args) {

        Enemy goblin = new Enemy("Mongo the Goblin", 70, IAttack(Dagger),90);
        
    }
}
