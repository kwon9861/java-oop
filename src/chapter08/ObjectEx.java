package chapter08;

public class ObjectEx {
    public static void main(String[] args) {
        allObject(new GraphicCard());
        allObject(new Amd());
        allObject(new Nvidia());
        allObject("ㅎ2");
    }
    // 모든 클래스를 매개변수로 받고 싶으면 메소드 정의시 매개변수 자료형을 최상위 클래스인 Object로 선언
    public static void allObject(Object obj){
        System.out.println(obj.toString());
    }
}
