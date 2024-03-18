package Poly.Ex5;

public class CastingMain1 {
    public static void main(String[] args) {
        // 부모 변수가 자식 인스턴스 참조(다형적 참조)
        Parent parent1 = new Child();
        parent1.parentMethod();

        //자식은 부모를 담을 수 없다. Child child1 = new Parent(); 에러
        //다운캐스팅
        // Child child = (Child) parent1;
        // child.childMethod();;

        //자식메소드를 호출할때 다운캐스팅 할 수 있습니다.
        //일시적 다운캐스팅
        ((Child)parent1).childMethod();
    }

}
