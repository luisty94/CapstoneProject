package com.capstone.project.venturethemisadventure.repositories;

import com.capstone.project.venturethemisadventure.models.attack.Weapon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WeaponRepository extends JpaRepository<Weapon, Long> {
}
