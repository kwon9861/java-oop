package Poly.Ex2;

import Poly.Ex1.Animal;

public class Duck extends AbstrackAnimal {
    @Override
    public void sound() {
        System.out.println("꿱꿱");
    }

    public void move() {
        System.out.println("move");
    }
}
