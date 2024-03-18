package chapter10;

class A { // 바깥 클래스
    A() { // 바깥 클래스의 생성자}
        System.out.println("A 객체 생성");
}
// method()
    // 바깥클래스 A
    /*
    A클래스는 B와 C 두개의 내부클래스를 가지고 있따.
    B클래스는 static 내부클래스, C클래스는 인스턴스 내부 클래스입니다.
    static 내부 클래스는 바깥 클래스의 인스턴스의 상관없이 독립적으로 존재한다.
    인스턴스 내부 클래스는 바깥 클래스의 인스턴스를 통해 생성됩니다.
    각 각의 내부 클래스는 자체적인 메소드와 변수를 가질 수 있습니다.
    static 메소드는 인스턴스를 생성하지 않고 생성할 수 있다.
     */

static class B { // static 내부 클래스
        B(){ // static 내부 클래스의 생성자}
            System.out.println("C 객체 생성");
    }
    int var1;
        static int var2;

        void method1(){
            System.out.println("static 내부 클래스의 method1()");
        }
        static void method2(){
            System.out.println("static 내부 클래스의 static method2()");
        }
}
public class C {//인스턴스 내부 클래스}

    C() {//인스턴스 내부 클래스의 생성자}
        System.out.println("B 객체 생성");
    }
    int var1;
    void method1() {
        System.out.println("인스턴스 내부 클래스의 method1()");
    }
}

void method(){
        class D{
            D() {
                System.out.println("D 객체 생성");
            }
            int var1;

            void method1(){
                System.out.println("로컬 내부 클래스의 method1()");
            }
        }
        D d = new D();
        d.var1 = 3;
        d.method1();
}
}