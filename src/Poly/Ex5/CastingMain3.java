package Poly.Ex5;

public class CastingMain3 {
    public static void main(String[] args) {

        Parent parent = new Parent();
        System.out.println("parent 호출");
        call(parent);

        Parent parent1 = new Parent();
        System.out.println("parent1 호출");
        call(parent1);
    }
    private static void call(Parent parent){
        parent.parentMethod();
        if (parent instanceof Child child){ // Child가 왼쪽 parent에 대입이 되는가?
            System.out.println("Child 인스턴스가 맞음");
            child.childMethod();
        }else{
            System.out.println("인스턴스가 아님");
        }
    }
}
