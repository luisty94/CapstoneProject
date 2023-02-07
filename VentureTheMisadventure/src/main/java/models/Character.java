package models;

import player.attack.IAttack;

public abstract class Character {

    private String name;
    private int healthValue;
    private IAttack weapon;
    private int speed;

    public Character(String name, int healthValue, IAttack weapon, int speed) {
        this.name = name;
        this.healthValue = healthValue;
        this.weapon = weapon;
        this.speed = speed;
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

    public IAttack getWeapon() {
        return weapon;
    }

    public void setWeapon(IAttack weapon) {
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
    public void attack(Character character, IAttack weapon){
        weapon.attack(character);
    }

}