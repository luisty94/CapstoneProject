package com.capstone.project.venturethemisadventure.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.capstone.project.venturethemisadventure.models.Character;
import org.springframework.stereotype.Repository;

@Repository
public interface CharacterRepository extends JpaRepository<Character, Long> {
}
