package Poly.Ex2;

import Poly.Ex1.Animal;

public class Dog extends AbstrackAnimal {
    @Override
    public void sound() {
        System.out.println("멍멍");
    }


    public void move() {
        System.out.println("move");
    }
}

