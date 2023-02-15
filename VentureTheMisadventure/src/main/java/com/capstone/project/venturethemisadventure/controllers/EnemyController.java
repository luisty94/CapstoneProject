package com.capstone.project.venturethemisadventure.controllers;

import com.capstone.project.venturethemisadventure.models.Character;
import com.capstone.project.venturethemisadventure.models.attack.Dagger;
import com.capstone.project.venturethemisadventure.models.attack.Sword;
import com.capstone.project.venturethemisadventure.models.enemies.Enemy;
import com.capstone.project.venturethemisadventure.models.player.classes.Hero;
import com.capstone.project.venturethemisadventure.models.player.classes.Thief;
import com.capstone.project.venturethemisadventure.models.player.classes.Warrior;
import com.capstone.project.venturethemisadventure.repositories.CharacterRepository;
import com.capstone.project.venturethemisadventure.repositories.EnemyRepository;
import com.capstone.project.venturethemisadventure.repositories.WeaponRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class EnemyController {

    @Autowired
    EnemyRepository enemyRepository;

    @GetMapping(value = "/enemies")
    public ResponseEntity<List<Enemy>> getAllEnemies() {
        return new ResponseEntity<>(enemyRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/enemies/{id}")
    public ResponseEntity getEnemy(@PathVariable Long id) {
        return new ResponseEntity<>(enemyRepository.findById(id), HttpStatus.OK);
    }

}

