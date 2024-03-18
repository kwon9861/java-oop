package Poly.Ex5;

public class CastingMain2 {
    public static void main(String[] args) {
        Child child = new Child();
        Parent parent = child; // 업 캐스팅
        Parent parent1 = child; // 업 캐스팅 (Parent)적지말것
        // Parent parent1 = (Parent) child; 자연스럽게 업캐스팅하므로 적지 않습니다.

        parent.parentMethod();
        parent1.parentMethod();
    }
}
