package Poly.Ex3;

public class InterfaceAnimalMain {
    public static void main(String[] args) {
            Duck duck = new Duck();
            Dog dog = new Dog();
            Cat cat = new Cat();

            cat.sound();
            dog.sound();
            duck.sound();

            cat.move();
            dog.move();
            duck.move();
        }
    }
