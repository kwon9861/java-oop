package Class.Class2;

public class ClassA {
    public static void main(String[] args) {
        ClassB cb = new ClassB();
        cb.print();
        ClassA ca = new ClassA();
        ca.print();
    }
    void print() {
        System.out.println("여기는 ClassA");
    }
}
    class ClassB{
        void print() {
            System.out.println("여기는 ClassB");
        }
    }
