package com.capstone.project.venturethemisadventure.models.enemies;

import com.capstone.project.venturethemisadventure.models.Character;
import com.capstone.project.venturethemisadventure.models.attack.IAttack;
import com.capstone.project.venturethemisadventure.models.attack.ITakeDamage;
import com.capstone.project.venturethemisadventure.models.attack.Weapon;

import javax.persistence.*;

@Entity
@Table(name = "enemies")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(discriminatorType = DiscriminatorType.STRING, name = "ENEMY_TYPE")
public abstract class Enemy implements ITakeDamage, IAttack {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "type")
    private String type;


    @Column(name = "name")
    private String name;

    @Column(name = "health")
    private int healthValue;

    @Column(name = "speed")
    private int speed;

    @ManyToOne
    @JoinColumn(name = "weapon_id", nullable = false)
    private Weapon weapon;

    public Enemy(String name, int healthValue, Weapon weapon, int speed) {
        this.name = name;
        this.healthValue = healthValue;
        this.weapon = weapon;
        this.speed = speed;
    }

    public Enemy(){}

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
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


    public void attack(ITakeDamage character){
        character.takeDamage(this.weapon.getDamage());
    }

    public void heal(){
        this.healthValue = 500;
    }
}