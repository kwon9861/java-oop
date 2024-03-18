package chapter08;

public class Warrior {
    int weapon;

    Warrior(int weapon) {
        this.weapon = weapon;
    }

    void defence(Object target) {
        System.out.println("방어");
    }
}