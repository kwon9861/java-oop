public class InitEx {
    InitEx(){
        System.out.println("생성자 호출");
    }
        static{
        System.out.println("클래스 초기화 블럭 실행");
    }
    {
        System.out.println("인스턴스 초기화 블랙 실행");
    }
    public static void main(String [] args){
        System.out.println("main() start~~");
        System.out.println("main init1 instance 생성");
        InitEx init1 = new InitEx();
        System.out.println("main init2 instance 생성");
        InitEx init2 = new InitEx();
    }
}
