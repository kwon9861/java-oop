package Poly.Ex3;

import Poly.Ex2.AbstrackAnimal;

public class Duck implements InterfaceAnimal {
    @Override
    public void sound() {
        System.out.println("꿱꿱");
    }

    public void move() {
        System.out.println("move");
    }
}
