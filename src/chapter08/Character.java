package chapter08;

public class Character {
    int hp;
    int power;

    Character(int hp, int power) {
        this.hp = hp;
        this.power = power;
    }

    void attack(Object target) {
        System.out.println("공격");
    }
}