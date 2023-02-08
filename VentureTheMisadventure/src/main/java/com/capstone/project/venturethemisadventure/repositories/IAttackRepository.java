package com.capstone.project.venturethemisadventure.repositories;

import com.capstone.project.venturethemisadventure.models.attack.IAttack;
import com.capstone.project.venturethemisadventure.models.player.classes.Hero;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAttackRepository extends JpaRepository<IAttack, Long> {
}
