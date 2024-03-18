package chapter11;

public class ExceptionEx7 {
    public static void main(String[] args) {
        try {
            first();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("main() 예외처리");
        }
    }

    static void first() throws Exception {
        try {
            second();
        } catch (Exception e) {
            System.out.println("first() 예외 처리");
            throw e;
        }
    }

    static void second() throws Exception {
        try {
            throw new Exception("예외 발생");
        } catch (Exception e) {
            System.out.println("second() 예외 처리");
            throw e;
        }
    }
}