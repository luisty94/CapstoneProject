package com.capstone.project.venturethemisadventure.models.attack;

import com.capstone.project.venturethemisadventure.models.Character;

import javax.persistence.Entity;

@Entity
public class Fist extends Weapon {
    public Fist() {
        super(10);
    }
}
