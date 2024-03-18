package chapter07.Class1;

public class Student1 {
    public static void main(String[] args) {
        // int a;
        Student student1 = new Student();
        System.out.println(student1);
        //scanner.nextInt();
        student1.name = "kim";
        student1.age = 10;
        student1.grade = 100;

        Student student2 = new Student();
        student2.name = "lee";
        student2.age = 20;
        student2.grade = 90;
        System.out.println(student2);

        Student student3 = new Student();
        student3.name = "park";
        student3.age = 30;
        student3.grade = 80;
        System.out.println(student3);

        Student[] students = new Student[]{student1, student2, student3};

        for (int i = 0; i < students.length; i++) {
            System.out.println("name: " + students[i].name + ", age: " + students[i].age + ", grade: " + students[i].grade);
        }
            //System.out.println("name "+ student2.name + ", age: "+ student2.age+", grade: " + student2.grade);
        //System.out.println("name "+ student3.name + ", age: "+ student3.age+", grade: " + student3.grade);
    }
}
