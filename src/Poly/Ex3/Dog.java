package Poly.Ex3;

import Poly.Ex2.AbstrackAnimal;

public class Dog implements InterfaceAnimal {
    @Override
    public void sound() {
        System.out.println("멍멍");
    }


    public void move() {
        System.out.println("move");
    }
}

