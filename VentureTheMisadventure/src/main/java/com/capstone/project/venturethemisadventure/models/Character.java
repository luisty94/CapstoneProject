package com.capstone.project.venturethemisadventure.models;

import com.capstone.project.venturethemisadventure.models.attack.IAttack;
import com.capstone.project.venturethemisadventure.models.attack.ITakeDamage;
import com.capstone.project.venturethemisadventure.models.attack.Weapon;

import javax.persistence.*;

@Entity
@Table(name = "characters")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(discriminatorType = DiscriminatorType.STRING, name = "CHARACTER_TYPE")
public abstract class Character implements ITakeDamage, IAttack {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "health")
    private int healthValue;

    @Column(name = "speed")
    private int speed;

    @ManyToOne
    @JoinColumn(name = "weapon_id", nullable = false)
    private Weapon weapon;

    public Character(String name, int healthValue, Weapon weapon, int speed) {
        this.name = name;
        this.healthValue = healthValue;
        this.weapon = weapon;
        this.speed = speed;
    }

    public Character(){
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealthValue() {
        return healthValue;
    }

    public void setHealthValue(int healthValue) {
        this.healthValue = healthValue;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public int getSpeed(){
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void takeDamage(int damage){
        this.healthValue -= damage;
    }
    public void attack(ITakeDamage enemy){
        enemy.takeDamage(this.weapon.getDamage());
    }

}