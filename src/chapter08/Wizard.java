package chapter08;

public class Wizard {
    int heal;

    Wizard(int heal) {
        this.heal = heal;
    }

    void healing(Object target) {
        System.out.println("치료마법");
    }
}