package com.capstone.project.venturethemisadventure.controllers;

import com.capstone.project.venturethemisadventure.models.Character;
import com.capstone.project.venturethemisadventure.repositories.CharacterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CharacterController {

    @Autowired
    CharacterRepository characterRepository;

    @GetMapping(value = "/character")
    public ResponseEntity<List<Character>> getAllCharacters(){
        return new ResponseEntity<>(characterRepository.findAll(), HttpStatus.OK);
    }
}
