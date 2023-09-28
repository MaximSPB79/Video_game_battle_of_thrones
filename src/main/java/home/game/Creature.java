package org.example;

public abstract class Creature {

    private int attack;

    private int defense;

    private int health;
    private int damage;

    public Creature(int attack, int defense, int damage) {
        this.attack = attack;
        this.defense = defense;
        this.health = 100;
        this.damage = damage;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
}
