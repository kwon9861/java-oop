package BBB;

public class ABMain {
    /**
     * 상속 : 의존성 있다.
     * 상속에서는 오버라이딩 안됩니다. (자식이 부모의 메소드를 덮어쓰는것)
     */
    public static void main(String[] args) {
        B b = new B("bClass");
        System.out.println(b.bField);
        System.out.println(b.bMethod());

        System.out.println(b.aField);
        System.out.println(b.aMethod());
    }
}
class A{
    String aField;
    public A(){}
    public A(String aField){
        this.aField = aField;
    }
    String aMethod(){
        return "B.aMethod";
    }
}
class B extends A{
    String bField;

    public B(String bField){
        super("AClass"); // 부모의 생성자를 강제로 호출 제외시키면 null 나옴.
        this.bField = bField;
    }
    String bMethod() {
        return "B.bMethod";
    }
}
