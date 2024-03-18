package chapter07.Exercise;

public class Exercise {
    public static void main(String[] args){
        Person father = new Person();
        Person mother = new Person();

        father.name="홍길동";
        mother.name="홍길순";
        father.age=60;
        mother.age=58;
        father.gender="남";
        mother.gender="여";
        father.height=175;
        mother.height=168;
        father.weight=50;
        mother.weight=70;

        System.out.println("아빠 이름: "+father.name+" 나이= "+father.age+" 성별= "+father.gender+" 키= "+father.height+" 몸무게= "+father.weight);
        System.out.println("엄마 이름: "+mother.name+" 나이= "+mother.age+" 성별= "+mother.gender+" 키= "+mother.height+" 몸무게= "+mother.weight);
    }
}
