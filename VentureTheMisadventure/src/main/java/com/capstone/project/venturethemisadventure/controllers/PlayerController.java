package com.capstone.project.venturethemisadventure.controllers;

import com.capstone.project.venturethemisadventure.models.player.Player;
import com.capstone.project.venturethemisadventure.repositories.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PlayerController {

    @Autowired
    PlayerRepository playerRepository;

    @GetMapping(value = "/player")
    public ResponseEntity<List<Player>> getAllPlayers(){
        return new ResponseEntity<>(playerRepository.findAll(), HttpStatus.OK);
    }
}
