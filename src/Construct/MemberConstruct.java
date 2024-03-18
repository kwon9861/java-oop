package Construct;

public class MemberConstruct {
    String name;
    int age;
    int grade;
    /**
     * 생성자
     * 1. 생성자는 클래스 이름과 같아야 한다.
     * 2. 생성자 리턴 타입이 없으므로 비워둔다.
     * 3. 멤버변수를 초기화하는 역할을 합니다.
     */
    MemberConstruct(String name, int age, int grade){
        System.out.println("생성자 호출 name= "+name+", age= "+age+", grade= "+grade);
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

}
