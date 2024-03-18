package Poly.Ex3;

import Poly.Ex2.AbstrackAnimal;

public class Cat implements InterfaceAnimal {
    @Override
    public void sound() {
        System.out.println("야옹야옹");
    }

    public void move() {
        System.out.println("move");
    }
}
