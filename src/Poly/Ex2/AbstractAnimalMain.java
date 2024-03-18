package Poly.Ex2;

public class AbstractAnimalMain {
    public static void main(String[] args){
        // 추상클래스 생성 불가 new AbstractAnimal()
        Dog dog = new Dog();
        Duck duck = new Duck();
        Cat cat = new Cat();

        cat.sound();
        cat.move();

        dog.sound();
        dog.move();

        duck.sound();
        duck.move();
    }
}
