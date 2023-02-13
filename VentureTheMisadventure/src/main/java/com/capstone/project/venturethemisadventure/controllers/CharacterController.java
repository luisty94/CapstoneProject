package com.capstone.project.venturethemisadventure.controllers;

import com.capstone.project.venturethemisadventure.models.Character;
import com.capstone.project.venturethemisadventure.models.attack.Dagger;
import com.capstone.project.venturethemisadventure.models.attack.Sword;
import com.capstone.project.venturethemisadventure.models.player.classes.Hero;
import com.capstone.project.venturethemisadventure.models.player.classes.Thief;
import com.capstone.project.venturethemisadventure.models.player.classes.Warrior;
import com.capstone.project.venturethemisadventure.repositories.CharacterRepository;
import com.capstone.project.venturethemisadventure.repositories.WeaponRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class CharacterController {

    @Autowired
    CharacterRepository characterRepository;

    @Autowired
    WeaponRepository weaponRepository;

    @GetMapping(value = "/characters")
    public ResponseEntity<List<Character>> getAllCharacters() {
        return new ResponseEntity<>(characterRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/characters/{id}")
    public ResponseEntity getCharacter(@PathVariable Long id) {
        return new ResponseEntity<>(characterRepository.findById(id), HttpStatus.OK);
    }

    @PostMapping(value = "/characters")
    public ResponseEntity<Character> postCharacter(@RequestBody Map<String, String> characterMap) {
        System.out.println("POST CHARACTER");
        System.out.println(characterMap);
        System.out.println(characterMap.get("character_type") == "THIEF");
        if (characterMap.get("character_type").equals("THIEF")) {
            Dagger dagger = new Dagger();
            weaponRepository.save(dagger);
            Thief thief = new Thief(characterMap.get("name"), 100, dagger, 300);
            characterRepository.save(thief);
            return new ResponseEntity<>(thief, HttpStatus.CREATED);
        }
        if (characterMap.get("character_type").equals("HERO")) {
            Sword sword = new Sword();
            weaponRepository.save(sword);
            Hero hero = new Hero(characterMap.get("name"), 200, sword, 200);
            characterRepository.save(hero);
            return new ResponseEntity<>(hero, HttpStatus.CREATED);
        }
        if (characterMap.get("character_type").equals("WARRIOR")) {
            Sword sword = new Sword();
            weaponRepository.save(sword);
            Warrior warrior = new Warrior(characterMap.get("name"), 350, sword, 100);
            characterRepository.save(warrior);
            return new ResponseEntity<>(warrior, HttpStatus.CREATED);
        }
        return new ResponseEntity<>(HttpStatus.I_AM_A_TEAPOT);
    }
}
