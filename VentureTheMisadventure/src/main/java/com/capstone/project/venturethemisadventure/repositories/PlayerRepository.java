package com.capstone.project.venturethemisadventure.repositories;

import com.capstone.project.venturethemisadventure.models.player.Player;
import com.capstone.project.venturethemisadventure.models.player.classes.Hero;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerRepository extends JpaRepository<Player, Long> {
}
