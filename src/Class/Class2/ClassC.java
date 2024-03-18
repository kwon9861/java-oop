package Class.Class2;

import Class.Class2.*;

public class ClassC {
    public static void main(String[] args) {
        ClassA ca = new ClassA();
        ca.print();
        ClassB cb = new ClassB(); // 같은 패키지까지만 가능.
        cb.print();
    }
}
