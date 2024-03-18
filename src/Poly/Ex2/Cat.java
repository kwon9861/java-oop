package Poly.Ex2;

import Poly.Ex1.Animal;

public class Cat extends AbstrackAnimal {
    @Override
    public void sound() {
        System.out.println("야옹야옹");
    }

    public void move() {
        System.out.println("move");
    }
}
