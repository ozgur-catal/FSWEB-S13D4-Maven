package org.example;

public enum Weapon {
    SWORD(30, 3),
    AXE(40, 4),
    MACE(50, 5);

    private int damage;
    private double attackSpeed;

    Weapon(int damage, double attackSpeed) {
        this.damage = damage;
        this.attackSpeed = attackSpeed;
    }

    public int getDamage() {
        return this.damage;
    }

    public double getAttackSpeed() {
        return this.attackSpeed;
    }
}
