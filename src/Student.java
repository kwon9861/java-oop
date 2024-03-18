public class Student {
    String name;
    int grade;
    String department;

    // 기본생성자 안만들어 줘서 만든것
    Student() {
    }

    Student(String n) {
        name = n;
    }
    Student(String n, int g){
        name = n;
        grade = g;
    }
    Student(String n, int g, String d){
        name = n;
        grade = g;
        department = d;
    }
    // 학과와 학년을 매개변수로 받는 생성자(에러발생)
    Student(int g, String d){
        department = d;
        grade = g;
    }
}