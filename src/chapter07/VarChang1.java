package chapter07;

public class VarChang1 {
    public static void main(String[] args){
        int a = 10;
        int b = a; // a가 아닌 10이라는 변수의 값을 대입한다. b = 10
        System.out.println("a: "+a+", b: "+b);
        // a를 20으로 변경
        a = 20;
        System.out.println("a: "+a+", b: "+b);
        b = 30;
        System.out.println("a: "+a+", b: "+b);
    }
}
