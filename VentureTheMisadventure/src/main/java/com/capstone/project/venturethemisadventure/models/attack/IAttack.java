package com.capstone.project.venturethemisadventure.models.attack;

import com.capstone.project.venturethemisadventure.models.Character;
import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.List;

@Entity
public class IAttack {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonBackReference
    @OneToMany(mappedBy = "weapon", fetch = FetchType.LAZY)
    private List<Character> characters;

    public IAttack() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Character> getCharacters() {
        return characters;
    }

    public void setCharacters(List<Character> characters) {
        this.characters = characters;
    }

    public void attack (Character character) {
    };
}
