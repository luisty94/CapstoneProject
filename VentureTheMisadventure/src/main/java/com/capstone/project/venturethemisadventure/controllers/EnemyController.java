package com.capstone.project.venturethemisadventure.controllers;

import com.capstone.project.venturethemisadventure.models.Character;

import com.capstone.project.venturethemisadventure.models.enemies.Enemy;
import com.capstone.project.venturethemisadventure.repositories.CharacterRepository;
import com.capstone.project.venturethemisadventure.repositories.EnemyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class EnemyController {

    @Autowired
    EnemyRepository enemyRepository;
    @Autowired
    CharacterRepository characterRepository;

    @GetMapping(value = "/enemies")
    public ResponseEntity<List<Enemy>> getAllEnemies() {
        return new ResponseEntity<>(enemyRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/enemies/{id}")
    public ResponseEntity getEnemy(@PathVariable Long id) {
        return new ResponseEntity<>(enemyRepository.findById(id), HttpStatus.OK);
    }
    @PostMapping
    public Enemy createEnemy(@RequestBody Enemy enemy) {
        return enemyRepository.save(enemy);
    }

    @PutMapping("{id}")
    public ResponseEntity<Enemy> updateEnemy(@PathVariable long id,@RequestBody Enemy enemy) {
        Enemy updateEnemy = enemyRepository.findById(id).get();
        updateEnemy.setId(enemy.getId());
        updateEnemy.setName(enemy.getName());
        updateEnemy.setHealthValue(enemy.getHealthValue());
        updateEnemy.setWeapon(enemy.getWeapon());
        updateEnemy.setSpeed(enemy.getSpeed());

        enemyRepository.save(updateEnemy);

        return ResponseEntity.ok(updateEnemy);
    }


    @PostMapping(value = "/enemies/combat")
    public ResponseEntity<Character> postEnemyAttack(@RequestBody HashMap<String, Long> attackObj) {
        Enemy enemy = enemyRepository.findById(attackObj.get("enemyId")).get();
        Character character = characterRepository.findById(attackObj.get("characterId")).get();
        enemy.attack(character);
        characterRepository.save(character);
        return new ResponseEntity<>(character, HttpStatus.I_AM_A_TEAPOT);
    }
}

