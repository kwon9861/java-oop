public class InitEx2 {
    static int sVar;
    static void sMethod(){}
    // 인스턴스 변수, 멤버 변수
    int var;
    void method(){}
    // static 초기화 블럭
    static{
        sVar = 0;
        sMethod();
    }
    static void sMethod2(){
        //static 메소드에서 this 사용 불가
        //this
    }
}
