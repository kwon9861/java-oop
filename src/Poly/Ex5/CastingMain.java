package Poly.Ex5;

public class CastingMain {
    public static void main(String[] args) {
        // 부모 변수가 부모 인스턴스 참조
        Parent parent = new Parent();
        parent.parentMethod();
        // 자식 변수가 자식 인스턴스 참조
        Child child = new Child();
        child.childMethod();
        // 부모 변수가 자식 인스턴스 참조(다형적 참조)
        Parent parent1 = new Child();
        parent1.parentMethod();

        //자식은 부모를 담을 수 없다. Child child1 = new Parent(); 에러
    }

}
